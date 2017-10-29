package pet_simulation_v2;
/*
 @author Nibir(BurstLinker)
 */

import java.io.*;

public class Log_In extends javax.swing.JFrame {
    public Log_In() {
        initComponents();
    }
    
    // decalring public variables
    String Owner_Name;
    String Pet_Name;
    double Owner_Health;
    double Pet_Health;
    double Owner_Money;
    double Pet_Money;
    File f1,f2 ;
    FileWriter fw1,fw2;
    boolean Ans;
    //end of variable declaration
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JChoosePet = new javax.swing.JComboBox<>();
        JPlay = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JUser_Address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JLevel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Pet Simulator V2");

        jLabel2.setText("User Name :");

        JUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUserNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Pet :");

        JChoosePet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beagle", "Poodle", "BullDog", "Boxer", "Pug" }));

        JPlay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JPlay.setText("Play");
        JPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPlayMouseReleased(evt);
            }
        });

        jLabel4.setText("User Address :");

        jLabel5.setText("  Level :");

        JLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pro", "Noob" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JUserName)
                            .addComponent(JUser_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JChoosePet, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPlay)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JUser_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JChoosePet, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPlay)
                        .addGap(16, 16, 16))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUserNameActionPerformed
        
    }//GEN-LAST:event_JUserNameActionPerformed

    private void JPlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPlayMouseReleased

        // here we are setting the values for the owner
        Owner_Name = JUserName.getText();
        Owner_Health = 30.0;
        Owner_Money = 0.0;
        
        // calling upon the instance
        PlayerInfo plr = PlayerInfo.getInstance();
        
        // here we stored the name and address of the player 
        f1 = new File("Player_Name.txt");
        f2 = new File("Player_Address.txt");
        try {
            
            fw1 = new FileWriter(f1);
            fw1.write(Owner_Name);
            fw1.close();
            
            fw2 = new FileWriter(f2);
            fw2.write(JUser_Address.getText());
            fw2.close();
            
        } catch (IOException ex) {
            System.out.println("Coudn't create the file");
        }
        
        // here we are setting the values for the Pet based on OOP
        Pet_Name = (String) JChoosePet.getSelectedItem();
        switch(Pet_Name){
            case "Beagle" :
                Beagle TO = new Beagle();
                TO.Set_Health(80);
                Pet_Health = TO.Get_Health();
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "Poodle" :
                Poodle BO = new Poodle();
                BO.Set_Health(70);
                Pet_Health = BO.Get_Health();
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "BullDog" :
                BullDog GO = new BullDog();
                GO.Set_Health(65);
                Pet_Health = GO.Get_Health();
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "Boxer" :
                Boxer PO = new Boxer();
                PO.Set_Health(75);
                Pet_Health = PO.Get_Health();
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "Pug" :
                Pug RO = new Pug();
                RO.Set_Health(85);
                Pet_Health = RO.Get_Health();
                plr.Set_Pet_Health(Pet_Health);
                break;
            default :
                System.out.println("Select properly");
                break;
        }
        Pet_Money = 0.0;
        // storing values in the Instance 
        plr.Set_Pet_Name(Pet_Name);
        // creating status page object
        Status_Page Status_Page_Obj = new Status_Page();
        Status_Page_Obj.setVisible(true);
        
        // popping up the main theme of the game
        Main_Game_Theme obj = new Main_Game_Theme();
        obj.setVisible(true);
        
        // here we are setting the values for the labels that are in Status Page for the Owner
        Status_Page_Obj.JOwnerName.setText(Owner_Name);
        Status_Page_Obj.JOwner_Health.setText(Double.toString(Owner_Health));
        Status_Page_Obj.JOwner_Money.setText(Double.toString(Owner_Money));
        
        // here we are setting the values for the labels that are in Status Page for the Pet
        Status_Page_Obj.JPet_Name.setText(plr.Get_Pet_Name()); 
        Status_Page_Obj.JPet_Health.setText(Double.toString(Pet_Health)); 
        Status_Page_Obj.JPet_Money.setText(Double.toString(plr.get_pet_Balance()));
        
        
        this.dispose();
    }//GEN-LAST:event_JPlayMouseReleased

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
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_In().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> JChoosePet;
    private javax.swing.JComboBox<String> JLevel;
    private javax.swing.JButton JPlay;
    public javax.swing.JTextField JUserName;
    public javax.swing.JTextField JUser_Address;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
