
Tips:
db = new Database();
initComponents();
dlgAddRep.pack();
dlgManage.pack();
dlgAddCus.pack();
refreshRepList();
refreshCustList();


after adding to jList model and then refresh jList to show the new data;

db.addCus(cus);
dlgAddCus.setVisible(false);
refreshCustList();

http://blog.sina.com.cn/s/blog_4ab057eb0100bx3w.html

http://mypaper.pchome.com.tw/zerojudge/post/1324519263

jList 多选/


Java的Swing编程中，设置JList中的数据可以多选的方法是：

jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

设置多选参数之后需要进行多选的话要按住ctrl进行多选。

jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);


ABOUT MOUSE CLICK EVENT:


    private void listCarMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        //Double Edit
        if ((evt.getButton() == MouseEvent.BUTTON1) && (evt.getClickCount() == 2)) {
            // left button, double-click
            listCar.setSelectedIndex(listCar.locationToIndex(evt.getPoint()));
            int index = listCar.getSelectedIndex();
            if (index != -1) {
                Car c = modelListCar.get(index);
                // fill in data of Car double-clicked for editing
                tfNameDlg.setText(c.name);
                tfYearDlg.setText(c.year + "");
                tfSecsDlg.setText(c.secs +"");
                // hide errors
                dlgNameErr.setVisible(false);
                dlgYearErr.setVisible(false);
                dlgSecsErr.setVisible(false);
                // show dialog
                dlgEditCar.setVisible(true);
            }
        }
    }                                    

    private void listCarMousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        //delete
        if ((evt.getButton() == MouseEvent.BUTTON3) && (evt.getClickCount() == 1)) {
            listCar.setSelectedIndex(listCar.locationToIndex(evt.getPoint()));
            if (listCar.getSelectedIndex() != -1) {
                popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }                                    

    private void ppmiDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int index = listCar.getSelectedIndex();
        Car p = modelListCar.get(index);
        //Custom button text
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
            modelListCar.remove(index);
        }
    }                                          

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dlgEditCar.setVisible(false);
        dlgEditCar.dispose();
    }     
	

	public int getCountTaskByName(String str) throws SQLException {
        String query = "SELECT count(*) FROM task WHERE taskname like \"%" + str + "%\"";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                throw new SQLExceptionResultEmpty();
            }
            rs.last();
            int count = rs.getInt(1);
            rs.beforeFirst();
            boolean re = rs.wasNull();
            return count;
        }
    }