
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Homeproject extends javax.swing.JFrame {

    


    public Homeproject() {
        initComponents();
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtHome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logRoom2 = new javax.swing.JButton();
        logWholeResort = new javax.swing.JButton();
        logRestaurant = new javax.swing.JButton();
        logRoom = new javax.swing.JButton();
        logCattage = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        txtHome.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        txtHome.setText("HOME PAGE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(txtHome)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHome, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Bodoni MT Condensed", 0, 24)); // NOI18N
        jLabel2.setText("RENT TYPE");

        logRoom2.setBackground(new java.awt.Color(204, 204, 204));
        logRoom2.setFont(new java.awt.Font("Serif", 0, 10)); // NOI18N
        logRoom2.setText("Pool");
        logRoom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logRoom2ActionPerformed(evt);
            }
        });

        logWholeResort.setFont(new java.awt.Font("Serif", 0, 10)); // NOI18N
        logWholeResort.setText("Whole Resort");
        logWholeResort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logWholeResortActionPerformed(evt);
            }
        });

        logRestaurant.setBackground(new java.awt.Color(204, 204, 204));
        logRestaurant.setFont(new java.awt.Font("Serif", 0, 10)); // NOI18N
        logRestaurant.setText("Restaurant");
        logRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logRestaurantActionPerformed(evt);
            }
        });

        logRoom.setBackground(new java.awt.Color(204, 204, 204));
        logRoom.setFont(new java.awt.Font("Serif", 0, 10)); // NOI18N
        logRoom.setText("Room");
        logRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logRoomActionPerformed(evt);
            }
        });

        logCattage.setBackground(new java.awt.Color(204, 204, 204));
        logCattage.setFont(new java.awt.Font("Serif", 0, 10)); // NOI18N
        logCattage.setText("Cattage");
        logCattage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logCattageActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logWholeResort, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(logCattage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(logRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(logRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(logRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(logRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logCattage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logWholeResort, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logRestaurantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logRestaurantActionPerformed

    private void logWholeResortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logWholeResortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logWholeResortActionPerformed

    private void logRoom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logRoom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logRoom2ActionPerformed

    private void logRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logRoomActionPerformed

    private void logCattageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logCattageActionPerformed
         CattageUI cattageUI = new CattageUI();
        cattageUI.setVisible(true);
    }//GEN-LAST:event_logCattageActionPerformed

    public JButton getLogCattage() {
        return logCattage;
    }

    public void setLogCattage(JButton logCattage) {
        this.logCattage = logCattage;
    }

    public JButton getLogRoom() {
        return logRoom;
    }

    public void setLogRoom(JButton logRoom) {
        this.logRoom = logRoom;
    }

    public JButton getLogRoom2() {
        return logRoom2;
    }

    public void setLogRoom2(JButton logRoom2) {
        this.logRoom2 = logRoom2;
    }

    public JButton getLogWholeResort() {
        return logWholeResort;
    }

    public void setLogWholeResort(JButton logWholeResort) {
        this.logWholeResort = logWholeResort;
    }

    public JButton getLogRestaurant() {
        return logRestaurant;
    }

    public void setLogRestaurant(JButton logRestaurant) {
        this.logRestaurant = logRestaurant;
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
            java.util.logging.Logger.getLogger(Homeproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homeproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homeproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homeproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homeproject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logCattage;
    private javax.swing.JButton logRestaurant;
    private javax.swing.JButton logRoom;
    private javax.swing.JButton logRoom2;
    private javax.swing.JButton logWholeResort;
    private javax.swing.JLabel txtHome;
    // End of variables declaration//GEN-END:variables
}
