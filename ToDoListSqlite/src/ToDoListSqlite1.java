
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jdesktop.swingx.JXDatePicker;

class ToDoListSqlite1 extends javax.swing.JFrame {

    Database db;
    DefaultListModel<Task> listModelTask = new DefaultListModel<>();

    public ToDoListSqlite1() throws ClassNotFoundException {

        try {
            db = new Database();
            initComponents();
            //refreshTaskList();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed to open database connection",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    final SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
    String date_to_store = "";
    String dlg_date_to_store = "";
    String new_taskStatus = "";
    String new_taskName = "";
    int index = -1;
    Task t;
    File currentFile = new File("C:\\untitled.txt");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        ppmiDelete = new javax.swing.JMenuItem();
        ppmiEdit = new javax.swing.JMenuItem();
        dlgEdit = new javax.swing.JDialog();
        dlgtfTaskName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dlgtfTaskDate = new javax.swing.JTextField();
        dlgbtEdit = new javax.swing.JButton();
        dlgbtQuit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dlgtfTaskStatus = new javax.swing.JTextField();
        dlglbEditResult = new javax.swing.JLabel();
        dlgDatePicker = new org.jdesktop.swingx.JXDatePicker();
        jFileChooserSave = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        tfTaskName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTask = new javax.swing.JList<>();
        btAdd = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        cbTaskStatusFinished = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jxDpTaskDate = new org.jdesktop.swingx.JXDatePicker();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miSave = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        popupMenu.setToolTipText("");

        ppmiDelete.setText("Delete Task");
        ppmiDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppmiDeleteActionPerformed(evt);
            }
        });
        popupMenu.add(ppmiDelete);

        ppmiEdit.setText("Edit Task");
        ppmiEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppmiEditActionPerformed(evt);
            }
        });
        popupMenu.add(ppmiEdit);

        dlgEdit.setTitle("Edit Task Item");
        dlgEdit.setMinimumSize(new java.awt.Dimension(450, 300));

        dlgtfTaskName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dlgtfTaskNameMouseClicked(evt);
            }
        });
        dlgtfTaskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgtfTaskNameActionPerformed(evt);
            }
        });
        dlgtfTaskName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dlgtfTaskNameKeyTyped(evt);
            }
        });

        jLabel2.setText("Task");

        jLabel3.setText("Task Date ");

        dlgtfTaskDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dlgtfTaskDateMouseClicked(evt);
            }
        });

        dlgbtEdit.setText("Edit");
        dlgbtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgbtEditActionPerformed(evt);
            }
        });

        dlgbtQuit.setText("Quit");
        dlgbtQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgbtQuitActionPerformed(evt);
            }
        });

        jLabel4.setText("Task Status");

        dlgtfTaskStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgtfTaskStatusActionPerformed(evt);
            }
        });
        dlgtfTaskStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dlgtfTaskStatusKeyTyped(evt);
            }
        });

        dlglbEditResult.setForeground(new java.awt.Color(0, 0, 204));
        dlglbEditResult.setText("Edit successful");

        javax.swing.GroupLayout dlgEditLayout = new javax.swing.GroupLayout(dlgEdit.getContentPane());
        dlgEdit.getContentPane().setLayout(dlgEditLayout);
        dlgEditLayout.setHorizontalGroup(
            dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgEditLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(dlgtfTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgEditLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dlgtfTaskDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgEditLayout.createSequentialGroup()
                        .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dlglbEditResult, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dlgEditLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dlgEditLayout.createSequentialGroup()
                                        .addComponent(dlgbtEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(dlgbtQuit))
                                    .addComponent(dlgtfTaskStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addComponent(dlgDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        dlgEditLayout.setVerticalGroup(
            dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEditLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgtfTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dlgtfTaskDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dlgtfTaskStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlgDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(dlglbEditResult)
                .addGap(18, 18, 18)
                .addGroup(dlgEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgbtEdit)
                    .addComponent(dlgbtQuit))
                .addGap(35, 35, 35))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ToDoList Application");

        jLabel1.setText("Task");

        tfTaskName.setText("buy milk");

        jListTask.setModel(listModelTask);
        jListTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListTaskMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListTask);

        btAdd.setText("Add Task");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btRefresh.setText("Refresh");
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        cbTaskStatusFinished.setText("Finished");
        cbTaskStatusFinished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTaskStatusFinishedActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        miSave.setText("Save");
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbTaskStatusFinished)
                                .addGap(80, 80, 80)
                                .addComponent(jxDpTaskDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btRefresh))
                            .addComponent(jButton2))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdd)
                    .addComponent(btSearch)
                    .addComponent(btRefresh))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTaskStatusFinished)
                            .addComponent(jxDpTaskDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_miExitActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        String taskName = tfTaskName.getText();
        // String cbUnfinished = cbTaskStatusUnfinished.getActionCommand();
        String cbFinished = cbTaskStatusFinished.getActionCommand();
        String cbTaskStatusResult = "";
        cbTaskStatusResult = (!cbFinished.isEmpty() ? "Finished" : "Unfinished");
        System.out.println("cbTaskResult is " + cbTaskStatusResult);

        try {
            db.addTask(taskName, date_to_store, cbTaskStatusResult);
            refreshTaskList();
            tfTaskName.setText("");
            //tfTaskStatus.setText("unfinshed");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database query",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void cbTaskStatusFinishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTaskStatusFinishedActionPerformed
        // TODO add your handling code here:

        String st = cbTaskStatusFinished.getActionCommand();
        System.out.println("task status is " + st);
    }//GEN-LAST:event_cbTaskStatusFinishedActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        // TODO add your handling code here:
        refreshTaskList();
    }//GEN-LAST:event_btRefreshActionPerformed

    private void jxDpTaskDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxDpTaskDateActionPerformed
        // TODO add your handling code here:
        Date taskDate = jxDpTaskDate.getDate();
        //System.out.println("taskDate is "+ taskDate);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        jxDpTaskDate.setFormats(dateFormat);
        DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date_to_store = sysDate.format(jxDpTaskDate.getDate()).toString();
        //System.out.println("date_to_store is "+ date_to_store);
    }//GEN-LAST:event_jxDpTaskDateActionPerformed

    private void jListTaskMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListTaskMousePressed
        // TODO add your handling code here:
        if ((evt.getButton() == MouseEvent.BUTTON3) && (evt.getClickCount() == 1)) {
            jListTask.setSelectedIndex(jListTask.locationToIndex(evt.getPoint()));
            if (jListTask.getSelectedIndex() != -1) {
                popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jListTaskMousePressed

    private void ppmiDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppmiDeleteActionPerformed
        // TODO add your handling code here:
        int index = jListTask.getSelectedIndex();
        Task t = listModelTask.get(index);
        int id = t.getId();
        //Custom button text
        Object[] options = {"Delete", "Cancel"};
        int choice = JOptionPane.showOptionDialog(this,
                "Are you sure you want to delete item: \n" + t,
                "Confirm deletion",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        if (choice == 0) {
            try {
                db.deleteTask(id);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this,
                        "Failed execute database delete",
                        "Database error",
                        JOptionPane.ERROR_MESSAGE);
            }
            listModelTask.remove(index);

        }
    }//GEN-LAST:event_ppmiDeleteActionPerformed

    private void ppmiEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppmiEditActionPerformed
        // TODO add your handling code here:
        dlgEdit.setVisible(true);
        dlgDatePicker.setVisible(false);
        dlglbEditResult.setVisible(false);

        index = jListTask.getSelectedIndex();
        t = listModelTask.get(index);
        int id = t.getId();

        dlgtfTaskName.setText(t.getTaskName());
        dlgtfTaskDate.setText(t.getTaskDate());
        dlgtfTaskStatus.setText(t.getTaskStatus());

        refreshTaskList();

    }//GEN-LAST:event_ppmiEditActionPerformed

    private void dlgtfTaskDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dlgtfTaskDateMouseClicked
        // TODO add your handling code here:
        dlgDatePicker.setVisible(true);
        if (evt.getClickCount() > 0) {
            System.out.println("Change the task date ");
        }
    }//GEN-LAST:event_dlgtfTaskDateMouseClicked

    private void dlgbtQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgbtQuitActionPerformed
        // TODO add your handling code here:
        dlgEdit.dispose();
    }//GEN-LAST:event_dlgbtQuitActionPerformed

    private void dlgtfTaskNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgtfTaskNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dlgtfTaskNameActionPerformed

    private void dlgbtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgbtEditActionPerformed
        // TODO add your handling code here:
        dlglbEditResult.setVisible(false);

        //int index = jListTask.getSelectedIndex();
        jListTask.getSelectedIndex();
        Task t1 = jListTask.getSelectedValue();
        System.out.println("listModelTask index  is" + index);
        //t = listModelTask.get(index);
        int id = t.getId();
        dlgtfTaskName.setText(t.getTaskName());
        dlgtfTaskDate.setText(t.getTaskDate());
        dlgtfTaskStatus.setText(t.getTaskStatus());

        String new_taskDate = dlg_date_to_store;
        //String new_taskStatus = dlgtfTaskStatus.getText(); //dlgtfTaskStatus
        t.setTaskName(new_taskName);
        t.setTaskDate(new_taskDate);
        t.setTaskStatus(new_taskStatus);

        System.out.println("new Task is " + new_taskName + " date is " + new_taskDate + " status " + new_taskStatus);
        //listModelTask.addElement(t);
        System.out.println("New Taskid is " + t.getId() + " task name is " + t.getTaskName() + " ,date is " + t.getTaskDate() + ",status is " + t.getTaskStatus());
        Object[] options = {"Edit", "Cancel"};
        int choice = JOptionPane.showOptionDialog(this,
                "Are you sure you want to Edit item: \n" + t.toString(),
                "Confirm deletion",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        if (choice == 0) {
            try {
                db.updateTask(t);
                dlglbEditResult.setVisible(true);
                //refreshTaskList();
                //listModelTask.removeElementAt(index);
                // listModelTask.addElement(t);
            } catch (SQLException ex) {
                ex.printStackTrace();
                dlglbEditResult.setVisible(false);
                JOptionPane.showMessageDialog(this,
                        "Failed execute database delete",
                        "Database error",
                        JOptionPane.ERROR_MESSAGE);
            }
            //listModelTask.remove(index);

        }
    }//GEN-LAST:event_dlgbtEditActionPerformed

    private void dlgDatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgDatePickerActionPerformed
        // TODO add your handling code here:
        Date dlgtaskDate = dlgDatePicker.getDate();
        //System.out.println("taskDate is "+ taskDate);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dlgDatePicker.setFormats(dateFormat);
        DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        dlg_date_to_store = sysDate.format(dlgDatePicker.getDate()).toString();
        dlgtfTaskDate.setText(dlg_date_to_store);
    }//GEN-LAST:event_dlgDatePickerActionPerformed

    private void dlgtfTaskStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgtfTaskStatusActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dlgtfTaskStatusActionPerformed

    private void dlgtfTaskNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dlgtfTaskNameMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_dlgtfTaskNameMouseClicked

    private void dlgtfTaskNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dlgtfTaskNameKeyTyped
        // TODO add your handling code here:
        //System.out.println("taskName key typed");
        new_taskName = dlgtfTaskName.getText();
        dlgtfTaskName.setText(new_taskName);
    }//GEN-LAST:event_dlgtfTaskNameKeyTyped

    private void dlgtfTaskStatusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dlgtfTaskStatusKeyTyped
        // TODO add your handling code here:
        new_taskStatus = dlgtfTaskStatus.getText();
        dlgtfTaskStatus.setText(new_taskStatus);
    }//GEN-LAST:event_dlgtfTaskStatusKeyTyped

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        // TODO add your handling code here:
        jFileChooserSave.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));

        if (jFileChooserSave.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = jFileChooserSave.getSelectedFile();
            String filePath = currentFile.getAbsolutePath();
            if (!filePath.endsWith(".txt")) {
                currentFile = new File(filePath + ".txt");
            }
            try (PrintWriter pw = new PrintWriter(currentFile)) {

                int[] selectedIndexList = jListTask.getSelectedIndices();
                for (int idx : selectedIndexList) {
                    Task c = listModelTask.get(idx);
                    pw.write(c.toStringSaveFile());
                    //pw.printf("%s;%d;%0.2f;%s\n", c.makeModel, c.yop, c.secsTo100, c.plates);
                }
                System.out.println("Finished write file" + currentFile.getName());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Unable to write file contents to " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_miSaveActionPerformed

    static int length;

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
        String str_search = tfTaskName.getText();
        System.out.println("str_search is " + str_search);
        refreshTaskList();
        listModelTask.clear();
        
        try {
            length = db.getCountTaskByName(str_search);
            System.out.println("length is " + length);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database select Count Task By Name",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
        if (length == 1) {
            try {
                t = db.getTaskByName(str_search);
                System.out.println("Found 1 row");
                System.out.println("t is " + t.toStringSaveFile());
                //listModelTask.clear();
                listModelTask.addElement(t);

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this,
                        "Failed execute database select ",
                        "Database error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else if (length == 0) {
            String result_str = "Not founded";
            System.out.println(result_str);
            //listModelTask.clear();
            JOptionPane.showMessageDialog(this,
                    "Not Founded",
                    "Database Query",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (length > 1) {
            String result_str = "Many rows founde!";
            System.out.println(result_str);
            try {
                ArrayList<Task> taskResultList = db.getTasksByName(str_search);
                System.out.println("taskResultList is " + taskResultList);
                if (taskResultList.isEmpty()) {
                    JOptionPane.showMessageDialog(this,
                            "Failed execute database select Many taskResultList is empty",
                            "Database error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    for (int i = 0; i < length; i++) {
                        //t = db.getTaskByName(str_search);
                        t = taskResultList.get(i);
                        System.out.println("i = " + i);
                        listModelTask.addElement(t);
                    }
                }
                // listModelTask.addElement(taskResultList.get(i));

                System.out.println("Found " + length + " rows ");
                // System.out.println("t is "+t.toStringSaveFile());

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this,
                        "Failed execute database select Many",
                        "Database error",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jFileChooserSave.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));

        if (jFileChooserSave.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = jFileChooserSave.getSelectedFile();
            String filePath = currentFile.getAbsolutePath();
            if (!filePath.endsWith(".txt")) {
                currentFile = new File(filePath + ".txt");
            }
            try (PrintWriter pw = new PrintWriter(currentFile)) {

                int[] selectedIndexList = jListTask.getSelectedIndices();
                for (int idx : selectedIndexList) {
                    Task c = listModelTask.get(idx);
                    pw.write(c.toStringSaveFile());
                    //pw.printf("%s;%d;%0.2f;%s\n", c.makeModel, c.yop, c.secsTo100, c.plates);
                }
                System.out.println("Finished write file" + currentFile.getName());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Unable to write file contents to " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshTaskList() {
        try {
            ArrayList<Task> taskList = db.getAllTasks();
            listModelTask.clear();
            for (Task t : taskList) {
                listModelTask.addElement(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database query",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ToDoListSqlite1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToDoListSqlite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToDoListSqlite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToDoListSqlite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ToDoListSqlite1().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ToDoListSqlite1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSearch;
    private javax.swing.JCheckBox cbTaskStatusFinished;
    private org.jdesktop.swingx.JXDatePicker dlgDatePicker;
    private javax.swing.JDialog dlgEdit;
    private javax.swing.JButton dlgbtEdit;
    private javax.swing.JButton dlgbtQuit;
    private javax.swing.JLabel dlglbEditResult;
    private javax.swing.JTextField dlgtfTaskDate;
    private javax.swing.JTextField dlgtfTaskName;
    private javax.swing.JTextField dlgtfTaskStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooserSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<Task> jListTask;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jxDpTaskDate;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JMenuItem ppmiDelete;
    private javax.swing.JMenuItem ppmiEdit;
    private javax.swing.JTextField tfTaskName;
    // End of variables declaration//GEN-END:variables
}
