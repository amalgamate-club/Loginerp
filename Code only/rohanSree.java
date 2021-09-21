import javax.swing.*;
public class rohanSree
{
    public static void main(String[] args) 
    {
        ImageIcon img = new ImageIcon("ait_logo.png");
        JFrame frame = new JFrame();
        frame.setTitle("AIT Library Student Portal"); //Frame title.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Makes sure app closes and not suspended.
        frame.setSize(500, 500); //size of Frame.
        frame.setIconImage(img.getImage());
        frame.setVisible(true); // make frame visible.
        frame.setLayout(null);        
    }
}
