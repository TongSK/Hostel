/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelmanagement;
import com.mycompany.FileHandling.FileHandle;
import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.font.TextAttribute;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Asus
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        paddingText(jPasswordField1);
        paddingText(UsernameField);
        paddingText(EmailField);
        paddingText(NameField);
        paddingText(ContactField);
        onFocus(UsernameField);
        onFocus(EmailField);
        onFocus(NameField);
        onFocus(ContactField);
        onFocus(jPasswordField1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        signupBtn = new javax.swing.JButton();
        loginTxt = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        ContactField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 43, 43));
        jLabel1.setText("Sign In");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostel");
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(298, 438));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 43, 43));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign Up");

        UsernameField.setBackground(new java.awt.Color(233, 233, 233));
        UsernameField.setForeground(new java.awt.Color(153, 153, 153));
        UsernameField.setText("example");
        UsernameField.setToolTipText("Username");
        UsernameField.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        UsernameField.setCaretColor(new java.awt.Color(0, 0, 0));
        UsernameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UsernameField.setMargin(new java.awt.Insets(2, 20, 2, 6));
        UsernameField.setOpaque(true);

        EmailField.setBackground(new java.awt.Color(233, 233, 233));
        EmailField.setForeground(new java.awt.Color(153, 153, 153));
        EmailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EmailField.setText("example@gmail.com");
        EmailField.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        EmailField.setCaretColor(new java.awt.Color(0, 0, 0));
        EmailField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EmailField.setMargin(new java.awt.Insets(2, 7, 2, 6));
        EmailField.setOpaque(true);

        jPasswordField1.setBackground(new java.awt.Color(233, 233, 233));
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordField1.setText("   21331");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPasswordField1.setCaretColor(new java.awt.Color(0, 0, 0));
        jPasswordField1.setOpaque(true);
        jPasswordField1.setPreferredSize(new java.awt.Dimension(1, 16));

        signupBtn.setBackground(new java.awt.Color(35, 134, 255));
        signupBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("Sign up");
        signupBtn.setBorder(null);
        signupBtn.setFocusPainted(false);
        signupBtn.setFocusable(false);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        loginTxt.setEditable(false);
        loginTxt.setBackground(new java.awt.Color(242, 242, 242));
        loginTxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        loginTxt.setForeground(new java.awt.Color(0, 0, 0));
        loginTxt.setText("Already have an account? ");
        loginTxt.setBorder(null);
        loginTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginTxtMouseExited(evt);
            }
        });

        NameField.setBackground(new java.awt.Color(233, 233, 233));
        NameField.setForeground(new java.awt.Color(153, 153, 153));
        NameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        NameField.setText("Example");
        NameField.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        NameField.setCaretColor(new java.awt.Color(0, 0, 0));
        NameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NameField.setMargin(new java.awt.Insets(2, 7, 2, 6));
        NameField.setOpaque(true);

        ContactField.setBackground(new java.awt.Color(233, 233, 233));
        ContactField.setForeground(new java.awt.Color(153, 153, 153));
        ContactField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ContactField.setText("xxxxxxxxxx");
        ContactField.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        ContactField.setCaretColor(new java.awt.Color(0, 0, 0));
        ContactField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ContactField.setMargin(new java.awt.Insets(2, 7, 2, 6));
        ContactField.setOpaque(true);

        jLabel3.setText("Please fill in this form to create an account!");
        jLabel3.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("Contact Number");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(170, 170, 170)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(233, 233, 233))
                                .addComponent(ContactField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(52, 52, 52)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(302, 302, 302))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(loginTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ContactField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void paddingText(JTextField jtext){
        jtext.setBorder(BorderFactory.createCompoundBorder(
        jtext.getBorder(),BorderFactory.createEmptyBorder(0,10,0,10)));
    }
    
    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        String uname = UsernameField.getText();
        String email = EmailField.getText();
        String pwd = jPasswordField1.getText();
        String name = NameField.getText();
        String contact = ContactField.getText();
        int res = 0;
        Student st = new Student(uname,pwd,name,contact,email);
        st.setStudentData(st);
        
        if(uname.isEmpty()||email.isEmpty()||pwd.isEmpty()||name.isEmpty()||contact.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill in the Form!");
            
        }else{
            res = st.register();
            if(res == 0){
                JOptionPane.showMessageDialog(null,"The username is used Please try others name! ");
                UsernameField.setText("");
            }else if(res == 1){
                JOptionPane.showMessageDialog(this,"Incorrect Email Address format!!!","Error Message", JOptionPane.ERROR_MESSAGE);
                EmailField.setText("");
            }else if(res == 2){
                JOptionPane.showMessageDialog(this,"Incorrect Phone format!!! Please Follow +60 12345678!!","Error Message", JOptionPane.ERROR_MESSAGE);
                ContactField.setText("");
            }else if(res == 3){
                JOptionPane.showMessageDialog(this,"Name can only contains alphabets!!","Error Message", JOptionPane.ERROR_MESSAGE);
                ContactField.setText("");
            }else if(res == 4){
                JOptionPane.showMessageDialog(null,"Register success!");
                FileHandle fh = new FileHandle(FileHandle.ACCOUNT);
                fh.AddAccount(st.getStudentData());
                login lg = new login();
                lg.setVisible(true);
                this.dispose();
            }
            
        }
       
    }//GEN-LAST:event_signupBtnActionPerformed
    
    private void loginTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseClicked
        login lg = new login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginTxtMouseClicked

    private void loginTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseEntered
        Font f = loginTxt.getFont();
        Map style = f.getAttributes();
        style.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        loginTxt.setFont(f.deriveFont(style));
    }//GEN-LAST:event_loginTxtMouseEntered

    private void loginTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseExited
        Font f = loginTxt.getFont();
        Map style = f.getAttributes();
        style.put(TextAttribute.UNDERLINE,-1);
        loginTxt.setFont(f.deriveFont(style));
    }//GEN-LAST:event_loginTxtMouseExited
    public static void onFocus(JTextField fieldName){
        fieldName.addFocusListener(new FocusListener(){
            @Override

            public void focusGained(FocusEvent e) {
                if(!fieldName.getForeground().equals(Color.BLACK)){
                    fieldName.setText("");
                    fieldName.setForeground(Color.BLACK);
                }

            }

            @Override
            public void focusLost(FocusEvent e) {

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContactField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField loginTxt;
    private javax.swing.JButton signupBtn;
    // End of variables declaration//GEN-END:variables
}
