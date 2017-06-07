/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author ipd
 */
public class YNotePad extends javax.swing.JFrame {

    File currentFile = new File("e:\\untitled.txt");
    ;
    boolean isModified = false;

    /**
     * Creates new form JNotepad
     */
    public YNotePad() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setTitle("Java Notepad");
        this.setSize(800, 600);
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        taEdit.getDocument().addDocumentListener(new MyDocumentListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooserOpen = new javax.swing.JFileChooser();
        fileChooserSaveas = new javax.swing.JFileChooser();
        colorChooser = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        taEdit = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lFileName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miSaveas = new javax.swing.JMenuItem();
        miClose = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();
        mEdit = new javax.swing.JMenu();
        miTextColor = new javax.swing.JMenuItem();
        miWordWrap = new javax.swing.JCheckBoxMenuItem();

        fileChooserOpen.setFileFilter(new MyCustomFilter());

        fileChooserSaveas.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        taEdit.setColumns(20);
        taEdit.setRows(5);
        jScrollPane1.setViewportView(taEdit);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        lFileName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lFileName.setToolTipText("");
        jPanel2.add(lFileName);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        mFile.setText("File");

        miOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miOpen.setText("Open...");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        mFile.add(miOpen);

        miSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miSave.setText("Save");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        mFile.add(miSave);

        miSaveas.setText("Save as...");
        miSaveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveasActionPerformed(evt);
            }
        });
        mFile.add(miSaveas);

        miClose.setText("Close");
        miClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCloseActionPerformed(evt);
            }
        });
        mFile.add(miClose);
        mFile.add(jSeparator1);

        miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        mFile.add(miExit);

        jMenuBar1.add(mFile);

        mEdit.setText("Edit");

        miTextColor.setText("Text Color");
        miTextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTextColorActionPerformed(evt);
            }
        });
        mEdit.add(miTextColor);

        miWordWrap.setSelected(true);
        miWordWrap.setText("Word Wrap");
        miWordWrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miWordWrapActionPerformed(evt);
            }
        });
        mEdit.add(miWordWrap);

        jMenuBar1.add(mEdit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed

        fileChooserOpen.setDialogTitle("Open a file:");
        if (fileChooserOpen.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            try {
                // What to do with the file, e.g. display it in a TextArea
                currentFile = fileChooserOpen.getSelectedFile();
                String content = new Scanner(currentFile).useDelimiter("\\Z").next();
                taEdit.setText(content);
                lFileName.setText("Current file: " + currentFile.getAbsolutePath());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        "Unable to read file contents from " + currentFile.getAbsolutePath(),
                        "File access erro",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "System error " + currentFile.getAbsolutePath(),
                    "File access erro",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_miOpenActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        if (isModified) {
            Object[] options = {"Save",
                "Don't Save",
                "Cancel"};
            int n = JOptionPane.showOptionDialog(this,
                    "Do you want to save changes to current file? ",
                    "A Silly Question",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]);
            if (n == 0) {
                try (PrintWriter pw = new PrintWriter(currentFile)) {
                    pw.write(taEdit.getText());
                    lFileName.setText(currentFile.getAbsolutePath() + "is saved.");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this,
                            "Unable to write file contents to " + currentFile.getAbsolutePath(),
                            "File access error",
                            JOptionPane.WARNING_MESSAGE);
                }
            } else if (n == 2) {
                return;
            }
        }
        dispose();
    }//GEN-LAST:event_miExitActionPerformed

    private void miSaveasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveasActionPerformed

        fileChooserSaveas.setDialogTitle("Specify a file to save as ");
        if (fileChooserSaveas.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooserSaveas.getSelectedFile();
			
            try (PrintWriter pw = new PrintWriter(currentFile)) {
                pw.write(taEdit.getText());
                isModified = false;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Unable to write file contents to " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "System error " + currentFile.getAbsolutePath(),
                    "File access erro",
                    JOptionPane.WARNING_MESSAGE);
        }// TODO add your handling code here:
    }//GEN-LAST:event_miSaveasActionPerformed

    private void miTextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTextColorActionPerformed

        fileChooserOpen.setDialogTitle("Choose text color: ");
        Color c = JColorChooser.showDialog(null, "Choose a Color", taEdit.getForeground());
        if (c != null) {
            taEdit.setForeground(c);
        } else {
            JOptionPane.showMessageDialog(this,
                    "System error in color chooser",
                    "File access erro",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_miTextColorActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        try (PrintWriter pw = new PrintWriter(currentFile)) {
            pw.write(taEdit.getText());
            lFileName.setText(currentFile.getAbsolutePath() + "is saved.");
            isModified = false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Unable to write file contents to " + currentFile.getAbsolutePath(),
                    "File access error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_miSaveActionPerformed

    private void miCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCloseActionPerformed
        taEdit.setText(null);
        currentFile = null;
        isModified = true;
    }//GEN-LAST:event_miCloseActionPerformed

    private void miWordWrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miWordWrapActionPerformed
        if (miWordWrap.isSelected()) {
            taEdit.setLineWrap(true);
            taEdit.setWrapStyleWord(true);
        } else {
            taEdit.setLineWrap(false);
            taEdit.setWrapStyleWord(false);
        }
    }//GEN-LAST:event_miWordWrapActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (isModified) {
            Object[] options = {"Save",
                "Don't Save",
                "Cancel"};
            int n = JOptionPane.showOptionDialog(this,
                    "Do you want to save changes to current file? ",
                    "A Silly Question",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]);
            if (n == 0) {
                try (PrintWriter pw = new PrintWriter(currentFile)) {
                    pw.write(taEdit.getText());
                    lFileName.setText(currentFile.getAbsolutePath() + "is saved.");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this,
                            "Unable to write file contents to " + currentFile.getAbsolutePath(),
                            "File access error",
                            JOptionPane.WARNING_MESSAGE);
                }
            } else if (n == 2) {
                this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                return;
            }
        }
        dispose();
    }//GEN-LAST:event_formWindowClosing

    class MyCustomFilter extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }

        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.txt)";
        }
    }

    class MyDocumentListener implements DocumentListener {

        String newline = "\n";

        @Override
        public void insertUpdate(DocumentEvent e) {
            updateLog(e, "inserted into");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateLog(e, "removed from");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            //Plain text components do not fire these events
        }

        public void updateLog(DocumentEvent e, String action) {
            isModified = true;
            lFileName.setText(currentFile.getAbsolutePath() + "is modified.");
        }
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
            java.util.logging.Logger.getLogger(JNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new YNotePad().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JFileChooser fileChooserOpen;
    private javax.swing.JFileChooser fileChooserSaveas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lFileName;
    private javax.swing.JMenu mEdit;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenuItem miClose;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenuItem miSaveas;
    private javax.swing.JMenuItem miTextColor;
    private javax.swing.JCheckBoxMenuItem miWordWrap;
    private javax.swing.JTextArea taEdit;
    // End of variables declaration//GEN-END:variables
}