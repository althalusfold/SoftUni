
package gui;
import java.awt.*;
import javax.swing.*;

public class GUI 
{   
    public static void main(String[] args)
    {      
        JOptionPane.showMessageDialog(null, "I love JAVA",
               "НЕ СТАВАШ!!!",
               JOptionPane.WARNING_MESSAGE); 
       
       String inputstr =
               JOptionPane.showInputDialog(null, "What is your name?");
       JOptionPane.showMessageDialog(null,"Hi " + inputstr);
       
       Frame fw = new FrameW();
    }      
}
