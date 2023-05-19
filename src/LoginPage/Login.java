/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPage;


import FormUntukLogin.FormAdmin;
import FormUntukLogin.FormUser;
import FormUntukLogin.formPetugas;
import java.awt.Color;
import java.awt.Frame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;

/**
 *
 * @author ALYA
 */
public class Login extends javax.swing.JFrame {

    
    
    
    public Login() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        

        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelRound_11 = new LoginPage.PanelRound_1();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelRound_12 = new LoginPage.PanelRound_1();
        panelRound_13 = new LoginPage.PanelRound_1();
        panelRound_15 = new LoginPage.PanelRound_1();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelRound_14 = new LoginPage.PanelRound_1();
        panelRound_16 = new LoginPage.PanelRound_1();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginPage/2672292__1_-removebg-preview.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, 370));

        panelRound_11.setBackground(new java.awt.Color(138, 86, 236));
        panelRound_11.setRoundBottomLeft(50);
        panelRound_11.setRoundBottomRight(50);
        panelRound_11.setRoundTopLeft(50);
        panelRound_11.setRoundTopRight(50);
        panelRound_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound_11MouseClicked(evt);
            }
        });
        panelRound_11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADMINISTRATOR");
        panelRound_11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html>Admin dapat mengakses semua halaman yang ada serta dapat menambah, mengubah, dan  mehapus data.</html>");
        panelRound_11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 74, 277, -1));

        panelRound_12.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_12.setRoundBottomLeft(20);
        panelRound_12.setRoundBottomRight(20);
        panelRound_12.setRoundTopLeft(20);
        panelRound_12.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound_12Layout = new javax.swing.GroupLayout(panelRound_12);
        panelRound_12.setLayout(panelRound_12Layout);
        panelRound_12Layout.setHorizontalGroup(
            panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        panelRound_12Layout.setVerticalGroup(
            panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelRound_11.add(panelRound_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        getContentPane().add(panelRound_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 360, 220));

        panelRound_13.setBackground(new java.awt.Color(174, 112, 255));
        panelRound_13.setRoundBottomLeft(50);
        panelRound_13.setRoundBottomRight(50);
        panelRound_13.setRoundTopLeft(50);
        panelRound_13.setRoundTopRight(50);
        panelRound_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound_13MouseClicked(evt);
            }
        });

        panelRound_15.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_15.setRoundBottomLeft(20);
        panelRound_15.setRoundBottomRight(20);
        panelRound_15.setRoundTopLeft(20);
        panelRound_15.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound_15Layout = new javax.swing.GroupLayout(panelRound_15);
        panelRound_15.setLayout(panelRound_15Layout);
        panelRound_15Layout.setHorizontalGroup(
            panelRound_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        panelRound_15Layout.setVerticalGroup(
            panelRound_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>Petugas dapat mengakses beberapa halaman yang sudah disediakan oleh Admin serta dapat menambah, mengubah, dan  mehapus data.</html>");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PETUGAS");

        javax.swing.GroupLayout panelRound_13Layout = new javax.swing.GroupLayout(panelRound_13);
        panelRound_13.setLayout(panelRound_13Layout);
        panelRound_13Layout.setHorizontalGroup(
            panelRound_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_13Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRound_13Layout.setVerticalGroup(
            panelRound_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_13Layout.createSequentialGroup()
                .addGroup(panelRound_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_13Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound_13Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(panelRound_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(panelRound_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, -1, -1));

        panelRound_14.setBackground(new java.awt.Color(145, 0, 255));
        panelRound_14.setRoundBottomLeft(50);
        panelRound_14.setRoundBottomRight(50);
        panelRound_14.setRoundTopLeft(50);
        panelRound_14.setRoundTopRight(50);
        panelRound_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound_14MouseClicked(evt);
            }
        });

        panelRound_16.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_16.setRoundBottomLeft(20);
        panelRound_16.setRoundBottomRight(20);
        panelRound_16.setRoundTopLeft(20);
        panelRound_16.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound_16Layout = new javax.swing.GroupLayout(panelRound_16);
        panelRound_16.setLayout(panelRound_16Layout);
        panelRound_16Layout.setHorizontalGroup(
            panelRound_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        panelRound_16Layout.setVerticalGroup(
            panelRound_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html>Bagi pengguna Masyarakat hanya perlu mengisi data diri dan form yang telah disediakan, Masyarakat juga dapat melihat daftar-daftar barang.</html>");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MASYARAKAT");

        javax.swing.GroupLayout panelRound_14Layout = new javax.swing.GroupLayout(panelRound_14);
        panelRound_14.setLayout(panelRound_14Layout);
        panelRound_14Layout.setHorizontalGroup(
            panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(panelRound_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRound_14Layout.setVerticalGroup(
            panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_14Layout.createSequentialGroup()
                .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(panelRound_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelRound_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 570, -1, 220));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html>SELAMAT DATANG</html>");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 210, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<html>APLIKASI LELANG</html>");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 340, 200, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Made By: Kelompok III");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginPage/copyright (1).png"))); // NOI18N
        jLabel12.setText("  Alright Reserved.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1040, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginPage/bg.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -40, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setMaximumFrame();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    private void panelRound_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound_11MouseClicked
        // TODO add your handling code here:
        this.setVisible(true);
        new FormAdmin().setVisible(true);
    }//GEN-LAST:event_panelRound_11MouseClicked

    private void panelRound_13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound_13MouseClicked
        this.setVisible(true);
        new formPetugas().setVisible(true);
    }//GEN-LAST:event_panelRound_13MouseClicked

    private void panelRound_14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound_14MouseClicked
        this.setVisible(true);
        new FormUser().setVisible(true);
    }//GEN-LAST:event_panelRound_14MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private LoginPage.PanelRound_1 panelRound_11;
    private LoginPage.PanelRound_1 panelRound_12;
    private LoginPage.PanelRound_1 panelRound_13;
    private LoginPage.PanelRound_1 panelRound_14;
    private LoginPage.PanelRound_1 panelRound_15;
    private LoginPage.PanelRound_1 panelRound_16;
    // End of variables declaration//GEN-END:variables

private void setMaximumFrame(){
        try {
            this.setExtendedState(MAXIMIZED_BOTH);
        } catch(Exception error) {
            System.err.println("Error at HomeView-setMaximunFrame, details : "+error.toString());
            JOptionPane.showMessageDialog(this, "Error at HomeView-menuItemKeluarAction, details : "+error.toString());
        }
    }   
}

