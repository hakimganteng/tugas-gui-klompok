package nizwah.src;

import config.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Produk extends javax.swing.JPanel {

    public Produk() {
        initComponents();
        loadCameraData();
       
        reset();
        ComboStatus();
        
    }
    
    private void loadCameraData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CameraID");
        model.addColumn("Merek");
        model.addColumn("Model");
        model.addColumn("HargaSewaPerHari");
        model.addColumn("Status");

        try {
            String sql = "SELECT * FROM Camera";
            Connection con = Koneksi.ConfigDB();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("CameraID"),
                    rs.getString("Merek"),
                    rs.getString("Model"),
                    rs.getDouble("HargaSewaPerHari"),
                    rs.getString("Status")
                };
                model.addRow(row);
            }

            tbCamera.setModel(model);
            pst.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        cmbStatus.setSelectedItem(null);
       
    }

    void reset() {
        txtMerek.setText(null);
        txtModel.setText(null);
        txtHargaSewaPerHari.setText(null);
        
    }


    void ComboStatus(){
        try {
            String sql = "SELECT status FROM Camera";
            Connection con = Koneksi.ConfigDB();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
            cmbStatus.addItem(rs.getString("status"));
            }
        } catch (Exception e) {
          e.printStackTrace();
        }
        cmbStatus.setSelectedItem(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        tMerek = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        txtMerek = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCamera = new javax.swing.JTable();
        txtHargaSewaPerHari = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Model");

        l5.setText("Status");

        tMerek.setText("Merk");

        l2.setText("Harga");

        txtMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMerekActionPerformed(evt);
            }
        });

        bTambah.setBackground(new java.awt.Color(41, 128, 185));
        bTambah.setForeground(new java.awt.Color(255, 255, 255));
        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bUbah.setBackground(new java.awt.Color(39, 174, 96));
        bUbah.setForeground(new java.awt.Color(255, 255, 255));
        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setBackground(new java.awt.Color(231, 76, 60));
        bHapus.setForeground(new java.awt.Color(255, 255, 255));
        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bReset.setBackground(new java.awt.Color(230, 126, 34));
        bReset.setForeground(new java.awt.Color(255, 255, 255));
        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        tbCamera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbCamera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCameraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCamera);

        txtHargaSewaPerHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaSewaPerHariActionPerformed(evt);
            }
        });
        txtHargaSewaPerHari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaSewaPerHariKeyTyped(evt);
            }
        });

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "available", "rented" }));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tMerek)
                            .addComponent(l5)
                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtModel, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                    .addComponent(txtMerek))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bUbah)
                                    .addComponent(bReset)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHargaSewaPerHari, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTambah)
                    .addComponent(bUbah)
                    .addComponent(tMerek))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHapus)
                    .addComponent(bReset)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2)
                    .addComponent(txtHargaSewaPerHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l5)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMerekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMerekActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        try {
            String sql = "INSERT INTO Camera (Merek, Model, HargaSewaPerHari, Status) VALUES (?, ?, ?, ?)";
            Connection con = Koneksi.ConfigDB();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, txtMerek.getText());
            pst.setString(2, txtModel.getText());
            pst.setString(3, txtHargaSewaPerHari.getText());
            pst.setString(4, cmbStatus.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Camera Added Successfully");
            loadCameraData();
            reset();
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_bTambahActionPerformed

    private void tbCameraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCameraMouseClicked
        int baris = tbCamera.rowAtPoint(evt.getPoint());
        txtMerek.setText(tbCamera.getValueAt(baris, 1).toString());
        txtModel.setText(tbCamera.getValueAt(baris, 2).toString());
        txtHargaSewaPerHari.setText(tbCamera.getValueAt(baris, 3).toString());
        cmbStatus.setSelectedItem(tbCamera.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_tbCameraMouseClicked

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        try {
            String sql = "UPDATE Camera SET Merek = ?, Model = ?, HargaSewaPerHari = ?, Status = ? WHERE CameraID = ?";
            Connection con = Koneksi.ConfigDB();
            PreparedStatement pst = con.prepareStatement(sql);
            int baris = tbCamera.getSelectedRow();
            pst.setString(1, txtMerek.getText());
            pst.setString(2, txtModel.getText());
            pst.setDouble(3, Double.parseDouble(txtHargaSewaPerHari.getText()));
            pst.setString(4, cmbStatus.getSelectedItem().toString());
            pst.setInt(5, Integer.parseInt(tbCamera.getValueAt(baris, 0).toString()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Camera Updated Successfully");
            loadCameraData();
            reset();
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        try {
            String sql = "DELETE FROM Camera WHERE CameraID = ?";
            Connection con = Koneksi.ConfigDB();
            PreparedStatement pst = con.prepareStatement(sql);
            int baris = tbCamera.getSelectedRow();
            pst.setInt(1, Integer.parseInt(tbCamera.getValueAt(baris, 0).toString()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Camera Deleted Successfully");
            loadCameraData();
            reset();
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_bHapusActionPerformed

    private void txtHargaSewaPerHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaSewaPerHariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaSewaPerHariActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void txtHargaSewaPerHariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaSewaPerHariKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
           evt.consume();
    
    }//GEN-LAST:event_txtHargaSewaPerHariKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel tMerek;
    private javax.swing.JTable tbCamera;
    private javax.swing.JTextField txtHargaSewaPerHari;
    private javax.swing.JTextField txtMerek;
    private javax.swing.JTextField txtModel;
    // End of variables declaration//GEN-END:variables

}
