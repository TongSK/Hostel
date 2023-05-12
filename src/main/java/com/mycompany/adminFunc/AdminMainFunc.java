/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adminFunc;

import com.mycompany.FileHandling.FileHandle;
import com.mycompany.hostelmanagement.AdminGenerateReport;
import static com.mycompany.hostelmanagement.AdminGenerateReport.MONTHS;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
    public String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    
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
            if(rData[9].equals("null")){
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
    
    public void displyUserInfo(JTable tblName){
        DefaultTableModel dft = (DefaultTableModel)tblName.getModel();
        dft.setRowCount(0);
        String rDetails;
        String[] rData;
        int removeIndex = 1;
        
        for(int i=0; i<tmp.size(); i++){
            rDetails = tmp.get(i);
            rData = rDetails.split(",");
            int arrayLength = rData.length+1;
            String[] newRData = new String[arrayLength];
            System.arraycopy(rData, 0, newRData, 0, removeIndex);
            System.arraycopy(rData, removeIndex+1, newRData, removeIndex, rData.length - removeIndex-1);
            dft.addRow(newRData );
        }
    }
    
    public void displyAvailRoom(JTable tblName){
        DefaultTableModel dft = (DefaultTableModel)tblName.getModel();
        dft.setRowCount(0);
        String rDetails;
        String[] rData,data1,data2;
        
        for(int i=0; i<tmp.size(); i++){
            rDetails = tmp.get(i);
            rData = rDetails.split(",");
            data1 = Arrays.copyOfRange(rData,0,3);
            data2 = Arrays.copyOfRange(rData,4,5);
            rData = new String[data1.length+data2.length];
            System.arraycopy(data1,0,rData,0,data1.length);
            System.arraycopy(data2, 0, rData, data1.length, data2.length);
            dft.addRow(rData);
        }
    }
    
    public void insertRow0(JTable tblName){
        DefaultTableModel dtm = (DefaultTableModel) tblName.getModel();
        for (int i = 0; i < months.length; i++) {
            dtm.insertRow(i, new Object[]{months[i],AdminGenerateReport.MONTHS[i]});
        }
    }
    
    public void calculateIncome(JTable tblName){
        DefaultTableModel dft = (DefaultTableModel)tblName.getModel();
        dft.setRowCount(0);
        String rDetails,startString,endString;
        int startM,endM;
        String[] data;
        double rental=0;
        LocalDate end, start;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        try{
            for(int i=0; i<tmp.size();i++){
                rDetails = tmp.get(i);
                data = rDetails.split(",");
                startString = data[8];
                start = LocalDate.parse(startString,dtf);
                startM = start.getMonthValue();
                endString = data[9];
                if(endString.equals("null")){
                    System.out.println("The Contract havent end!");
                    end = LocalDate.now();
                    endM = end.getMonthValue();
                }else{
                    end = LocalDate.parse(endString,dtf);
                    endM = end.getMonthValue();
                }
                rental = Double.parseDouble(data[3]);
                for(int j = startM-1; j <endM;j++){
                    AdminGenerateReport.MONTHS[j] +=rental;
                }
            }
            System.out.println("rental"+ Arrays.toString(AdminGenerateReport.MONTHS));
            
        }catch(Exception exp){
            System.out.println("ERROR : "+exp);
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
    
    public void onClickStdRecoTable(JTable tblName, JTextField nameField, JTextField contact, JComboBox roomID, JTextField roomType, JTextField date, JTextField duration ){
        int combCount = roomID.getItemCount();
        if(combCount >1){
            
            while(combCount>1){
                roomID.removeItemAt(combCount-1);
                combCount -=1;
            }
        }
        
        int rowSel = tblName.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblName.getModel();
        String owner = (String) model.getValueAt(rowSel,0);
        nameField.setText(owner);
        contact.setText((String) model.getValueAt(rowSel,1));
        String line;
        String[] data;
        for(int i =0; i<tmp.size();i++){
            line = tmp.get(i);
            data = line.split(",");
            if(owner.equals(data[4])){
                roomID.addItem(data[0]);       
            }
        } 
        
    }
    
    public void onClickRoomID(JComboBox roomID, JTextField roomType, JTextField date, JTextField duration){
        String room = (String) roomID.getSelectedItem();
        String line,reserLine = null;
        String[] data, reserData;
        if(!room.equals("Rooms")){
           for(int i = 0; i<tmp.size();i++){
            line = tmp.get(i);
            data = line.split(",");
            if(room.equals(data[0])){
                reserLine = line;
                break;
            }
            }
            reserData = reserLine.split(",");
            roomType.setText(reserData[1]);
            date.setText(reserData[8]);
            duration.setText(reserData[2]); 
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
