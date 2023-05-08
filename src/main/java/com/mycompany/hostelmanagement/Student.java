/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanagement;

import com.mycompany.FileHandling.FileHandle;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Student extends Person {
    
    private Student studentData;
    private ArrayList<String> tmp;   
    
    public Student(String Uname, String pwd, String sName,String contNum, String mail) {
        super(Uname, pwd);
        studentName = sName;
        contact = contNum;
        email = mail;
    }
    public Student(String Uname, String pwd){
        super(Uname,pwd);
    }
    
    public Student(String Uname){
        super(Uname);
    }
    
    public void setStudentData(Student studentData){
        this.studentData = studentData;
    }
    
    public Student getStudentData(){
        return this.studentData;
    }
    
    
    @Override
    public int register(){
        int res = 0;
        FileHandle fh = new FileHandle(FileHandle.ACCOUNT);
        tmp = fh.getTmp();
        String line;
        String[] data;
        for(int i = 0; i<tmp.size(); i++){
            line = tmp.get(i);
            data = line.split(",");
            if(Uname.equals(data[0]) || Uname.equals(Admin.ADMINID) ){
                res = 0;
                
                break;
                
            }else{

               res = 4;
               
               Validation v = new Validation();
                if(v.validateEmail(email)==false){
                    res = 1;
                    break;
                }
                if(v.validatePhone(contact)==false){
                    res = 2;
                    break;
                }
                if(v.validateName(studentName) == false){
                    res = 3;
                    break;
                }
            }
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

    public String getContactNum() {
        return contact;
    }

    public String getEmail() {
        return email;
    }
     
    
}
