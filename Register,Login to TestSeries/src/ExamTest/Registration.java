package ExamTest;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Registration 
{
    JLabel fname,lname,email,mobile,gender,username,password,head;
    JTextField fnameText,lnameText,emailText,mobileText,usernameText;
    JPasswordField passwordText;
    ButtonGroup grp;
    JButton register,cancel;
    public Registration(JPanel p) throws Exception
    {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());        
        Font f = new Font("Times new Roman", Font.PLAIN, 25);
        p.setBounds(280, 20, 850, 700);
        p.setBackground(Color.WHITE);
        p.setBorder(BorderFactory.createLineBorder(Color.gray));
        
        //______________________________________________________________________
        
        head = new JLabel("User's Registration Form");
        head.setBounds(200, 5, 500, 80);
        head.setFont(new Font("Times New Roman", Font.ITALIC , 40));
        p.add(head);
        
        //______________________________________________________________________
        
        fname = new JLabel("First Name : ");
        fname.setBounds(50, 150, 150, 30);
        fname.setFont(f);
        p.add(fname);
        
        fnameText = new JTextField();
        fnameText.setBounds(200, 150, 200, 38);
        fnameText.setFont(f);
        p.add(fnameText);
        
        //______________________________________________________________________
        
        lname = new JLabel("Last Name :");
        lname.setBounds(420, 150, 150, 30);
        lname.setFont(f);
        p.add(lname);
        
        lnameText = new JTextField();
        lnameText.setBounds(570, 150, 200, 38);
        lnameText.setFont(f);
        p.add(lnameText);
        
        //______________________________________________________________________
        
        email = new JLabel("Email ID : ");
        email.setBounds(50, 250, 150, 30);
        email.setFont(f);
        p.add(email);
        
        emailText = new JTextField();
        emailText.setBounds(200, 250, 400, 38);
        emailText.setFont(f);
        p.add(emailText);
        
        //______________________________________________________________________
        
        mobile = new JLabel("Mobile No. : ");
        mobile.setBounds(50, 350, 150, 30);
        mobile.setFont(f);
        p.add(mobile);
        
        mobileText = new JTextField();
        mobileText.setBounds(200, 350, 200, 38);
        mobileText.setFont(f);
        p.add(mobileText);
        
        //______________________________________________________________________
        
        gender = new JLabel("Gender : ");
        gender.setBounds(420, 350, 150, 30);
        gender.setFont(f);
        p.add(gender);
        
        grp = new ButtonGroup();
        
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(530, 350, 80, 30);
        male.setFont(f);
        grp.add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(620, 350, 100, 30);
        female.setFont(f);
        grp.add(female);
        p.add(male);
        p.add(female);
        
        //______________________________________________________________________
        
        username = new JLabel("Username : ");
        username.setBounds(50, 450, 150, 30);
        username.setFont(f);
        p.add(username);
        
        usernameText = new JTextField();
        usernameText.setBounds(200, 450, 300, 38);
        usernameText.setFont(f);
        p.add(usernameText);
        
        //______________________________________________________________________
        
        password = new JLabel("Password : ");
        password.setBounds(50, 550, 150, 30);
        password.setFont(f);
        p.add(password);
        
        passwordText = new JPasswordField();
        passwordText.setBounds(200, 550, 300, 38);
        passwordText.setFont(f);
        p.add(passwordText);
        
        register = new JButton("Register");
        register.setBounds(200, 630, 150, 50);
        register.setFont(f);
        p.add(register);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(400, 630, 150, 50);
        cancel.setFont(f);
        p.add(cancel);
        
        
        
        register.addActionListener((ActionEvent e) ->
        {
            String Fname = fnameText.getText();
            String Lname = lnameText.getText();
            String Email = emailText.getText();
            String Mobile = mobileText.getText();
            String Gender;
            if(male.isSelected()){Gender = male.getText();}
            else{Gender = female.getText();}
            String Username = usernameText.getText();
            String Password = passwordText.getText();
            
            String url = "jdbc:mysql://localhost/loginform";
            String user = "root";
            String pass = "Akshay";
            
            
            String input = "insert into registration values(?,?,?,?,?,?,?)";
            String Ulogin = "insert into login values(?,?)";
            Connection c;
            Statement s;
            try
            {
                c = DriverManager.getConnection(url,user,pass);
                s = c.createStatement();
                ResultSet rs = s.executeQuery("select username from registration");
                if(!Mobile.matches("\\d{10}")) { 
                    JOptionPane.showMessageDialog(p,"Mobile No Should be 10 digit");
                    System.exit(0);
                }
                Registration r = new Registration(p);

                while(rs.next())
                {
                    try{
                        if(rs.getString("username").equals(Username)){
                            JOptionPane.showMessageDialog(p, "Username '"+Username+"' already Exist, Please try another Username");
                        }

                    }catch(Exception ex)
                    {
                        System.out.println("Username '"+Username+"' alredy exist");
                    }
                }
                
                
                PreparedStatement ps1 = c.prepareStatement(input);
                ps1.setString(1, Fname);
                ps1.setString(2, Lname);
                ps1.setString(3, Email);
                ps1.setString(4, Mobile);
                ps1.setString(5, Gender);
                ps1.setString(6, Username);
                ps1.setString(7, Password);
                int r1 = ps1.executeUpdate();
                
                PreparedStatement ps2 = c.prepareStatement(Ulogin);
                ps2.setString(1, Username);
                ps2.setString(2, Password);
                int r2 = ps2.executeUpdate();
                
                String Upass = Password;
                JOptionPane.showMessageDialog(p, "Note Down your Username & Pasword\n Username : "+Username+"\n\n Password : "+Password);
                Login g = new Login(p);
                p.removeAll();
                p.remove(head);
                p.remove(fname);
                p.remove(fnameText);
                p.remove(lname);
                p.remove(lnameText);
                p.remove(email);
                p.remove(emailText);
                p.remove(mobile);
                p.remove(mobileText);
                p.remove(gender);
                p.remove(male);
                p.remove(female);
                p.remove(username);
                p.remove(usernameText);
                p.remove(password);
                p.remove(passwordText);
                p.remove(register);
                p.remove(cancel);
                Login g1 = new Login(p);
                }catch(Exception excp){}
                
              
        });
        
        cancel.addActionListener((ActionEvent e) -> 
        {
            JOptionPane.showMessageDialog(p, "Thanks for Visiting us");
            System.exit(0);
        });
        
    }

    
}

