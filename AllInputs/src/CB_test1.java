import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CB_test1{

    private void display() {
        JFrame f = new JFrame("Listeners");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox b = new JCheckBox("Milk");
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getID() == ActionEvent.ACTION_PERFORMED
                    ? "ACTION_PERFORMED" : e.getID());
            }
        });
        b.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getStateChange() == ItemEvent.SELECTED
                    ? "SELECTED" : "DESELECTED");
            }
        });
        JPanel p = new JPanel();
        p.add(b);
        f.add(p);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new CB_test1().display();
            }
        });
    }
}
