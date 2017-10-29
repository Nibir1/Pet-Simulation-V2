package pet_simulation_v2;
/*
 * @author Nibir(BurstLinker)
 */
import java.util.*;
import java.io.*;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }
    
    // decalring public variables
    Scanner Read1,Read2;
    String Name,Address;
    File f1,f2;
    String Owner_Name;
    double Owner_Health;
    double Owner_Money = 0.0;
    String Pet_Name;
    double Pet_Health;
    double Pet_Money; 
    //end of variable declaration
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBack_To_Status_Page = new javax.swing.JButton();
        JSee_Location = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JEnter_Kitchen = new javax.swing.JButton();
        JPass_Kitchen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JFood_Label = new javax.swing.JLabel();
        JWarning1 = new javax.swing.JLabel();
        JFoodList = new javax.swing.JComboBox<>();
        JCook = new javax.swing.JButton();
        JSleep_Label = new javax.swing.JLabel();
        JSleep_Duration = new javax.swing.JComboBox<>();
        JSleep = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JPass_Bed_Room = new javax.swing.JTextField();
        JEnter_Bed_Room = new javax.swing.JButton();
        JWarning2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JPass_Gaming_Room = new javax.swing.JTextField();
        JEnter_Gaming_Room = new javax.swing.JButton();
        JWarning3 = new javax.swing.JLabel();
        JGaming_Label = new javax.swing.JLabel();
        JGaming_List = new javax.swing.JComboBox<>();
        JPlay = new javax.swing.JButton();
        JGiveAway = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JBack_To_Status_Page.setText("Back To Status Page");
        JBack_To_Status_Page.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JBack_To_Status_PageMouseReleased(evt);
            }
        });

        JSee_Location.setText("See Location");
        JSee_Location.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JSee_LocationMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Bed Room");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Gaming Room");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Kitchen");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JEnter_Kitchen.setText("Enter Kitchen");
        JEnter_Kitchen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JEnter_KitchenMouseReleased(evt);
            }
        });

        jLabel4.setText("Pass :");

        JFood_Label.setText("Food :");
        JFood_Label.setEnabled(false);

        JFoodList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza", "Burger", "Sub_Sandwitch", "Fried_Rice" }));
        JFoodList.setEnabled(false);

        JCook.setText("Cook & Feed Master");
        JCook.setEnabled(false);
        JCook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JCookMouseReleased(evt);
            }
        });

        JSleep_Label.setText("Sleep Hour :");
        JSleep_Label.setEnabled(false);

        JSleep_Duration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        JSleep_Duration.setEnabled(false);

        JSleep.setText("Sleep");
        JSleep.setEnabled(false);
        JSleep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JSleepMouseReleased(evt);
            }
        });

        jLabel6.setText("Pass :");

        JEnter_Bed_Room.setText("Enter Bed Room");
        JEnter_Bed_Room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JEnter_Bed_RoomMouseReleased(evt);
            }
        });
        JEnter_Bed_Room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEnter_Bed_RoomActionPerformed(evt);
            }
        });

        jLabel7.setText("Pass :");

        JEnter_Gaming_Room.setText("Enter Gaming Room");
        JEnter_Gaming_Room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JEnter_Gaming_RoomMouseReleased(evt);
            }
        });
        JEnter_Gaming_Room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEnter_Gaming_RoomActionPerformed(evt);
            }
        });

        JGaming_Label.setText("Games :");
        JGaming_Label.setEnabled(false);

        JGaming_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Call_Of_Duty", "Battlefield", "Ghost_In_The_Shell", "Titanfall_2" }));
        JGaming_List.setEnabled(false);

        JPlay.setText("Play");
        JPlay.setEnabled(false);
        JPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPlayMouseReleased(evt);
            }
        });

        JGiveAway.setText("Give The Rest Of The Money To Owner");
        JGiveAway.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JGiveAwayMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(JEnter_Kitchen))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JPass_Kitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JWarning1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JCook)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JFood_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(JFoodList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JSleep))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JEnter_Bed_Room)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JPass_Bed_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JSleep_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(JSleep_Duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(JWarning2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPlay, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JGaming_Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JGaming_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JPass_Gaming_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JEnter_Gaming_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(JWarning3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 26, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1)))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSee_Location)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JGiveAway)
                .addGap(98, 98, 98)
                .addComponent(JBack_To_Status_Page)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(226, 226, 226)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(504, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(JPass_Kitchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JEnter_Kitchen))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(JPass_Bed_Room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JEnter_Bed_Room)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JWarning1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(JFood_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JFoodList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JCook))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JWarning2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(JSleep))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(JSleep_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JSleep_Duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JPass_Gaming_Room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JEnter_Gaming_Room)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JWarning3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JGaming_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JGaming_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addComponent(JPlay)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBack_To_Status_Page)
                    .addComponent(JSee_Location)
                    .addComponent(JGiveAway))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addGap(58, 58, 58)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBack_To_Status_PageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBack_To_Status_PageMouseReleased
        
        Status_Page Status_Page_Obj = new Status_Page();
        PlayerInfo plr = PlayerInfo.getInstance();
        // Reading and setting values for the Owner
        f1 = new File("Player_Name.txt");
        try {
            Read1 = new Scanner(f1);
            
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

    private void JSee_LocationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSee_LocationMouseReleased
        
        // these codes lets us to show values of the players name and address
        Home_Address Home_Address_Obj = new Home_Address();
        Home_Address_Obj.setVisible(true);
        
        f1 = new File("Player_Name.txt");
        f2 = new File("Player_Address.txt");
        try {
            Read1 = new Scanner(f1);
            Read2 = new Scanner(f2);
            
            while (Read1.hasNext()){
              Name = Read1.next();
            }
            while (Read2.hasNext()){
              Address = Read2.next();
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Couldn't read from file");
        }
        
        Home_Address_Obj.JHome_Name.setText(" "+Name+"'s Residence");
        Home_Address_Obj.JHome_Address.setText(" "+Address);
    }//GEN-LAST:event_JSee_LocationMouseReleased

    private void JEnter_KitchenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JEnter_KitchenMouseReleased
        
        // kitchen password and enabling things
        String Kitchen_Pass = JPass_Kitchen.getText();
        String Reset = null;
        JPass_Kitchen.setText(Reset);
        switch(Kitchen_Pass){
            case "1" : 
                JFood_Label.setEnabled(true);
                JFoodList.setEnabled(true);
                JCook.setEnabled(true);
                JWarning1.setText(null);
                break;
            default :
                JWarning1.setText("Wrong Password");
                JFood_Label.setEnabled(false);
                JFoodList.setEnabled(false);
                JCook.setEnabled(false);
                break;
        }
        
    }//GEN-LAST:event_JEnter_KitchenMouseReleased

    private void JCookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCookMouseReleased
        
        // cooking and setting values of Owner and pet
        PlayerInfo plr = PlayerInfo.getInstance();
        switch((String)JFoodList.getSelectedItem()){
            case "Pizza" : 
                Owner_Health = 90.0;
                Pet_Health = 80;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "Burger" :
                Owner_Health = 80.0;
                Pet_Health = 70;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "Sub_Sandwitch" :
                Owner_Health = 70.0;
                Pet_Health = 60;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "Fried_Rice" :
                Owner_Health = 75.0;
                Pet_Health = 50;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            default :
                System.out.println("You need to be good at cooking");
                break;
        }
    }//GEN-LAST:event_JCookMouseReleased

    private void JEnter_Bed_RoomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JEnter_Bed_RoomMouseReleased
        // Bed Room password and enabling things
        String Bed_Room_Pass = JPass_Bed_Room.getText();
        String Reset = null;
        JPass_Bed_Room.setText(Reset);
        switch(Bed_Room_Pass){
            case "2" : 
                JSleep_Label.setEnabled(true);
                JSleep_Duration.setEnabled(true);
                JSleep.setEnabled(true);
                JWarning2.setText(null);
                break;
            default :
                JWarning2.setText("Wrong Password");
                JSleep_Label.setEnabled(false);
                JSleep_Duration.setEnabled(false);
                JSleep.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_JEnter_Bed_RoomMouseReleased

    private void JEnter_Bed_RoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEnter_Bed_RoomActionPerformed
        
    }//GEN-LAST:event_JEnter_Bed_RoomActionPerformed

    private void JSleepMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSleepMouseReleased
        // Sleeping and setting values of Owner
        PlayerInfo plr = PlayerInfo.getInstance();
        switch((String)JSleep_Duration.getSelectedItem()){
            case "1" : 
                Owner_Health = 70.0;
                Pet_Health = 70;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "2" :
                Owner_Health = 80.0;
                Pet_Health = 70;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "3" :
                Owner_Health = 90.0;
                Pet_Health = 80;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "4" :
                Owner_Health = 100.0;
                Pet_Health = 85;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            default :
                System.out.println("You need to be good at Sleeping");
                break;
        }
    }//GEN-LAST:event_JSleepMouseReleased

    private void JEnter_Gaming_RoomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JEnter_Gaming_RoomMouseReleased
        // Gaming Room password and enabling things
        String Gaming_Room_Pass = JPass_Gaming_Room.getText();
        String Reset = null;
        JPass_Gaming_Room.setText(Reset);
        switch(Gaming_Room_Pass){
            case "3" : 
                JGaming_Label.setEnabled(true);
                JGaming_List.setEnabled(true);
                JPlay.setEnabled(true);
                JWarning3.setText(null);
                break;
            default :
                JWarning3.setText("Wrong Password");
                JGaming_Label.setEnabled(false);
                JGaming_List.setEnabled(false);
                JPlay.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_JEnter_Gaming_RoomMouseReleased

    private void JEnter_Gaming_RoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEnter_Gaming_RoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JEnter_Gaming_RoomActionPerformed

    private void JPlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPlayMouseReleased
        // Gaming and setting values of Owner
        PlayerInfo plr = PlayerInfo.getInstance();
        switch((String)JGaming_List.getSelectedItem()){
            case "Call_Of_Duty" : 
                Owner_Health = 80.0;
                Pet_Health = 70;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "Battlefield" :
                Owner_Health = 80.0;
                Pet_Health = 70;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "Ghost_In_The_Shell" :
                Owner_Health = 90.0;
                Pet_Health = 80;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            case "Titanfall_2" :
                Owner_Health = 100.0;
                Pet_Health = 85;
                plr.Set_Owner_Health(Owner_Health);
                plr.Set_Pet_Health(Pet_Health);
                break;
            default :
                System.out.println("You need to be good at gaming");
                break;
        }
    }//GEN-LAST:event_JPlayMouseReleased

    private void JGiveAwayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JGiveAwayMouseReleased
        
        PlayerInfo plr = PlayerInfo.getInstance();
        plr.Set_Owner_Money(plr.get_pet_Balance());
        plr.set_pet_Balance(0); // setting pets money to 0 
        
    }//GEN-LAST:event_JGiveAwayMouseReleased

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JBack_To_Status_Page;
    public javax.swing.JButton JCook;
    public javax.swing.JButton JEnter_Bed_Room;
    public javax.swing.JButton JEnter_Gaming_Room;
    public javax.swing.JButton JEnter_Kitchen;
    private javax.swing.JComboBox<String> JFoodList;
    private javax.swing.JLabel JFood_Label;
    private javax.swing.JLabel JGaming_Label;
    public javax.swing.JComboBox<String> JGaming_List;
    private javax.swing.JButton JGiveAway;
    public javax.swing.JTextField JPass_Bed_Room;
    public javax.swing.JTextField JPass_Gaming_Room;
    public javax.swing.JTextField JPass_Kitchen;
    private javax.swing.JButton JPlay;
    private javax.swing.JButton JSee_Location;
    private javax.swing.JButton JSleep;
    public javax.swing.JComboBox<String> JSleep_Duration;
    private javax.swing.JLabel JSleep_Label;
    private javax.swing.JLabel JWarning1;
    private javax.swing.JLabel JWarning2;
    private javax.swing.JLabel JWarning3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
