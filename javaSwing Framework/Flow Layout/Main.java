import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
public class Main {
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for components within a container
        // FlowLayout =
                        // placbs components in a row, sized at their preferred size.
                        // If the horizontal space in the container is too small,
                        // the FlowLayout class uses the next available row.        

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();

        button1.setText("1");
        button2.setText("2");
        button3.setText("3");      
        button4.setText("4");
        button5.setText("5");
        button6.setText("6");
        button7.setText("7");
        button8.setText("8");
        button9.setText("9");

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(Color.BLUE);
        panel.setVisible(true);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 700);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.add(panel);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);


    }
}