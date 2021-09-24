import java.util.Date;
import javax.swing.*;

public class time {
    public static void main(String[] args){

        System.out.println("time now"+new Date());
        for(int i =0 ; i <10;i++)
        {
        try{
            Thread.sleep(5000);
            //System.out.println("time now :" + new Date());
            JOptionPane.showMessageDialog(null, "Login Successful !", "AIT Student Library Login", JOptionPane.PLAIN_MESSAGE);    
        }
        catch(InterruptedException e)
        {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Login Unsuccessful !", "AIT Student Library Login", JOptionPane.PLAIN_MESSAGE);
        }
    }
    }
    
}
