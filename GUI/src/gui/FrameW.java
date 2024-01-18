
package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FrameW extends JFrame implements ActionListener
{
    Container cp;
    
    public FrameW()
    {
       setSize(600, 400);
       setLocation(150, 250);
       cp = getContentPane();
       cp.setBackground(Color.pink);

       cp.setLayout(new FlowLayout());
      
       JButton bt1 = new JButton("OK");
       bt1.addActionListener(this);
       cp.add(bt1);
       JButton bt2 = new JButton("Submit");
       bt2.addActionListener(this);
       cp.add(bt2);
       JButton bt3 = new JButton("Cancel");
       bt3.addActionListener(this);
       cp.add(bt3); 

       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ea) 
    {
       JButton bt = (JButton) ea.getSource();
       if (bt.getText().equalsIgnoreCase("OK"))
       {
           cp.setBackground (Color.red);
       }
       else
       {
           cp.setBackground (Color.blue);
       }
    }
}
