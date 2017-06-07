
import java.awt.Dimension;
import java.awt.List;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * DefaultListModel<Person> listModelPeople
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Person {

    private String name;
    private int age;
    private String postCode;

    public Person(String name, int age, String postCode) {
        setName(name);
        setAge(age);
        setPostCode(postCode);

    }

    public Person() {
        setName(name);
        setAge(age);
        setPostCode(postCode);

    }

    public String toString() {
        String string = getName() + " is " + getAge() + " years old and PostCode is " + getPostCode();
        return string;
    }

    public String toStringSave() {
        String string = getName() + ";" + getAge() + ";" + getPostCode() + System.getProperty("line.separator");;
        return string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}

public class NewPeopleList extends javax.swing.JFrame {

    DefaultListModel<Person> listModelPeople = new DefaultListModel<>();

    public NewPeopleList() {

        initComponents();
        lbNameErr.setVisible(false);
        lbAgeErr.setVisible(false);
        lbZipErr.setVisible(false);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
    }

    
    File currentFile = new File("C:\\untitled.txt");
    boolean isModified = false;
    Person person;
    String strSelect = "";
    int index = 0;

    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserOpen = new javax.swing.JFileChooser();
        jFileChooserSave = new javax.swing.JFileChooser();
        popMenu = new javax.swing.JPopupMenu();
        miDelete = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        miDel = new javax.swing.JMenuItem();
        dlgEditPerson = new javax.swing.JDialog();
        mi2Save = new javax.swing.JButton();
        mi2Exit = new javax.swing.JButton();
        tfInfo = new javax.swing.JTextField();
        tfNameDlg = new javax.swing.JTextField();
        lbName1 = new javax.swing.JLabel();
        tfZipDlg = new javax.swing.JTextField();
        lbPostCode1 = new javax.swing.JLabel();
        lbAge1 = new javax.swing.JLabel();
        tfAgeDlg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPeople = new javax.swing.JList<>();
        lbName = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        lbPostCode = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        tfZip = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        lbNameErr = new javax.swing.JLabel();
        lbAgeErr = new javax.swing.JLabel();
        lbZipErr = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miOpen = new javax.swing.JMenuItem();
        miSaveAs = new javax.swing.JMenuItem();
        miSaveSelect = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        popMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popMenuMouseClicked(evt);
            }
        });

        miDelete.setText("Delete");
        miDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miDeleteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                miDeleteMouseReleased(evt);
            }
        });
        miDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeleteActionPerformed(evt);
            }
        });
        popMenu.add(miDelete);

        miDel.setText("jMenuItem1");
        jPopupMenu1.add(miDel);

        dlgEditPerson.setTitle("Double Click Save Person ");
        dlgEditPerson.setMinimumSize(new java.awt.Dimension(200, 200));
        dlgEditPerson.setModal(true);
        dlgEditPerson.setSize(new java.awt.Dimension(450, 300));

        mi2Save.setText("Save");
        mi2Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi2SaveActionPerformed(evt);
            }
        });

        mi2Exit.setText("Cancel");
        mi2Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi2ExitActionPerformed(evt);
            }
        });

        tfNameDlg.setText("ZhangSan");
        tfNameDlg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameDlgActionPerformed(evt);
            }
        });

        lbName1.setText("Name");

        tfZipDlg.setText("H4L 0B5");

        lbPostCode1.setText("PostCode");

        lbAge1.setText("Age");

        tfAgeDlg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeDlgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgEditPersonLayout = new javax.swing.GroupLayout(dlgEditPerson.getContentPane());
        dlgEditPerson.getContentPane().setLayout(dlgEditPersonLayout);
        dlgEditPersonLayout.setHorizontalGroup(
            dlgEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEditPersonLayout.createSequentialGroup()
                .addGroup(dlgEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgEditPersonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfInfo))
                    .addGroup(dlgEditPersonLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(mi2Save)
                        .addGap(66, 66, 66)
                        .addComponent(mi2Exit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(dlgEditPersonLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(dlgEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName1)
                    .addComponent(lbAge1)
                    .addComponent(lbPostCode1))
                .addGap(44, 44, 44)
                .addGroup(dlgEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNameDlg)
                    .addComponent(tfAgeDlg)
                    .addComponent(tfZipDlg, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        dlgEditPersonLayout.setVerticalGroup(
            dlgEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEditPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dlgEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgEditPersonLayout.createSequentialGroup()
                        .addComponent(lbName1)
                        .addGap(32, 32, 32)
                        .addGroup(dlgEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAge1)
                            .addComponent(tfAgeDlg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(dlgEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPostCode1)
                            .addComponent(tfZipDlg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfNameDlg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(dlgEditPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mi2Save)
                    .addComponent(mi2Exit))
                .addGap(36, 36, 36))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New People List ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        listPeople.setModel(listModelPeople);
        listPeople.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listPeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPeopleMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listPeopleMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listPeople);

        lbName.setText("Name");

        lbAge.setText("Age");

        lbPostCode.setText("PostCode");

        tfName.setText("ZhangSan");
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        tfZip.setText("H4L 0B5");

        btAdd.setText("Add Person");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        lbNameErr.setForeground(new java.awt.Color(255, 0, 0));
        lbNameErr.setText("Input Name illegal");

        lbAgeErr.setForeground(new java.awt.Color(255, 0, 0));
        lbAgeErr.setText("Input Age illegal");

        lbZipErr.setForeground(new java.awt.Color(255, 0, 0));
        lbZipErr.setText("Input zip illegal");

        jMenu1.setText("File");

        miOpen.setText("Open");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        jMenu1.add(miOpen);

        miSaveAs.setText("Save As...");
        miSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(miSaveAs);

        miSaveSelect.setText("Save SelectedAs");
        miSaveSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                miSaveSelectMousePressed(evt);
            }
        });
        miSaveSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveSelectActionPerformed(evt);
            }
        });
        jMenu1.add(miSaveSelect);
        jMenu1.add(jSeparator1);

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
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName)
                    .addComponent(lbAge)
                    .addComponent(lbPostCode))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfName)
                        .addComponent(tfAge)
                        .addComponent(tfZip, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                    .addComponent(btAdd)
                    .addComponent(lbNameErr)
                    .addComponent(lbAgeErr)
                    .addComponent(lbZipErr))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNameErr)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAge))
                        .addGap(4, 4, 4)
                        .addComponent(lbAgeErr)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPostCode))
                        .addGap(2, 2, 2)
                        .addComponent(lbZipErr)
                        .addGap(18, 18, 18)
                        .addComponent(btAdd)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //////////////////////////////////////////////////////////
    
    // Center on parent ( absolute true/false (exact center or 25% upper left) )
