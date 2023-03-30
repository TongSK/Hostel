/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelmanagement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.font.TextAttribute;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        UsernameField.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
        jPasswordField1.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));

        onFocus(Usernamelabel,UsernameField);
        onFocus(PassLabel,jPasswordField1);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Usernamelabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        PassLabel = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        registerTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostel");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        loginBtn.setBackground(new java.awt.Color(35, 134, 255));
        loginBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Sign in");
        loginBtn.setBorder(null);
        loginBtn.setFocusPainted(false);
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 43, 43));
        jLabel1.setText("Sign In");

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setEnabled(false);

        Usernamelabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        Usernamelabel.setForeground(new java.awt.Color(184, 184, 184));
        Usernamelabel.setText("Username");
        Usernamelabel.setEnabled(false);

        UsernameField.setBackground(new java.awt.Color(242, 242, 242));
        UsernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        UsernameField.setBorder(null);
        UsernameField.setCaretColor(new java.awt.Color(0, 0, 0));
        UsernameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UsernameField.setMargin(new java.awt.Insets(2, 7, 2, 6));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Usernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(150, Short.MAX_VALUE))
                    .addComponent(UsernameField, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Usernamelabel)
                .addGap(1, 1, 1)
                .addComponent(UsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(242, 242, 242));
        jPanel4.setEnabled(false);

        PassLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        PassLabel.setText("Password");
        PassLabel.setEnabled(false);

        jPasswordField1.setBackground(new java.awt.Color(242, 242, 242));
        jPasswordField1.setBorder(null);
        jPasswordField1.setCaretColor(new java.awt.Color(0, 0, 0));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(1, 16));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(PassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(PassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        registerTxt.setEditable(false);
        registerTxt.setBackground(new java.awt.Color(242, 242, 242));
        registerTxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        registerTxt.setForeground(new java.awt.Color(0, 0, 0));
        registerTxt.setText("Don't have an account? ");
        registerTxt.setBorder(null);
        registerTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(registerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String uname =UsernameField.getText().trim();
        String password = jPasswordField1.getText().trim();
        Student d = new Student(uname,password);
        switch (d.isValid()) {
            case 0:
                JOptionPane.showMessageDialog(null,"Incorrect Username or Password!!");
                break;
            case 1:
                Register rg = new Register();
                rg.setVisible(true);
                break;
            case 2:
                AdminPage ap = new AdminPage();
                ap.setVisible(true);
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerTxtMouseEntered
        Font f = registerTxt.getFont();
        Map style = f.getAttributes();
        style.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        registerTxt.setFont(f.deriveFont(style));
    }//GEN-LAST:event_registerTxtMouseEntered

    private void registerTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerTxtMouseExited
        Font f = registerTxt.getFont();
        Map style = f.getAttributes();
        style.put(TextAttribute.UNDERLINE,-1);
        registerTxt.setFont(f.deriveFont(style));
    }//GEN-LAST:event_registerTxtMouseExited

    private void registerTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerTxtMouseClicked
        Register rs = new Register();
        rs.setVisible(true);
    }//GEN-LAST:event_registerTxtMouseClicked
    
    public static void onFocus(JLabel labelname, JTextField fieldName){
        fieldName.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                labelname.setEnabled(true);
                fieldName.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.BLUE));
                labelname.setForeground(Color.BLUE);
            }

            @Override
            public void focusLost(FocusEvent e) {
                labelname.setEnabled(false);
                fieldName.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
            }
            
        });
    }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PassLabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel Usernamelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField registerTxt;
    // End of variables declaration//GEN-END:variables
}
