import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
 
 
public class MyJTextAreaDemo2 extends JFrame{
    private String checkedStr="清华大学";
    private boolean modified=false;
    private JTextArea textArea=null;
    private JLabel    inputLabel=null;
 
    public MyJTextAreaDemo2(){}
 
    public MyJTextAreaDemo2(String title){
        super(title);
        textArea=new JTextArea(5,10);
        inputLabel=new JLabel("input");
        inputLabel.setLabelFor(textArea);
 
        Container container=this.getContentPane();
        container.setLayout(new BorderLayout());
        container.add(inputLabel,BorderLayout.EAST);
        container.add(textArea,BorderLayout.CENTER);
 
        textArea.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void changedUpdate(DocumentEvent event) {
                // TODO Auto-generated method stub
                modified=true;
                System.out.println("Text Area has been changed");
            }
 
            @Override
            public void insertUpdate(DocumentEvent event) {
                // TODO Auto-generated method stub
                System.out.println(textArea.getText());
                String inputStr=textArea.getText().trim();
                modified=true;
            }
 
            @Override
            public void removeUpdate(DocumentEvent event) {
                // TODO Auto-generated method stub
                modified=true;
                System.out.println("removeUpdate");
            }
 
        });
 
        this.pack();
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                int needSaveOrNot=0;
                if(modified){
                   needSaveOrNot=JOptionPane.showConfirmDialog(MyJTextAreaDemo2.this,
                           "内容被修改是否要保存","保存修改",0);
                    if(needSaveOrNot==JOptionPane.YES_OPTION){
                       //完成业务保存
                    }
                    if(needSaveOrNot==JOptionPane.NO_OPTION){
                        //什么都不做
                    }
                     
                }
                System.exit(0);
            }
        });
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
 
    }
 
    public static void main(String[] args){
        new MyJTextAreaDemo2("Demo");
    }
 
}