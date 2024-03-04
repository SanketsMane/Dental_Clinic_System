
package dentalclinic;

import connection.DatabaseConnection;
//import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.*;
//import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
//import net.proteanit.sql.*;

/**
 *
 * @author Sanket Manne  Github - https://github.com/SanketsMane 
 */
public class DentalMedicalReport extends javax.swing.JFrame {
    
    Connection conn;
    String col, sql, search;
    int row;
    PreparedStatement stmt;
    ResultSet result;
    TableRowSorter<DefaultTableModel> tableRow;

    /**
     * Creates new form DentalMedicalReport
     */
    public DentalMedicalReport() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jrbClinical = new javax.swing.JRadioButton();
        jrbXray = new javax.swing.JRadioButton();
        jrbProphylaxis = new javax.swing.JRadioButton();
        jrbFluoride = new javax.swing.JRadioButton();
        jrbOthers = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfCavities = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfDecay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jrbNormal = new javax.swing.JRadioButton();
        jrbSlight = new javax.swing.JRadioButton();
        jrbModerate = new javax.swing.JRadioButton();
        jrbAdvance = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaRecommendation = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jBtnBack = new javax.swing.JButton();
        jBtnSubmit = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        exitLbl = new javax.swing.JLabel();
        minimizeLbl = new javax.swing.JLabel();
        signoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 153));
        jLabel8.setText("Dental Examination Report ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Date");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diagnostic Procedure", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        buttonGroup1.add(jrbClinical);
        jrbClinical.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrbClinical.setText("Clinical Examination");

        buttonGroup1.add(jrbXray);
        jrbXray.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrbXray.setText("X-Rays");

        buttonGroup1.add(jrbProphylaxis);
        jrbProphylaxis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrbProphylaxis.setText("Prophylaxis");

        buttonGroup1.add(jrbFluoride);
        jrbFluoride.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrbFluoride.setText("Fluoride Application");

        buttonGroup1.add(jrbOthers);
        jrbOthers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrbOthers.setText("Others");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbClinical)
                    .addComponent(jrbXray))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbFluoride)
                        .addContainerGap(208, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbProphylaxis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbOthers)
                        .addGap(96, 96, 96))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbClinical)
                    .addComponent(jrbProphylaxis)
                    .addComponent(jrbOthers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbXray)
                    .addComponent(jrbFluoride))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Cavities");

        jtfCavities.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Decay");

        jtfDecay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Gums");

        buttonGroup2.add(jrbNormal);
        jrbNormal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrbNormal.setText("Normal & Healthy");

        buttonGroup2.add(jrbSlight);
        jrbSlight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrbSlight.setText("Slight Inflammation");

        buttonGroup2.add(jrbModerate);
        jrbModerate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrbModerate.setText("Moderate Inflammation");

        buttonGroup2.add(jrbAdvance);
        jrbAdvance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrbAdvance.setText("Advance Disease");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbAdvance)
                    .addComponent(jrbModerate)
                    .addComponent(jrbSlight)
                    .addComponent(jrbNormal)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfDecay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(jtfCavities, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfCavities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfDecay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jrbNormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbSlight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbModerate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbAdvance)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recommendation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jtaRecommendation.setColumns(20);
        jtaRecommendation.setRows(5);
        jScrollPane1.setViewportView(jtaRecommendation);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(138, 138, 138))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jBtnBack.setBackground(new java.awt.Color(102, 51, 153));
        jBtnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnBack.setForeground(new java.awt.Color(255, 255, 255));
        jBtnBack.setText("Back");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        jBtnSubmit.setBackground(new java.awt.Color(102, 51, 153));
        jBtnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSubmit.setText("Submit");
        jBtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubmitActionPerformed(evt);
            }
        });

        jBtnReset.setBackground(new java.awt.Color(102, 51, 153));
        jBtnReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnReset.setForeground(new java.awt.Color(255, 255, 255));
        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        exitLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitLbl.setForeground(new java.awt.Color(204, 0, 0));
        exitLbl.setText("X");

        minimizeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minimizeLbl.setText("-");
        minimizeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLblMouseClicked(evt);
            }
        });

        signoutBtn.setBackground(new java.awt.Color(102, 51, 153));
        signoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        signoutBtn.setText("Sign Out");
        signoutBtn.setPreferredSize(new java.awt.Dimension(66, 41));
        signoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(signoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(142, 142, 142)
                                .addComponent(minimizeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exitLbl)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addContainerGap())))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitLbl)
                    .addComponent(minimizeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jBtnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeLblMouseClicked

    private void signoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutBtnActionPerformed

        dispose();
        new LogIn().setVisible(true);
    }//GEN-LAST:event_signoutBtnActionPerformed

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        // TODO add your handling code here:
         dispose();
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void jBtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitActionPerformed
        // TODO add your handling code here:
        
         try {
            sql = "INSERT INTO dentalreport(diagnostic_proc, cavities, decay, gums, recommendation) VALUES (?,?,?,?.,?)";
            conn = DatabaseConnection.getConnection();
            stmt = conn.prepareStatement(sql);
            if (jrbClinical.isSelected())
            {
                stmt.setString(1,jrbClinical.getText());
            }
            else if(jrbProphylaxis.isSelected())
            {
                stmt.setString(1,jrbProphylaxis.getText());
            }
            else if(jrbXray.isSelected())
            {
                stmt.setString(1,jrbXray.getText());
            }
            else if(jrbFluoride.isSelected())
            {
                stmt.setString(1,jrbFluoride.getText());
            }
            else if(jrbOthers.isSelected())
            {
                stmt.setString(1,jrbOthers.getText());
            }
            stmt.setString(2, jtfCavities.getText());
            stmt.setString(3, jtfDecay.getText());
            if (jrbNormal.isSelected())
            {
                stmt.setString(4,jrbNormal.getText());
            }
            else if(jrbSlight.isSelected())
            {
                stmt.setString(4,jrbSlight.getText());
            }
            else if(jrbModerate.isSelected())
            {
                stmt.setString(4,jrbModerate.getText());
            }
            else if(jrbAdvance.isSelected())
            {
                stmt.setString(4,jrbAdvance.getText());
            }
            stmt.setString(5, jtaRecommendation.getText());
            stmt.executeUpdate();
            clear();
            JOptionPane.showMessageDialog(null, "Data succesfully submitted");
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jBtnSubmitActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        // TODO add your handling code here:  
        clear();
    }//GEN-LAST:event_jBtnResetActionPerformed

    public void clear(){
        
        jrbClinical.setSelected(false);
        jrbXray.setSelected(false);
        jrbProphylaxis.setSelected(false);
        jrbFluoride.setSelected(false);
        jrbOthers.setSelected(false);
        jrbNormal.setSelected(false);
        jrbSlight.setSelected(false);
        jrbModerate.setSelected(false);
        jrbAdvance.setSelected(false);
        jtfCavities.setText("");
        jtfDecay.setText("");
        jtaRecommendation.setText("");
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
            java.util.logging.Logger.getLogger(DentalMedicalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DentalMedicalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DentalMedicalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DentalMedicalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DentalMedicalReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnSubmit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbAdvance;
    private javax.swing.JRadioButton jrbClinical;
    private javax.swing.JRadioButton jrbFluoride;
    private javax.swing.JRadioButton jrbModerate;
    private javax.swing.JRadioButton jrbNormal;
    private javax.swing.JRadioButton jrbOthers;
    private javax.swing.JRadioButton jrbProphylaxis;
    private javax.swing.JRadioButton jrbSlight;
    private javax.swing.JRadioButton jrbXray;
    private javax.swing.JTextArea jtaRecommendation;
    private javax.swing.JTextField jtfCavities;
    private javax.swing.JTextField jtfDecay;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JButton signoutBtn;
    // End of variables declaration//GEN-END:variables
}
