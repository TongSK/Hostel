/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanagement;

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

    public hostel(String roomID, String roomName, String roomType, String desc, double price, String avail, String owner) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomType = roomType;
        this.desc = desc;
        this.price = price;
        this.avail = avail;
        this.owner = owner;
    }
    
    
    public ArrayList<String> mainFunc(String fileName, String func){
        ArrayList<String> tmp = new ArrayList<>();
        try {
            String[] roomls;
            String line ;
            File f = new File(fileName);
            Scanner s = new Scanner(f);
                
            while(s.hasNextLine()){
                if((line = s.nextLine()) != null){
                    roomls = line.split(",");
                    switch (func) {
                        case "r" -> tmp.add(line);
                        case "w" -> {
                            if(getRoomID().equals(roomls[0])){
                                tmp.add(getRoomID()+","+getRoomName()+","+getRoomType()+","+getDesc()+","+getPrice()+","+getAvail()+","+getOwner());
                            }else{
                                tmp.add(line);
                            }
                        }
                        case "a" -> {
                            if(getRoomID().equals(roomls[0])){
                                return tmp;
                            }else{
                                tmp.add(getRoomID()+","+getRoomName()+","+getRoomType()+","+getDesc()+","+getPrice()+","+getAvail()+","+getOwner());
                                return tmp;
                            }
                           
                        }
                        
                        case "d" -> {
                            tmp.add(line);
                            
                        }
                        default -> tmp = null;
                    }
            
                }
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(hostel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(hostel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tmp;
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
    
    
}
