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