public void centerOnParent(final Window child, final boolean absolute) {
    child.pack();
    boolean useChildsOwner = child.getOwner() != null ? ((child.getOwner() instanceof JFrame) || (child.getOwner() instanceof JDialog)) : false;
    final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    final Dimension parentSize = useChildsOwner ? child.getOwner().getSize() : screenSize ;
    final Point parentLocationOnScreen = useChildsOwner ? child.getOwner().getLocationOnScreen() : new Point(0,0) ;
    final Dimension childSize = child.getSize();
    childSize.width = Math.min(childSize.width, screenSize.width);
    childSize.height = Math.min(childSize.height, screenSize.height);
    child.setSize(childSize);        
    int x;
    int y;
    if ((child.getOwner() != null) && child.getOwner().isShowing()) {
        x = (parentSize.width - childSize.width) / 2;
        y = (parentSize.height - childSize.height) / 2;
        x += parentLocationOnScreen.x;
        y += parentLocationOnScreen.y;
    } else {
        x = (screenSize.width - childSize.width) / 2;
        y = (screenSize.height - childSize.height) / 2;
    }
    if (!absolute) {
        x /= 2;
        y /= 2;
    }
    child.setLocation(x, y);
}
    
    //////////////////////////////////////////////////////////
    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        Person person = new Person();
        String name = tfName.getText();
        String age_str = tfAge.getText();
        String postCode = tfZip.getText();
        int intAge = 0;
        /////////////////////////CHECK the textArea values //////////////////////////////
        boolean isZipInvalid = (!isValidPostalCode(tfZip.getText()));
        boolean isNameInvalid = (name.length() < 2 || name.length() > 20);
        lbNameErr.setVisible(isNameInvalid);
        if (!isInteger(tfAge.getText())) {
            lbAgeErr.setVisible(true);
            return;
        } else {
            intAge = Integer.parseInt(tfAge.getText());
            boolean isAgeInvalid = (intAge < 1 || intAge > 99);
            if (isAgeInvalid){
            lbAgeErr.setVisible(isAgeInvalid);
            return;}
        }
        if (isZipInvalid)
        {
            lbZipErr.setVisible(isZipInvalid);
            return;
         }
        //boolean isAgeInvalid = !isInteger(tfAge.getText());
       
        //boolean isZipInvalid = (!isValidPostalCode(tfZip.getText()));
        

        if (isNameInvalid || isZipInvalid) {
            System.out.println("Invalid input in name and postcode");
            return;
        }
        String outputString = "";
        ///////////////////////////finished the check//////////////////////////////////
        /*
        if (name.isEmpty()){
            JOptionPane.showMessageDialog(this, "tfName is Empty","Name missing",JOptionPane.WARNING_MESSAGE);
            return;
        }else {
        person.setName(name);
        tfName.setText("");}

        if (age_str.isEmpty()){JOptionPane.showMessageDialog(this, "tfName is Empty","Name missing",JOptionPane.WARNING_MESSAGE);
            return;}else {
        person.setAge(intAge);}
        
        if (postCode.isEmpty()){
            JOptionPane.showMessageDialog(this, "Post Code is Empty","PostCode missing",JOptionPane.WARNING_MESSAGE);
            return;
        }else 
        {
        person.setPostCode(postCode);
        //tfZip.setText("");
        } */

        outputString = name + ";" + age_str + ";" + postCode;

        //System.out.println("outputString is " + outputString);
        person.setAge(intAge);
        person.setName(name);
        person.setPostCode(postCode);
        listModelPeople.addElement(person);
        //System.out.println("Add person is "+person.getName()+" "+person.getAge()+" "+person.getPostCode());

        //////////////////////////////////////////////////////////
        //listPeople.addMouseListener(new PopClickListener());
    }//GEN-LAST:event_btAddActionPerformed

    class PopMenu extends JPopupMenu {

        JMenuItem miDel;
        //JMenuItem miExit2;

        public PopMenu() {
            miDel = new JMenuItem("Delete it!");
            add(miDel);
            //add(miExit2);
        }
    }

    class PopClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            if (e.isPopupTrigger()) {
                doPop(e);
            }
        }

        public void mouseReleased(MouseEvent e) {
            if (e.isPopupTrigger()) {
                doPop(e);
            }
        }

        private void doPop(MouseEvent e) {
            PopMenu menu = new PopMenu();
            menu.show(e.getComponent(), e.getX(), e.getY());
        }

    }


    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        String s;
        Person pOpen;

        jFileChooserOpen.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
        if (jFileChooserOpen.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                currentFile = jFileChooserOpen.getSelectedFile();
                // Person pOpen = new Person();
                String[] toSplit = new String[2];
                Scanner content = new Scanner(currentFile);
                while (content.hasNextLine()) {
                    s = content.nextLine();
                    toSplit = s.split(";");
                    pOpen = new Person(toSplit[0], Integer.parseInt(toSplit[1]), toSplit[2]);
                    listModelPeople.addElement(pOpen);
                }
                //listModelPeople.addElement(content);
                System.out.println("Open the file ");
                System.out.println("content is " + content);
                //lblStatus.setText("Current file: " + currentFile.getAbsolutePath());
                content.close();
            } catch (IOException ex) {
                currentFile = null;
                JOptionPane.showMessageDialog(this,
                        "Unable to read file contents from " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
                //return;
            }
        }
    }//GEN-LAST:event_miOpenActionPerformed

    private void miDelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        System.out.println("Delete");
    }

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_miExitActionPerformed

    private void miSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveAsActionPerformed
        // TODO add your handling code here:
        //JList list = (JList)evt.getSource();
        //saveAs(person);
        jFileChooserSave.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
        
        if (jFileChooserSave.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = jFileChooserSave.getSelectedFile();
            String filePath = currentFile.getAbsolutePath();
            if (!filePath.endsWith(".txt")) {
                currentFile = new File(filePath + ".txt");
            }
            try (PrintWriter pw = new PrintWriter(currentFile)) {
                //pw.write(listModelPeople.getElementAt(1));
                int count = listModelPeople.getSize();
                for (int i = 0; i < count; i++) {
                    Person person = listModelPeople.elementAt(i);
                    strSelect = person.getName() + ";" + person.getAge() + ";" + person.getPostCode() + System.getProperty("line.separator");
                    //pw.write(strSelect);
                    pw.write(person.toStringSave());
                }
                int i = listModelPeople.getSize();
                System.out.println("Finished write file" + currentFile.getName());

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Unable to write file contents to " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

        }

    }//GEN-LAST:event_miSaveAsActionPerformed
   private void saveAs(){
   
   jFileChooserSave.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
        
        if (jFileChooserSave.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = jFileChooserSave.getSelectedFile();
            String filePath = currentFile.getAbsolutePath();
            if (!filePath.endsWith(".txt")) {
                currentFile = new File(filePath + ".txt");
            }
            try (PrintWriter pw = new PrintWriter(currentFile)) {
                //pw.write(listModelPeople.getElementAt(1));
                int count = listModelPeople.getSize();
                for (int i = 0; i < count; i++) {
                    Person person = listModelPeople.elementAt(i);
                    strSelect = person.getName() + ";" + person.getAge() + ";" + person.getPostCode() + System.getProperty("line.separator");
                    //pw.write(strSelect);
                    pw.write(person.toStringSave());
                }
                int i = listModelPeople.getSize();
                System.out.println("Finished write file" + currentFile.getName());

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Unable to write file contents to " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

        }
   
   }
    private void listPeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPeopleMouseClicked
        // TODO add your handling code here:
        JList list = (JList) evt.getSource();
        int index = 0;
        if ((evt.getButton() == MouseEvent.BUTTON3) && (evt.getClickCount() == 1)) {            
            listPeople.setSelectedIndex(listPeople.locationToIndex(evt.getPoint()));
            if (listPeople.getSelectedIndex() != -1) {
                popMenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
        
    }//GEN-LAST:event_listPeopleMouseClicked

    private void miSaveSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveSelectActionPerformed
        // TODO add your handling code here:
        /*
        jFileChooserSave.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));

        if (jFileChooserSave.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = jFileChooserSave.getSelectedFile();
            String filePath = currentFile.getAbsolutePath();
            if (!filePath.endsWith(".txt")) {
                currentFile = new File(filePath + ".txt");
            }
            try (PrintWriter pw = new PrintWriter(currentFile)) {
                pw.write(strSelect);
                System.out.println("Select item is " + strSelect);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Unable to write file contents to " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
*/
        jFileChooserSave.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
        
        if (jFileChooserSave.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = jFileChooserSave.getSelectedFile();
            String filePath = currentFile.getAbsolutePath();
            if (!filePath.endsWith(".txt")) {
                currentFile = new File(filePath + ".txt");
            }
            try (PrintWriter pw = new PrintWriter(currentFile)) {
                //pw.write(listModelPeople.getElementAt(1));
                int count = listModelPeople.getSize();
                for (int i = 0; i < count; i++) {
                    Person person = listModelPeople.elementAt(i);
                    strSelect = person.getName() + ";" + person.getAge() + ";" + person.getPostCode() + System.getProperty("line.separator");
                    //pw.write(strSelect);
                    pw.write(person.toStringSave());
                }
                int i = listModelPeople.getSize();
                System.out.println("Finished write file" + currentFile.getName());

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Unable to write file contents to " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

        }
    }//GEN-LAST:event_miSaveSelectActionPerformed

    private void popMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popMenuMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            int index = listPeople.locationToIndex(evt.getPoint());
            System.out.println("miDelMouseClicked index is " + index);
            //listModelPeople.remove(index);
            System.out.println("Do something! 524");
        }

    }//GEN-LAST:event_popMenuMouseClicked

    private void miDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_miDeleteMouseClicked

    private void miDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miDeleteMouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) {
            popMenu.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_miDeleteMouseReleased

    private void miSaveSelectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miSaveSelectMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_miSaveSelectMousePressed

    private void miDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeleteActionPerformed
        // TODO add your handling code here:
        //System.out.println("miDeleteActionPerformed");
        evt.getSource();
        if (listPeople.getSelectedIndices().length > 0) {
            Object[] options = {"Yes", "No"};
            int choice = JOptionPane.showOptionDialog(this,
                    "Are you sure to delete selected persons?",
                    "Unsaved changes to current file",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
            if (choice == JOptionPane.YES_OPTION) {
                    int[] index = listPeople.getSelectedIndices();
                    for (int i = index.length - 1; i >= 0; i--) {
                        listModelPeople.removeElementAt(index[i]); //
                    }
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "You forgot to select persons",
                    "Inane warning",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_miDeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
      if (isModified) {
            Object[] options = {"Yes", "No"};
            int choice = JOptionPane.showOptionDialog(this,
                    "Please save the current file before exit?",
                    "Unsaved changes to current file",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            switch (choice) {
                case JOptionPane.YES_OPTION:
                    saveAs(person);
                    break;
                case JOptionPane.NO_OPTION:
                default:
            }
        }
        dispose();  
    }//GEN-LAST:event_formWindowClosing

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAgeActionPerformed

    private void mi2SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi2SaveActionPerformed
        // TODO add your handling code here:
        System.out.println("Save your selected information?");
        
        jFileChooserSave.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));

        if (jFileChooserSave.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = jFileChooserSave.getSelectedFile();
            String filePath = currentFile.getAbsolutePath();
            if (!filePath.endsWith(".txt")) {
                currentFile = new File(filePath + ".txt");
            }
            try (PrintWriter pw = new PrintWriter(currentFile)) {
                pw.write(strSelect);
                System.out.println("Select item is " + strSelect);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Unable to write file contents to " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
            }
        } 
    }//GEN-LAST:event_mi2SaveActionPerformed

    private void mi2ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi2ExitActionPerformed
        // TODO add your handling code here:
        dlgEditPerson.setVisible(false);
        dlgEditPerson.dispose();
    }//GEN-LAST:event_mi2ExitActionPerformed

    private void tfNameDlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameDlgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameDlgActionPerformed

    private void tfAgeDlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeDlgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAgeDlgActionPerformed

    private void listPeopleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPeopleMouseReleased
        // TODO add your handling code here:
        //////////////////////////Secound Task //////////////////////////////////
        centerOnParent(dlgEditPerson,true);
        //JDialog dlgEditPerson = new JDialog();
        /*
        JList list = (JList) evt.getSource();
        
        
         //if (evt.getClickCount() == 2 && (evt.getButton() == evt.BUTTON2)) {
         if (evt.getClickCount() == 2 ) {
            dlgEditPerson.setVisible(true);
            tfInfo.setText("");
            System.out.println("Task2 begin.............");
            index = list.locationToIndex(evt.getPoint());
            System.out.println("Task2: index is " + index);
            
            Person pSelect = listModelPeople.elementAt(index);
            strSelect = pSelect.getName() + ";" + pSelect.getAge() + ";" + pSelect.getPostCode();
             System.out.println("strSelect is "+strSelect);
            tfInfo.setText(strSelect);
             System.out.println("Information show in textArea start........");
            tfNameDlg.setText(pSelect.getName());
            tfAgeDlg.setText(pSelect.getAge()+"");
            tfAgeDlg.setText(Integer.toString(pSelect.getAge()));
            tfZipDlg.setText(pSelect.getPostCode());
            //System.out.println("Person object is " + listModelPeople.elementAt(index).toString());
            System.out.println("Task2: Seleced one is " + strSelect);
             System.out.println("Task2 finished..............................");
            
        }
        */
        if ((evt.getButton() == MouseEvent.BUTTON1) && (evt.getClickCount() == 2)) {
            // left button, double-click
            listPeople.setSelectedIndex(listPeople.locationToIndex(evt.getPoint()));
            int index = listPeople.getSelectedIndex();
            if (index != -1) {
                Person p = listModelPeople.get(index);
                // fill in data of Person double-clicked for editing
                tfNameDlg.setText(p.getName());
                tfAgeDlg.setText(p.getAge() + "");
                tfZipDlg.setText(p.getPostCode());
                
                tfInfo.setText(p.toString());
                // hide errors
                //tfNameDlgError.setVisible(false);
                //tfNameDlgError.setVisible(false);
                //tfZipDlgError.setVisible(false);
                // show dialog
                dlgEditPerson.setVisible(true);
            }
        }
    }//GEN-LAST:event_listPeopleMouseReleased

    private void deleteAndExit() {
        int n = JOptionPane.showConfirmDialog(
                listPeople,
                "Do you want to delete this line?",
                "An Inane Question",
                JOptionPane.YES_NO_OPTION);

        if (n == JOptionPane.YES_OPTION) {

            listPeople.remove(n);
        } else if (n == JOptionPane.NO_OPTION) {
            dispose();
        }
    }
