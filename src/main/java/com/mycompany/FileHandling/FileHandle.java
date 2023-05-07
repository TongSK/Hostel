/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.FileHandling;


import com.mycompany.hostelmanagement.hostel;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Asus
 */
public class FileHandle {
    
    public final static String ACCOUNT = "Account.txt";
    public final static String RESERVATION = "Reservation.txt";
    public final static String ROOM = "Room.txt";
    
    private final ArrayList<String> tmp; 
    private final String fileName;
    
    public FileHandle( String fileName){
        this.tmp = new ArrayList<>();
        this.fileName = fileName;
        ReadData();
    }

    public ArrayList<String> getTmp() {
        return tmp;
    }
    
    
    
    private void ReadData(){
        try {
            String line ;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            Scanner s = new Scanner(br);
                
            while(s.hasNextLine()){
                if((line = s.nextLine()) != null){
                    tmp.add(line);
                }
            }
            
        }catch(FileNotFoundException exp){
            System.out.println("File Not Found!!!");
        }
    }
    
    
    public int UpdateRoomData(hostel roomData){
        int res = 0;
        String line;
        String[] data;
        ArrayList<String> roomList = new ArrayList<>();
        String roomID = roomData.getRoomID();
        String roomName = roomData.getRoomName();
        String roomType = roomData.getRoomType();
        String desc = roomData.getDesc();
        double price = roomData.getPrice();
        String avail = roomData.getAvail();
        String owner = roomData.getOwner();
        try{
            for(int i=0; i<tmp.size(); i++){
                line = tmp.get(i);
                data = line.split(",");
                if(roomID.equals(data[0])){
                    res = 1;
                    roomList.add(roomID+","+roomName+","+roomType+","+desc+","+price+","+avail+","+owner);
                    
                }else{
                    roomList.add(line);
                    
                }
            }
            if(res == 1){
                PrintWriter w = new PrintWriter(fileName);
                for(String editData : roomList){
                    w.println(editData);
                }
                w.close();
            }else{
                res = 0;
            }
            
        
        }catch(FileNotFoundException exp){
            System.out.println("File Not Found!! Cannot Edit!!");
        }
            
        return res;
    }
    
    public int AddRoomData(hostel roomData){
        String line;
        String[] data;
        int res = 0;
        ArrayList<String> roomIDList = new ArrayList<>();
        ArrayList<String> roomList = new ArrayList<>();
        String roomID = roomData.getRoomID();
        String roomName = roomData.getRoomName();
        String roomType = roomData.getRoomType();
        String desc = roomData.getDesc();
        double price = roomData.getPrice();
        String avail = roomData.getAvail();
        String owner = roomData.getOwner();
        try{
            for(int i=0; i<tmp.size(); i++){
                line = tmp.get(i);
                data = line.split(",");
                roomIDList.add(data[0]);
                
            }
            if(!roomIDList.contains(roomID)){    
                roomList.add(roomID+","+roomName+","+roomType+","+desc+","+price+","+avail+","+owner);
                FileWriter w = new FileWriter(fileName,true);
                for(String addData: roomList){
                    w.write(addData+System.lineSeparator());
                }

                w.close();
                res = 1;
            }else{
                res = 0;
            }
            
            
        
        }catch(FileNotFoundException exp){
            System.out.println("File Not Found!! Cannot Edit!!");
        } catch (IOException ex) {
            Logger.getLogger(FileHandle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public void DeleteRoomData(hostel roomData){

        try{
           
            String roomID = roomData.getRoomID();
            FileWriter w = new FileWriter(fileName);
            w.write("");

            for(int i =0; i<tmp.size(); i++){
                String lines = tmp.get(i);
                String[] data = lines.split(",");
                if(data[0].equals(roomID)){
                    tmp.remove(i);

                }
            }

            for(String data :tmp){
                w.write(data);
                w.write("\n");
            }
            w.close();
        }catch(IOException exp){
            System.out.println("IO Problem!! Cannot delete!!");
        }

    }
    
}
