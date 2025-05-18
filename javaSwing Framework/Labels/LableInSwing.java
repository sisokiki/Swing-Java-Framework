import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LableInSwing {
    public static void main(String[] args) {
        // 'Label a GUI display area for a string of text, an image, or both
        ImageIcon imageIcon = new ImageIcon("ok.jpg");
        
        Border border = BorderFactory.createLineBorder(Color.yellow,9);

        JLabel label = new JLabel();// create a lable
        label.setText("Hey This is Siso");// set text of lable
        label.setIcon(imageIcon);// get the image in the lable portion
        label.setHorizontalTextPosition(JLabel.CENTER);// use to centre the text //set text LEFT,CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP,CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0,33,213));// set font colour
        label.setFont(new Font("MV Boli",Font.PLAIN,18));// set font of text
        label.setIconTextGap(20);// set the gap between the image and the text
        label.setBackground(Color.GRAY); // set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);// set the border in the text
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);// set horizontal position of icon+text within label
        //label.setBounds(0,0,350,250);// use to place the lable in where using x and y axix //set x, y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400, 820);
        // frame.setLayout(null);// use to stop the defult layout manager
        frame.setVisible(true);
        frame.setTitle("Lables");
        frame.getContentPane().setBackground(new Color(255,255,255));
        frame.add(label);// use to add or use the lable in the frame
        frame.setIconImage(imageIcon.getImage());
        frame.pack();// automatically adjust all in the frame and lables
        
    }
}