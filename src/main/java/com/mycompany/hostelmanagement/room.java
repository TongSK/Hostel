/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanagement;

/**
 *
 * @author Asus
 */
public class room extends hostel {
    private hostel roomData;
    
    public room(String roomID, String roomName, String roomType, String desc, double price, String avail, String owner) {
        super(roomID, roomName, roomType, desc, price, avail, owner);
    }
    
     public void setRoomData(hostel roomData){
        this.roomData = roomData;
    }
    
    public hostel getRoomData(){
        return this.roomData;
    }
    
    
}
