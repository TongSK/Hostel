/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanagement;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
class Admin extends Person{
    
    final static String ADMINID = "admin";
    final static String ADMINPASS= "admin123";
    
    public Admin(String Uname, String pwd, String mail) {
        super(Uname, pwd);
        email = mail;
    }

    public Admin(String Uname, String pwd) {
        super(Uname, pwd);
    }
    
    public int register(){
        return 0;      
    };
    
    public String getUname() {
        return Uname;
    }

    public String getPwd() {
        return pwd;
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
