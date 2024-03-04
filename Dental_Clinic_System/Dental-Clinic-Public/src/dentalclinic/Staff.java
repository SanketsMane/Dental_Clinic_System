
package dentalclinic;

import connection.DatabaseConnection;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import net.proteanit.sql.*;

/**
 *
 * @author Sanket Manne  Github - https://github.com/SanketsMane 
 */
public class Staff extends javax.swing.JFrame {

    Connection conn;
    String col, sql, search;
    int row;
    PreparedStatement stmt;
    ResultSet result;
    TableRowSorter<DefaultTableModel> tableRow;

    /**
     * Creates new form Staff
     */
    public Staff() {
        initComponents();
        showTableData();
        updateTableData();
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) staffTable.getDefaultRenderer(Object.class);
        renderer.setHorizontalAlignment(JLabel.CENTER);
        staffTable.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        staffTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        staffTable.getColumnModel().getColumn(1).setPreferredWidth(230);
        staffTable.getColumnModel().getColumn(2).setPreferredWidth(325);
    }

    public void showTableData() {
        try {
            conn = DatabaseConnection.getConnection();
            sql = "SELECT id AS 'No.', staff_name AS 'Staff Name', staff_details AS 'Staff Details' FROM staffdetails";
            stmt = conn.prepareStatement(sql);
            result = stmt.executeQuery();
            staffTable.setModel(DbUtils.resultSetToTableModel(result));
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                result.close();
                stmt.close();
            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

        updateTableData();

    }

    public void updateTableData() {
        try {
            sql = "SELECT id AS 'No.', staff_name AS 'Staff Name', staff_details AS 'Staff Details' FROM staffdetails";
            stmt = conn.prepareStatement(sql);
            result = stmt.executeQuery();
            staffTable.setModel(DbUtils.resultSetToTableModel(result));
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                result.close();
                stmt.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
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
        staffSearchBar = new javax.swing.JTextField();
        staffLbl = new javax.swing.JLabel();
        staffScrollPane = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        signoutBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        minimizeLbl = new javax.swing.JLabel();
        exitLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        detailsTxt = new javax.swing.JTextField();
        idTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        LabelNo = new javax.swing.JLabel();
        LabelStaff = new javax.swing.JLabel();
        LabelDetails = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        staffSearchBar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        staffSearchBar.setForeground(new java.awt.Color(153, 153, 153));
        staffSearchBar.setText("Search");
        staffSearchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                staffSearchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                staffSearchBarFocusLost(evt);
            }
        });

        staffLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        staffLbl.setForeground(new java.awt.Color(255, 255, 255));
        staffLbl.setText("Staff's Section");

        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Staff Name", "Details"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        staffTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        staffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffTableMouseClicked(evt);
            }
        });
        staffScrollPane.setViewportView(staffTable);

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

        backBtn.setBackground(new java.awt.Color(102, 51, 153));
        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        minimizeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minimizeLbl.setText("-");
        minimizeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLblMouseClicked(evt);
            }
        });

        exitLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitLbl.setForeground(new java.awt.Color(204, 0, 0));
        exitLbl.setText("X");
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
        });

        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(153, 153, 153));
        nameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTxtFocusLost(evt);
            }
        });

        detailsTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        detailsTxt.setForeground(new java.awt.Color(153, 153, 153));
        detailsTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                detailsTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                detailsTxtFocusLost(evt);
            }
        });

        idTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idTxt.setForeground(new java.awt.Color(153, 153, 153));
        idTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idTxtFocusLost(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(102, 51, 153));
        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(102, 51, 153));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(102, 51, 153));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        LabelNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelNo.setText("No");

        LabelStaff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelStaff.setText("Staff name");

        LabelDetails.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelDetails.setText("Details");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 153));
        jLabel1.setText("Staff Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(staffSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(staffLbl))
                            .addComponent(staffScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LabelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(minimizeLbl)
                            .addGap(28, 28, 28)
                            .addComponent(exitLbl)))
                    .addComponent(LabelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailsTxt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(staffLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minimizeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staffSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(staffScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(backBtn)
                    .addComponent(addBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn))
                .addGap(226, 226, 226))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

        String sql= "delete from staffdetails where id =?";
    
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dentalclinic?serverTimezone=" + TimeZone.getDefault().getID(), "root", "");
            stmt=conn.prepareStatement(sql);
            stmt.setString(1, idTxt.getText());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Data succesfully deleted");

        }
        catch(SQLException | HeadlessException ex)
        {
        JOptionPane.showMessageDialog(null,ex);
        }
        
        updateTableData();
        showTableData();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        try {
            sql = "UPDATE staffdetails SET staff_name=?, staff_details=? WHERE id=?";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dentalclinic?serverTimezone=" + TimeZone.getDefault().getID(), "root", "");
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nameTxt.getText());
            stmt.setString(2, detailsTxt.getText());
            stmt.setString(3, idTxt.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data updated succesfully");
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        updateTableData();
        showTableData();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        try {
            sql = "INSERT INTO staffdetails(staff_name, staff_details) VALUES (?,?)";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dentalclinic?serverTimezone=" + TimeZone.getDefault().getID(), "root", "");
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nameTxt.getText());
            stmt.setString(2, detailsTxt.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data succesfully added");
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        updateTableData();
        showTableData();
    }//GEN-LAST:event_addBtnActionPerformed

    private void idTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTxtFocusLost
        if (idTxt.getText().equals("")) {
            idTxt.setText("No");
        }
    }//GEN-LAST:event_idTxtFocusLost

    private void idTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTxtFocusGained
        if (idTxt.getText().equals("No")) {
            idTxt.setText("");
        }
    }//GEN-LAST:event_idTxtFocusGained

    private void detailsTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_detailsTxtFocusLost
        if (detailsTxt.getText().equals("")) {
            detailsTxt.setText("Details");
        }
    }//GEN-LAST:event_detailsTxtFocusLost

    private void detailsTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_detailsTxtFocusGained
        if (detailsTxt.getText().equals("Details")) {
            detailsTxt.setText("");
        }
    }//GEN-LAST:event_detailsTxtFocusGained

    private void nameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusLost
        if (nameTxt.getText().equals("")) {
            nameTxt.setText("Staff Name");
        }
    }//GEN-LAST:event_nameTxtFocusLost

    private void nameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusGained
        if (nameTxt.getText().equals("Staff Name")) {
            nameTxt.setText("");
        }
    }//GEN-LAST:event_nameTxtFocusGained

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLblMouseClicked

    private void minimizeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeLblMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        dispose();
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void signoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutBtnActionPerformed

        dispose();
        new LogIn().setVisible(true);
    }//GEN-LAST:event_signoutBtnActionPerformed

    private void staffSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staffSearchBarFocusLost

        if (staffSearchBar.getText().equals("")) {
            staffSearchBar.setText("Search");
        }
    }//GEN-LAST:event_staffSearchBarFocusLost

    private void staffSearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staffSearchBarFocusGained

        if (staffSearchBar.getText().equals("Search")) {
            staffSearchBar.setText("");
        }
    }//GEN-LAST:event_staffSearchBarFocusGained

    private void staffTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffTableMouseClicked
        // TODO add your handling code here:
         try
        {
           int r = staffTable.getSelectedRow();
           String rowClick = (staffTable.getModel().getValueAt(r,0).toString());
           String sql1= "select * from staffdetails where id='"+rowClick+"'";
           stmt=conn.prepareStatement(sql1);
           result = stmt.executeQuery();
           
           if (result.next())
           {
               idTxt.setText(result.getString("id")) ;
               nameTxt.setText(result.getString("staff_name")) ;
               detailsTxt.setText(result.getString("staff_details")) ;
           }
        }
        catch(Exception ex)
        {
        JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_staffTableMouseClicked

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDetails;
    private javax.swing.JLabel LabelNo;
    private javax.swing.JLabel LabelStaff;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField detailsTxt;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton signoutBtn;
    private javax.swing.JLabel staffLbl;
    private javax.swing.JScrollPane staffScrollPane;
    private javax.swing.JTextField staffSearchBar;
    private javax.swing.JTable staffTable;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
