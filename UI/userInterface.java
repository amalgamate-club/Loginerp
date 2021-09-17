import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class userInterface extends JFrame implements ActionListener
{
    static JButton btn;
    static JButton btn1;

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame(); //created instance of JFrame.
        JPanel panel = new JPanel(); //created panel (to hold other components)
        JPanel panel1 = new JPanel(); 
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel(); //created label (text)
        btn = new JButton();
        btn1 =  new JButton();

        //code for Label
        label.setText("To show button works");
        label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        label.setBounds(30, 50, 250, 200);
        label.setForeground(Color.BLACK);
        label.setVisible(true);


        //code for button
        btn.setBounds(10, 150, 300, 150);
        btn.setText("Click me!");
        //btn.addActionListener(this);


        btn1.setBounds(350, 150, 100, 100);
        btn1.setText("Don't Click");


        //code for panel
        panel.add(label);
        panel.setBounds(0, 0, 500, 100);

        panel1.add(btn);
        panel1.setBounds(10, 150, 100, 100);

        panel2.add(btn1);
        panel2.setBounds(350, 150, 100, 100);



         //code for Frame
        frame.setTitle("Harini Akka wassup?"); //Frame title.
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); //Makes sure app closes and not suspended.
        frame.setSize(500, 500); //size of Frame.
        frame.setVisible(true); // make frame visible.
        frame.setLayout(null);
        //frame.add(label);
        //frame.add(btn);
        frame.add(panel);
        frame.add(panel1);
        frame.add(panel2);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btn)
        {
            System.out.println("Hariniiiiii akka");
        }
        
    }
}
