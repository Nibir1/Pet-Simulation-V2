package pet_simulation_v2;
/*
 * @author Nibir(BurstLinker)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Shop extends javax.swing.JFrame {

    public Shop() {
        initComponents();
    }
    // variable declaration starts here
    int Earned_Value = 0;
    String Name;
    double Owner_Health = 30.0;
    double Owner_Money = 0.0;
    double Pet_Health = 50.0; 
    // End of variable declaration
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBack_To_Status_Page = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JMedicine_List = new javax.swing.JComboBox<>();
        JMed_Buy = new javax.swing.JButton();
        JMed_Warning = new javax.swing.JTextField();
        JDrink_List = new javax.swing.JComboBox<>();
        JDrink_Buy = new javax.swing.JButton();
        JDrink_Warning = new javax.swing.JTextField();
        JBake_List = new javax.swing.JComboBox<>();
        JBake_Buy = new javax.swing.JButton();
        JBake_Warning = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JBack_To_Status_Page.setText("Back_To_Status_Page");
        JBack_To_Status_Page.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JBack_To_Status_PageMouseReleased(evt);
            }
        });

        jButton1.setText("See Location");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Medicine");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Drinks");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Bakes");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JMedicine_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ace+", "Neotak", "Alatrol", "Antacid+", "" }));

        JMed_Buy.setText("Buy");
        JMed_Buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JMed_BuyMouseReleased(evt);
            }
        });
        JMed_Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMed_BuyActionPerformed(evt);
            }
        });

        JMed_Warning.setEditable(false);

        JDrink_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sprite", "Cocacola", "RedBull", "Apple_Juice", "" }));

        JDrink_Buy.setText("Buy");
        JDrink_Buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JDrink_BuyMouseReleased(evt);
            }
        });

        JDrink_Warning.setEditable(false);

        JBake_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bread", "Biscuits", "Cake", "Chips", " " }));

        JBake_Buy.setText("Buy");
        JBake_Buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JBake_BuyMouseReleased(evt);
            }
        });

        JBake_Warning.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JBack_To_Status_Page))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(JMed_Warning, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JMedicine_List, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JMed_Buy)
                                .addGap(73, 73, 73)))))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JDrink_List, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JDrink_Buy)
                                .addGap(64, 64, 64))
                            .addComponent(JDrink_Warning, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBake_List, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBake_Buy)
                        .addGap(64, 64, 64))
                    .addComponent(JBake_Warning, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(JMedicine_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(JMed_Buy)
                                .addGap(47, 47, 47)
                                .addComponent(JMed_Warning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(JDrink_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(JDrink_Buy)
                                .addGap(47, 47, 47)
                                .addComponent(JDrink_Warning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(JBake_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(JBake_Buy)
                                .addGap(47, 47, 47)
                                .addComponent(JBake_Warning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(71, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jSeparator1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBack_To_Status_Page)
                    .addComponent(jButton1))
                .addContainerGap())
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
        Status_Page_Obj.JOwnerName.setText(Name);
        Status_Page_Obj.JOwner_Health.setText(Double.toString(Owner_Health));
        Status_Page_Obj.JOwner_Money.setText(Double.toString(Owner_Money));
        
        // setting values for the pet
        PlayerInfo plr = PlayerInfo.getInstance();
        Status_Page_Obj.JPet_Name.setText(plr.Get_Pet_Name());
        Status_Page_Obj.JPet_Health.setText(Double.toString(Pet_Health));
        Status_Page_Obj.JPet_Money.setText(Integer.toString(plr.get_pet_Balance()));
        this.dispose();
    }//GEN-LAST:event_JBack_To_Status_PageMouseReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        
        Shop_Address Shop_Address_Obj = new Shop_Address();
        Shop_Address_Obj.setVisible(true);
    }//GEN-LAST:event_jButton1MouseReleased

    private void JMed_BuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMed_BuyMouseReleased
        
        // taking what you want to buy based on your money
        PlayerInfo plr = PlayerInfo.getInstance();
        String Item = (String) JMedicine_List.getSelectedItem();
        switch (Item){
            case "Ace+" :
                if (plr.deductFromBalance(20)){
                    JMed_Warning.setText("You bought "+Item);
                }else{
                    JMed_Warning.setText("Price is $20");
                }
                break;
            case "Neotak" :
                if (plr.deductFromBalance(15)){
                    JMed_Warning.setText("You bought "+Item);
                }else{
                    JMed_Warning.setText("Price is $15");
                }
                break;
            case "Alatrol" :
                if (plr.deductFromBalance(30) ){
                    JMed_Warning.setText("You bought "+Item);
                }else{
                    JMed_Warning.setText("Price is $30");
                }
                break;
            case "Antacid+" :
                if (plr.deductFromBalance(25) ){
                    JMed_Warning.setText("You bought "+Item);
                }else{
                    JMed_Warning.setText("Price is $25");
                }
                break;
            default :
                JMed_Warning.setText("Keyboard Much");
                break;
        }
    }//GEN-LAST:event_JMed_BuyMouseReleased

    private void JMed_BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMed_BuyActionPerformed

    }//GEN-LAST:event_JMed_BuyActionPerformed

    private void JDrink_BuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JDrink_BuyMouseReleased
        
        // taking what you want to buy based on your money
        PlayerInfo plr = PlayerInfo.getInstance();
        String Item = (String) JDrink_List.getSelectedItem();
        switch (Item){
            case "Sprite" :
                if (plr.deductFromBalance(10)){
                    JDrink_Warning.setText("You bought "+Item);
                }else{
                    JDrink_Warning.setText("Price is $10");
                }
                break;
            case "Cocacola" :
                if (plr.deductFromBalance(15)){
                    JDrink_Warning.setText("You bought "+Item);
                }else{
                    JDrink_Warning.setText("Price is $15");
                }
                break;
            case "RedBull" :
                if (plr.deductFromBalance(20) ){
                    JDrink_Warning.setText("You bought "+Item);
                }else{
                    JDrink_Warning.setText("Price is $20");
                }
                break;
            case "Apple_Juice" :
                if (plr.deductFromBalance(18) ){
                    JDrink_Warning.setText("You bought "+Item);
                }else{
                    JDrink_Warning.setText("Price is $18");
                }
                break;
            default :
                JDrink_Warning.setText("Keyboard Much");
                break;
        }
    }//GEN-LAST:event_JDrink_BuyMouseReleased

    private void JBake_BuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBake_BuyMouseReleased
        
        // taking what you want to buy based on your money
        PlayerInfo plr = PlayerInfo.getInstance();
        String Item = (String) JBake_List.getSelectedItem();
        switch (Item){
            case "Bread" :
                if (plr.deductFromBalance(15)){
                    JBake_Warning.setText("You bought "+Item);
                }else{
                    JBake_Warning.setText("Price is $15");
                }
                break;
            case "Biscuits" :
                if (plr.deductFromBalance(25)){
                    JBake_Warning.setText("You bought "+Item);
                }else{
                    JBake_Warning.setText("Price is $25");
                }
                break;
            case "Cake" :
                if (plr.deductFromBalance(28) ){
                    JBake_Warning.setText("You bought "+Item);
                }else{
                    JBake_Warning.setText("Price is $28");
                }
                break;
            case "Chips" :
                if (plr.deductFromBalance(8) ){
                    JBake_Warning.setText("You bought "+Item);
                }else{
                    JBake_Warning.setText("Price is $8");
                }
                break;
            default :
                JBake_Warning.setText("Keyboard Much");
                break;
        }
    }//GEN-LAST:event_JBake_BuyMouseReleased

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
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBack_To_Status_Page;
    private javax.swing.JButton JBake_Buy;
    private javax.swing.JComboBox<String> JBake_List;
    private javax.swing.JTextField JBake_Warning;
    private javax.swing.JButton JDrink_Buy;
    private javax.swing.JComboBox<String> JDrink_List;
    private javax.swing.JTextField JDrink_Warning;
    private javax.swing.JButton JMed_Buy;
    private javax.swing.JTextField JMed_Warning;
    private javax.swing.JComboBox<String> JMedicine_List;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
