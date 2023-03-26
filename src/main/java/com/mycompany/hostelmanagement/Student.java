/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
class Student extends Person {

    public Student(String Uname, String pwd, String sName, Date DOB, String cNum, String mail) {
        super(Uname, pwd);
        studentName = sName;
        dob = DOB;
        contractNum = cNum;
        email = mail;
    }
    public Student(String Uname, String pwd){
        super(Uname,pwd);
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

    public Date getDob() {
        return dob;
    }

    public String getContractNum() {
        return contractNum;
    }

    public String getEmail() {
        return email;
    }
     
    
}
