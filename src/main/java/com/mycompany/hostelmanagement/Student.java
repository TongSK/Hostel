/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanagement;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
class Student extends Person {

    public Student(String Uname, String pwd, String sName,  String cNum, String mail) {
        super(Uname, pwd);
        studentName = sName;
        contractNum = cNum;
        email = mail;
    }
    public Student(String Uname, String pwd){
        super(Uname,pwd);
    }
    
    public Student(String Uname){
        super(Uname);
    }
    
    @Override
    public int register(){
        File f = new File("Account.txt");
        Scanner s;
        int res = 0;
        try {
            s = new Scanner(f);
            while(s.hasNextLine()){
            String data = s.nextLine();
            String[] datalist = data.split(",");
            if(getUname().equals(datalist[0]) || getUname().equals("admin")){
                res = 0;
                break;
            }else{
                res = 1;
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
    }
    
    //Method for Student to check available rooms
    public void checkRoom(String username, StudentPanel sp){
        HostelApplication ha = new HostelApplication(username);
        ha.setVisible(true);
        sp.dispose();
    }
    
    //Method for Student to book a room
    public void reserveRoom(String roomID, HostelApplication HA){
        RoomReservation rr = new RoomReservation(getUname(),roomID);
        rr.setVisible(true);
        HA.dispose();
    }
    
    //Method for Student to make payment for booking
    public boolean makePayment(String cardHolder, String cardNo, String expiryDate, String cvv){
        String placeholder = "Student Name";
        
        Validation v = new Validation();
        boolean valid_name = v.validateName(cardHolder, placeholder);
        boolean valid_card = v.validateCard(cardNo, expiryDate, cvv);
        
        if(valid_name && valid_card){
            int response = JOptionPane.showConfirmDialog
                (null, "Are you sure you want to proceed to payment?", 
                "Confirm!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION)
            {
                return true;
            }
        }
        return false;
    }
    
    //Method for Student to check their profile
    public void trackPersonalDetails(String username, StudentPanel sp){
        Profile p = new Profile(username);
        p.setVisible(true);
        sp.dispose();
    }
    
    public String getUname() {
        return Uname;
    }

    public String getPwd() {
        return pwd;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getContractNum() {
        return contractNum;
    }

    public String getEmail() {
        return email;
    }
     
    
}
