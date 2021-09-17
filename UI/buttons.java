import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class buttons extends JFrame implements ActionListener
{
    JButton btn;
    JButton btn1;

    buttons()
    {
        btn = new JButton();
        btn1 = new JButton();

        btn.setBounds(10, 150, 300, 150);
        btn.setText("Click me!");
        btn.addActionListener(this);

        btn1.setBounds(350, 150, 100, 100);
        btn1.setText("Don't Click");
        btn1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btn)
        {
            System.out.println("Harini i did offffffff");
        }    
        
    }
}
