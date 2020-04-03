package examtest;

import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class WelcomeFrame extends JFrame
{
    JLabel text;
    JPanel p;
    JFrame j;
    JButton login;
    JButton register;
    
    public WelcomeFrame() throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        (this.j = new JFrame("Welcome, Guest")).setLayout(null);
        this.j.setLocationRelativeTo(null);
        this.j.setBounds(0, 0, 1365, 767);
        final Font f = new Font("Times new Roman", 2, 50);
        (this.p = new JPanel(null)).setBounds(280, 150, 800, 450);
        this.p.setBackground(Color.WHITE);
        this.p.setBorder(BorderFactory.createLineBorder(Color.gray));
        (this.text = new JLabel("Welcome Guest...!")).setBounds(200, 10, 600, 80);
        this.text.setFont(new Font("Times New Roman", 2, 60));
        this.text.setForeground(Color.BLACK);
        this.p.add(this.text);
        (this.login = new JButton("Login")).setBounds(250, 150, 300, 70);
        this.login.setFont(f);
        this.login.setBackground(Color.GRAY);
        this.p.add(this.login);
        (this.register = new JButton("Register")).setBounds(250, 300, 300, 70);
        this.register.setFont(f);
        this.register.setBackground(Color.GRAY);
        this.p.add(this.register);
        
        this.login.addActionListener(e -> {
            try {
                Login l = new Login(this.p);
                this.p.remove(this.text);
                this.p.remove(this.login);
                this.p.remove(this.register);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            return;
        });
        
        this.register.addActionListener(ae -> {
            try {
                Registration r = new Registration(this.p);
                this.p.remove(this.text);
                this.p.remove(this.login);
                this.p.remove(this.register);
            }
            catch (Exception ex2) {
                ex2.printStackTrace();
            }
            return;
        });
        this.j.add(this.p);
        this.j.setDefaultCloseOperation(3);
        this.j.setResizable(false);
        this.j.setVisible(true);
    }
    
    public static void main(final String[] args) throws Exception {
        final WelcomeFrame f = new WelcomeFrame();
    }
}