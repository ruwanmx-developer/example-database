package frames;

import classes.AccessData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewFormFrame extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel(new String[]{"Name", "Email", "Gender", "Medium", "Languages"}, 0);
    MainFrame mf = new MainFrame();
    int position = 0;
    ArrayList<AccessData> dataList;

    public ViewFormFrame() {
        initComponents();
        refreshData();
        if (dataList.size() > 0) {
            setData(0);
        } else {
            JOptionPane.showMessageDialog(null, "No data to display");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btn_pre = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btn_pre.setText("Previous");
        btn_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_preActionPerformed(evt);
            }
        });

        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
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

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_editorLayout.createSequentialGroup()
                        .addComponent(btn_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hint, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancel))
                    .addComponent(text_email)
                    .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(combo_medium, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_pre)
                        .addComponent(btn_next)
                        .addComponent(btn_cancel)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_editor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_editor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_preActionPerformed
        if (position > 0) {
            position = position - 1;
        }
        setData(position);
    }//GEN-LAST:event_btn_preActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if (position < dataList.size() - 1) {
            position = position + 1;
        }
        setData(position);
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refreshData();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ViewFormFrame().setVisible(true);
        });
    }

    private void refreshData() {
        dataList = mf.getDataList();
        for (int i = 0; i < dataList.size(); i++) {
            String a = dataList.get(i).getName();
            String b = dataList.get(i).getEmail();
            String c = dataList.get(i).getGender();
            String d = dataList.get(i).getMedium();
            String e = dataList.get(i).getLanguages();
            model.addRow(new Object[]{a, b, c, d, e});
        }
    }

    private void clearData() {
        text_name.setText("");
        text_email.setText("");
        combo_medium.setSelectedIndex(0);
        radio_male.setSelected(false);
        radio_female.setSelected(false);
        check_java.setSelected(false);
        check_kotlin.setSelected(false);
        check_js.setSelected(false);
    }

    private void setData(int _pos) {
        clearData();
        String a, b, c, d, e;
        a = model.getValueAt(_pos, 0).toString();
        b = model.getValueAt(_pos, 1).toString();
        c = model.getValueAt(_pos, 2).toString();
        d = model.getValueAt(_pos, 3).toString();
        e = model.getValueAt(_pos, 4).toString();

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
        hint.setText((position + 1) + " of " + dataList.size());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_pre;
    private javax.swing.JCheckBox check_java;
    private javax.swing.JCheckBox check_js;
    private javax.swing.JCheckBox check_kotlin;
    private javax.swing.JComboBox<String> combo_medium;
    private javax.swing.JLabel hint;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panel_editor;
    private javax.swing.JRadioButton radio_female;
    private javax.swing.JRadioButton radio_male;
    private javax.swing.JTextField text_email;
    private javax.swing.JTextField text_name;
    // End of variables declaration//GEN-END:variables
}
