/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanagement;

/**
 *
 * @author Asus
 */
class Admin extends Person{

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
    
    
}
