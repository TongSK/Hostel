/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.FileHandling;


import com.mycompany.hostelmanagement.Student;
import com.mycompany.hostelmanagement.hostel;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    
    private ArrayList<String> ReadData(String fileName) {
        ArrayList<String> tmp = new ArrayList<>();
        try {
            String line ;
            
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            Scanner s = new Scanner(br);
                
            while(s.hasNextLine()){
                if((line = s.nextLine()) != null){
                    
                    tmp.add(line);
                }
            }
            br.close();
        }catch(FileNotFoundException exp){
            System.out.println("File Not Found!!!");
        } catch (IOException ex) {
            Logger.getLogger(FileHandle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tmp;
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
                    roomList.add(roomID+","+roomName+","+roomType+","+desc+","+price+","+avail+","+owner);
                    res = 1;
                }else{
                    roomList.add(line);
                    
                }
                
                if(!data[6].equals("null")){
                   //admin Edit Reservation txt when owner  change
                    if(roomID.equals(data[0]) && !owner.equals(data[6])){
                        System.out.println("Changing new Owner!!");
                        res = changeOwner(roomID,owner,data[6]);
                    }else{
                        System.out.println("Dont have new Owner!!");
                    } 
                }
                
                
            }
            if(res == 1){
                PrintWriter w = new PrintWriter(fileName);
                for(String editData : roomList){
                    w.println(editData);
                }
                w.close();
            }else if(res == 2){
                res = 2;
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
                    int validOwner = validOwner(owner);
                    if(validOwner ==1){
                        roomList.add(roomID+","+roomName+","+roomType+","+desc+","+price+","+avail+","+owner);
                        FileWriter w = new FileWriter(fileName,true);
                        for(String addData: roomList){
                            w.write(addData+System.lineSeparator());
                        }

                        w.close();
                        res = 1;
                    }else{
                        res = -1;
                    }
                
                
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
            String lines ;
            String[] data; 
            for(int i =0; i<tmp.size(); i++){
                lines = tmp.get(i);
                data = lines.split(",");
                if(data[0].equals(roomID)){
                    tmp.remove(i);

                }
            }

            for(String t :tmp){
                w.write(t);
                w.write("\n");
            }
            w.close();
        }catch(IOException exp){
            System.out.println("IO Problem!! Cannot delete!!");
        }

    }
    
    public void AddAccount(Student studentData){
        
        ArrayList<String> studentList = new ArrayList<>();
        String uName = studentData.getUname();
        String cNum = studentData.getContactNum();
        String email = studentData.getEmail();
        String pwd = studentData.getPwd();
        String sName = studentData.getStudentName();
        studentList.add(uName+","+pwd+","+sName+","+cNum+","+email);
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
            for(String data: studentList){
                bw.write(data+System.lineSeparator());
            }
            bw.close();
        }catch(IOException exp){
            System.out.println("IO Problem!! CANT ADD ACCOUNT!!");
        }
      
    }
    
    public int changeOwner(String roomID,String newOwner, String oldOwner){
        int res = 0;
        try{
            
            ArrayList<String> reserData = ReadData(FileHandle.RESERVATION);
            ArrayList<String> newReseData = new ArrayList<>();
            String accInfor = fetchOwnerDetail(newOwner);
            if(accInfor == null){
                System.out.println("Invalid User!!! This USER is not exist in our system!!");
                return res = 2;
            }else{
                String roomDetail;
                String[] accData, data; 
                accData = accInfor.split(",");
                for(int i =0; i<reserData.size();i++){
                    roomDetail = reserData.get(i);
                    data = roomDetail.split(",");
                    if(roomID.equals(data[0]) && oldOwner.equals(data[4])){ 
                        newReseData.add(data[0]+","+data[1]+","+data[2]+","+data[3]+","+newOwner+","+accData[2]+","+accData[3]+","+accData[4]+","+data[8]+","+data[9]);
                        res = 1;
                    }else{
                        newReseData.add(roomDetail);
                    }
                }

                if(res == 1){
                    PrintWriter w = new PrintWriter(FileHandle.RESERVATION);
                    for(String editData : newReseData){
                        w.println(editData);
                    }
                    w.close();
                }else{
                    System.out.println("Unable to update owner!!, verify problem.");
                }
            }
            
        }catch(FileNotFoundException exp){
            System.out.println("File Not Found!!");
        } 

        return res;
    }
    
    
    public String fetchOwnerDetail(String owner){
        
        String line, res = null;
        String[] data;
        ArrayList<String> accData = ReadData(FileHandle.ACCOUNT);
        for(int i =0; i<accData.size(); i++){
            line = accData.get(i);
            data = line.split(",");
            if(data[0].equals(owner)){
                res = line;
                break;
            }else{
                res = null;
            }
                    
        }
        
        return res;
    }
    
    
    public ArrayList<String> fetchReservationDetail(String roomID){
        String line;
        String data[];
        ArrayList<String> roomDetail = new ArrayList<>(); 
        for(int i =0; i<tmp.size();i++){
            line = tmp.get(i);
            data = line.split(",");
            if(roomID.equals(data[0])){
                roomDetail.add(line);
            }
        }
       return roomDetail;
    }
    
    
    public void changeRoomAvaibility(String owner, String roomID){
       
        ArrayList<String> roomTmp = new ArrayList<>();
        String line;
        String[] data;
        for(int i = 0; i<tmp.size();i++){
            line = tmp.get(i);
            data = line.split(",");
            if(roomID.equals(data[0]) && owner.equals(data[6])){
                roomTmp.add(data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+","+"available"+","+"null");
            }else{
                roomTmp.add(line);
            }
        }
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for(String room:roomTmp){
                bw.write(room);
                bw.write("\n");
            }
            bw.close();
            
        }catch(FileNotFoundException exp){
            System.out.println("File Not Found!!! Cannot End Application !!");
        } catch (IOException ex) {
            Logger.getLogger(FileHandle.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    public void updateReservation(String owner, String roomID){
        ArrayList<String> reserData = ReadData(FileHandle.RESERVATION);
        ArrayList<String> reserTmp = new ArrayList<>();
        String line;
        String[] data;
        
        LocalDate current =  LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currDate =format.format(current);
        for(int i = 0; i<reserData.size();i++){
            line = reserData.get(i);
            data = line.split(",");
            if(roomID.equals(data[0]) && owner.equals(data[4])){
                reserTmp.add(data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+","+data[5]+","+data[6]+","+data[7]+","+data[8]+","+currDate);
            }else{
                reserTmp.add(line);
            }
        }
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(FileHandle.RESERVATION));
            for(String room:reserTmp){
                bw.write(room);
                bw.write("\n");
            }
            bw.close();
            
        }catch(FileNotFoundException exp){
            System.out.println("File Not Found!!! Cannot End Application !!");
        } catch (IOException ex) {
            Logger.getLogger(FileHandle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public int validOwner(String owner){
        int res = 0;
        ArrayList<String> ownerData = ReadData(FileHandle.ACCOUNT);
        String line;
        String[] data;
        for(int i =0; i<ownerData.size();i++){
            line = ownerData.get(i);
            data = line.split(",");
            if(owner.equals(data[0]) || owner.equals("null")){
                return res = 1;
            }else{
                res = 0;
            }
                    
        }
        return res;
    }

}
