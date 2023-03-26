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
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
 class Person {
    protected String Uname;
    protected String pwd;
    protected String studentName;
    protected Date dob;
    protected String contractNum;
    protected String email; 
    
    
    public Person(String Uname, String pwd) {
        this.Uname = Uname;
        this.pwd = pwd;
    }

    public int isValid(){
        int valid = 0; 
        File f = new File("Account");
        try {
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                String data = s.nextLine();
                String[] datalist = data.split(","); 
                
                if(getUname().equals(datalist[0])&& getPwd().equals(datalist[1])){                  
                    valid += 1;
                
                }else if(getUname().equals("admin")&&getPwd().equals("admin123")){               
                    valid += 2;
          
                }else{
                    valid += 0;
    
                }
            }
            
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valid;
        
    }
    public String getUname() {
        return Uname;
    }

    public String getPwd() {
        return pwd;
    }
    
   

}
