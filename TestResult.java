
package Aptitude;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class TestResult extends JFrame
{
    Question q;
    QuestionDisplay d;
    JLabel Question1,Question2,Question3,Question4,Question5,Question6,Question7,Question8,Question9,Question10;
    JLabel userAns1,userAns2,userAns3,userAns4,userAns5,userAns6,userAns7,userAns8,userAns9,userAns10,ActualAns1,ActualAns2,ActualAns3,ActualAns4,ActualAns5,ActualAns6,ActualAns7,ActualAns8,ActualAns9,ActualAns10;
    JLabel correct,wrong,Cvalue,Wvalue;
    public TestResult() throws Exception
    {
        d = new QuestionDisplay();
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        JFrame j = new JFrame("Aptitude Series");
        j.setLayout(null);
        j.setLocationRelativeTo(null);
        j.setBounds(400, 10, 651, 710);
        Font f = new Font("lucida calligraphy", Font.HANGING_BASELINE, 30);
        
        //________________________________________________________________________________________________________________
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 650, 50);
        p1.setBackground(Color.GRAY);
        JLabel head = new JLabel("Result of Test Series ");
        head.setBounds(100, 150, 350, 40);
        head.setForeground(Color.WHITE);
        head.setFont(f);
        p1.add(head);
        j.add(p1);
        //_________________________________________________________________________________________________________________
        
        JPanel p2 = new JPanel(null);
        p2.setBackground(Color.WHITE);
        //p2.setBounds(0, 50, 650, 580);
        p2.setPreferredSize(new Dimension(600, 1000));
        Font ft = new Font("Times New Roman",Font.PLAIN,20);

        JScrollPane scroll = new JScrollPane(p2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(0,50,638,580);
        j.add(scroll);
        
        
        //----------------------------------------------------------------------Question 1
        Question1 = new JLabel(q.question[0]);
        Question1.setBounds(50, 0, 600, 30);
        Question1.setFont(ft);
        p2.add(Question1);
        
        userAns1 = new JLabel("Your Answer : "+QuestionDisplay.Ans1);
        userAns1.setBounds(100, 30, 500, 30);
        userAns1.setFont(ft);
        p2.add(userAns1);
        
        ActualAns1 = new JLabel("Actual Answer : "+q.option1[0]);
        ActualAns1.setBounds(100, 60, 500, 30);
        ActualAns1.setFont(ft);
        p2.add(ActualAns1);
        
        JSeparator sp1 = new JSeparator(JSeparator.HORIZONTAL);
        sp1.setBounds(0, 90, 650, 30);
        p2.add(sp1);
        
        //----------------------------------------------------------------------Question 2
        
        Question2 = new JLabel(q.question[1]);
        Question2.setBounds(50, 100, 600, 30);
        Question2.setFont(ft);
        p2.add(Question2);
        
        userAns2 = new JLabel("Your Answer : "+QuestionDisplay.Ans2);
        userAns2.setBounds(100, 130, 500, 30);
        userAns2.setFont(ft);
        p2.add(userAns2);
        
        ActualAns2 = new JLabel("Actual Answer : "+q.option2[3]);
        ActualAns2.setBounds(100, 160, 500, 30);
        ActualAns2.setFont(ft);
        p2.add(ActualAns2);
        
        JSeparator sp2 = new JSeparator(JSeparator.HORIZONTAL);
        sp2.setBounds(0, 190, 650, 30);
        p2.add(sp2);
        
        //----------------------------------------------------------------------Question 3
        
        Question3 = new JLabel(q.question[2]);
        Question3.setBounds(50, 200, 600, 30);
        Question3.setFont(ft);
        p2.add(Question3);
        
        userAns3 = new JLabel("Your Answer : "+QuestionDisplay.Ans3);
        userAns3.setBounds(100, 230, 500, 30);
        userAns3.setFont(ft);
        p2.add(userAns3);
        
        ActualAns3 = new JLabel("Actual Answer : "+q.option3[1]);
        ActualAns3.setBounds(100, 260, 500, 30);
        ActualAns3.setFont(ft);
        p2.add(ActualAns3);
        
        JSeparator sp3 = new JSeparator(JSeparator.HORIZONTAL);
        sp3.setBounds(0, 290, 650, 30);
        p2.add(sp3);
        
        //----------------------------------------------------------------------Question 4
        Question4 = new JLabel(q.question[3]);
        Question4.setBounds(50, 300, 600, 30);
        Question4.setFont(ft);
        p2.add(Question4);
        
        userAns4 = new JLabel("Your Answer : "+QuestionDisplay.Ans4);
        userAns4.setBounds(100, 330, 500, 30);
        userAns4.setFont(ft);
        p2.add(userAns4);
        
        ActualAns4 = new JLabel("Actual Answer : "+q.option4[0]);
        ActualAns4.setBounds(100, 360, 500, 30);
        ActualAns4.setFont(ft);
        p2.add(ActualAns4);
        
        JSeparator sp4 = new JSeparator(JSeparator.HORIZONTAL);
        sp4.setBounds(0, 390, 650, 30);
        p2.add(sp4);

        //----------------------------------------------------------------------Question 5
        
        Question5 = new JLabel(q.question[4]);
        Question5.setBounds(50, 400, 600, 30);
        Question5.setFont(ft);
        p2.add(Question5);
        
        userAns5 = new JLabel("Your Answer : "+QuestionDisplay.Ans5);
        userAns5.setBounds(100, 430, 500, 30);
        userAns5.setFont(ft);
        p2.add(userAns5);
        
        ActualAns5 = new JLabel("Actual Answer : "+q.option5[3]);
        ActualAns5.setBounds(100, 460, 500, 30);
        ActualAns5.setFont(ft);
        p2.add(ActualAns5);
        
        JSeparator sp5 = new JSeparator(JSeparator.HORIZONTAL);
        sp5.setBounds(0, 490, 650, 30);
        p2.add(sp5);

        //----------------------------------------------------------------------Question 6
        Question6 = new JLabel(q.question[5]);
        Question6.setBounds(50, 500, 600, 30);
        Question6.setFont(ft);
        p2.add(Question6);
        
        userAns6 = new JLabel("Your Answer : "+QuestionDisplay.Ans6);
        userAns6.setBounds(100, 530, 500, 30);
        userAns6.setFont(ft);
        p2.add(userAns6);
        
        ActualAns6 = new JLabel("Actual Answer : "+q.option6[3]);
        ActualAns6.setBounds(100, 560, 500, 30);
        ActualAns6.setFont(ft);
        p2.add(ActualAns6);
        
        JSeparator sp6 = new JSeparator(JSeparator.HORIZONTAL);
        sp6.setBounds(0, 590, 650, 30);
        p2.add(sp6);

        //----------------------------------------------------------------------Question 7
        Question7 = new JLabel(q.question[6]);
        Question7.setBounds(50, 600, 600, 30);
        Question7.setFont(ft);
        p2.add(Question7);
        
        userAns7 = new JLabel("Your Answer : "+QuestionDisplay.Ans7);
        userAns7.setBounds(100, 630, 500, 30);
        userAns7.setFont(ft);
        p2.add(userAns7);
        
        ActualAns7 = new JLabel("Actual Answer : "+q.option7[2]);
        ActualAns7.setBounds(100, 660, 500, 30);
        ActualAns7.setFont(ft);
        p2.add(ActualAns7);
        
        JSeparator sp7 = new JSeparator(JSeparator.HORIZONTAL);
        sp7.setBounds(0, 690, 650, 30);
        p2.add(sp7);

        //----------------------------------------------------------------------Question 8
        Question8 = new JLabel(q.question[7]);
        Question8.setBounds(50, 700, 600, 30);
        Question8.setFont(ft);
        p2.add(Question8);
        
        userAns8 = new JLabel("Your Answer : "+QuestionDisplay.Ans8);
        userAns8.setBounds(100, 730, 500, 30);
        userAns8.setFont(ft);
        p2.add(userAns8);
        
        ActualAns8 = new JLabel("Actual Answer : "+q.option8[0]);
        ActualAns8.setBounds(100, 760, 500, 30);
        ActualAns8.setFont(ft);
        p2.add(ActualAns8);
        
        JSeparator sp8 = new JSeparator(JSeparator.HORIZONTAL);
        sp8.setBounds(0, 790, 650, 30);
        p2.add(sp8);

        //----------------------------------------------------------------------Question 9
        
        Question9 = new JLabel(q.question[8]);
        Question9.setBounds(50, 800, 600, 30);
        Question9.setFont(ft);
        p2.add(Question9);
        
        userAns9 = new JLabel("Your Answer : "+QuestionDisplay.Ans9);
        userAns9.setBounds(100, 830, 500, 30);
        userAns9.setFont(ft);
        p2.add(userAns9);
        
        ActualAns9 = new JLabel("Actual Answer : "+q.option9[3]);
        ActualAns9.setBounds(100, 860, 500, 30);
        ActualAns9.setFont(ft);
        p2.add(ActualAns9);
        
        JSeparator sp9 = new JSeparator(JSeparator.HORIZONTAL);
        sp9.setBounds(0, 890, 650, 30);
        p2.add(sp9);
        //----------------------------------------------------------------------Question 10
        
        Question10 = new JLabel(q.question[9]);
        Question10.setBounds(50, 900, 600, 30);
        Question10.setFont(ft);
        p2.add(Question10);
        
        userAns10 = new JLabel("Your Answer : "+QuestionDisplay.Ans10);
        userAns10.setBounds(100, 930, 500, 30);
        userAns10.setFont(ft);
        p2.add(userAns10);
        
        ActualAns10 = new JLabel("Actual Answer : "+q.option10[3]);
        ActualAns10.setBounds(100, 960, 500, 30);
        ActualAns10.setFont(ft);
        p2.add(ActualAns10);
        
        JSeparator sp10 = new JSeparator(JSeparator.HORIZONTAL);
        sp10.setBounds(0, 990, 650, 30);
        p2.add(sp10);
        
        
        //_________________________________________________________________________________________________________________
        
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(0, 630, 650, 40);
        p3.setBackground(Color.LIGHT_GRAY);
        
        correct = new JLabel("Correct Answer : ");
        correct.setBounds(20, 10, 150, 30);
        correct.setFont(ft);
        correct.setBackground(Color.red);
        p3.add(correct);
        
        Cvalue = new JLabel(String.valueOf(d.getCorrect()));
        Cvalue.setBounds(170, 10, 50, 30);
        Cvalue.setBackground(Color.BLUE);
        Cvalue.setFont(ft);
        p3.add(Cvalue);
        
        wrong = new JLabel("Wrong Answer : ");
        wrong.setBounds(220, 10, 150, 30);
        wrong.setFont(ft);
        p3.add(wrong);
        
        Wvalue = new JLabel(String.valueOf(d.getWrong()));
        Wvalue.setBounds(350, 10, 50, 30);
        Wvalue.setFont(ft);
        p3.add(Wvalue);
        
        JButton exit = new JButton("Exit");
        exit.setBounds(500, 5, 100, 35);
        exit.setFont(ft);
        p3.add(exit);
        
        exit.addActionListener((ActionEvent e) -> {
            //j.dispose();
            System.exit(0);
        });
        
        j.add(p3);
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //j.setResizable(false);
        j.setVisible(true); 
        
       
    }
    
    public static void main(String[] args) throws Exception
    {
        QuestionDisplay d = new QuestionDisplay();
        
    }
    
    
}
