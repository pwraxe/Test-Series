package frame_change;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SecondFrame 
{

    public SecondFrame() 
    {
        JFrame f1 = new JFrame("Second Frame");
        f1.setBounds(100, 100, 400, 600);
        f1.setLayout(null);
        JButton b = new JButton("Second");
        b.setBounds(100, 100, 100, 40);
        f1.add(b);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
    
    public static void main(String[] args) {
        FirstFrame f = new FirstFrame();
    }
}
