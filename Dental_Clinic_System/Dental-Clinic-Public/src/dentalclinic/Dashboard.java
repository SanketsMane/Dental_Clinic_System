
package dentalclinic;

/**
 *
 * @author Sanket Manne  Github - https://github.com/SanketsMane 
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        exitLbl = new javax.swing.JLabel();
        minimizeLbl = new javax.swing.JLabel();
        adminLbl = new javax.swing.JLabel();
        patientBtn = new javax.swing.JButton();
        staffBtn = new javax.swing.JButton();
        jBtnDentalReport = new javax.swing.JButton();
        invoiceBtn = new javax.swing.JButton();
        invoiceBtn1 = new javax.swing.JButton();
        jBtnMedicalLeave = new javax.swing.JButton();
        btnMedicine = new javax.swing.JButton();
        signoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(31, 58, 147));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(618, 605));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/applogo.png"))); // NOI18N

        exitLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitLbl.setForeground(new java.awt.Color(204, 0, 0));
        exitLbl.setText("X");
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
        });

        minimizeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minimizeLbl.setText("-");
        minimizeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLblMouseClicked(evt);
            }
        });

        adminLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        adminLbl.setForeground(new java.awt.Color(102, 51, 153));
        adminLbl.setText("Admin Dashboard");

        patientBtn.setBackground(new java.awt.Color(102, 51, 153));
        patientBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        patientBtn.setForeground(new java.awt.Color(255, 255, 255));
        patientBtn.setText("Patient");
        patientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBtnActionPerformed(evt);
            }
        });

        staffBtn.setBackground(new java.awt.Color(102, 51, 153));
        staffBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        staffBtn.setForeground(new java.awt.Color(255, 255, 255));
        staffBtn.setText("Staff");
        staffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffBtnActionPerformed(evt);
            }
        });

        jBtnDentalReport.setBackground(new java.awt.Color(102, 51, 153));
        jBtnDentalReport.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnDentalReport.setForeground(new java.awt.Color(255, 255, 255));
        jBtnDentalReport.setText("Dental Report");
        jBtnDentalReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDentalReportActionPerformed(evt);
            }
        });

        invoiceBtn.setBackground(new java.awt.Color(102, 51, 153));
        invoiceBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        invoiceBtn.setForeground(new java.awt.Color(255, 255, 255));
        invoiceBtn.setText("Invoice");
        invoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtnActionPerformed(evt);
            }
        });

        invoiceBtn1.setBackground(new java.awt.Color(102, 51, 153));
        invoiceBtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        invoiceBtn1.setForeground(new java.awt.Color(255, 255, 255));
        invoiceBtn1.setText("Insurance");
        invoiceBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtn1ActionPerformed(evt);
            }
        });

        jBtnMedicalLeave.setBackground(new java.awt.Color(102, 51, 153));
        jBtnMedicalLeave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnMedicalLeave.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMedicalLeave.setText("Medical  Leave");
        jBtnMedicalLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMedicalLeaveActionPerformed(evt);
            }
        });

        btnMedicine.setBackground(new java.awt.Color(102, 51, 153));
        btnMedicine.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMedicine.setForeground(new java.awt.Color(255, 255, 255));
        btnMedicine.setLabel("Medicine Inventory");
        btnMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicineActionPerformed(evt);
            }
        });

        signoutBtn.setBackground(new java.awt.Color(102, 51, 153));
        signoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        signoutBtn.setText("Sign Out");
        signoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jBtnMedicalLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(invoiceBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jBtnDentalReport, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(invoiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(patientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(staffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(103, 103, 103))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(adminLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(minimizeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitLbl)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMedicine)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(signoutBtn)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitLbl)
                    .addComponent(minimizeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDentalReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(invoiceBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnMedicalLeave, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signoutBtn)
                .addContainerGap())
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

    private void patientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBtnActionPerformed

        new Patient().setVisible(true);
        dispose();
    }//GEN-LAST:event_patientBtnActionPerformed

    private void staffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffBtnActionPerformed
        new Staff().setVisible(true);
        dispose();
    }//GEN-LAST:event_staffBtnActionPerformed

    private void invoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtnActionPerformed
        new Invoice().setVisible(true);
        dispose();
    }//GEN-LAST:event_invoiceBtnActionPerformed

    private void signoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutBtnActionPerformed
        new LogIn().setVisible(true);
        dispose();
    }//GEN-LAST:event_signoutBtnActionPerformed

    private void minimizeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeLblMouseClicked

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLblMouseClicked

    private void invoiceBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtn1ActionPerformed
        new Insurance().setVisible(true);
        dispose();
    }//GEN-LAST:event_invoiceBtn1ActionPerformed

    private void btnMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicineActionPerformed
        // TODO add your handling code here:
        new MedicineInventory2().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMedicineActionPerformed

    private void jBtnDentalReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDentalReportActionPerformed
        // TODO add your handling code here:\
        
        new DentalMedicalReport().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnDentalReportActionPerformed

    private void jBtnMedicalLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMedicalLeaveActionPerformed
        // TODO add your handling code here:
        
        new MedicalLeave().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnMedicalLeaveActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLbl;
    private javax.swing.JButton btnMedicine;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JButton invoiceBtn;
    private javax.swing.JButton invoiceBtn1;
    private javax.swing.JButton jBtnDentalReport;
    private javax.swing.JButton jBtnMedicalLeave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JButton patientBtn;
    private javax.swing.JButton signoutBtn;
    private javax.swing.JButton staffBtn;
    // End of variables declaration//GEN-END:variables
}
