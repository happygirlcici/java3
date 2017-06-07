
package flavour;

import flavour.entity.Flavour;
import flavour.entity.PlaceOrder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame {

    Database db;

    DefaultListModel<Flavour> listModelFlavour = new DefaultListModel<>();
    DefaultListModel<PlaceOrder> listModelOrder = new DefaultListModel<>();
    DefaultListModel<String> listModelFlavourList = new DefaultListModel<>();
    
    
    public MainWindow() {
        try {
            db = new Database();
            initComponents();
            dlgEditOrder.pack();

            refreshFlavourList();
            refreshOrderList();
            enableButtonWhenBothListsSelected();
            //refreshCustList();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed to open database connection",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgEditOrder = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        dlgbtDismiss = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dlgPlaceOrderjList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFlavour = new javax.swing.JList<>();
        btAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListFlavoursChoose = new javax.swing.JList<>();
        tfCustName = new javax.swing.JTextField();
        btManage = new javax.swing.JButton();
        btPlace = new javax.swing.JButton();

        jLabel3.setText("Orders");

        dlgbtDismiss.setText("Dismiss");
        dlgbtDismiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgbtDismissActionPerformed(evt);
            }
        });

        dlgPlaceOrderjList.setModel(listModelOrder);
        dlgPlaceOrderjList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dlgPlaceOrderjListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(dlgPlaceOrderjList);

        javax.swing.GroupLayout dlgEditOrderLayout = new javax.swing.GroupLayout(dlgEditOrder.getContentPane());
        dlgEditOrder.getContentPane().setLayout(dlgEditOrderLayout);
        dlgEditOrderLayout.setHorizontalGroup(
            dlgEditOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEditOrderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(dlgEditOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgEditOrderLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(dlgEditOrderLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dlgbtDismiss)
                        .addGap(78, 78, 78))))
        );
        dlgEditOrderLayout.setVerticalGroup(
            dlgEditOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEditOrderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dlgEditOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dlgbtDismiss))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flavours");

        jLabel1.setText("Flavours");

        jListFlavour.setModel(listModelFlavour);
        jListFlavour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListFlavourMouseClicked(evt);
            }
        });
        jListFlavour.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jListFlavourPropertyChange(evt);
            }
        });
        jListFlavour.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListFlavourValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListFlavour);

        btAdd.setText("Add ->");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer Name");

        jListFlavoursChoose.setModel(listModelFlavourList);
        jListFlavoursChoose.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListFlavoursChooseValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListFlavoursChoose);

        tfCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCustNameActionPerformed(evt);
            }
        });

        btManage.setText("Manage Order");
        btManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageActionPerformed(evt);
            }
        });

        btPlace.setText("Place Order");
        btPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(187, 187, 187)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfCustName))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btManage))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btPlace)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tfCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btManage)
                    .addComponent(btPlace))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCustNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfCustNameActionPerformed

    private void btPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlaceActionPerformed
        // TODO add your handling code here:
        System.out.println("Place Order and Insert data");
        try {
            //System.out.println("Order is "+new_pl.placeOrderID);
            db.addOrders(new_pl);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed to Insert Data PlaceOrder",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
    }//GEN-LAST:event_btPlaceActionPerformed

    int indexFlav = 0;
    String flavName = "";
    
    private void jListFlavourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListFlavourMouseClicked
        // TODO add your handling code here:
        if ((evt.getClickCount() >= 1)) {

            jListFlavour.setSelectedIndex(jListFlavour.locationToIndex(evt.getPoint()));
            indexFlav  = jListFlavour.getSelectedIndex();
            //ArrayList<int[]> indexFlavList = new ArrayList<int[]>(); 
            
            int indexFlavList[]  =jListFlavour.getSelectedIndices();
            jListFlavour.getSelectedIndices();
            if (indexFlav != -1) {
                //for (int mm=0; mm <jListFlavour.getSize();mm++){
                Flavour f = listModelFlavour.get(indexFlav);
                flavName = f.name;
                System.out.println("flavour Name is "+ flavName);
                //}
            }
        }
    }//GEN-LAST:event_jListFlavourMouseClicked
PlaceOrder new_pl;
String str_flavList="";

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        //add flavour + custname to placeOrder
        String customerName = tfCustName.getText();
        String flavourList = flavName;
        int poID = listModelOrder.getSize()+1;
        listModelFlavourList.clear();
        new_pl = new PlaceOrder(poID,customerName,flavourList);
        str_flavList = poID+""+customerName+flavourList;
        listModelFlavourList.addElement(str_flavList);
        
    }//GEN-LAST:event_btAddActionPerformed

    private void dlgbtDismissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgbtDismissActionPerformed
        // TODO add your handling code here:
        dlgEditOrder.dispose();
    }//GEN-LAST:event_dlgbtDismissActionPerformed

    private void btManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageActionPerformed
        // TODO add your handling code here:
        dlgEditOrder.setVisible(true);
        String custName = tfCustName.getText();
        Flavour f = listModelFlavour.get(indexFlav);
        System.out.println("custName is "+ custName);
        String customerName = tfCustName.getText();
        String flavourList = flavName;
        int poID = listModelOrder.getSize()+1;
        listModelOrder.clear();
        ArrayList<PlaceOrder> new_order = new ArrayList<>();
        PlaceOrder new_pl = new PlaceOrder(poID,customerName,flavourList);
        listModelOrder.addElement(new_pl);
    }//GEN-LAST:event_btManageActionPerformed

    private void jListFlavourPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jListFlavourPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jListFlavourPropertyChange

    private void jListFlavourValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListFlavourValueChanged
        // TODO add your handling code here:
        enableButtonWhenBothListsSelected();
    }//GEN-LAST:event_jListFlavourValueChanged

    private void jListFlavoursChooseValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListFlavoursChooseValueChanged
        // TODO add your handling code here:
        //enableButtonWhenBothListsSelected();
    }//GEN-LAST:event_jListFlavoursChooseValueChanged

    private void dlgPlaceOrderjListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dlgPlaceOrderjListValueChanged
        // TODO add your handling code here:
        //listModelOrder
        enableButtonWhenBothListsSelected();
    }//GEN-LAST:event_dlgPlaceOrderjListValueChanged

    private void refreshFlavourList() {
        try {
            ArrayList<Flavour> flavList = db.getAllFlavours();
            listModelFlavour.clear();
            for (Flavour c : flavList) {
                listModelFlavour.addElement(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database SELECT",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void refreshOrderList() {
        try {
            ArrayList<PlaceOrder> orderList = db.getAllOrders();
            listModelOrder.clear();
            for (PlaceOrder o : orderList) {
                listModelOrder.addElement(o);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database SELECT",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void enableButtonWhenBothListsSelected() {
        int idx1 = jListFlavour.getSelectedIndex();
        int idx2 = dlgPlaceOrderjList.getSelectedIndex();
        System.out.println("idx2" + idx2);
        boolean enabled = idx1 >= 0 && idx2 >= 0;
        //boolean enabled = idx1 >= 0;
        btPlace.setEnabled(enabled);
    }
    ////////////////////////////////////////////
    
    
    ///////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btManage;
    private javax.swing.JButton btPlace;
    private javax.swing.JDialog dlgEditOrder;
    private javax.swing.JList<PlaceOrder> dlgPlaceOrderjList;
    private javax.swing.JButton dlgbtDismiss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<Flavour> jListFlavour;
    private javax.swing.JList<String> jListFlavoursChoose;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField tfCustName;
    // End of variables declaration//GEN-END:variables
}
