package frame_change;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrame 
{

    public FirstFrame() 
    {
        JFrame f1 = new JFrame("First Frame");
        f1.setBounds(100, 100, 400, 600);
        f1.setLayout(null);
        JButton b = new JButton("First");
        b.setBounds(100, 100, 100, 40);
        f1.add(b);
        
        
        b.addActionListener((ActionEvent e) -> 
        {
            SecondFrame s = new SecondFrame();
            f1.dispose();
            
        });
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
    
    
   
}
