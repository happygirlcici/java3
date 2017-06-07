
import javax.swing.JLabel;


public class LabRegularExpression extends javax.swing.JFrame {

    /**
     * Creates new form LabCCC
     */
    public LabRegularExpression() {
        initComponents();
        
        lbEmailErr.setVisible(false);
        lbDateErr.setVisible(false);
    }

    String str_Email = "";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btTestSubmit = new javax.swing.JButton();
        tfUSZIP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCAZIP = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        lbZipErr = new javax.swing.JLabel();
        lbCAZipErr = new javax.swing.JLabel();
        lbEmailErr = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        lbDateErr = new javax.swing.JLabel();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test Regular Expression");

        jLabel1.setText("Regular Expression ");

        btTestSubmit.setText("Test");
        btTestSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTestSubmitActionPerformed(evt);
            }
        });

        tfUSZIP.setText("jTextField1");
        tfUSZIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUSZIPActionPerformed(evt);
            }
        });

        jLabel2.setText("US post code ");

        jLabel3.setText("Canada post code");

        jLabel4.setText("Email address");

        tfCAZIP.setText("jTextField2");

        lbZipErr.setText("Invalid");

        lbCAZipErr.setForeground(new java.awt.Color(255, 0, 0));
        lbCAZipErr.setText("Invalid");

        lbEmailErr.setForeground(new java.awt.Color(255, 0, 0));
        lbEmailErr.setText("Invalid");

        jLabel8.setText("Date");

        tfDate.setText("jTextField1");

        lbDateErr.setText("Invalid");

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(btTestSubmit))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfUSZIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfCAZIP)
                                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(2, 2, 2)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDateErr)
                                    .addComponent(lbZipErr)
                                    .addComponent(lbCAZipErr)
                                    .addComponent(lbEmailErr)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btExit)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUSZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lbZipErr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCAZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCAZipErr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmailErr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDateErr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTestSubmit)
                    .addComponent(btExit))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUSZIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUSZIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUSZIPActionPerformed

    private void btTestSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTestSubmitActionPerformed
        // TODO add your handling code here:
        String str_USZip = tfUSZIP.getText();
        String str_CAZip = tfCAZIP.getText();
        String str_Email = tfEmail.getText()+"";
        String stt_date = tfDate.getText();
        
        System.out.println("str_Email is "+tfEmail.getText());
        
        boolean isPostcodeInvalid = !tfEmail.getText().matches("[A-Z][0-9][A-Z] ?[0-9][A-Z][0-9]");
        lbZipErr.setVisible(isPostcodeInvalid);
        
        boolean isDateInvalid = !tfDate.getText().matches("\"^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$\""); // works
        
        boolean isEmaillInvalid = !tfEmail.getText().matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        /*
        for the all kinds of date 
        ^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$
        
        
        */
        System.out.println("str_Email");
        System.out.println("isEmailInvalid is "+isEmaillInvalid);
        if (isEmaillInvalid) {
            lbEmailErr.setVisible(true);
            System.out.println("email is valid");
        }
        if (isDateInvalid) {
            lbDateErr.setVisible(true);
            System.out.println("email is valid");
        }
    }//GEN-LAST:event_btTestSubmitActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private boolean isDataValid(
        String strUSZIP, JLabel Error, String postcode, JLabel postcodeError) {
        
        boolean isPostcodeInvalid = !strUSZIP.matches("[A-Z][0-9][A-Z] ?[0-9][A-Z][0-9]");
        lbZipErr.setVisible(isPostcodeInvalid);
        //
        return (!(isPostcodeInvalid));
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
            java.util.logging.Logger.getLogger(LabRegularExpression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabRegularExpression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabRegularExpression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabRegularExpression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabRegularExpression().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btTestSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbCAZipErr;
    private javax.swing.JLabel lbDateErr;
    private javax.swing.JLabel lbEmailErr;
    private javax.swing.JLabel lbZipErr;
    private javax.swing.JTextField tfCAZIP;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfUSZIP;
    // End of variables declaration//GEN-END:variables
}
