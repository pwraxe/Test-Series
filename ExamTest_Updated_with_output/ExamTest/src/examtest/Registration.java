package examtest;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Registration
{
    
    JLabel fname;
    JLabel lname;
    JLabel email;
    JLabel mobile;
    JLabel gender;
    JLabel username;
    JLabel password;
    JLabel head;
    JTextField fnameText;
    JTextField lnameText;
    JTextField emailText;
    JTextField mobileText;
    JTextField usernameText;
    JPasswordField passwordText;
    ButtonGroup grp;
    JButton register;
    JButton cancel;

    
    public Registration(final JPanel p) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        final Font f = new Font("Times new Roman", 0, 25);
        p.setBounds(280, 20, 850, 700);
        p.setBackground(Color.WHITE);
        p.setBorder(BorderFactory.createLineBorder(Color.gray));
        (this.head = new JLabel("User's Registration Form")).setBounds(200, 5, 500, 80);
        this.head.setFont(new Font("Times New Roman", 2, 40));
        p.add(this.head);
        (this.fname = new JLabel("First Name : ")).setBounds(50, 150, 150, 30);
        this.fname.setFont(f);
        p.add(this.fname);
        (this.fnameText = new JTextField()).setBounds(200, 150, 200, 38);
        this.fnameText.setFont(f);
        p.add(this.fnameText);
        (this.lname = new JLabel("Last Name :")).setBounds(420, 150, 150, 30);
        this.lname.setFont(f);
        p.add(this.lname);
        (this.lnameText = new JTextField()).setBounds(570, 150, 200, 38);
        this.lnameText.setFont(f);
        p.add(this.lnameText);
        (this.email = new JLabel("Email ID : ")).setBounds(50, 250, 150, 30);
        this.email.setFont(f);
        p.add(this.email);
        (this.emailText = new JTextField()).setBounds(200, 250, 400, 38);
        this.emailText.setFont(f);
        p.add(this.emailText);
        (this.mobile = new JLabel("Mobile No. : ")).setBounds(50, 350, 150, 30);
        this.mobile.setFont(f);
        p.add(this.mobile);
        (this.mobileText = new JTextField()).setBounds(200, 350, 200, 38);
        this.mobileText.setFont(f);
        p.add(this.mobileText);
        (this.gender = new JLabel("Gender : ")).setBounds(420, 350, 150, 30);
        this.gender.setFont(f);
        p.add(this.gender);
        this.grp = new ButtonGroup();
        final JRadioButton male = new JRadioButton("Male");
        male.setBounds(530, 350, 80, 30);
        male.setFont(f);
        this.grp.add(male);
        final JRadioButton female = new JRadioButton("Female");
        female.setBounds(620, 350, 100, 30);
        female.setFont(f);
        this.grp.add(female);
        p.add(male);
        p.add(female);
        (this.username = new JLabel("Username : ")).setBounds(50, 450, 150, 30);
        this.username.setFont(f);
        p.add(this.username);
        (this.usernameText = new JTextField()).setBounds(200, 450, 300, 38);
        this.usernameText.setFont(f);
        p.add(this.usernameText);
        (this.password = new JLabel("Password : ")).setBounds(50, 550, 150, 30);
        this.password.setFont(f);
        p.add(this.password);
        (this.passwordText = new JPasswordField()).setBounds(200, 550, 300, 38);
        this.passwordText.setFont(f);
        p.add(this.passwordText);
        (this.register = new JButton("Register")).setBounds(200, 630, 150, 50);
        this.register.setFont(f);
        p.add(this.register);
        (this.cancel = new JButton("Cancel")).setBounds(400, 630, 150, 50);
        this.cancel.setFont(f);
        p.add(this.cancel);
        
        
        final AbstractButton comp = null;
        final AbstractButton comp2 = null;

     
        
        this.register.addActionListener((e) -> {
            String Fname = this.fnameText.getText();
            String Lname = this.lnameText.getText();
            String Email = this.emailText.getText();
            String Mobile = this.mobileText.getText();
           /* if (comp.isSelected()) {
                String Gender = "Male";
            }
            else {
                String Gender= "Female";
            }*/
            String Username = this.usernameText.getText();
            String Password = this.passwordText.getText();
            String url = "jdbc:mysql://localhost/loginform";
            String user = "root";
            String pass = "Akshay";
            String input = "insert into registration values(?,?,?,?,?,?,?)";
            String Ulogin = "insert into login values(?,?)";
            try {
                Connection c = DriverManager.getConnection(url, user, pass);
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery("select username from registration");
                if (!Mobile.matches("\\d{10}")) {
                    JOptionPane.showMessageDialog(p, "Mobile No Should be 10 digit");
                    System.exit(0);
                }
                Registration r = new Registration(p);
                while (rs.next()) {
                    try {
                        if (rs.getString("username").equals(Username)) {
                            JOptionPane.showMessageDialog(p, "Username '" + Username + "' already Exist, Please try another Username");
                        }
                        else {
                            continue;
                        }
                    }
                    catch (Exception ex) {
                        System.out.println("Username '" + Username + "' alredy exist");
                    }
                }
                PreparedStatement ps1 = c.prepareStatement(input);
                ps1.setString(1, Fname);
                ps1.setString(2, Lname);
                ps1.setString(3, Email);
                ps1.setString(4, Mobile);
                ps1.setString(5, "Male");
                ps1.setString(6, Username);
                ps1.setString(7, Password);
                int r2 = ps1.executeUpdate();
                PreparedStatement ps2 = c.prepareStatement(Ulogin);
                ps2.setString(1, Username);
                ps2.setString(2, Password);
                int r3 = ps2.executeUpdate();
                String Upass = Password;
                JOptionPane.showMessageDialog(p, "Note Down your Username & Pasword\n Username : " + Username + "\n\n Password : " + Password);
                Login g = new Login(p);
                p.removeAll();
//                p.remove(this.head);
//                p.remove(this.fname);
//                p.remove(this.fnameText);
//                p.remove(this.lname);
//                p.remove(this.lnameText);
//                p.remove(this.email);
//                p.remove(this.emailText);
//                p.remove(this.mobile);
//                p.remove(this.mobileText);
//                p.remove(this.gender);
//                p.remove(comp);
//                p.remove(comp2);
//                p.remove(this.username);
//                p.remove(this.usernameText);
//                p.remove(this.password);
//                p.remove(this.passwordText);
//                p.remove(this.register);
//                p.remove(this.cancel);
                Login login = new Login(p);
            }
            catch (Exception ex2) {}
            return;
        });
        this.cancel.addActionListener(e -> {
            JOptionPane.showMessageDialog(p, "Thanks for Visiting us");
            System.exit(0);
        });
    }
}