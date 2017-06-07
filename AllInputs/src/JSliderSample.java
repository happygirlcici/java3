import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class JSliderSample {
  public static void main(String args[]) {
    JFrame f = new JFrame("JSlider Sample");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container content = f.getContentPane();
    JSlider slider = new JSlider();
    slider.setMinorTickSpacing(5);
    slider.setMajorTickSpacing(10);
    slider.setPaintTicks(true);
    slider.setSnapToTicks(true);
    slider.setPaintTrack(false);
    slider.setPaintLabels(true);
    slider.setToolTipText("The value is 50");
    content.add(slider, BorderLayout.CENTER);
    f.setSize(300, 100);
    f.setVisible(true);
  }
}