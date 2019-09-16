package ExamTest;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class WelcomeFrame extends JFrame
{
    JLabel text;
    JPanel p;
    JFrame j;
    JButton login,register;
    public WelcomeFrame() throws Exception 
    {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        j = new JFrame("Welcome, Guest");
        j.setLayout(null);
        j.setLocationRelativeTo(null);
        j.setBounds(0, 0, 1365, 767);
        
        Font f = new Font("Times new Roman", Font.ITALIC, 50);
        p = new JPanel(null);
        p.setBounds(280, 150, 800, 450);
        p.setBackground(Color.WHITE);
        p.setBorder(BorderFactory.createLineBorder(Color.gray));
        
        
        text = new JLabel("Welcome Guest...!");
        text.setBounds(200, 10, 600, 80);
        text.setFont(new Font("Times New Roman", Font.ITALIC, 60));
        text.setForeground(Color.BLACK);
        p.add(text);
        
        
        login = new JButton("Login");
        login.setBounds(250, 150, 300, 70);
        login.setFont(f);
        login.setBackground(Color.GRAY);
        p.add(login);
        
        register = new JButton("Register");
        register.setBounds(250, 300, 300,70);
        register.setFont(f);
        register.setBackground(Color.GRAY);
        p.add(register);
        
        login.addActionListener((ActionEvent e) -> {
            try {
            
            Login l = new Login(p);
            p.remove(text);
            p.remove(login);
            p.remove(register);
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        });
        register.addActionListener((ActionEvent ae)->
        {
            try {
                Registration r = new Registration(p);
                p.remove(text);
                p.remove(login);
                p.remove(register);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        );
        
        j.add(p);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setResizable(false);
        j.setVisible(true);
    }
    public static void main(String[] args) throws Exception
    {
        WelcomeFrame f = new WelcomeFrame();
    }
}

    
