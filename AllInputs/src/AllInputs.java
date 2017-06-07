
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class AllInputs extends javax.swing.JFrame {
    public AllInputs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroupAge = new javax.swing.ButtonGroup();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lbAge = new javax.swing.JLabel();
        rbAge1 = new javax.swing.JRadioButton();
        rbAge2 = new javax.swing.JRadioButton();
        rbAge3 = new javax.swing.JRadioButton();
        lbPets = new javax.swing.JLabel();
        cbCat = new javax.swing.JCheckBox();
        cbDog = new javax.swing.JCheckBox();
        cbOther = new javax.swing.JCheckBox();
        lbContients = new javax.swing.JLabel();
        cbContients = new javax.swing.JComboBox<>();
        lbTemp = new javax.swing.JLabel();
        jbSubmit = new javax.swing.JButton();
        lbResult = new javax.swing.JLabel();
        slTemperature = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbName.setText("Name:");

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        lbAge.setText("Age:");

        bgroupAge.add(rbAge1);
        rbAge1.setText("Below 18");
        rbAge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAge1ActionPerformed(evt);
            }
        });

        bgroupAge.add(rbAge2);
        rbAge2.setText("18-35");
        rbAge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAge2ActionPerformed(evt);
            }
        });

        bgroupAge.add(rbAge3);
        rbAge3.setText(" up 36");
        rbAge3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAge3ActionPerformed(evt);
            }
        });

        lbPets.setText("Pets:");

        cbCat.setText("Cat");
        cbCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCatActionPerformed(evt);
            }
        });

        cbDog.setText("Dog");
        cbDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDogActionPerformed(evt);
            }
        });

        cbOther.setText("Others");
        cbOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOtherActionPerformed(evt);
            }
        });

        lbContients.setText("Continents");

        cbContients.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "America", "Africa", "Asia", "Europe", "Oceania" }));
        cbContients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbContientsActionPerformed(evt);
            }
        });

        lbTemp.setText("Reference Temp:");

        jbSubmit.setText("Submit");
        jbSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubmitActionPerformed(evt);
            }
        });

        lbResult.setText("...");

        slTemperature.setMajorTickSpacing(5);
        slTemperature.setMaximum(35);
        slTemperature.setMinimum(15);
        slTemperature.setMinorTickSpacing(1);
        slTemperature.setPaintLabels(true);
        slTemperature.setPaintTicks(true);
        slTemperature.setSnapToTicks(true);
        slTemperature.setValue(25);
        slTemperature.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slTemperatureStateChanged(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbName)
                                    .addComponent(lbAge))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbAge1)
                                            .addComponent(cbCat)
                                            .addComponent(cbContients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbAge2)
                                            .addComponent(cbDog))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(cbOther))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(rbAge3))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))))
                            .addComponent(lbPets)
                            .addComponent(lbContients)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbTemp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSubmit)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbResult, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(326, 326, 326))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAge)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbAge1)
                                .addComponent(rbAge2)
                                .addComponent(rbAge3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPets)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbDog)
                                .addComponent(cbOther)
                                .addComponent(cbCat)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbContients)
                            .addComponent(cbContients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTemp)
                            .addComponent(slTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSubmit)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbResult)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbContientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbContientsActionPerformed
        // TODO add your handling code here:
        String[] contientsStrings = {"America", "Africa", "Asia", "Europe", "Oceania" };
        cbContients = (JComboBox)evt.getSource();
        //System.out.println("Contients is "+conString);
    }//GEN-LAST:event_cbContientsActionPerformed

    private void rbAge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAge1ActionPerformed
        // TODO add your handling code here:
       
        rbAge1.setActionCommand(" Below 18");
    }//GEN-LAST:event_rbAge1ActionPerformed

    private void rbAge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAge2ActionPerformed
        // TODO add your handling code here:
        rbAge2.setActionCommand("18-35");
        
    }//GEN-LAST:event_rbAge2ActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
                // TODO add your handling code here:
        
    }//GEN-LAST:event_tfNameActionPerformed

    private void rbAge3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAge3ActionPerformed
        // TODO add your handling code here:
        
        rbAge3.setActionCommand(">36");
    }//GEN-LAST:event_rbAge3ActionPerformed

    
    private void cbDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDogActionPerformed
        // TODO add your handling code here:
        cbD = evt.getActionCommand();
        cbDog.setActionCommand("Dog, ");
    }//GEN-LAST:event_cbDogActionPerformed

    
    private void jbSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubmitActionPerformed
        String name = tfName.getText();
        String outputString = "";
        //ButtonGroup bgroupAge.isSe
        if (name.isEmpty()  ){
            JOptionPane.showMessageDialog(this, "tfName is Empty","Name missing",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        tfName.setText(name);
        String bgAgeResult = bgroupAge.getSelection().getActionCommand();
        String cbPetsResult = cbC+" "+cbD+" "+cbO;
        String conString = (String)cbContients.getSelectedItem();
        String conResult = conString.toString();

        int temperatureInt = slTemperature.getValue();
        System.out.println("Temp is  "+temperatureInt);
        
        outputString = "Name: "+name+"; Age: "+bgAgeResult+"; Pets : "+cbPetsResult+"; Contients is "+conResult+" ; Temperature is: "+temperatureInt+";"+"\n";
        lbResult.setText(outputString);
        System.out.println("Name:"+name+" ; Age :"+bgAgeResult + " , Pets is "+cbPetsResult+",Contients is "+conResult+" ; Temperature is: "+temperatureInt+";"+"\n");
        System.out.println(outputString);
        AllInputs allin = new AllInputs();
        allin.saveToFile(outputString);
            //System.out.println("Save file success");
        
    }//GEN-LAST:event_jbSubmitActionPerformed

    private void cbCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCatActionPerformed
        // TODO add your handling code here:
        cbC =evt.getActionCommand();
        cbCat.setActionCommand("Cat, ");
       
    }//GEN-LAST:event_cbCatActionPerformed

    private void cbOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOtherActionPerformed
        // TODO add your handling code here:
        cbO =evt.getActionCommand();
        cbOther.setActionCommand("Others .");
        
    }//GEN-LAST:event_cbOtherActionPerformed

    private void slTemperatureStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slTemperatureStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_slTemperatureStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tfName.setText("");
        rbAge1.setSelected(false);
        rbAge2.setSelected(false);
        rbAge3.setSelected(false);
        cbCat.setSelected(false);
        cbDog.setSelected(false);
        cbOther.setSelected(false);
        cbContients.setSelectedIndex(1);
        //cbContients.setEnabled(true);
        slTemperature.setValue(25);

        
    }//GEN-LAST:event_jButton1ActionPerformed

    String cbC = "";
    String cbD = "";
    String cbO = "";
    
    public static void saveToFile(String a)
    {
        try{
            
            Writer output;
            output =new BufferedWriter(new FileWriter("AllInput.txt", true));//clears file every time
            //output.append("AllInputs!");
            output.append("\n");
            output.append(a);
            
            output.close();
             
            System.out.println("Save file success");

        } catch (IOException e) {
   // do something
   
}
    
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        JFrame frame = new JFrame("All Inputs JFrame");
        JPanel entreePanel = new JPanel();
        JRadioButton radioButton;

        final JPanel allInputsPanel = new JPanel();
        
        allInputsPanel.add(new JCheckBox("C"));
        allInputsPanel.add(new JCheckBox("D"));
        allInputsPanel.add(new JCheckBox("O"));
       
        JButton submitButton = new JButton("Submit2");
        frame.setLayout(new GridLayout(3, 1));
        frame.add(entreePanel);
        frame.add(allInputsPanel);

        submitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        //String entreeAge = bgroupAge.getSelection().getActionCommand();
        //System.out.println(entreeAge + " Age Seclect");
        Component[] components = allInputsPanel.getComponents();
        for (Component c : components) {
          JCheckBox cc = (JCheckBox) c;
          if (cc.isSelected())
            System.out.println("Success!");
        }
      }
    });
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AllInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllInputs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgroupAge;
    private javax.swing.JCheckBox cbCat;
    private javax.swing.JComboBox<String> cbContients;
    private javax.swing.JCheckBox cbDog;
    private javax.swing.JCheckBox cbOther;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbSubmit;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbContients;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPets;
    private javax.swing.JLabel lbResult;
    private javax.swing.JLabel lbTemp;
    private javax.swing.JRadioButton rbAge1;
    private javax.swing.JRadioButton rbAge2;
    private javax.swing.JRadioButton rbAge3;
    private javax.swing.JSlider slTemperature;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
