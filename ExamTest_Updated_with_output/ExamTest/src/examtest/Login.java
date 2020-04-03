package examtest;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Login extends JFrame
{
    JLabel loginname;
    JLabel username;
    JLabel password;
    JTextField logintext;
    JTextField passwdtext;
    JButton login;
    JButton register;
    
    public Login(final JPanel p) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        final Font f = new Font("Times new Roman", 0, 30);
        p.setBounds(380, 150, 600, 450);
        p.setBackground(Color.WHITE);
        p.setBorder(BorderFactory.createLineBorder(Color.gray));
        (this.loginname = new JLabel("Login")).setBounds(250, 5, 300, 70);
        this.loginname.setFont(new Font("Times New Roman", 0, 50));
        p.add(this.loginname, "East");
        (this.username = new JLabel("Username : ")).setBounds(30, 130, 150, 30);
        this.username.setFont(f);
        p.add(this.username);
        (this.logintext = new JTextField()).setBounds(230, 130, 300, 40);
        this.logintext.setFont(f);
        this.logintext.setBorder(BorderFactory.createLineBorder(Color.gray));
        p.add(this.logintext);
        (this.password = new JLabel("Password : ")).setBounds(30, 220, 150, 30);
        this.password.setFont(f);
        p.add(this.password);
        (this.passwdtext = new JPasswordField()).setBounds(230, 220, 300, 40);
        this.passwdtext.setFont(f);
        this.passwdtext.setBorder(BorderFactory.createLineBorder(Color.gray));
        p.add(this.passwdtext);
        (this.login = new JButton("Login")).setBounds(30, 320, 250, 50);
        this.login.setFont(f);
        this.login.setBackground(Color.WHITE);
        p.add(this.login);
        (this.register = new JButton("Register")).setBounds(320, 320, 250, 50);
        this.register.setFont(f);
        this.register.setBackground(Color.WHITE);
        p.add(this.register);
        this.login.addActionListener(e -> {
            try {
                this.run(p);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            return;
        });
        
        this.register.addActionListener((ActionEvent ae) -> {
            try {
                Registration r = new Registration(p);
                p.remove(this.loginname);
                p.remove(this.username);
                p.remove(this.logintext);
                p.remove(this.password);
                p.remove(this.passwdtext);
                p.remove(this.login);
                p.remove(this.register);
            }
            catch (Exception ex2) {
                ex2.printStackTrace();
            }
        });
    }
    
    public void run(final JPanel p) throws SQLException {
        final String url = "jdbc:mysql://localhost/loginform";
        final String user = "root";
        final String pass = "Akshay";
        final Connection c = DriverManager.getConnection(url, user, pass);
        final Statement s = c.createStatement();
        final String usrnm = this.logintext.getText();
        final String passwd = this.passwdtext.getText();
        final String logPass = "select username from login where username = ? and password = ?";
        final PreparedStatement ps1 = c.prepareStatement(logPass);
        ps1.setString(1, usrnm);
        ps1.setString(2, passwd);
        final ResultSet set = ps1.executeQuery();
        if (set.next()) {
            JOptionPane.showMessageDialog(null, "Login Successful");
            try {
                final QuestionDisplay d = new QuestionDisplay();
                p.remove(this.loginname);
                p.remove(this.username);
                p.remove(this.logintext);
                p.remove(this.password);
                p.remove(this.passwdtext);
                p.remove(this.login);
                p.remove(this.register);
            }
            catch (Exception x) {
                x.printStackTrace();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid username and password");
        }
    }
}