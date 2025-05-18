import java.awt.Color;
import java.awt.Font;
// import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener{
    JButton button,button2;
    JLabel label;
    MyFrame(){
        
        ImageIcon image = new ImageIcon("smile.png");

        label = new JLabel();
        label.setIcon(image);
        label.setBounds(0,200,400,400);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(40, 100, 200, 50);
        button.setText("Open");
        button.setFocusable(false);
        button.addActionListener(this) ;
        button.setFont(new Font("Comic Sans",Font.BOLD,16 ));
        // button.setIconTextGap(-10);
        button.setForeground(Color.white);
        button.setBackground(Color.black);
        button.setBorder(BorderFactory.createEtchedBorder(Color.green,Color.yellow));
        // button.setEnabled(false);// to disable the button

        button2 = new JButton();
        button2.setBounds(40, 100, 200, 50);
        button2.setText("Close");
        button2.setFocusable(false);
        button2.addActionListener(this) ;
        button2.setFont(new Font("Comic Sans",Font.BOLD,16 ));
        // button.setIconTextGap(-10);
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBorder(BorderFactory.createEtchedBorder(Color.green,Color.yellow));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(300,900);
        this.setVisible(true);
        this.add(button);
        this.add(button2);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            //    System.out.println("Hey Souvik.");
            // //    button.setEnabled(false);// to disable the button
            label.setVisible(true);
            button.setVisible(false);
            button2.setVisible(true);
        }
        else if (e.getSource()==button2) {
            label.setVisible(false);
            button.setVisible(true);
            button2.setVisible(false);

        }
    }
     
}
