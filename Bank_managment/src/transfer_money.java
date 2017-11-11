
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class transfer_money extends javax.swing.JFrame {
    public String account_number;
    public transfer_money() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        transfer_account_number = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        transfer_ammount = new javax.swing.JTextField();
        correct = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        back2 = new javax.swing.JButton();
        log_out = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ENTER ACCOUNT NUMBER ");

        transfer_account_number.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        transfer_account_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        transfer_account_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer_account_numberActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ENTER AMMOUNT");

        transfer_ammount.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        transfer_ammount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        transfer_ammount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer_ammountActionPerformed(evt);
            }
        });

        correct.setBackground(new java.awt.Color(0, 102, 102));
        correct.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        correct.setForeground(new java.awt.Color(0, 0, 0));
        correct.setText("CORRECT");
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 102, 102));
        reset.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 0, 0));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 102, 102));
        exit.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        back2.setBackground(new java.awt.Color(0, 102, 102));
        back2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        back2.setForeground(new java.awt.Color(0, 0, 0));
        back2.setText("BACK");
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });

        log_out.setBackground(new java.awt.Color(0, 102, 102));
        log_out.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        log_out.setForeground(new java.awt.Color(0, 0, 0));
        log_out.setText("LOG OUT");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(transfer_account_number, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(back2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(correct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reset)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(transfer_ammount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(log_out)
                                        .addGap(18, 18, 18)
                                        .addComponent(exit)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(transfer_account_number, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfer_ammount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(log_out)
                            .addComponent(exit))
                        .addGap(19, 19, 19))))
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

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
           main_page main = new main_page();
           main.setusername(account_number);
           main.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_back2ActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        Log_in l = new Log_in();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_log_outActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed
        String file_name,input_taka,get_taka=null;
        int i_taka,g_taka,total_ammount,taka,ammount;
        input_taka = transfer_ammount.getText();
        file_name = account_number.concat("balance.txt");
        try{
            File file = new File(file_name);
            Scanner read = new Scanner(file);
            while(read.hasNext()){
                get_taka = read.nextLine();
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,"FILE DOES NOT EXIST","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        try{
            g_taka = Integer.parseInt(get_taka);
            i_taka = Integer.parseInt(input_taka);
            if((g_taka-i_taka)<=500){
                JOptionPane.showMessageDialog(null,"INSUFFICIENT BALANCE","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else {
                total_ammount = g_taka-i_taka;
                try{
                    File f = new File(file_name);
                    FileWriter fw = new FileWriter(f);
                    fw.write(total_ammount+"");
                    fw.close();
                    JOptionPane.showMessageDialog(null,"TRANSFER SUCCESFULL");
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(null,"YOU HAVE AN ERROR","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(null,"INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        String get_value=null,file_name1,ac_no;
        ac_no = transfer_account_number.getText();
        file_name1 = ac_no.concat("balance.txt");
        try{
            File file = new File(file_name1);
            Scanner read = new Scanner(file);
            while(read.hasNextLine()){
                get_value = read.nextLine();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"FILE DOES NOT EXIST","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        try{
            taka = Integer.parseInt(get_value);
            i_taka = Integer.parseInt(input_taka);
            ammount = taka+i_taka;
            try{
                File file = new File(file_name1);
                FileWriter fw = new FileWriter(file);
                fw.write(ammount+"");
                fw.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"FILE DOES NOT EXIST","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        transfer_account_number.setText("");
        transfer_ammount.setText("");
    }//GEN-LAST:event_correctActionPerformed

    private void transfer_account_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer_account_numberActionPerformed
        String ac_number;
        ac_number = transfer_account_number.getText();
        transfer_account_number.setText(ac_number);
    }//GEN-LAST:event_transfer_account_numberActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        transfer_ammount.setText("");
        transfer_account_number.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void transfer_ammountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer_ammountActionPerformed
        String taka;
        taka = transfer_ammount.getText();
        transfer_ammount.setText(taka);
    }//GEN-LAST:event_transfer_ammountActionPerformed
    public void set_username(String str){
        account_number = str;
    }
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
            java.util.logging.Logger.getLogger(transfer_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transfer_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transfer_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transfer_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transfer_money().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back2;
    private javax.swing.JButton correct;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log_out;
    private javax.swing.JButton reset;
    private javax.swing.JTextField transfer_account_number;
    private javax.swing.JTextField transfer_ammount;
    // End of variables declaration//GEN-END:variables
}
