
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/*Quiz 1*/
public class IceCreamSelection extends javax.swing.JFrame {

    File currentFile;
    boolean isModified;
    String flav1 = "";
    String flav2 = "";
    String flav3 = "";
    String flav4 = "";
    //rbsmall.setSelected(false);
    
    public IceCreamSelection() {
        initComponents();
        rbsmall.setSelected(true);
        rbMedium.setSelected(false);
        rbLarge.setSelected(false);
        
        jbFlavour1.setText("Add 1");
        jbFlavour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFlavour1ActionPerformed(evt);
            }
        });
        
        jbFlavour2.setText("Add 2");
        jbFlavour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFlavour1ActionPerformed(evt);
            }
        });
        
        jbFlavour3.setText("Add 3");
        jbFlavour3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFlavour1ActionPerformed(evt);
            }
        });
        
        jbFlavour4.setText("Add 4");
        jbFlavour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFlavour1ActionPerformed(evt);
            }
        });
        //textArea.getDocument().addDocumentListener(new MyDocumentListener());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSize = new javax.swing.ButtonGroup();
        fileChooserOpen = new javax.swing.JFileChooser();
        fileChooserSave = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbCustName = new javax.swing.JLabel();
        tfCustName = new javax.swing.JTextField();
        lbSize = new javax.swing.JLabel();
        rbsmall = new javax.swing.JRadioButton();
        rbMedium = new javax.swing.JRadioButton();
        rbLarge = new javax.swing.JRadioButton();
        cbChocolate = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbSprinkle = new javax.swing.JCheckBox();
        cbType = new javax.swing.JComboBox<>();
        jbFlavour1 = new javax.swing.JButton();
        jbFlavour2 = new javax.swing.JButton();
        jbFlavour3 = new javax.swing.JButton();
        jbFlavour4 = new javax.swing.JButton();
        jbPlace = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miLoad = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblStatus.setText("lblStatus");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblStatus)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblStatus)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbCustName.setText("Customer Name: ");

        tfCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCustNameActionPerformed(evt);
            }
        });

        lbSize.setText("Scoop Size");

        bgSize.add(rbsmall);
        rbsmall.setSelected(true);
        rbsmall.setText("Small");
        rbsmall.setContentAreaFilled(false);
        rbsmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsmallActionPerformed(evt);
            }
        });

        bgSize.add(rbMedium);
        rbMedium.setText("Medium");
        rbMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMediumActionPerformed(evt);
            }
        });

        bgSize.add(rbLarge);
        rbLarge.setText("Large");
        rbLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLargeActionPerformed(evt);
            }
        });

        cbChocolate.setText("Chocolate");

        jLabel2.setText("Topping");

        jLabel3.setText("Cone Type");

        cbSprinkle.setText("Sprinkle");

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Waffle", "sweet", "cheese" }));
        cbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeActionPerformed(evt);
            }
        });

        jbFlavour1.setText("Add");
        jbFlavour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFlavour1ActionPerformed(evt);
            }
        });

        jbFlavour2.setText("Add");
        jbFlavour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFlavour2ActionPerformed(evt);
            }
        });

        jbFlavour3.setText("Add");
        jbFlavour3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFlavour3ActionPerformed(evt);
            }
        });

        jbFlavour4.setText("Add");
        jbFlavour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFlavour4ActionPerformed(evt);
            }
        });

        jbPlace.setText("Place Order");
        jbPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbCustName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSize)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbsmall)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbMedium)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbLarge))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbChocolate))
                                        .addGap(18, 18, 18)
                                        .addComponent(cbSprinkle))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jbFlavour2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbFlavour3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbFlavour4))))
                            .addComponent(jLabel3)
                            .addComponent(jbFlavour1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jbPlace)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCustName)
                    .addComponent(tfCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSize)
                    .addComponent(rbsmall)
                    .addComponent(rbMedium)
                    .addComponent(rbLarge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbChocolate)
                    .addComponent(jLabel2)
                    .addComponent(cbSprinkle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFlavour1)
                    .addComponent(jbFlavour2)
                    .addComponent(jbFlavour3)
                    .addComponent(jbFlavour4))
                .addGap(27, 27, 27)
                .addComponent(jbPlace)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setText("Orders");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setEnabled(false);
        jScrollPane1.setViewportView(textArea);

        jMenu1.setText("File");

        miLoad.setText(" Load Flavours");
        miLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoadActionPerformed(evt);
            }
        });
        jMenu1.add(miLoad);

        miSave.setText("Save Orders as");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        jMenu1.add(miSave);

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoadActionPerformed
        // TODO add your handling code here:
        fileChooserOpen.setFileFilter(new FileNameExtensionFilter("*.flav", "flav"));
        if (fileChooserOpen.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                currentFile = fileChooserOpen.getSelectedFile();
                // FIXME: what happens if we can't read the file?
                //String content = new Scanner(currentFile).useDelimiter("\\Z").next();
                Scanner content = new Scanner(currentFile);
                
                jbFlavour1.setText(content.next());
                
                jbFlavour2.setText(content.next());
                jbFlavour3.setText(content.next());
                jbFlavour4.setText(content.next());
                try{
                flav1 = content.next();
                    
                flav2 = content.next();
                flav3 = content.next();
                flav4 = content.next();
                } catch (NoSuchElementException ex)
                {
                    System.out.println("No Such Element Exception 391");
                    return;
                }
                
                System.out.println("flav1 is"+flav1+" flav2 is "+flav2+" flav3 is "+flav3+" flav4 is "+flav4);
                content.close();
                //lblStatus.setText("Current file: " + currentFile.getAbsolutePath());
            } catch (IOException ex) {
                currentFile = null;
                JOptionPane.showMessageDialog(this,
                        "Unable to load flav file contents from " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_miLoadActionPerformed

    private void rbMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMediumActionPerformed
        // TODO add your handling code here:
        rbMedium.setActionCommand(" Medium Size");
        textArea.setText("Medium Size");
    }//GEN-LAST:event_rbMediumActionPerformed
private String placeOrder() {
    String custName = tfCustName.getText();
        String outputString = "";
        
        if (custName.isEmpty()  ){
            JOptionPane.showMessageDialog(this, "customer name is Empty","Name missing",JOptionPane.WARNING_MESSAGE);
            return null;
        }
        
        outputString = "Customer name:"+tfCustName.getText();
        String bgSizeResult = bgSize.getSelection().getActionCommand();
        outputString = outputString+";"+bgSizeResult;
        ArrayList<String> topping = new ArrayList();
        if (cbChocolate.isSelected()){
            topping.add("Chocolate");
            //textArea.setText("Chocolate");
        }
        if (cbSprinkle.isSelected()){
            topping.add("Sprinkle");
            //textArea.setText("Sprinkle");
        }
        System.out.println("Topping "+topping);
        outputString = outputString+";"+topping;
        String conString = (String)cbType.getSelectedItem();
        String conResult = conString.toString();     
        outputString = outputString+";"+conResult;      
        System.out.println(outputString);

        textArea.setText(outputString);
        return outputString;
}


    private void jbPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlaceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbPlaceActionPerformed

    private void rbsmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsmallActionPerformed
        // TODO add your handling code here:
        rbsmall.setActionCommand(" Small Size");
    }//GEN-LAST:event_rbsmallActionPerformed

    private void rbLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLargeActionPerformed
        // TODO add your handling code here:
        rbLarge.setActionCommand(" Large Size");
        
    }//GEN-LAST:event_rbLargeActionPerformed

    private void cbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeActionPerformed
        // TODO add your handling code here:
        cbType = (JComboBox)evt.getSource();
    }//GEN-LAST:event_cbTypeActionPerformed

    private void tfCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCustNameActionPerformed

    private void jbFlavour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFlavour1ActionPerformed

        jbFlavour1.setText(flav1);
        textArea.setText(placeOrder() + ";"+flav1);
    }//GEN-LAST:event_jbFlavour1ActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        // TODO add your handling code here:
        fileChooserSave.setFileFilter(new FileNameExtensionFilter("*.ord", "ord"));
        if (fileChooserSave.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooserSave.getSelectedFile();
            String filePath = currentFile.getAbsolutePath();
       if(!filePath.endsWith(".ord")) {
            currentFile = new File(filePath + ".ord");
            }
            try (PrintWriter pw = new PrintWriter(currentFile)) {
                pw.write(textArea.getText());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Unable to write order file contents to " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_miSaveActionPerformed

    private void jbFlavour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFlavour2ActionPerformed
        // TODO add your handling code here:
        jbFlavour2.setText(flav2);
        textArea.setText(placeOrder() + ";"+flav2);
    }//GEN-LAST:event_jbFlavour2ActionPerformed

    private void jbFlavour3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFlavour3ActionPerformed
        // TODO add your handling code here:
        jbFlavour3.setText(flav3);
        textArea.setText(placeOrder() + ";"+flav3);

    }//GEN-LAST:event_jbFlavour3ActionPerformed

    private void jbFlavour4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFlavour4ActionPerformed
        // TODO add your handling code here:
        jbFlavour4.setText(flav4);
        textArea.setText(placeOrder() + ";"+flav4);
    }//GEN-LAST:event_jbFlavour4ActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_miExitActionPerformed

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
            java.util.logging.Logger.getLogger(IceCreamSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IceCreamSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IceCreamSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IceCreamSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IceCreamSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSize;
    private javax.swing.JCheckBox cbChocolate;
    private javax.swing.JCheckBox cbSprinkle;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JFileChooser fileChooserOpen;
    private javax.swing.JFileChooser fileChooserSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbFlavour1;
    private javax.swing.JButton jbFlavour2;
    private javax.swing.JButton jbFlavour3;
    private javax.swing.JButton jbFlavour4;
    private javax.swing.JButton jbPlace;
    private javax.swing.JLabel lbCustName;
    private javax.swing.JLabel lbSize;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miLoad;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JRadioButton rbLarge;
    private javax.swing.JRadioButton rbMedium;
    private javax.swing.JRadioButton rbsmall;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField tfCustName;
    // End of variables declaration//GEN-END:variables
}
