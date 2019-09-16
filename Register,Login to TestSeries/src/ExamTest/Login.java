package ExamTest;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Login extends JFrame
{
    JLabel loginname,username,password;
    JTextField logintext,passwdtext;
    JButton login,register;
    
    /**
     *
     * @param p
     * @throws Exception
     */
    public Login(JPanel p) throws Exception 
    {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());        
        Font f = new Font("Times new Roman", Font.PLAIN, 30);
        
        p.setBounds(380, 150, 600, 450);
        p.setBackground(Color.WHITE);
        p.setBorder(BorderFactory.createLineBorder(Color.gray));
        
        loginname = new JLabel("Login");
        loginname.setBounds(250, 5, 300, 70);
        loginname.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        p.add(loginname,BorderLayout.EAST);
        
        
        //_____________________________________________________________________________
        
        username = new JLabel("Username : ");
        username.setBounds(30, 130 , 150, 30);
        username.setFont(f);
        p.add(username);
        
        logintext = new JTextField();
        logintext.setBounds(230, 130, 300, 40);
        logintext.setFont(f);
        logintext.setBorder(BorderFactory.createLineBorder(Color.gray));
        p.add(logintext);
        
        //_______________________________________________________________________________
        
        password = new JLabel("Password : ");
        password.setBounds(30, 220, 150, 30);
        password.setFont(f);
        p.add(password);
        
        passwdtext = new JPasswordField();
        passwdtext.setBounds(230, 220, 300, 40);
        passwdtext.setFont(f);
        passwdtext.setBorder(BorderFactory.createLineBorder(Color.gray));
        p.add(passwdtext);
        
        //_______________________________________________________________________________
        
        login = new JButton("Login");
        login.setBounds(30, 320, 250, 50);
        login.setFont(f);
        login.setBackground(Color.WHITE);
        p.add(login);
        
        register = new JButton("Register");
        register.setBounds(320, 320, 250, 50);
        register.setFont(f);
        register.setBackground(Color.WHITE);
        p.add(register);
        
        
        login.addActionListener((ActionEvent e) ->
        {
          try{
                run(p);
          }catch(Exception ex){ex.printStackTrace();}
        });
        
        
        register.addActionListener((ActionEvent ae)->
        {
            try {
                Registration r = new Registration(p);
                p.remove(loginname);
                p.remove(username);
                p.remove(logintext);
                p.remove(password);
                p.remove(passwdtext);
                p.remove(login);
                p.remove(register);
            } catch (Exception ex) {ex.printStackTrace(); }
        });
        
      

    }
    
    public void run(JPanel p) throws SQLException
    {
        String url = "jdbc:mysql://localhost/loginform";
        String user = "root";
        String pass = "Akshay";
        Connection c = DriverManager.getConnection(url,user,pass);
        Statement s = c.createStatement();
        String usrnm = logintext.getText();
        String passwd = passwdtext.getText();

        String logPass = "select username from login where username = ? and password = ?";
        PreparedStatement ps1 = (PreparedStatement) c.prepareStatement(logPass);
        ps1.setString(1, usrnm);
        ps1.setString(2, passwd);


        ResultSet set =  ps1.executeQuery();
        if(set.next())
        {
            JOptionPane.showMessageDialog(null, "Login Successful");
            try{ 
                QuestionDisplay d = new QuestionDisplay();
                p.remove(loginname);
                p.remove(username);
                p.remove(logintext);
                p.remove(password);
                p.remove(passwdtext);
                p.remove(login);
                p.remove(register);
    
            }catch(Exception x){x.printStackTrace();}
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid username and password");
        }
    }
    
}