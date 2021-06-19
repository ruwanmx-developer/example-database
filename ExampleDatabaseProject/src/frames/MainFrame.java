package frames;

import classes.AccessData;
import classes.DBConnect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    // create objects 
    DBConnect dbConn = new DBConnect();
    Connection con = dbConn.databaseConn();

    // create variables
    private String name;
    private String email;
    private String gender;
    private String medium;
    private String languages;

    public MainFrame() {
        initComponents();
        setEditor(false, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_menuadd = new javax.swing.JButton();
        btn_menuUpdate = new javax.swing.JButton();
        btn_menuRemove = new javax.swing.JButton();
        btn_menuCreate = new javax.swing.JButton();
        btn_menuDelete = new javax.swing.JButton();
        btn_menuRefresh = new javax.swing.JButton();
        panel_editor = new javax.swing.JPanel();
        text_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        text_email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combo_medium = new javax.swing.JComboBox<>();
        radio_male = new javax.swing.JRadioButton();
        radio_female = new javax.swing.JRadioButton();
        check_java = new javax.swing.JCheckBox();
        check_kotlin = new javax.swing.JCheckBox();
        check_js = new javax.swing.JCheckBox();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_validate = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_view = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        btn_menuadd.setText("Add Data");
        btn_menuadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuaddActionPerformed(evt);
            }
        });

        btn_menuUpdate.setText("Edit Data (Update Data)");
        btn_menuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuUpdateActionPerformed(evt);
            }
        });

        btn_menuRemove.setText("Remove Data");
        btn_menuRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuRemoveActionPerformed(evt);
            }
        });

        btn_menuCreate.setText("Create Table");
        btn_menuCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuCreateActionPerformed(evt);
            }
        });

        btn_menuDelete.setText("Delete Table");
        btn_menuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuDeleteActionPerformed(evt);
            }
        });

        btn_menuRefresh.setText("Refresh");
        btn_menuRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuRefreshActionPerformed(evt);
            }
        });

        panel_editor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Email");

        combo_medium.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinhala", "English", "Tamil" }));

        radio_male.setText("Male");

        radio_female.setText("Female");

        check_java.setText("Java");

        check_kotlin.setText("Kotlin");

        check_js.setText("JavaScript");

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_validate.setText("Check Data (Validate)");
        btn_validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validateActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Medium");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Language/s");

        btn_view.setText("View");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_editorLayout = new javax.swing.GroupLayout(panel_editor);
        panel_editor.setLayout(panel_editorLayout);
        panel_editorLayout.setHorizontalGroup(
            panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_editorLayout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_validate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_view))
                    .addGroup(panel_editorLayout.createSequentialGroup()
                        .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(text_email)
                                .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_editorLayout.createSequentialGroup()
                                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio_male)
                                    .addComponent(check_java))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_editorLayout.createSequentialGroup()
                                        .addComponent(check_kotlin)
                                        .addGap(29, 29, 29)
                                        .addComponent(check_js))
                                    .addComponent(radio_female)))
                            .addComponent(combo_medium, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_editorLayout.setVerticalGroup(
            panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_medium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_male)
                    .addComponent(radio_female)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_java)
                    .addComponent(check_kotlin)
                    .addComponent(check_js)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_update)
                    .addComponent(btn_validate)
                    .addComponent(btn_cancel)
                    .addComponent(btn_view))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_editor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_menuDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_menuCreate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_menuRemove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_menuUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_menuadd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_menuRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_menuadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_menuUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_menuRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_menuCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_menuDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_menuRefresh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_editor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_menuaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuaddActionPerformed
        setEditor(true, 1);
    }//GEN-LAST:event_btn_menuaddActionPerformed

    private void btn_menuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuUpdateActionPerformed
        if (setUpdateData()) {
            setEditor(true, 2);
        }
    }//GEN-LAST:event_btn_menuUpdateActionPerformed

    private void btn_menuRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuRemoveActionPerformed
        if (table.getSelectedRowCount() == 1) {
            Statement st;
            String query;
            try {
                query = "DELETE FROM table_db WHERE Email = '" + table.getValueAt(table.getSelectedRow(),1) + "';";
                st = dbConn.databaseConn().createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(MainFrame.this, "Data Deleted deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(MainFrame.this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_menuRemoveActionPerformed

    private void btn_menuCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuCreateActionPerformed
        try {
            createTable("table_db ( Name VARCHAR(60) NOT NULL , Email VARCHAR(40) NOT NULL , Gender VARCHAR(6) NOT NULL , Medium VARCHAR(12) NOT NULL , Languages VARCHAR(40) NOT NULL , PRIMARY KEY (Email)) ENGINE = InnoDB;");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(MainFrame.this, e.getMessage());
        }
    }//GEN-LAST:event_btn_menuCreateActionPerformed

    private void btn_menuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuDeleteActionPerformed
        Statement st;
        String query;
        try {
            query = "DROP TABLE table_db;";
            st = dbConn.databaseConn().createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(MainFrame.this, "Table deleted!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(MainFrame.this, ex.getMessage());
        }
    }//GEN-LAST:event_btn_menuDeleteActionPerformed

    private void btn_menuRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuRefreshActionPerformed
        DefaultTableModel model = new DefaultTableModel(new String[]{"Name", "Email", "Gender", "Medium", "Languages"}, 0);
        ArrayList<AccessData> dataList = getDataList();
        for (int i = 0; i < dataList.size(); i++) {
            String a = dataList.get(i).getName();
            String b = dataList.get(i).getEmail();
            String c = dataList.get(i).getGender();
            String d = dataList.get(i).getMedium();
            String e = dataList.get(i).getLanguages();
            model.addRow(new Object[]{a, b, c, d, e});
        }
        table.setModel(model);
    }//GEN-LAST:event_btn_menuRefreshActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if (validateAllData()) {
            try {
                // query for insert
                String query = " INSERT INTO table_db VALUES (?, ?, ?, ?, ?)";
                // create statement
                PreparedStatement pst = con.prepareStatement(query);
                // setting statement
                pst.setString(1, name);
                pst.setString(2, email);
                pst.setString(3, gender);
                pst.setString(4, medium);
                pst.setString(5, languages);
                pst.execute();
                // close connection
                dbConn.databaseConn().close();
                // show message
                JOptionPane.showMessageDialog(MainFrame.this, "Details Uploaded Successfully");
                // disable panel
                setEditor(false, 0);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(MainFrame.this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        if (validateAllData()) {
            try {
                // query for update
                String query = "UPDATE table_db SET Email = ?, Gender = ?, Medium = ?, Languages = ? WHERE Name = ?";
                // create statement
                PreparedStatement pst = con.prepareStatement(query);
                // setting statement
                pst.setString(1, email);
                pst.setString(2, gender);
                pst.setString(3, medium);
                pst.setString(4, languages);
                pst.setString(5, name);
                pst.execute();
                // close connection
                dbConn.databaseConn().close();
                // show message
                JOptionPane.showMessageDialog(MainFrame.this, "Details Updated Successfully");
                // disable panel
                setEditor(false, 0);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(MainFrame.this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validateActionPerformed
        if (validateAllData()) {
            JOptionPane.showMessageDialog(MainFrame.this, "All data has validated!");
        }
    }//GEN-LAST:event_btn_validateActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        setEditor(false, 0);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        new ViewFormFrame().setVisible(true);
    }//GEN-LAST:event_btn_viewActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    public ArrayList<AccessData> getDataList() {
        // create AccessData arraylist 
        ArrayList<AccessData> dataList = new ArrayList();

        // query for get all data
        String query = "SELECT * FROM table_db";

        // create required variables
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            AccessData data;
            while (rs.next()) {
                data = new AccessData(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                dataList.add(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dataList;
    }

    public boolean validateAllData() {
        //validate name field -- is empty
        if (text_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name field is empty!");
            return false;
        }

        // validate name field -- length > 60
        if (text_name.getText().length() > 60) {
            JOptionPane.showMessageDialog(null, "Character limit exeeded ( " + text_name.getText().length() + " )!");
            return false;
        }

        // validate email field -- is empty
        if (text_email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email field is empty!");
            return false;
        }

        // validate email field -- > 40
        if (text_email.getText().length() > 40) {
            JOptionPane.showMessageDialog(null, "Character limit exeeded ( " + text_name.getText().length() + " )!");
            return false;
        }

        // create a boolean for gamil validation purpose
        boolean x = true;

        // check gmail requirements
        if (!(text_email.getText().contains("@"))) {
            x = false;
        }

        // check gmail requirements
        if (!(text_email.getText().contains(".com"))) {
            x = false;
        }

        // check gmail requirements
        if (!(text_email.getText().contains("gmail"))) {
            x = false;
        }

        // check it is a valid gmail
        if (!x) {
            JOptionPane.showMessageDialog(null, "Wrong email address!");
            return false;
        }

        // check gender
        if (!radio_male.isSelected() && !radio_female.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select your gender!");
            return false;
        }
        if (!check_java.isSelected() && !check_kotlin.isSelected() && !check_js.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select at least 1 language!");
            return false;
        }

        // assign data to variables
        // textfields
        name = text_name.getText();
        email = text_email.getText();

        if (radio_male.isSelected()) {
            gender = "Male";
        }
        if (radio_female.isSelected()) {
            gender = "Female";
        }

        // combo box
        medium = combo_medium.getSelectedItem().toString();

        // checkboxes
        languages = "";
        if (check_java.isSelected()) {
            languages += " Java";
        }
        if (check_kotlin.isSelected()) {
            languages += " Kotlin";
        }
        if (check_js.isSelected()) {
            languages += " JavaScript";
        }

        // return all done
        return true;
    }

    private void createTable(String _query) {
        Statement st;
        String query;
        try {
            query = "CREATE TABLE IF NOT EXISTS " + _query;//table_name ( col_name type(size) null, col_name type(size) null, PRIMARY KEY (col_name)) ENGINE = InnoDB;";
            st = dbConn.databaseConn().createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(MainFrame.this, e.getMessage());
            try {
                query = "IF NOT EXISTS CREATE TABLE " + _query;//table_name ( col_name type(size) null, col_name type(size) null, PRIMARY KEY (col_name)) ENGINE = InnoDB;";
                st = dbConn.databaseConn().createStatement();
                st.executeUpdate(query);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(MainFrame.this, ex.getMessage());
            }
        }
    }

    private void setEditor(boolean x, int y) {
        // clear all fields
        if (!(y == 2)) {
            text_name.setText("");
            text_email.setText("");
            combo_medium.setSelectedIndex(0);
            radio_male.setSelected(false);
            radio_female.setSelected(false);
            check_java.setSelected(false);
            check_kotlin.setSelected(false);
            check_js.setSelected(false);
        }
        
        // disable or enable all fields
        for (int i = 0; i < panel_editor.getComponentCount(); i++) {
            panel_editor.getComponent(i).setEnabled(x);
        }
        
        // disable buttons for validity
        btn_add.setEnabled(false);
        btn_update.setEnabled(false);

        // turn on the valid button
        if (x && y == 1) {
            text_email.setEditable(true);
            btn_add.setEnabled(true);
        }
        if (x && y == 2) {
            text_email.setEditable(false);
            btn_update.setEnabled(true);
        }
        btn_view.setEnabled(true);
    }

    private boolean setUpdateData() {
        if (table.getSelectedRowCount() == 1) {
            String a, b, c, d, e;
            int row = table.getSelectedRow();
            a = table.getModel().getValueAt(row, 0).toString();
            b = table.getModel().getValueAt(row, 1).toString();
            c = table.getModel().getValueAt(row, 2).toString();
            d = table.getModel().getValueAt(row, 3).toString();
            e = table.getModel().getValueAt(row, 4).toString();

            text_name.setText(a);
            text_email.setText(b);
            if (c.equals("Male")) {
                radio_male.setSelected(true);
            } else {
                radio_female.setSelected(true);
            }
            combo_medium.setSelectedItem(d);

            if (e.contains("Java")) {
                check_java.setSelected(true);
            }
            if (e.contains("Kotlin")) {
                check_kotlin.setSelected(true);
            }
            if (e.contains("JavaScript")) {
                check_js.setSelected(true);
            }
            return true;
        } else {
            JOptionPane.showMessageDialog(MainFrame.this, "Select a data before update");
        }
        return false;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_menuCreate;
    private javax.swing.JButton btn_menuDelete;
    private javax.swing.JButton btn_menuRefresh;
    private javax.swing.JButton btn_menuRemove;
    private javax.swing.JButton btn_menuUpdate;
    private javax.swing.JButton btn_menuadd;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_validate;
    private javax.swing.JButton btn_view;
    private javax.swing.JCheckBox check_java;
    private javax.swing.JCheckBox check_js;
    private javax.swing.JCheckBox check_kotlin;
    private javax.swing.JComboBox<String> combo_medium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_editor;
    private javax.swing.JRadioButton radio_female;
    private javax.swing.JRadioButton radio_male;
    private javax.swing.JTable table;
    private javax.swing.JTextField text_email;
    private javax.swing.JTextField text_name;
    // End of variables declaration//GEN-END:variables
}
