import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MyFrame {
    public static void main(String[] args) {
    // Layout Manager = Defines the natural layout for components within a container
        // 3 common managers
        // BorderLayout =
        //                   A BorderLayout places components in five areas:
        //                   All extra space is placed in the center area.
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,800);
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.add(new JLabel("PannelOne"));
        panel2.add(new JLabel("PannelTwo"));
        panel3.add(new JLabel("PannelThree"));
        panel4.add(new JLabel("PannelFour"));
        panel5.add(new JLabel("PannelFive"));

        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.CYAN);
        panel3.setBackground(Color.GREEN);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.YELLOW);

        panel1.setPreferredSize(new Dimension(100,50));
        panel2.setPreferredSize(new Dimension(100,50));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.WEST);
        frame.add(panel5,BorderLayout.CENTER);


    }
}
