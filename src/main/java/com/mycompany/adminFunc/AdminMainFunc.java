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
        for(int i=0; i<tmp.size(); i++){
            String rDetails = tmp.get(i);
            String[] rData = rDetails.split(",");
            dft.addRow(rData);
        }
    }
    
    public void displyApplicData(JTable tbleName){
        DefaultTableModel dft = (DefaultTableModel)tbleName.getModel();
        dft.setRowCount(0);
        for(int i=0; i<tmp.size(); i++){
            String rDetails = tmp.get(i);
            String[] rData = rDetails.split(",");
            String[] tblData = Arrays.copyOfRange(rData,0,7);
            dft.addRow(tblData);
        }
    }
    
    public void displyStdRecData(JTable tbleName){
        DefaultTableModel dft = (DefaultTableModel)tbleName.getModel();
        dft.setRowCount(0);
        for(int i=0; i<tmp.size(); i++){
            String rDetails = tmp.get(i);
            String[] rData = rDetails.split(",");
            String[] tblData = Arrays.copyOfRange(rData,2,5);
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
        }else if(avail.toLowerCase().equals("booked")){
            availBox.setSelectedIndex(2);
        }else{
            availBox.setSelectedIndex(0);
        }
        ownerField.setText((String) model.getValueAt(rowSel,6));
        rIDfield.setEnabled(false);
    }
    
    public void onClickStdRecoTabel(JTable tblName, JTextField nameField, JTextField contact, JTextField roomID, JTextField roomType, JTextField date, JTextField duration ){
        int rowSel = tblName.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblName.getModel();
        nameField.setText((String) model.getValueAt(rowSel,0));
        contact.setText((String) model.getValueAt(rowSel,1));
        String line;
        String[] data;
        String name = (String) model.getValueAt(rowSel,0);
        String rID = (String) model.getValueAt(rowSel,3);
        for(int i =0; i<tmp.size();i++){
            line = tmp.get(i);
            data = line.split(",");
            if(name.equals(data[5]) && rID.equals(data[0])){
                roomID.setText(data[0]);
                roomType.setText(data[1]);
                date.setText(data[9]);
                duration.setText(data[2]);
                break;
            }
        }
        
        
        
        
    }
    
}
