/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanagement;

import com.mycompany.FileHandling.FileHandle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class hostel {
    protected String roomID;
    protected String roomName;
    protected String roomType;
    protected String desc;
    protected double price;
    protected String avail;
    protected String owner;
    

    public String getRoomID() {
        return roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public String getAvail() {
        return avail;
    }

    public String getOwner() {
        return owner;
    }

    public hostel() {
    }
    
 
    
    public hostel(String roomID, String roomName, String roomType, String desc, double price, String avail, String owner) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomType = roomType;
        this.desc = desc;
        this.price = price;
        this.avail = avail;
        this.owner = owner;
    }
    
    public void displyData(ArrayList<String> tmp , JTable tblName){

        DefaultTableModel dft = (DefaultTableModel)tblName.getModel();
        dft.setRowCount(0);
        for(int i=0; i<tmp.size(); i++){
            String rDetails = tmp.get(i);
            String[] rData = rDetails.split(",");
            dft.addRow(rData);
        }
    }
    
    //Display the hostel information in a table
    public void displayTable(DefaultTableModel table){
        try {
            FileHandle fh = new FileHandle(FileHandle.ROOM);
            ArrayList<String> tmp = fh.getTmp();
            if(tmp.isEmpty()){
                JOptionPane.showMessageDialog(null, "No available room.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            table.setRowCount(0);
            for(int i=0; i<tmp.size(); i++){
                String rDetails = tmp.get(i);
                String[] rData = rDetails.split(",");
                if(rData[5].equals("available") && rData[6].equals("null")){
                    table.addRow(new Object[]{rData[0],rData[2],rData[3],"RM "+rData[4]});
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    //Search room by type
    public void searchRoom(String roomType, DefaultTableModel table){
        if(roomType.equals("Room Type") || roomType.isEmpty()){
            JOptionPane.showMessageDialog(null, """
                                                Please enter a room type!
                                                
                                                For example:
                                                1. Small
                                                2. Medium
                                                3. Master""", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(roomType.equals("Small") || roomType.equals("Medium") || roomType.equals("Master")){
            FileHandle fh = new FileHandle(FileHandle.ROOM);
            ArrayList<String> tmp = fh.getTmp();
            table.setRowCount(0);
            for(int i=0; i<tmp.size(); i++){
                String rDetails = tmp.get(i);
                String[] rData = rDetails.split(",");
                if(rData[2].equals(roomType)&&(rData[5].equals("available") && rData[6].equals("null"))){
                    table.addRow(new Object[]{rData[0],rData[2],rData[3],"RM "+rData[4]});
                }
            }
            if(tmp.isEmpty()){
                JOptionPane.showMessageDialog(null, "No available room.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, """
                                                Invalid room type!
                                                
                                                For example:
                                                1. Small
                                                2. Medium
                                                3. Master
                                                
                                                Note: It is case-sensitive, please check your input carefully.""", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
