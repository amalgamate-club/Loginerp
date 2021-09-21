import java.awt.*;
import javax.swing.*;

class userInterface extends JFrame
{

    public static void main(String[] args) 
    {
        buttons b = new buttons();
        JFrame frame = new JFrame(); //created instance of JFrame.
        JPanel panel = new JPanel(); //created panel (to hold other components)
        JPanel panel1 = new JPanel(); 
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel(); //created label (text)

        //code for Label
        label.setText("To show button works");
        label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        label.setBounds(30, 50, 250, 200);
        label.setForeground(Color.black);
        label.setVisible(true);



        //code for panel
        panel.add(label);
        panel.setBounds(0, 0, 500, 100);

        panel1.add(b.btn);
        panel1.setBounds(10, 150, 100, 100);

        panel2.add(b.btn1);
        panel2.setBounds(350, 150, 100, 100);



         //code for Frame
        frame.setTitle("Harini Akka wassup?"); //Frame title.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Makes sure app closes and not suspended.
        frame.setSize(500, 500); //size of Frame.
        frame.setVisible(true); // make frame visible.
        frame.setLayout(null);
        frame.add(panel);
        frame.add(panel1);
        frame.add(panel2);
    }
}
