package pet_simulation_v2;
/*
 * @author Nibir(BurstLinker)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Park extends javax.swing.JFrame {

    public Park() {
        initComponents();
    }
    
    String Name;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBack_To_Status_Page = new javax.swing.JButton();
        JPark_Address = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JCandy_Eat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JCoster_Ride = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        JIce_Cream_List = new javax.swing.JComboBox<>();
        JIce_Cream_Eat = new javax.swing.JButton();
        JWarning1 = new javax.swing.JTextField();
        JWarning2 = new javax.swing.JTextField();
        JWarning3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JBack_To_Status_Page.setText("Back_To_Status_Page");
        JBack_To_Status_Page.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JBack_To_Status_PageMouseReleased(evt);
            }
        });

        JPark_Address.setText("See Location");
        JPark_Address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPark_AddressMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Cotton Candy");

        JCandy_Eat.setText("Eat");
        JCandy_Eat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCandy_EatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Roller Coster");

        JCoster_Ride.setText("Ride");
        JCoster_Ride.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCoster_RideActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Ice-Creams");

        JIce_Cream_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vanilla", "Chocolate", "Strawberry", "Mango" }));

        JIce_Cream_Eat.setText("Eat");
        JIce_Cream_Eat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JIce_Cream_EatActionPerformed(evt);
            }
        });

        JWarning1.setEditable(false);
        JWarning1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JWarning1ActionPerformed(evt);
            }
        });

        JWarning2.setEditable(false);
        JWarning2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JWarning2ActionPerformed(evt);
            }
        });

        JWarning3.setEditable(false);
        JWarning3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JWarning3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(JWarning1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JWarning3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(JCoster_Ride)
                                .addGap(164, 164, 164)
                                .addComponent(JCandy_Eat))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JPark_Address)))
                        .addGap(81, 81, 81)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBack_To_Status_Page))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(JIce_Cream_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(JIce_Cream_Eat))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(JWarning2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jLabel2)
                    .addContainerGap(493, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(241, 241, 241)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(431, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(JCoster_Ride))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(JIce_Cream_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(JCandy_Eat)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JIce_Cream_Eat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JWarning1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JWarning3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JWarning2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBack_To_Status_Page)
                            .addComponent(JPark_Address)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel2)
                    .addContainerGap(192, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBack_To_Status_PageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBack_To_Status_PageMouseReleased
        
        Status_Page Status_Page_Obj = new Status_Page();
        PlayerInfo plr = PlayerInfo.getInstance();
        // Reading and setting values for the Owner
        File f1 = new File("Player_Name.txt");
        try {
            Scanner Read1 = new Scanner(f1);
            
            while (Read1.hasNext()){
                Name = Read1.next();
            } 
        } catch (FileNotFoundException ex) {
            System.out.println("Couldn't read from file");
        }
        Status_Page_Obj.JOwnerName.setText(Name);
        Status_Page_Obj.JOwner_Health.setText(Double.toString(plr.Get_Owner_Health()));
        Status_Page_Obj.JOwner_Money.setText(Double.toString(plr.Get_Owner_Money()));
        
        // setting values for the pet
        Status_Page_Obj.JPet_Name.setText(plr.Get_Pet_Name());
        Status_Page_Obj.JPet_Health.setText(Double.toString(plr.Get_Pet_Health()));
        Status_Page_Obj.JPet_Money.setText(Double.toString(plr.get_pet_Balance()));
        Status_Page_Obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBack_To_Status_PageMouseReleased

    private void JPark_AddressMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPark_AddressMouseReleased
        Park_Address Park_Address_Obj = new Park_Address();
        Park_Address_Obj.setVisible(true);
    }//GEN-LAST:event_JPark_AddressMouseReleased

    private void JCandy_EatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCandy_EatActionPerformed
        
        PlayerInfo plr = PlayerInfo.getInstance();

        if ( plr.Get_Owner_Money() <= 10 ){
            JWarning3.setText("You need above $10");
        }else{
            plr.Set_Owner_Money(plr.Get_Owner_Money()-8);
            plr.Set_Pet_Health(92);
            plr.Set_Owner_Health(92);
            JWarning3.setText("You ate the cotton candy");
        }
    }//GEN-LAST:event_JCandy_EatActionPerformed

    private void JCoster_RideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCoster_RideActionPerformed
        
        PlayerInfo plr = PlayerInfo.getInstance();

        if ( plr.Get_Owner_Money() <= 10 ){
            JWarning1.setText("You need above $10");
        }else{
            plr.Set_Owner_Money(plr.Get_Owner_Money()-5);
            plr.Set_Pet_Health(95);
            plr.Set_Owner_Health(95);
            JWarning1.setText("You rode the coster");
        }
    }//GEN-LAST:event_JCoster_RideActionPerformed

    private void JIce_Cream_EatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JIce_Cream_EatActionPerformed
        
        PlayerInfo plr = PlayerInfo.getInstance();

        if ( plr.Get_Owner_Money() <= 10 ){
            JWarning2.setText("You need above $10");
        }else{
            String Choice = (String) JIce_Cream_List.getSelectedItem();
            switch(Choice){
                case "Vanilla" :
                    plr.Set_Owner_Money(plr.Get_Owner_Money()-9);
                    break;
                case "Chocolate" :
                    plr.Set_Owner_Money(plr.Get_Owner_Money()-10);
                    break;
                case "Strawberry" :
                    plr.Set_Owner_Money(plr.Get_Owner_Money()-11);
                    break;
                case "Mango" :
                    plr.Set_Owner_Money(plr.Get_Owner_Money()-12);
                    break;
                default :
                    JWarning2.setText("Choose Properly");
                    break;
            }
            
            plr.Set_Pet_Health(100);
            plr.Set_Owner_Health(100);
            JWarning2.setText(" "+Choice+" Ice Cream Eaten");
        }
    }//GEN-LAST:event_JIce_Cream_EatActionPerformed

    private void JWarning1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JWarning1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JWarning1ActionPerformed

    private void JWarning2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JWarning2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JWarning2ActionPerformed

    private void JWarning3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JWarning3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JWarning3ActionPerformed

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
            java.util.logging.Logger.getLogger(Park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Park().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBack_To_Status_Page;
    private javax.swing.JButton JCandy_Eat;
    private javax.swing.JButton JCoster_Ride;
    private javax.swing.JButton JIce_Cream_Eat;
    private javax.swing.JComboBox<String> JIce_Cream_List;
    private javax.swing.JButton JPark_Address;
    private javax.swing.JTextField JWarning1;
    private javax.swing.JTextField JWarning2;
    private javax.swing.JTextField JWarning3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
