package frames;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class frameInSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();   //create a frame
        frame.setTitle("SisoKiki"); // set title of the frame or window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // (JFrame.EXIT_ON_CLOSE)exit out of the application
        // normally JFrame.HDIE_ON_ClOSE means just hide the frame
        // Another thing is JFrame.DO_NOTHING_ON_ClOSE means just do nothing the frame(we can't close the app window)
        frame.setResizable(false); //prevent frame from resige so we can't resize the frame
        frame.setSize(420,289);   //sets the x and y dimention of the frame
        frame.setVisible(true); //make frame visible

        // here we change the logo
        // ImageIcon image = new ImageIcon("C:/Users/bitmi/OneDrive/Desktop/javaSwing Framework/frames/lion_logo.png");
        // ImageIcon image = new ImageIcon("lion_logo.png");
        ImageIcon image = new ImageIcon(frameInSwing.class.getResource("lion_logo.png"));
        frame.setIconImage(image.getImage());//this will change icon in the frame
        // frame.getContentPane().setBackground(Color.MAGENTA); // change colour of the bg
        frame.getContentPane().setBackground(new Color(45,0,33)); // change colour using rgb  of the bg and We also use hexadecimal value for colour
        
    }
}