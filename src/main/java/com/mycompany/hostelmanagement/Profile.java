/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelmanagement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tan Zhong
 */
public class Profile extends javax.swing.JFrame {

    public static String username;
    /**
     * Creates new form Profile
     */
    public Profile(String userName) {
        initComponents();
        Profile.username = userName;
        displayUserDetails();
        displayReservationHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        profileUserLab = new javax.swing.JLabel();
        profileNameLab = new javax.swing.JLabel();
        profileEmailLab = new javax.swing.JLabel();
        profileMobileLab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        profileHistoryTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        profileHistoryLab = new javax.swing.JLabel();
        profileBackBtn = new javax.swing.JButton();
        profileNameLab2 = new javax.swing.JLabel();
        profileLab1 = new javax.swing.JLabel();
        profileUserLab2 = new javax.swing.JLabel();
        profileMobileLab2 = new javax.swing.JLabel();
        profileEmailLab2 = new javax.swing.JLabel();
        profileCheckBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Profile");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        profileUserLab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileUserLab.setText("Username:");

        profileNameLab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileNameLab.setText("Name:");

        profileEmailLab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileEmailLab.setText("Email:");

        profileMobileLab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileMobileLab.setText("Mobile:");

        profileHistoryTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RoomID", "Type", "Duration", "Monthly Payment", "Start Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(profileHistoryTable);

        profileHistoryLab.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        profileHistoryLab.setText("History");

        profileBackBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        profileBackBtn.setText("Back");
        profileBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBackBtnActionPerformed(evt);
            }
        });

        profileNameLab2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileNameLab2.setText("Student Name");

        profileLab1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        profileLab1.setText("User Profile");

        profileUserLab2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileUserLab2.setText("Username");

        profileMobileLab2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileMobileLab2.setText("Mobile Number");

        profileEmailLab2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileEmailLab2.setText("Email");

        profileCheckBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        profileCheckBtn.setText("Check");
        profileCheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileCheckBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(profileLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(257, 257, 257))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(profileNameLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(profileUserLab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(profileUserLab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(profileNameLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(profileMobileLab, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(profileEmailLab, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(profileMobileLab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(profileEmailLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(profileHistoryLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(profileBackBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(profileCheckBtn))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(profileLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(profileUserLab)
                        .addComponent(profileUserLab2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(profileEmailLab)
                        .addComponent(profileEmailLab2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileNameLab)
                    .addComponent(profileMobileLab)
                    .addComponent(profileNameLab2)
                    .addComponent(profileMobileLab2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profileHistoryLab)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileBackBtn)
                    .addComponent(profileCheckBtn))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Display the user details who booked the room
    private void displayUserDetails(){
        try(BufferedReader br = new BufferedReader(new FileReader("Account.txt"))){
            String information;
            while((information = br.readLine()) != null)
            {
                String[] data = information.split(",");
                if(data[0].equals(username))
                {
                    profileUserLab2.setText(data[0]);
                    profileNameLab2.setText(data[2]);
                    profileMobileLab2.setText(data[3]); 
                    profileEmailLab2.setText(data[4]);      
                }
            }
            br.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Account.txt not found!", "Error Message", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong with reading file!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void displayReservationHistory(){
        try(BufferedReader br = new BufferedReader(new FileReader("Reservation.txt"))){
            String information;
            
            DefaultTableModel table = (DefaultTableModel)profileHistoryTable.getModel();
            table.setRowCount(0);
            while((information = br.readLine()) != null)
            {
                String[] data = information.split(",");
                if(data[4].equals(username))
                {
                    table.addRow(new Object[]{data[0],data[1],data[2],"RM "+data[3],data[8]});
                }
            }
            br.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Account.txt not found!", "Error Message", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong with reading file!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void profileBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBackBtnActionPerformed
        // TODO add your handling code here:
        StudentPanel sp = new StudentPanel(username);
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileBackBtnActionPerformed

    private void profileCheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileCheckBtnActionPerformed
        // TODO add your handling code here:
        final int column = 0;
        int row = profileHistoryTable.getSelectedRow();
        String roomID_Selected = profileHistoryTable.getModel().getValueAt(row, column).toString();
        
        Receipt r = new Receipt(username,roomID_Selected);
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileCheckBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton profileBackBtn;
    private javax.swing.JButton profileCheckBtn;
    private javax.swing.JLabel profileEmailLab;
    private javax.swing.JLabel profileEmailLab2;
    private javax.swing.JLabel profileHistoryLab;
    private javax.swing.JTable profileHistoryTable;
    private javax.swing.JLabel profileLab1;
    private javax.swing.JLabel profileMobileLab;
    private javax.swing.JLabel profileMobileLab2;
    private javax.swing.JLabel profileNameLab;
    private javax.swing.JLabel profileNameLab2;
    private javax.swing.JLabel profileUserLab;
    private javax.swing.JLabel profileUserLab2;
    // End of variables declaration//GEN-END:variables
}
