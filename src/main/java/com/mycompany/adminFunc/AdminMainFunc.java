/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adminFunc;

import com.mycompany.FileHandling.FileHandle;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AdminMainFunc {
    
    private ArrayList<String> tmp = new ArrayList<>();

    public AdminMainFunc(String fileName){
        FileHandle fh = new FileHandle(fileName);
        this.tmp = fh.getTmp();
    }
     
    public void displyRoomData(JTable tblName){
        DefaultTableModel dft = (DefaultTableModel)tblName.getModel();
        dft.setRowCount(0);
        String rDetails;
        String[] rData;
        for(int i=0; i<tmp.size(); i++){
            rDetails = tmp.get(i);
            rData = rDetails.split(",");
            dft.addRow(rData);
        }
    }
    
    public void displyApplicData(JTable tbleName){
        DefaultTableModel dft = (DefaultTableModel)tbleName.getModel();
        dft.setRowCount(0);
        String rDetails;
        String[] rData, tblData, data1, data2;
        for(int i=0; i<tmp.size(); i++){
            rDetails = tmp.get(i);
            rData = rDetails.split(",");
            if(!rData[9].equals("end")){
                data1 = Arrays.copyOfRange(rData,0,6);
                data2 = Arrays.copyOfRange(rData,8,9);
                tblData = new String[data1.length+data2.length];
                System.arraycopy(data1,0,tblData,0,data1.length);
                System.arraycopy(data2, 0, tblData, data1.length, data2.length);       
                dft.addRow(tblData);  
            }
            
        }
    }
    
    public void displyStdRecData(JTable tbleName){
        DefaultTableModel dft = (DefaultTableModel)tbleName.getModel();
        dft.setRowCount(0);
        String[] rData, tblData ,data1,data2;
        String rDetails;
        for(int i=0; i<tmp.size(); i++){
            rDetails = tmp.get(i);
            rData = rDetails.split(",");
            data1 = Arrays.copyOfRange(rData,0,1);
            data2 = Arrays.copyOfRange(rData,2,5);
            tblData = new String[data1.length+data2.length];
            System.arraycopy(data1,0,tblData,0,data1.length);
            System.arraycopy(data2, 0, tblData, data1.length, data2.length);
            dft.addRow(tblData);
        }
        
    }
    
    public void onClickRoomRecordTbl(JTable tblName, JTextField rIDfield, JComboBox rTypeField, JTextField rNameField, JTextArea desTextArea, JTextField priceField,JComboBox availBox, JTextField ownerField   ){
        int rowSel = tblName.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblName.getModel();
        
        rIDfield.setText((String) model.getValueAt(rowSel,0));
        rNameField.setText((String) model.getValueAt(rowSel,1));
        String roomType = (String) model.getValueAt(rowSel,2);
        if(roomType.toLowerCase().equals("small")){
            rTypeField.setSelectedIndex(1);
        }else if(roomType.toLowerCase().equals("medium")){
            rTypeField.setSelectedIndex(2);
        }else if(roomType.toLowerCase().equals("master")){
            rTypeField.setSelectedIndex(3);
        }else{
            rTypeField.setSelectedIndex(0);
        }
        desTextArea.setText((String) model.getValueAt(rowSel,3));
        priceField.setText((String) model.getValueAt(rowSel,4));
        String avail = (String) model.getValueAt(rowSel,5);
        if(avail.toLowerCase().equals("available")){
            availBox.setSelectedIndex(1);
            availBox.setEnabled(false);
        }else if(avail.toLowerCase().equals("booked")){
            availBox.setSelectedIndex(2);
            availBox.setEnabled(true);
        }else{
            availBox.setSelectedIndex(0);
            availBox.setEnabled(true);
        }
        String owner = (String) model.getValueAt(rowSel,6);
        ownerField.setText(owner);
        if(owner.toLowerCase().equals("null")){
            ownerField.setEnabled(false);
        }else{
            ownerField.setEnabled(true);

        }
        rIDfield.setEnabled(false);
    }
    
    public void onClickStdRecoTabel(JTable tblName, JTextField nameField, JTextField contact, JComboBox roomID, JTextField roomType, JTextField date, JTextField duration ){
        int rowSel = tblName.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblName.getModel();
        nameField.setText((String) model.getValueAt(rowSel,0));
        contact.setText((String) model.getValueAt(rowSel,1));
        String line;
        String[] data;
        String name = (String) model.getValueAt(rowSel,0);
        
        for(int i =0; i<tmp.size();i++){
            line = tmp.get(i);
            data = line.split(",");
            if(name.equals(data[5])){
                FileHandle fh = new FileHandle(FileHandle.RESERVATION);
                //fh.fetchReservationDetail();
                
                
                
                roomType.setText(data[1]);
                date.setText(data[8]);
                duration.setText(data[2]);
                break;
            }
        }
        

        
    }
    
    
    
    
    public void endApplication(JTable tblName){
        int row = tblName.getSelectedRow();
        String line;
        String[] data;
        DefaultTableModel df = (DefaultTableModel)tblName.getModel();
        String roomID = (String)df.getValueAt(row, 0);
        String owner = (String)df.getValueAt(row, 4);
       
        int res = 0;
        for(int i =0; i<tmp.size();i++){
            line = tmp.get(i);
            data = line.split(",");
            if(roomID.equals(data[0])&& owner.equals(data[6])){
                System.out.println("Application is valid!!");
                res = 1;
                break;
            }else{
                res = 0;
            }
        }
        if(res == 1){
            FileHandle fh = new FileHandle(FileHandle.ROOM);
            fh.changeRoomAvaibility(owner, roomID);
            fh.updateReservation(owner, roomID);
            System.out.println("Application ended!!");
        }else{
            System.out.println("Invalid Application details!!");
        }
        
        
    }
    
}
