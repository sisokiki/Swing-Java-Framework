import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pannel_InGui {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components
        JLabel redLabel = new JLabel();
        redLabel.setText("hi this is red");
        // redLabel.setBounds(10,10,150,150);
        redLabel.setForeground(new Color(255,255,255));

        JPanel redPanel = new JPanel();//create a red pannel
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,230,100);//set the pannel boundary

        JPanel bluePanel = new JPanel();//create a blue pannel
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(230,0,60,100);//set the pannel boundary

        JPanel greenPanel = new JPanel();//create a green pannel
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,100,290,100);//set the pannel boundary

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300,900);
        frame.setVisible(true);
        redPanel.add(redLabel);
        frame.add(redPanel);// add the red pannel in the frame
        frame.add(bluePanel);// add the blue pannel in the frame
        frame.add(greenPanel);// add the green pannel in the frame
        
    }
}
