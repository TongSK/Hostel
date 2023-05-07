/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adminFunc;

import com.mycompany.FileHandling.FileHandle;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AdminMainFunc {
    

    
    public void displyRoomData(JTable tblName){
        FileHandle fh = new FileHandle(FileHandle.ROOM);
        ArrayList<String> tmp = fh.getTmp();
        DefaultTableModel dft = (DefaultTableModel)tblName.getModel();
        dft.setRowCount(0);
        for(int i=0; i<tmp.size(); i++){
            String rDetails = tmp.get(i);
            String[] rData = rDetails.split(",");
            dft.addRow(rData);
        }
    }
    
    
    
}
