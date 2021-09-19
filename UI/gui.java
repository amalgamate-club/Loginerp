import javax.swing.BorderFactory;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.JRootPane;  
import javax.swing.JFrame;
import javax.swing.JLabel;

class GUI
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(); //created panel (to hold other components)
        JPanel panel1 = new JPanel(); 
        //JPanel panel2 = new JPanel();
        //Border border = BorderFactory.createLineBorder(new Color(201,4,18));
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        label1.setText("Welcome to the Library !");
        label1.setForeground(new Color(201,4,18));
        //label1.setBorder(border);
        label1.setBounds(30, 50, 250, 200);
        label1.setVisible(true);

        label2.setText("Scan USN : ");
        label2.setForeground(new Color(201,4,18));
        //label2.setVerticalAlignment(JLabel.CENTER);
        //label2.setHorizontalAlignment(JLabel.CENTER);
        
        //code for panel
        panel.add(label1);
        panel.setBounds(0, 0, 100, 100);

        panel1.add(label2);
        panel1.setBounds(10, 150, 100, 100);

        frame.setTitle("AIT Student Library Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.add(panel);
        frame.add(panel1);

        ImageIcon image = new ImageIcon("ait_logo_red.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color (255,255,255));

    }
    
}