///////////////////////////////

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
            java.util.logging.Logger.getLogger(NewPeopleList.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPeopleList.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPeopleList.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPeopleList.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPeopleList().setVisible(true);
            }
        });
    }

    /////////////////////////////////////////////////////////////////////
    public static boolean isInteger(String s) {
        return isInteger(s, 10);
    }

    public static boolean isInteger(String s, int radix) {
        if (s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) {
                    return false;
                } else {
                    continue;
                }
            }
            if (Character.digit(s.charAt(i), radix) < 0) {
                return false;
            }
        }
        return true;
    }

    boolean isValidPostalCode(String code) {
        // must have 7 digits
        if (code.length() != 7) {
            return false;
        }

        // make if uppercase for not having to chack for A to Z AND a to z
        code = code.toUpperCase();
        // translate into digit
        char[] digit = code.toCharArray();

        if (digit[0] < 'A' || digit[0] > 'Z') {
            return false;
        }
        if (digit[1] < '0' || digit[1] > '9') {
            return false;
        }
        if (digit[2] < 'A' || digit[2] > 'Z') {
            return false;
        }
        if (digit[3] != ' ') {
            return false;
        }
        if (digit[4] < '0' || digit[4] > '9') {
            return false;
        }
        if (digit[5] < 'A' || digit[5] > 'Z') {
            return false;
        }
        if (digit[6] < '0' || digit[6] > '9') {
            return false;
        }
        // sounds OK to me
        return true;
    }

    public static ArrayList<String> convertStringArrayToArraylist(String[] strArr) {
        ArrayList<String> stringList = new ArrayList<String>();
        for (String s : strArr) {
            stringList.add(s);
        }
        return stringList;
    }

    private void saveAs(Person person) {
        //Person personSave = new Person();
        // person = new Person();

        jFileChooserSave.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
        //+".txt"
        if (jFileChooserSave.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = jFileChooserSave.getSelectedFile();
            String filePath = currentFile.getAbsolutePath();
            if (!filePath.endsWith(".txt")) {
                currentFile = new File(filePath + ".txt");
            }
            try (PrintWriter pw = new PrintWriter(currentFile)) {
                //pw.write(listModelPeople.getElementAt(1));
                int num = listModelPeople.getSize();
                for (int i = 0; i < num; i++) {
                    String str = person.getName() + ";" + person.getAge() + ";" + person.getPostCode();
                    System.out.println("String is " + str);
                    pw.write(str);
                }
                //System.out.println("listModelPeople size  is "+i);
                //System.out.println("listModelPeople."+person.);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Unable to write file contents to " + currentFile.getAbsolutePath(),
                        "File access error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }

    
    /////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JDialog dlgEditPerson;
    private javax.swing.JFileChooser jFileChooserOpen;
    private javax.swing.JFileChooser jFileChooserSave;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbAge1;
    private javax.swing.JLabel lbAgeErr;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbName1;
    private javax.swing.JLabel lbNameErr;
    private javax.swing.JLabel lbPostCode;
    private javax.swing.JLabel lbPostCode1;
    private javax.swing.JLabel lbZipErr;
    private javax.swing.JList<Person> listPeople;
    private javax.swing.JButton mi2Exit;
    private javax.swing.JButton mi2Save;
    private javax.swing.JMenuItem miDel;
    private javax.swing.JMenuItem miDelete;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSaveAs;
    private javax.swing.JMenuItem miSaveSelect;
    private javax.swing.JPopupMenu popMenu;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfAgeDlg;
    private javax.swing.JTextField tfInfo;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNameDlg;
    private javax.swing.JTextField tfZip;
    private javax.swing.JTextField tfZipDlg;
    // End of variables declaration//GEN-END:variables
}
