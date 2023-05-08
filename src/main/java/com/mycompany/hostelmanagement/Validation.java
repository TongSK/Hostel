/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanagement;

import javax.swing.JOptionPane;

/**
 *
 * @author Tan Zhong
 */
public class Validation {
    
    //Validation for name
    public boolean validateName(String name){
        //Name cannot be empty
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Name is required!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //Name can only contains alphabets
        if(!name.matches("[a-zA-Z ]+")){
            JOptionPane.showMessageDialog(null, "Name only allows alphabets!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    
    //Validation for name of cardholder
    public boolean validateName(String name, String defaultString){
        //Name cannot be empty
        if(name.isEmpty() || name.equals(defaultString)){
            JOptionPane.showMessageDialog(null, "Cardholder name is required!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //Name can only contains alphabets
        if(!name.matches("[a-zA-Z ]+")){
            JOptionPane.showMessageDialog(null, "Cardholder name only allows alphabets!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    //Validation for card
    public boolean validateCard(String cardNo, String expiryDate, String cvv){
        //The accepted format of card number is xxxx-xxxx-xxxx-xxxx
        if (!cardNo.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}") || cardNo.equals("xxxx-xxxx-xxxx-xxx")) {
            JOptionPane.showMessageDialog(null, "Invalid card number.\nPlease follow this format xxxx-xxxx-xxxx-xxxx.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        //The accepted format of date is MM/yy
        if (!expiryDate.matches("\\d{2}/\\d{2}") || expiryDate.equals("MM/yy")) {
            JOptionPane.showMessageDialog(null, "Invalid expiry date. Please follow this format MM/yy.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //Month: January to December (1-12)
        int month = Integer.parseInt(expiryDate.substring(0,2));
        if(month < 1 || month > 12){
            JOptionPane.showMessageDialog(null, "Invalid expiry date. Please enter a month between 1 to 12.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        //The accepted format of cvv is 3 digits
        if (!cvv.matches("\\d{3}") || cvv.equals("***")) {
            JOptionPane.showMessageDialog(null, "Invalid cvv. CVV is 3 digits.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    
}
