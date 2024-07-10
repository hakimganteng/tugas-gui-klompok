package nizwah.src;
import nizwah.src.Customer;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.UIManager;
import nizwah.src.Dashbord;
import nizwah.src.Produk;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
       // showDasboard();
    }

    void showDasboard() {
        Conten.removeAll();
        Conten.add(new Dashbord());
        Conten.repaint();
        Conten.revalidate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainLayout = new javax.swing.JPanel();
        SlideBar = new javax.swing.JPanel();
        MenuDashBord = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bDashboard = new javax.swing.JLabel();
        MenuCustomer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bCustomer = new javax.swing.JLabel();
        MenuBarang = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bBarang = new javax.swing.JLabel();
        MenuLogout = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        bLogout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Conten = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        SlideBar.setBackground(new java.awt.Color(102, 102, 102));

        MenuDashBord.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nizwah/src/img/Home.png"))); // NOI18N

        bDashboard.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        bDashboard.setForeground(new java.awt.Color(255, 255, 255));
        bDashboard.setText("Dashboard");
        bDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bDashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MenuDashBordLayout = new javax.swing.GroupLayout(MenuDashBord);
        MenuDashBord.setLayout(MenuDashBordLayout);
        MenuDashBordLayout.setHorizontalGroup(
            MenuDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDashBordLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuDashBordLayout.setVerticalGroup(
            MenuDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuCustomer.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nizwah/src/img/Contacts_1.png"))); // NOI18N

        bCustomer.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        bCustomer.setForeground(new java.awt.Color(255, 255, 255));
        bCustomer.setText("Customer");
        bCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCustomerMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MenuCustomerLayout = new javax.swing.GroupLayout(MenuCustomer);
        MenuCustomer.setLayout(MenuCustomerLayout);
        MenuCustomerLayout.setHorizontalGroup(
            MenuCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuCustomerLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(bCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuCustomerLayout.setVerticalGroup(
            MenuCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuBarang.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nizwah/src/img/Box.png"))); // NOI18N

        bBarang.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        bBarang.setForeground(new java.awt.Color(255, 255, 255));
        bBarang.setText("Barang");
        bBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bBarangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bBarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bBarangMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MenuBarangLayout = new javax.swing.GroupLayout(MenuBarang);
        MenuBarang.setLayout(MenuBarangLayout);
        MenuBarangLayout.setHorizontalGroup(
            MenuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarangLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(bBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuBarangLayout.setVerticalGroup(
            MenuBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        MenuLogout.setBackground(new java.awt.Color(153, 153, 153));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nizwah/src/img/Close.png"))); // NOI18N

        bLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bLogout.setForeground(new java.awt.Color(255, 255, 255));
        bLogout.setText("Logout");
        bLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MenuLogoutLayout = new javax.swing.GroupLayout(MenuLogout);
        MenuLogout.setLayout(MenuLogoutLayout);
        MenuLogoutLayout.setHorizontalGroup(
            MenuLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLogoutLayout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        MenuLogoutLayout.setVerticalGroup(
            MenuLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nizwah/src/img/NIZWAH.png"))); // NOI18N

        javax.swing.GroupLayout SlideBarLayout = new javax.swing.GroupLayout(SlideBar);
        SlideBar.setLayout(SlideBarLayout);
        SlideBarLayout.setHorizontalGroup(
            SlideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SlideBarLayout.createSequentialGroup()
                .addGroup(SlideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SlideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SlideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MenuDashBord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MenuCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MenuBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(SlideBarLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(SlideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MenuLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SlideBarLayout.setVerticalGroup(
            SlideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SlideBarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(MenuDashBord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(MenuLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
        );

        Conten.setBackground(new java.awt.Color(255, 255, 255));
        Conten.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout MainLayoutLayout = new javax.swing.GroupLayout(MainLayout);
        MainLayout.setLayout(MainLayoutLayout);
        MainLayoutLayout.setHorizontalGroup(
            MainLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayoutLayout.createSequentialGroup()
                .addComponent(SlideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Conten, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainLayoutLayout.setVerticalGroup(
            MainLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SlideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainLayoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Conten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(MainLayout, "card2");

        setSize(new java.awt.Dimension(1380, 775));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDashboardMouseClicked
        Conten.removeAll();
        Conten.add(new Dashbord());
        Conten.repaint();
        Conten.revalidate();
    }//GEN-LAST:event_bDashboardMouseClicked

    private void bCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCustomerMouseClicked
        Conten.removeAll();
        Conten.add(new Customer());
        Conten.repaint();
        Conten.revalidate();
    }//GEN-LAST:event_bCustomerMouseClicked

    private void bBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBarangMouseClicked
        Conten.removeAll();
        Conten.add(new Produk());
        Conten.repaint();
        Conten.revalidate();
    }//GEN-LAST:event_bBarangMouseClicked

    private void bLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLogoutMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_bLogoutMouseClicked

    private void bDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDashboardMouseEntered
        MenuDashBord.setBackground(new Color(23, 166, 137));
    }//GEN-LAST:event_bDashboardMouseEntered

    private void bDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDashboardMouseExited
        MenuDashBord.setBackground(new Color(26, 188, 156));
    }//GEN-LAST:event_bDashboardMouseExited

    private void bCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCustomerMouseEntered
        MenuCustomer.setBackground(new Color(23, 166, 137));
    }//GEN-LAST:event_bCustomerMouseEntered

    private void bCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCustomerMouseExited
        MenuCustomer.setBackground(new Color(26, 188, 156));
    }//GEN-LAST:event_bCustomerMouseExited

    private void bBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBarangMouseEntered
        MenuBarang.setBackground(new Color(23, 166, 137));
    }//GEN-LAST:event_bBarangMouseEntered

    private void bBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBarangMouseExited
        MenuBarang.setBackground(new Color(26, 188, 156));
    }//GEN-LAST:event_bBarangMouseExited

    private void bLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLogoutMouseEntered
        MenuLogout.setBackground(new Color(23, 166, 137));
    }//GEN-LAST:event_bLogoutMouseEntered

    private void bLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLogoutMouseExited
        MenuLogout.setBackground(new Color(26, 188, 156));
    }//GEN-LAST:event_bLogoutMouseExited

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Button.arc", 20);
            UIManager.put("TextComponent.arc", 50);
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Conten;
    private javax.swing.JPanel MainLayout;
    private javax.swing.JPanel MenuBarang;
    private javax.swing.JPanel MenuCustomer;
    private javax.swing.JPanel MenuDashBord;
    private javax.swing.JPanel MenuLogout;
    private javax.swing.JPanel SlideBar;
    private javax.swing.JLabel bBarang;
    private javax.swing.JLabel bCustomer;
    private javax.swing.JLabel bDashboard;
    private javax.swing.JLabel bLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
