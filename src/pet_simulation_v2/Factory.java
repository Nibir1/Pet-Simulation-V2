package pet_simulation_v2;
/*
 * @author Nibir(BurstLinker)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Factory extends javax.swing.JFrame {

    public Factory() {
        initComponents();
    }
    
    // variable declaration starts here
    int Generate_value;
    int Slider_value;
    int max = 100;
    int min = 1;
    int Earned_Value_Pre = 10;
    private int Earned_Value_New = 0 ; 
    int Vault_Value = 0;
    String Name;
    double Owner_Health = 30.0;
    int Owner_Money = 0;
    double Pet_Health = 60.0;
    // End of variable declaration
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBack_To_Status_Page = new javax.swing.JButton();
        JFactory_Loaction = new javax.swing.JButton();
        JGenerate = new javax.swing.JButton();
        JShow_Value = new javax.swing.JTextField();
        JSlider = new javax.swing.JSlider();
        jSeparator1 = new javax.swing.JSeparator();
        JSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JEarned_Value = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JBack_To_Status_Page.setText("Back_To_Status_Page");
        JBack_To_Status_Page.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JBack_To_Status_PageMouseReleased(evt);
            }
        });

        JFactory_Loaction.setText("See Location");
        JFactory_Loaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JFactory_LoactionMouseReleased(evt);
            }
        });

        JGenerate.setText("Generate");
        JGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JGenerateMouseReleased(evt);
            }
        });

        JShow_Value.setEditable(false);

        JSlider.setMinimum(1);
        JSlider.setMinorTickSpacing(5);
        JSlider.setPaintLabels(true);
        JSlider.setPaintTicks(true);
        JSlider.setToolTipText("");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JSubmit.setText("Submit");
        JSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSubmitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Earned");

        JEarned_Value.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(JFactory_Loaction)
                            .addGap(131, 131, 131))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JGenerate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JShow_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(JSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(JBack_To_Status_Page)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(JEarned_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JGenerate)
                    .addComponent(JShow_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JSubmit)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(JEarned_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBack_To_Status_Page)
                            .addComponent(JFactory_Loaction))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBack_To_Status_PageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBack_To_Status_PageMouseReleased
        
        Status_Page Status_Page_Obj = new Status_Page();
        Status_Page_Obj.setVisible(true);
        
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
        PlayerInfo plr = PlayerInfo.getInstance();
        plr.Set_Owner_Health(Owner_Health);
        plr.Set_Owner_Money(Owner_Money);
        Status_Page_Obj.JOwnerName.setText(Name);
        Status_Page_Obj.JOwner_Health.setText(Double.toString(plr.Get_Owner_Health()));
        Status_Page_Obj.JOwner_Money.setText(Double.toString(plr.Get_Owner_Money()));
        
        // setting values for the pet and calling upon the instance 
        plr.Set_Pet_Health(Pet_Health);
        Status_Page_Obj.JPet_Name.setText(plr.Get_Pet_Name());
        Status_Page_Obj.JPet_Health.setText(Double.toString(plr.Get_Pet_Health()));       
        Status_Page_Obj.JPet_Money.setText(Integer.toString(plr.get_pet_Balance()));
        this.dispose();
    }//GEN-LAST:event_JBack_To_Status_PageMouseReleased

    private void JFactory_LoactionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JFactory_LoactionMouseReleased
        
        Factory_Address Factory_Address_Obj = new Factory_Address();
        Factory_Address_Obj.setVisible(true);
    }//GEN-LAST:event_JFactory_LoactionMouseReleased

    private void JGenerateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JGenerateMouseReleased
        // Generating random values
        Random Rand = new Random();
        Generate_value = Rand.nextInt(((max - min) + 1) + min);
        JShow_Value.setText(Integer.toString(Generate_value));
    }//GEN-LAST:event_JGenerateMouseReleased

    private void JSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSubmitActionPerformed
        
        // submitting work in the vault
        Slider_value = JSlider.getValue();
        jTextField1.setText(Integer.toString(Slider_value));
        Vault_Value = Math.max(10-Math.abs(Generate_value - Slider_value), 0);
        
        // here we are setting the money based on the vault_Value
        PlayerInfo plr = PlayerInfo.getInstance();
        JEarned_Value.setText(Integer.toString(Vault_Value));
        
        // Need to use the factory earnings method to add to the previous earned money
        plr.addFactoryEarnings(Vault_Value);
        
        // Generating random values
        Random Rand = new Random();
        Generate_value = Rand.nextInt(((max - min) + 1) + min);
        JShow_Value.setText(Integer.toString(Generate_value));
        
        
    }//GEN-LAST:event_JSubmitActionPerformed
    
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
            java.util.logging.Logger.getLogger(Factory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factory().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBack_To_Status_Page;
    private javax.swing.JTextField JEarned_Value;
    private javax.swing.JButton JFactory_Loaction;
    private javax.swing.JButton JGenerate;
    private javax.swing.JTextField JShow_Value;
    private javax.swing.JSlider JSlider;
    private javax.swing.JButton JSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
