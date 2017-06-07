
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class PeopleDB extends javax.swing.JFrame {

    Database db;
    DefaultListModel<Person> modelPersonList = new DefaultListModel();
    
    public PeopleDB() throws SQLException {
        try {
            db = new Database();  //connect the database
            initComponents();
            refreshPersonList();
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

        popupMenu = new javax.swing.JPopupMenu();
        ppmiDelete = new javax.swing.JMenuItem();
        dlgEdit = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        dlgtfId = new javax.swing.JTextField();
        dlgtfName = new javax.swing.JTextField();
        dlgtfAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dlgbtEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        btAddPerson = new javax.swing.JButton();
        brRefreshList = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listPeople = new javax.swing.JList<>();
        btClear = new javax.swing.JButton();

        ppmiDelete.setText("Delete Item");
        ppmiDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ppmiDeleteMouseClicked(evt);
            }
        });
        ppmiDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppmiDeleteActionPerformed(evt);
            }
        });
        popupMenu.add(ppmiDelete);

        dlgEdit.setTitle("Edit One Person");
        dlgEdit.setMinimumSize(new java.awt.Dimension(300, 250));
        dlgEdit.setSize(new java.awt.Dimension(400, 300));

        jLabel3.setText("ID");

        dlgtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgtfIdActionPerformed(evt);
            }
        });

        dlgtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgtfNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel5.setText("Age");

        dlgbtEdit.setText("Edit");
        dlgbtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgbtEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgEditLayout = new javax.swing.GroupLayout(dlgEdit.getContentPane());
        dlgEdit.getContentPane().setLayout(dlgEditLayout);
        dlgEditLayout.setHorizontalGroup(
            dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEditLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgEditLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dlgtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgEditLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlgtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgEditLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dlgbtEdit)
                            .addComponent(dlgtfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        dlgEditLayout.setVerticalGroup(
            dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEditLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dlgtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgtfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addComponent(dlgbtEdit)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        tfName.setText("name");

        tfAge.setText("22");

        btAddPerson.setText("Add Person");
        btAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddPersonActionPerformed(evt);
            }
        });

        brRefreshList.setText("Refresh List");
        brRefreshList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brRefreshListActionPerformed(evt);
            }
        });

        listPeople.setModel(modelPersonList);
        listPeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPeopleMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listPeopleMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(listPeople);

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 84, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btAddPerson)
                        .addGap(18, 18, 18)
                        .addComponent(brRefreshList)
                        .addGap(18, 18, 18)
                        .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddPerson)
                    .addComponent(brRefreshList)
                    .addComponent(btClear))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddPersonActionPerformed
        // TODO add your handling code here:
        String name = tfName.getText();
        int age = Integer.parseInt(tfAge.getText());        
        try {
            db.addPerson(name, age);
            refreshPersonList();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database query",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_btAddPersonActionPerformed

    
    private void refreshPersonList(){
        try {
            //ResultSet rs = db.listPerson();
            ArrayList<Person> personList = db.getAllPersons();
            modelPersonList.clear();
            
            
            for (Person p : personList){
                modelPersonList.addElement(p);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database query",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    private void brRefreshListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brRefreshListActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_brRefreshListActionPerformed

    private void listPeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPeopleMouseClicked
        // TODO add your handling code here:
        
        
        if (evt.getClickCount() == 2) {
            System.out.println("Edit Data");
            int index = listPeople.getSelectedIndex();
            Person p = modelPersonList.get(index);
        
            listPeople.setSelectedIndex(listPeople.locationToIndex(evt.getPoint()));
            if (listPeople.getSelectedIndex() != -1) {
               dlgEdit.setVisible(true);
                dlgtfId.setText(p.getId()+"");
                dlgtfName.setText(p.getName());
                dlgtfAge.setText(p.getAge()+"");
                
                //dlgEdit.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_listPeopleMouseClicked

    private void ppmiDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppmiDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ppmiDeleteMouseClicked

    private void ppmiDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppmiDeleteActionPerformed
        // TODO add your handling code here:
        int index = listPeople.getSelectedIndex();
        Person p = modelPersonList.get(index);
        System.out.println("delete index is "+ index);
        Object[] options = {"Delete", "Cancel"};
        int choice = JOptionPane.showOptionDialog(this,
                "Are you sure you want to delete item: \n" + p,
                "Confirm deletion",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        if (choice == 0) {
            try {
                
                Person pDel =modelPersonList.getElementAt(index);
                //System.out.println("idperson is "+pDel.getId());
                //modelPersonList.remove(index);
                db.deletePersonById(pDel.getId());
                System.out.println("Delete finished");
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("Delete failing");
            }
        }
    }//GEN-LAST:event_ppmiDeleteActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        modelPersonList.removeAllElements();
    }//GEN-LAST:event_btClearActionPerformed

    private void listPeopleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPeopleMouseReleased
        // TODO add your handling code here:
        if ((evt.getButton() == MouseEvent.BUTTON3) ) {
            System.out.println("Right click 1 :delete");
            listPeople.setSelectedIndex(listPeople.locationToIndex(evt.getPoint()));
            if (listPeople.getSelectedIndex() != -1) {
                popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_listPeopleMouseReleased

    private void dlgtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlgtfIdActionPerformed

    private void dlgbtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgbtEditActionPerformed
        try {
            // TODO add your handling code here:
            //update date in database
            //UPDATE BY ID
            
            int intID = Integer.parseInt(dlgtfId.getText());
            String name = dlgtfName.getText();
            int intAge = Integer.parseInt(dlgtfAge.getText());

            
            db.updatePerson(intID, name, intAge);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("DlgEdit Failed update");
        }
        
        
    }//GEN-LAST:event_dlgbtEditActionPerformed

    private void dlgtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlgtfNameActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PeopleDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PeopleDB().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PeopleDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brRefreshList;
    private javax.swing.JButton btAddPerson;
    private javax.swing.JButton btClear;
    private javax.swing.JDialog dlgEdit;
    private javax.swing.JButton dlgbtEdit;
    private javax.swing.JTextField dlgtfAge;
    private javax.swing.JTextField dlgtfId;
    private javax.swing.JTextField dlgtfName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Person> listPeople;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JMenuItem ppmiDelete;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
