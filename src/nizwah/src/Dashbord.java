package nizwah.src;

import config.Koneksi;


public class Dashbord extends javax.swing.JPanel {

    
    public Dashbord() {
        initComponents();
        totalcustomer();
        totalbarang();

    }

   void totalcustomer(){
    try {
            String sql = "SELECT Count(*) AS Total FROM Customer";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            java.sql.ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                vTotalCustomer.setText(resultSet.getString("Total"));
            }

        } catch (Exception e) {
           e.printStackTrace();
        }
       
   }
   void totalbarang(){
    try {
            String sql = "SELECT Count(*) AS Total FROM Camera";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            java.sql.ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                vTotalBarang.setText(resultSet.getString("Total"));
            }

        } catch (Exception e) {
           e.printStackTrace();
        }
       
   }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        vTotalBarang = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vTotalCustomer = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL BARANG");

        vTotalBarang.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        vTotalBarang.setForeground(new java.awt.Color(255, 255, 255));
        vTotalBarang.setText("0");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vTotalBarang)
                    .addComponent(jLabel1))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vTotalBarang)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel17.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL CUSTOMER");

        vTotalCustomer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        vTotalCustomer.setForeground(new java.awt.Color(255, 255, 255));
        vTotalCustomer.setText("0");
        vTotalCustomer.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                vTotalCustomerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vTotalCustomer)
                    .addComponent(jLabel2))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vTotalCustomer)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(423, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vTotalCustomerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_vTotalCustomerAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_vTotalCustomerAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JLabel vTotalBarang;
    private javax.swing.JLabel vTotalCustomer;
    // End of variables declaration//GEN-END:variables
}
