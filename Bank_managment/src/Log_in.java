
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Log_in extends javax.swing.JFrame {
    public Log_in() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lebel1 = new javax.swing.JLabel();
        lebel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        lebel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        log_in = new javax.swing.JButton();
        newaccount = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        lebel1.setBackground(new java.awt.Color(0, 153, 255));
        lebel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lebel1.setForeground(new java.awt.Color(0, 0, 0));
        lebel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lebel1.setText("ABC BANK");

        lebel2.setBackground(new java.awt.Color(51, 153, 255));
        lebel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lebel2.setForeground(new java.awt.Color(0, 0, 0));
        lebel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lebel2.setText("Username");

        username.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        lebel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lebel3.setForeground(new java.awt.Color(0, 0, 0));
        lebel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lebel3.setText("Password");

        password.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        log_in.setBackground(new java.awt.Color(0, 153, 255));
        log_in.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        log_in.setForeground(new java.awt.Color(0, 0, 0));
        log_in.setText("LOG IN ");
        log_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_inActionPerformed(evt);
            }
        });

        newaccount.setBackground(new java.awt.Color(0, 153, 255));
        newaccount.setForeground(new java.awt.Color(0, 0, 0));
        newaccount.setText("Creat new account");
        newaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newaccountActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 153, 255));
        reset.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 0, 0));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lebel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lebel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lebel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(username)
                                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(newaccount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(log_in)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reset)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lebel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lebel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lebel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newaccount)
                    .addComponent(log_in, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newaccountActionPerformed
        creat_new_account C = new creat_new_account();
        C.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newaccountActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        String user_name;
        user_name = username.getText();
        username.setText(user_name);
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        String user_password;
        user_password = password.getText();
        password.setText(user_password);
    }//GEN-LAST:event_passwordActionPerformed

    private void log_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_inActionPerformed
        String user_name,user_password;
        String file_name;
        user_name = username.getText();
        user_password = password.getText();
        file_name = user_name.concat("pass.txt");
        String get_user_name=null,get_password=null;
        try{
            File file = new File(file_name);
            Scanner get = new Scanner(file);
            int count = 1;
            while(get.hasNextLine()){
                if(count==1)get_user_name = get.nextLine();
                else if (count==2)get_password = get.nextLine();
                count++;
            }
        }
        catch(Exception e){
           //JOptionPane.showMessageDialog(null,"Invalid username,please try again","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(user_name.equals(get_user_name)&&user_password.equals(get_password)){
            set_value value = new set_value();
            String account;
            account = value.setvalue(get_user_name);
            main_page main = new main_page();
            main.setusername(account);
            main.date();
            main.setVisible(true);
            this.dispose();
        }
        else {
            String admin=null,admin_password=null;
            try{
                File file = new File("admin_login.txt");
                Scanner read = new Scanner(file);
                int count=1;
                while(read.hasNextLine()){
                    if(count==1)admin = read.nextLine();
                    else if(count==2)admin_password = read.nextLine();
                    count++;
                }
                if(user_name.equals(admin)&&user_password.equals(admin_password)){
                    System.out.println("Log in success");
                    admin_panel add = new admin_panel();
                    add.setVisible(true);
                    this.dispose();
                }
                else JOptionPane.showMessageDialog(null,"WRONG USER NAME OR PASSWORD","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"WRONG USER NAME OR PASSWORD","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_log_inActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       username.setText("");
       password.setText("");
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lebel1;
    private javax.swing.JLabel lebel2;
    private javax.swing.JLabel lebel3;
    private javax.swing.JButton log_in;
    private javax.swing.JButton newaccount;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private Scanner Scanner(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
