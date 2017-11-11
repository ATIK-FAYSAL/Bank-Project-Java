
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class creat_new_account extends javax.swing.JFrame {
    public String f_name,l_name,vil1,ps1,st1,st2,vil2,ps2,dis1,dis2,mob,ema,gen,ocu,fat_name,mo_name;
        public String cpass,spass,ac_no,Nid;
        public double taka;
    public creat_new_account() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        name_lebell = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        name_lebell1 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        village = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        de1 = new javax.swing.JLabel();
        distric = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        village1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PS1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        state1 = new javax.swing.JTextField();
        de2 = new javax.swing.JLabel();
        distric1 = new javax.swing.JTextField();
        same = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        mobile_number = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        ocupetion = new javax.swing.JComboBox();
        balance = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        father_name = new javax.swing.JTextField();
        m_name = new javax.swing.JLabel();
        mother_name = new javax.swing.JTextField();
        fo = new javax.swing.JLabel();
        father_ocup = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        mother_ocup = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        account_number = new javax.swing.JTextField();
        s_pass = new javax.swing.JLabel();
        s_password = new javax.swing.JPasswordField();
        s_pass1 = new javax.swing.JLabel();
        c_pass = new javax.swing.JPasswordField();
        save_info = new javax.swing.JButton();
        reset_info = new javax.swing.JButton();
        log = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        nid = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name_lebell.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        name_lebell.setForeground(new java.awt.Color(0, 0, 0));
        name_lebell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_lebell.setText("FIRST NAME *");

        fname.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 0, 0));
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        name_lebell1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        name_lebell1.setForeground(new java.awt.Color(0, 0, 0));
        name_lebell1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_lebell1.setText("LAST NAME *");

        lname.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 0, 0));
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Permanent Adress *");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VIllage");

        village.setForeground(new java.awt.Color(0, 0, 0));
        village.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        village.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                villageActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PS");

        PS.setForeground(new java.awt.Color(0, 0, 0));
        PS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("State");

        state.setForeground(new java.awt.Color(0, 0, 0));
        state.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        de1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        de1.setForeground(new java.awt.Color(0, 0, 0));
        de1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        de1.setText("Distric");

        distric.setForeground(new java.awt.Color(0, 0, 0));
        distric.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        distric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Present Adress");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VIllage");

        village1.setForeground(new java.awt.Color(0, 0, 0));
        village1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        village1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                village1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PS");

        PS1.setForeground(new java.awt.Color(0, 0, 0));
        PS1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PS1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("State");

        state1.setForeground(new java.awt.Color(0, 0, 0));
        state1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        state1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state1ActionPerformed(evt);
            }
        });

        de2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        de2.setForeground(new java.awt.Color(0, 0, 0));
        de2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        de2.setText("Distric");

        distric1.setForeground(new java.awt.Color(0, 0, 0));
        distric1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        distric1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distric1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(state1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(de2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(village1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PS1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distric1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(village1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PS1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distric1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(de2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        same.setForeground(new java.awt.Color(0, 0, 0));
        same.setText("Same");
        same.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(village, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(de1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(same, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(distric, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(village, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distric, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(de1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(same))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Contact Information *");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Mobile number");

        mobile_number.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mobile_number.setForeground(new java.awt.Color(0, 0, 0));
        mobile_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mobile_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_numberActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Email");

        email.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(mobile_number, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email)))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile_number, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        gender.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gender", "MALE", "FEMALE", "OTHERS" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        ocupetion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ocupetion.setForeground(new java.awt.Color(0, 0, 0));
        ocupetion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ocupetion", "1)Student", "2)Engineer", "3)Doctore", "4)Teacher", "5)Farmer", "6)Others" }));
        ocupetion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupetionActionPerformed(evt);
            }
        });

        balance.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        balance.setForeground(new java.awt.Color(0, 0, 0));
        balance.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Balance *");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Parents Information");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Father's Name");

        father_name.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        father_name.setForeground(new java.awt.Color(0, 0, 0));
        father_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        father_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                father_nameActionPerformed(evt);
            }
        });

        m_name.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        m_name.setForeground(new java.awt.Color(0, 0, 0));
        m_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        m_name.setText("Mother's Name");

        mother_name.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mother_name.setForeground(new java.awt.Color(0, 0, 0));
        mother_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mother_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mother_nameActionPerformed(evt);
            }
        });

        fo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        fo.setForeground(new java.awt.Color(0, 0, 0));
        fo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fo.setText("Father Ocupetion");

        father_ocup.setForeground(new java.awt.Color(0, 0, 0));
        father_ocup.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        father_ocup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                father_ocupActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Mother Ocupetion");

        mother_ocup.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mother_ocup.setForeground(new java.awt.Color(0, 0, 0));
        mother_ocup.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mother_ocup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mother_ocupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mother_ocup))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(fo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(father_ocup, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(father_name, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(m_name, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(mother_name, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(father_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mother_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(father_ocup, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mother_ocup, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Account number *");

        account_number.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        account_number.setForeground(new java.awt.Color(0, 0, 0));
        account_number.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        account_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_numberActionPerformed(evt);
            }
        });

        s_pass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        s_pass.setForeground(new java.awt.Color(0, 0, 0));
        s_pass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        s_pass.setText("Password *");

        s_password.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        s_password.setForeground(new java.awt.Color(0, 0, 0));
        s_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        s_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_passwordActionPerformed(evt);
            }
        });

        s_pass1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        s_pass1.setForeground(new java.awt.Color(0, 0, 0));
        s_pass1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        s_pass1.setText("Confirm Password *");

        c_pass.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        c_pass.setForeground(new java.awt.Color(0, 0, 0));
        c_pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        c_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_passActionPerformed(evt);
            }
        });

        save_info.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        save_info.setForeground(new java.awt.Color(0, 0, 0));
        save_info.setText("SAVE");
        save_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_infoActionPerformed(evt);
            }
        });

        reset_info.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        reset_info.setForeground(new java.awt.Color(0, 0, 0));
        reset_info.setText("RESET");
        reset_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_infoActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        log.setForeground(new java.awt.Color(0, 0, 0));
        log.setText("LOG IN");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("NID *");

        nid.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nid.setForeground(new java.awt.Color(0, 0, 0));
        nid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reset_info, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(save_info, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_lebell, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name_lebell1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(lname))))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ocupetion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s_pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(s_pass1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(account_number)
                            .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s_password)
                            .addComponent(c_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_lebell, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_lebell1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ocupetion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(account_number, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_info, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_info, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        Log_in L = new Log_in();
        L.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logActionPerformed

    private void reset_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_infoActionPerformed
        fname.setText("");
        lname.setText("");
        village.setText("");
        PS.setText("");
        state.setText("");
        distric.setText("");
        village1.setText("");
        PS1.setText("");
        state1.setText("");
        distric1.setText("");
        mobile_number.setText("");
        email.setText("");
        father_name.setText("");
        mother_name.setText("");
        father_ocup.setText("");
        mother_ocup.setText("");
        balance.setText("");
        s_password.setText("");
        c_pass.setText("");
        account_number.setText("");
        nid.setText("");
    }//GEN-LAST:event_reset_infoActionPerformed

    private void save_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_infoActionPerformed
           ac_no = account_number.getText();
        spass = s_password.getText();
        cpass = c_pass.getText();
        f_name = fname.getText();
        l_name = lname.getText();
        Nid = nid.getText();
        ema = email.getText();
        mob = mobile_number.getText();
        vil1 = village.getText();
        ps1 = PS.getText();
        st1 = state.getText();
        dis1 = distric.getText();
        vil2 = village1.getText();
        ps2 = PS1.getText();
        st2 = state1.getText();
        dis2 = distric1.getText();
        gen = gender.getSelectedItem().toString();
        ocu = ocupetion.getSelectedItem().toString();
        fat_name = father_name.getText();
        mo_name = mother_name.getText();
        fat_name = father_name.getText();
        mo_name = mother_name.getText();
        String f_ocu,mo_ocu;
        f_ocu = father_ocup.getText();
        mo_ocu = mother_ocup.getText();
        gen = gender.getSelectedItem().toString();
        ocu = ocupetion.getSelectedItem().toString();
        try{
            taka = Double.parseDouble(balance.getText());
              if(spass.equals(cpass)){
                String file_name;
                file_name = ac_no.concat(".txt");
                try{
                    File file = new File(file_name);
                    FileWriter fw = new FileWriter(file);
                    fw.write(f_name+" ");
                    fw.write(l_name+" ");
                    fw.write(Nid+" ");
                    fw.write(ema+" ");
                    fw.write(mob+" ");
                    fw.write(vil1+" ");
                    fw.write(ps1+" ");
                    fw.write(st1+" ");
                    fw.write(dis1+" ");
                    fw.write(vil2+" ");
                    fw.write(ps2+" ");
                    fw.write(st2+" ");
                    fw.write(dis2+" ");
                    fw.write(gen+" ");
                    fw.write(ocu+" ");
                    fw.write(fat_name+" ");
                    fw.write(mo_name+" ");
                    fw.write(f_ocu+" ");
                    fw.write(mo_ocu+" ");
                    fw.close(); 
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"YOU HAVE AN ERROR,PLEASE TRY AGAIN","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                String pass_file;
                pass_file = ac_no.concat("pass.txt");
                try{
                    File file = new File(pass_file);
                    FileWriter fw = new FileWriter(file);
                    fw.write(ac_no+"\n");
                    fw.write(spass);
                    fw.close();
                }
                catch(Exception e){
                   JOptionPane.showMessageDialog(null,"YOU HAVE AN ERROR,PLEASE TRY AGAIN","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                String ammount;
                ammount = ac_no.concat("balance.txt");
                try{
                    File file = new File(ammount);
                    FileWriter fw = new FileWriter(file);
                    fw.write(taka+"");
                    fw.close();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"YOU HAVE AN ERROR,PLEASE TRY AGAIN","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(null,"DATA SAVE SUCCESSFULLY");
                fname.setText("");
                    lname.setText("");
                    village.setText("");
                    PS.setText("");
                    state.setText("");
                    distric.setText("");
                    village1.setText("");
                    PS1.setText("");
                    state1.setText("");
                    distric1.setText("");
                    mobile_number.setText("");
                    email.setText("");
                    father_name.setText("");
                    mother_name.setText("");
                    father_ocup.setText("");
                    mother_ocup.setText("");
                    balance.setText("");
                    s_password.setText("");
                    c_pass.setText("");
                    account_number.setText("");
                    nid.setText("");
            }
            else JOptionPane.showMessageDialog(null,"PASSWORD DOES NOT MATHC","ERROR",JOptionPane.ERROR_MESSAGE);
                    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"INVALID BALANCE,PLEASE INSERT VALID BALANCE","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_infoActionPerformed

    private void sameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sameActionPerformed
        village1.setText(village.getText());
        PS1.setText(PS.getText());
        state1.setText(state.getText());
        distric1.setText(distric.getText());
    }//GEN-LAST:event_sameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        String f_name;
        f_name = fname.getText();
        fname.setText(f_name);
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        String l_name;
        l_name = lname.getText();
        lname.setText(l_name);
    }//GEN-LAST:event_lnameActionPerformed

    private void villageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_villageActionPerformed
        String str;
        str = village.getText();
        village.setText(str);
        
    }//GEN-LAST:event_villageActionPerformed

    private void PSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSActionPerformed
        String str;
        str = PS.getText();
        PS.setText(str);
        
    }//GEN-LAST:event_PSActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        String str;
        str = state.getText();
        state.setText(str);
    }//GEN-LAST:event_stateActionPerformed

    private void districActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districActionPerformed
        String str;
        str = distric.getText();
        distric.setText(str);
    }//GEN-LAST:event_districActionPerformed

    private void village1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_village1ActionPerformed
        String str;
        str = village1.getText();
        village1.setText(str);
    }//GEN-LAST:event_village1ActionPerformed

    private void PS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PS1ActionPerformed
        String str;
        str = PS1.getText();
        PS1.setText(str);
    }//GEN-LAST:event_PS1ActionPerformed

    private void state1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state1ActionPerformed
        String str;
        str = state1.getText();
        state1.setText(str);
        
    }//GEN-LAST:event_state1ActionPerformed

    private void distric1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distric1ActionPerformed
        String str;
        str = distric1.getText();
        distric1.setText(str);
    }//GEN-LAST:event_distric1ActionPerformed

    private void mobile_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_numberActionPerformed
        String str;
        str = mobile_number.getText();
        mobile_number.setText(str);
    }//GEN-LAST:event_mobile_numberActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        String str;
        str = email.getText();
        email.setText(str);
    }//GEN-LAST:event_emailActionPerformed

    private void father_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_father_nameActionPerformed
       String str;
       str = father_name.getText();
       father_name.setText(str);
    }//GEN-LAST:event_father_nameActionPerformed

    private void mother_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mother_nameActionPerformed
        String str;
        str = mother_name.getText();
        mother_name.setText(str);
    }//GEN-LAST:event_mother_nameActionPerformed

    private void father_ocupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_father_ocupActionPerformed
        String str;
        str = father_ocup.getText();
        father_ocup.setText(str);
    }//GEN-LAST:event_father_ocupActionPerformed

    private void mother_ocupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mother_ocupActionPerformed
        String str;
        str = mother_ocup.getText();
        mother_ocup.setText(str);
    }//GEN-LAST:event_mother_ocupActionPerformed

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
        String bal;
        bal = balance.getText();
        balance.setText(bal);
    }//GEN-LAST:event_balanceActionPerformed

    private void account_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_numberActionPerformed
        String str;
        str = account_number.getText();
        account_number.setText(str);
    }//GEN-LAST:event_account_numberActionPerformed

    private void s_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_passwordActionPerformed
        String str;
        str = s_password.getText();
        s_password.setText(str);
    }//GEN-LAST:event_s_passwordActionPerformed

    private void c_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_passActionPerformed
        String str;
        str = c_pass.getText();
        c_pass.setText(str);
    }//GEN-LAST:event_c_passActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        String str;
        str = gender.getSelectedItem().toString();
        gender.setSelectedItem(str);
    }//GEN-LAST:event_genderActionPerformed

    private void ocupetionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupetionActionPerformed
        String str;
        str = ocupetion.getSelectedItem().toString();
        ocupetion.setSelectedItem(str);
    }//GEN-LAST:event_ocupetionActionPerformed

    private void nidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidActionPerformed
        String str;
        str = nid.getText();
        nid.setText(str);
    }//GEN-LAST:event_nidActionPerformed

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
            java.util.logging.Logger.getLogger(creat_new_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(creat_new_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(creat_new_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(creat_new_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new creat_new_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PS;
    private javax.swing.JTextField PS1;
    private javax.swing.JTextField account_number;
    private javax.swing.JTextField balance;
    private javax.swing.JPasswordField c_pass;
    private javax.swing.JLabel de1;
    private javax.swing.JLabel de2;
    private javax.swing.JTextField distric;
    private javax.swing.JTextField distric1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField father_name;
    private javax.swing.JTextField father_ocup;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel fo;
    private javax.swing.JComboBox gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lname;
    private javax.swing.JButton log;
    private javax.swing.JLabel m_name;
    private javax.swing.JTextField mobile_number;
    private javax.swing.JTextField mother_name;
    private javax.swing.JTextField mother_ocup;
    private javax.swing.JLabel name_lebell;
    private javax.swing.JLabel name_lebell1;
    private javax.swing.JTextField nid;
    private javax.swing.JComboBox ocupetion;
    private javax.swing.JButton reset_info;
    private javax.swing.JLabel s_pass;
    private javax.swing.JLabel s_pass1;
    private javax.swing.JPasswordField s_password;
    private javax.swing.JCheckBox same;
    private javax.swing.JButton save_info;
    private javax.swing.JTextField state;
    private javax.swing.JTextField state1;
    private javax.swing.JTextField village;
    private javax.swing.JTextField village1;
    // End of variables declaration//GEN-END:variables
}
