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
import com.mycompany.FileHandling.FileHandle;
import java.util.ArrayList;


/**
 *
 * @author Asus
 */
 abstract class Person {
    protected String Uname;
    protected String pwd;
    protected String studentName;
    protected String contractNum;
    protected String email; 
    
    
    public Person(String Uname, String pwd) {
        this.Uname = Uname;
        this.pwd = pwd;
    }

    public int isValidLogin(){
        int valid = 0; 
        FileHandle fh = new FileHandle(FileHandle.ACCOUNT);
        ArrayList<String> tmp = fh.getTmp();
        String line;
        String[] data;
        for(int i =0; i<tmp.size(); i++){
            line = tmp.get(i);
            data = line.split(",");
            if(Uname.equals(data[0]) && pwd.equals(data[1])){
                valid = 1;
                break;
            }else if(Uname.equals(Admin.ADMINID) && pwd.equals(Admin.ADMINPASS)){
                valid = 2;
                break;
            }else{
                valid = 0;
            }
            
        }
       
        return valid;
        
    }
    
    public abstract int register();
    
    public String getUname() {
        return Uname;
    }

    public String getPwd() {
        return pwd;
    }
    
   

}
