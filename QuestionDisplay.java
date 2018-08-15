
package Aptitude;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class QuestionDisplay
{     
    
    TestResult r; 
    static String Ans1,Ans2,Ans3,Ans4,Ans5,Ans6,Ans7,Ans8,Ans9,Ans10;
    static int Correct = 0;
    static int Wrong = 0;
    Question q;
    JLabel Question1,Question2,Question3,Question4,Question5,Question6,Question7,Question8,Question9,Question10;
    ButtonGroup Ques1,Ques2,Ques3,Ques4,Ques5,Ques6,Ques7,Ques8,Ques9,Ques10;
    JRadioButton Ques1A,Ques1B,Ques1C,Ques1D,Ques2A,Ques2B,Ques2C,Ques2D,Ques3A,Ques3B,Ques3C,Ques3D,Ques4A,Ques4B,Ques4C,Ques4D,Ques5A,Ques5B,Ques5C,Ques5D
                ,Ques6A,Ques6B,Ques6C,Ques6D,Ques7A,Ques7B,Ques7C,Ques7D,Ques8A,Ques8B,Ques8C,Ques8D,Ques9A,Ques9B,Ques9C,Ques9D,Ques10A,Ques10B,Ques10C,Ques10D;
    public QuestionDisplay() throws Exception
    {
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
        JLabel head = new JLabel("Welcome to Test Series ");
        head.setBounds(100, 150, 350, 40);
        head.setForeground(Color.WHITE);
        head.setFont(f);
        p1.add(head);
        j.add(p1);
        //_________________________________________________________________________________________________________________
        
        JPanel p2 = new JPanel(null);
        p2.setBackground(Color.WHITE);
        //p2.setBounds(0, 50, 650, 580);
        p2.setPreferredSize(new Dimension(600, 1700));
        Font ft = new Font("Times New Roman",Font.PLAIN,20);
        
        
        
        JScrollPane scroll = new JScrollPane(p2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(0,50,644,580);
        j.add(scroll);
       
        //----------------------------------------------------------------------Question 1
        Question1 = new JLabel(q.question[0]);
        Question1.setBounds(50, 0, 600, 30);
        Question1.setFont(ft);
        p2.add(Question1);
        
        Ques1 = new ButtonGroup();
        Ques1A = new JRadioButton(q.option1[0]);
        Ques1B = new JRadioButton(q.option1[1]);
        Ques1C = new JRadioButton(q.option1[2]);
        Ques1D = new JRadioButton(q.option1[3]);
        Ques1A.setBounds(90, 30, 300, 30);
        Ques1B.setBounds(90, 60, 300, 30);
        Ques1C.setBounds(90, 90, 300, 30);
        Ques1D.setBounds(90, 120, 300, 30);
        
        Ques1A.setFont(ft);
        Ques1B.setFont(ft);
        Ques1C.setFont(ft);
        Ques1D.setFont(ft);
                
        Ques1.add(Ques1A);
        Ques1.add(Ques1B);
        Ques1.add(Ques1C);
        Ques1.add(Ques1D);
        
        p2.add(Ques1A);
        p2.add(Ques1B);
        p2.add(Ques1C);
        p2.add(Ques1D);
        
        JSeparator sp1 = new JSeparator(JSeparator.HORIZONTAL);
        sp1.setBounds(0, 170, 650, 30);
        p2.add(sp1);
        
        //----------------------------------------------------------------------Question 2
        Question2 = new JLabel(q.question[1]);
        Question2.setBounds(50, 180, 600, 30);
        Question2.setFont(ft);
        p2.add(Question2);
        
        Ques2 = new ButtonGroup();
        Ques2A = new JRadioButton(q.option2[0]);
        Ques2B = new JRadioButton(q.option2[1]);
        Ques2C = new JRadioButton(q.option2[2]);
        Ques2D = new JRadioButton(q.option2[3]);
        
        Ques2A.setBounds(90, 210, 300, 30);
        Ques2B.setBounds(90, 240, 300, 30);
        Ques2C.setBounds(90, 270, 400, 30);
        Ques2D.setBounds(90, 300, 300, 30);
        
        Ques2A.setFont(ft);
        Ques2B.setFont(ft);
        Ques2C.setFont(ft);
        Ques2D.setFont(ft);
        
        Ques2.add(Ques2A);
        Ques2.add(Ques2B);
        Ques2.add(Ques2C);
        Ques2.add(Ques2D);
        
        p2.add(Ques2A);
        p2.add(Ques2B);
        p2.add(Ques2C);
        p2.add(Ques2D);
        
        JSeparator sp2 = new JSeparator(JSeparator.HORIZONTAL);
        sp2.setBounds(0, 340, 650, 30);
        p2.add(sp2);
        
        //----------------------------------------------------------------------Question 3
        Question3 = new JLabel(q.question[2]);
        Question3.setBounds(50, 350, 600, 30);
        Question3.setFont(ft);
        p2.add(Question3);
        
        Ques3 = new ButtonGroup();
        Ques3A = new JRadioButton(q.option3[0]);
        Ques3B = new JRadioButton(q.option3[1]);
        Ques3C = new JRadioButton(q.option3[2]);
        Ques3D = new JRadioButton(q.option3[3]);
        
        Ques3A.setBounds(90, 380, 600, 30);
        Ques3B.setBounds(90, 410, 600, 30);
        Ques3C.setBounds(90, 440, 600, 30);
        Ques3D.setBounds(90, 470, 600, 30);
        
        Ques3A.setFont(ft);
        Ques3B.setFont(ft);
        Ques3C.setFont(ft);
        Ques3D.setFont(ft);
        
        Ques3.add(Ques3A);
        Ques3.add(Ques3B);
        Ques3.add(Ques3C);
        Ques3.add(Ques3D);
        
        p2.add(Ques3A);
        p2.add(Ques3B);
        p2.add(Ques3C);
        p2.add(Ques3D);
        
        JSeparator sp3 = new JSeparator(JSeparator.HORIZONTAL);
        sp3.setBounds(0, 510, 650, 30);
        p2.add(sp3);
        
        //----------------------------------------------------------------------Question 4
        
        Question4 = new JLabel(q.question[3]);
        Question4.setBounds(50, 520, 600, 30);
        Question4.setFont(ft);
        p2.add(Question4);
        
        Ques4 = new ButtonGroup();
        Ques4A = new JRadioButton(q.option4[0]);
        Ques4B = new JRadioButton(q.option4[1]);
        Ques4C = new JRadioButton(q.option4[2]);
        Ques4D = new JRadioButton(q.option4[3]);
        
        Ques4A.setBounds(90, 550, 600, 30);
        Ques4B.setBounds(90, 580, 600, 30);
        Ques4C.setBounds(90, 610, 600, 30);
        Ques4D.setBounds(90, 640, 600, 30);
        
        Ques4A.setFont(ft);
        Ques4B.setFont(ft);
        Ques4C.setFont(ft);
        Ques4D.setFont(ft);
        
        Ques4.add(Ques4A);
        Ques4.add(Ques4B);
        Ques4.add(Ques4C);
        Ques4.add(Ques4D);
        
        p2.add(Ques4A);
        p2.add(Ques4B);
        p2.add(Ques4C);
        p2.add(Ques4D);
        
        
        JSeparator sp4 = new JSeparator(JSeparator.HORIZONTAL);
        sp4.setBounds(0, 680, 650, 30);
        p2.add(sp4);
        //----------------------------------------------------------------------Question 5
        
        Question5 = new JLabel(q.question[4]);
        Question5.setBounds(50, 690, 600, 30);
        Question5.setFont(ft);
        p2.add(Question5);
        
        Ques5 = new ButtonGroup();
        Ques5A = new JRadioButton(q.option5[0]);
        Ques5B = new JRadioButton(q.option5[1]);
        Ques5C = new JRadioButton(q.option5[2]);
        Ques5D = new JRadioButton(q.option5[3]);
        
        Ques5A.setBounds(90, 720, 600, 30);
        Ques5B.setBounds(90, 750, 600, 30);
        Ques5C.setBounds(90, 780, 600, 30);
        Ques5D.setBounds(90, 810, 600, 30);
        
        Ques5A.setFont(ft);
        Ques5B.setFont(ft);
        Ques5C.setFont(ft);
        Ques5D.setFont(ft);
        
        Ques5.add(Ques5A);
        Ques5.add(Ques5B);
        Ques5.add(Ques5C);
        Ques5.add(Ques5D);
        
        p2.add(Ques5A);
        p2.add(Ques5B);
        p2.add(Ques5C);
        p2.add(Ques5D);
        
        JSeparator sp5 = new JSeparator(JSeparator.HORIZONTAL);
        sp5.setBounds(0, 850, 650, 30);
        p2.add(sp5);
        
        //----------------------------------------------------------------------Question 6
        
        Question6 = new JLabel(q.question[5]);
        Question6.setBounds(50, 860, 600, 30);
        Question6.setFont(ft);
        p2.add(Question6);
        
        Ques6 = new ButtonGroup();
        Ques6A = new JRadioButton(q.option6[0]);
        Ques6B = new JRadioButton(q.option6[1]);
        Ques6C = new JRadioButton(q.option6[2]);
        Ques6D = new JRadioButton(q.option6[3]);
        
        Ques6A.setBounds(90, 890, 600, 30);
        Ques6B.setBounds(90, 920, 600, 30);
        Ques6C.setBounds(90, 950, 600, 30);
        Ques6D.setBounds(90, 980, 600, 30);
        
        Ques6A.setFont(ft);
        Ques6B.setFont(ft);
        Ques6C.setFont(ft);
        Ques6D.setFont(ft);
        
        Ques6.add(Ques6A);
        Ques6.add(Ques6B);
        Ques6.add(Ques6C);
        Ques6.add(Ques6D);
        
        p2.add(Ques6A);
        p2.add(Ques6B);
        p2.add(Ques6C);
        p2.add(Ques6D);
        
        JSeparator sp6 = new JSeparator(JSeparator.HORIZONTAL);
        sp6.setBounds(0, 1020, 650, 30);
        p2.add(sp6);
        
        //----------------------------------------------------------------------Question 7
        
        Question7 = new JLabel(q.question[6]);
        Question7.setBounds(50, 1030, 600, 30);
        Question7.setFont(ft);
        p2.add(Question7);
        
        Ques7 = new ButtonGroup();
        Ques7A = new JRadioButton(q.option7[0]);
        Ques7B = new JRadioButton(q.option7[1]);
        Ques7C = new JRadioButton(q.option7[2]);
        Ques7D = new JRadioButton(q.option7[3]);
        
        Ques7A.setBounds(90, 1060, 600, 30);
        Ques7B.setBounds(90, 1090, 600, 30);
        Ques7C.setBounds(90, 1120, 600, 30);
        Ques7D.setBounds(90, 1150, 600, 30);
        
        Ques7A.setFont(ft);
        Ques7B.setFont(ft);
        Ques7C.setFont(ft);
        Ques7D.setFont(ft);
        
        Ques7.add(Ques7A);
        Ques7.add(Ques7B);
        Ques7.add(Ques7C);
        Ques7.add(Ques7D);
        
        p2.add(Ques7A);
        p2.add(Ques7B);
        p2.add(Ques7C);
        p2.add(Ques7D);
        
        JSeparator sp7 = new JSeparator(JSeparator.HORIZONTAL);
        sp7.setBounds(0, 1190, 650, 30);
        p2.add(sp7);
        
        
        //----------------------------------------------------------------------Question 8
        Question8 = new JLabel(q.question[7]);
        Question8.setBounds(50, 1200, 600, 30);
        Question8.setFont(ft);
        p2.add(Question8);
        
        Ques8 = new ButtonGroup();
        Ques8A = new JRadioButton(q.option8[0]);
        Ques8B = new JRadioButton(q.option8[1]);
        Ques8C = new JRadioButton(q.option8[2]);
        Ques8D = new JRadioButton(q.option8[3]);
        
        Ques8A.setBounds(90, 1230, 600, 30);
        Ques8B.setBounds(90, 1260, 600, 30);
        Ques8C.setBounds(90, 1290, 600, 30);
        Ques8D.setBounds(90, 1320, 600, 30);
        
        Ques8A.setFont(ft);
        Ques8B.setFont(ft);
        Ques8C.setFont(ft);
        Ques8D.setFont(ft);
        
        Ques8.add(Ques8A);
        Ques8.add(Ques8B);
        Ques8.add(Ques8C);
        Ques8.add(Ques8D);
        
        p2.add(Ques8A);
        p2.add(Ques8B);
        p2.add(Ques8C);
        p2.add(Ques8D);
        
        JSeparator sp8 = new JSeparator(JSeparator.HORIZONTAL);
        sp8.setBounds(0, 1360, 650, 30);
        p2.add(sp8);
        
        //----------------------------------------------------------------------Question 9
        Question9 = new JLabel(q.question[8]);
        Question9.setBounds(50, 1370, 600, 30);
        Question9.setFont(ft);
        p2.add(Question9);
        
        Ques9 = new ButtonGroup();
        Ques9A = new JRadioButton(q.option9[0]);
        Ques9B = new JRadioButton(q.option9[1]);
        Ques9C = new JRadioButton(q.option9[2]);
        Ques9D = new JRadioButton(q.option9[3]);
        
        Ques9A.setBounds(90, 1400, 600, 30);
        Ques9B.setBounds(90, 1430, 600, 30);
        Ques9C.setBounds(90, 1460, 600, 30);
        Ques9D.setBounds(90, 1490, 600, 30);
        
        Ques9A.setFont(ft);
        Ques9B.setFont(ft);
        Ques9C.setFont(ft);
        Ques9D.setFont(ft);
        
        Ques9.add(Ques9A);
        Ques9.add(Ques9B);
        Ques9.add(Ques9C);
        Ques9.add(Ques9D);
        
        p2.add(Ques9A);
        p2.add(Ques9B);
        p2.add(Ques9C);
        p2.add(Ques9D);
        
        JSeparator sp9 = new JSeparator(JSeparator.HORIZONTAL);
        sp9.setBounds(0, 1530, 650, 30);
        p2.add(sp9);
        
        //----------------------------------------------------------------------Question 10
        
        Question10 = new JLabel(q.question[9]);
        Question10.setBounds(50, 1540, 600, 30);
        Question10.setFont(ft);
        p2.add(Question10);
        
        Ques10 = new ButtonGroup();
        Ques10A = new JRadioButton(q.option10[0]);
        Ques10B = new JRadioButton(q.option10[1]);
        Ques10C = new JRadioButton(q.option10[2]);
        Ques10D = new JRadioButton(q.option10[3]);
        
        Ques10A.setBounds(90, 1570, 600, 30);
        Ques10B.setBounds(90, 1600, 600, 30);
        Ques10C.setBounds(90, 1630, 600, 30);
        Ques10D.setBounds(90, 1660, 600, 30);
        
        Ques10A.setFont(ft);
        Ques10B.setFont(ft);
        Ques10C.setFont(ft);
        Ques10D.setFont(ft);
        
        Ques10.add(Ques10A);
        Ques10.add(Ques10B);
        Ques10.add(Ques10C);
        Ques10.add(Ques10D);
        
        p2.add(Ques10A);
        p2.add(Ques10B);
        p2.add(Ques10C);
        p2.add(Ques10D);
        
        JSeparator sp10 = new JSeparator(JSeparator.HORIZONTAL);
        sp10.setBounds(0, 1700, 650, 30);
        p2.add(sp10);
        
        //___________________________________________________________________________
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(0, 630, 650, 40);
        p3.setBackground(Color.LIGHT_GRAY);
        JButton submit = new JButton("Submit");
        
        submit.setBounds(180,0, 100, 40);
        p3.add(submit);
        
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(320, 0, 100, 40);
        p3.add(cancel);
        
        
        j.add(p3);
        
        //-----------------------------------------------------------Submit Button
        submit.addActionListener((ActionEvent e) -> {
            char ch[] ={'A','B','C','D'};
            
            //---------------------------------------Question 1
            if(Ques1A.isSelected())
            {
                Ans1 = Ques1A.getText();
                if(q.ChAns[0] == ch[0]){++Correct;}
                else{++Wrong;}
            }
            if(Ques1B.isSelected())
            {
                Ans1 = Ques1B.getText();
                if(q.ChAns[0] == ch[1]){++Correct;}
                else{++Wrong;}
            }
            if(Ques1C.isSelected())
            {
                Ans1 = Ques1C.getText();
                if(q.ChAns[0] == ch[2]){++Correct;}
                else{++Wrong;}
            }
            if(Ques1D.isSelected())
            {
                Ans1 = Ques1D.getText();
                if(q.ChAns[0] == ch[3]){++Correct;}
                else{++Wrong;}
            }
            
            //----------------------------------------Question 2
            
            if(Ques2A.isSelected())
            {
                Ans2 = Ques2A.getText();
                if(q.ChAns[1] == ch[0]){++Correct;}
                else{++Wrong;}
            }
            if(Ques2B.isSelected())
            {
                Ans2 = Ques2B.getText();
                if(q.ChAns[1] == ch[1]){++Correct;}
                else{++Wrong;}
            }
            if(Ques2C.isSelected())
            {
                Ans2 = Ques2C.getText();
                if(q.ChAns[1] == ch[2]){++Correct;}
                else{++Wrong;}
            }
            if(Ques2D.isSelected())
            {
                Ans2 = Ques2D.getText();
                if(q.ChAns[1] == ch[3]){++Correct;}
                else{++Wrong;}
            }
            
            
            //----------------------------------------Question 3
            
            if(Ques3A.isSelected())
            {
                Ans3 = Ques3A.getText();
                if(q.ChAns[2] == ch[0]){++Correct;}
                else{++Wrong;}
            }
            if(Ques3B.isSelected())
            {
                Ans3 = Ques3B.getText();
                if(q.ChAns[2] == ch[1]){++Correct;}
                else{++Wrong;}
            }
            if(Ques3C.isSelected())
            {
                Ans3 = Ques3C.getText();
                if(q.ChAns[2] == ch[2]){++Correct;}
                else{++Wrong;}
            }
            if(Ques3D.isSelected())
            {
                Ans2 = Ques3D.getText();
                if(q.ChAns[2] == ch[3]){++Correct;}
                else{++Wrong;}
            }
            
            //----------------------------------------Question 4
            
            if(Ques4A.isSelected())
            {
                Ans4 = Ques4A.getText();
                if(q.ChAns[3] == ch[0]){++Correct;}
                else{++Wrong;}
            }
            if(Ques4B.isSelected())
            {
                Ans4 = Ques4B.getText();
                if(q.ChAns[3] == ch[1]){++Correct;}
                else{++Wrong;}
            }
            if(Ques4C.isSelected())
            {
                Ans4 = Ques4C.getText();
                if(q.ChAns[3] == ch[2]){++Correct;}
                else{++Wrong;}
            }
            if(Ques4D.isSelected())
            {
                Ans4 = Ques4D.getText();
                if(q.ChAns[3] == ch[3]){++Correct;}
                else{++Wrong;}
            }
            
            //----------------------------------------Question 5
            
            if(Ques5A.isSelected())
            {
                Ans5 = Ques5A.getText();
                if(q.ChAns[4] == ch[0]){++Correct;}
                else{++Wrong;}
            }
            if(Ques5B.isSelected())
            {
                Ans5 = Ques5B.getText();
                if(q.ChAns[4] == ch[1]){++Correct;}
                else{++Wrong;}
            }
            if(Ques5C.isSelected())
            {
                Ans5 = Ques5C.getText();
                if(q.ChAns[4] == ch[2]){++Correct;}
                else{++Wrong;}
            }
            if(Ques5D.isSelected())
            {
                Ans5 = Ques5D.getText();
                if(q.ChAns[4] == ch[3]){++Correct;}
                else{++Wrong;}
            }
            
            //----------------------------------------Question 6
            
            if(Ques6A.isSelected())
            {
                Ans6 = Ques6A.getText();
                if(q.ChAns[5] == ch[0]){++Correct;}
                else{++Wrong;}
            }
            if(Ques6B.isSelected())
            {
                Ans6 = Ques6B.getText();
                if(q.ChAns[5] == ch[1]){++Correct;}
                else{++Wrong;}
            }
            if(Ques6C.isSelected())
            {
                Ans6 = Ques6C.getText();
                if(q.ChAns[5] == ch[2]){++Correct;}
                else{++Wrong;}
            }
            if(Ques6D.isSelected())
            {
                Ans6 = Ques6D.getText();
                if(q.ChAns[5] == ch[3]){++Correct;}
                else{++Wrong;}
            }
            
            //----------------------------------------Question 7
            
            if(Ques7A.isSelected())
            {
                Ans7 = Ques7A.getText();
                if(q.ChAns[6] == ch[0]){++Correct;}
                else{++Wrong;}
            }
            if(Ques7B.isSelected())
            {
                Ans7 = Ques7B.getText();
                if(q.ChAns[6] == ch[1]){++Correct;}
                else{++Wrong;}
            }
            if(Ques7C.isSelected())
            {
                Ans7 = Ques7C.getText();
                if(q.ChAns[6] == ch[2]){++Correct;}
                else{++Wrong;}
            }
            if(Ques7D.isSelected())
            {
                Ans7 = Ques7D.getText();
                if(q.ChAns[6] == ch[3]){++Correct;}
                else{++Wrong;}
            }
            
            //----------------------------------------Question 8
            
            
            if(Ques8A.isSelected())
            {
                Ans8 = Ques8A.getText();
                if(q.ChAns[7] == ch[0]){++Correct;}
                else{++Wrong;}
            }
            if(Ques8B.isSelected())
            {
                Ans8 = Ques8B.getText();
                if(q.ChAns[7] == ch[1]){++Correct;}
                else{++Wrong;}
            }
            if(Ques8C.isSelected())
            {
                Ans8 = Ques8C.getText();
                if(q.ChAns[7] == ch[2]){++Correct;}
                else{++Wrong;}
            }
            if(Ques8D.isSelected())
            {
                Ans8 = Ques8D.getText();
                if(q.ChAns[7] == ch[3]){++Correct;}
                else{++Wrong;}
            }
            
            
            //----------------------------------------Question 9
            
            if(Ques9A.isSelected())
            {
                Ans9 = Ques9A.getText();
                if(q.ChAns[8] == ch[0]){++Correct;}
                else{++Wrong;}
            }
            if(Ques9B.isSelected())
            {
                Ans9 = Ques9B.getText();
                if(q.ChAns[8] == ch[1]){++Correct;}
                else{++Wrong;}
            }
            if(Ques9C.isSelected())
            {
                Ans9 = Ques9C.getText();
                if(q.ChAns[8] == ch[2]){++Correct;}
                else{++Wrong;}
            }
            if(Ques9D.isSelected())
            {
                Ans9 = Ques9C.getText();
                if(q.ChAns[8] == ch[3]){++Correct;}
                else{++Wrong;}
            }
            
            
            //----------------------------------------Question 10
            
            
            if(Ques10A.isSelected())
            {
                Ans10 = Ques10A.getText();
                if(q.ChAns[9] == ch[0]){++Correct;}
                else{++Wrong;}
            }
            if(Ques10B.isSelected())
            {
                Ans10 = Ques10B.getText();
                if(q.ChAns[9] == ch[1]){++Correct;}
                else{++Wrong;}
            }
            if(Ques10C.isSelected())
            {
                Ans10 = Ques10C.getText();
                if(q.ChAns[9] == ch[2]){++Correct;}
                else{++Wrong;}
            }if(Ques10D.isSelected())
            {
                Ans10 = Ques10D.getText();
                if(q.ChAns[9] == ch[3]){++Correct;}
                else{++Wrong;}
            }
            j.dispose();
            try {
                TestResult tr = new TestResult();
            } catch (Exception ex) {}
            
        });
        
        
        
        //-----------------------------------------------------------Cancel Button
        
        cancel.addActionListener((ActionEvent e) -> 
        {
            JOptionPane.showMessageDialog(j, "Thanks for Visiting us...\n Good By");
            j.dispose();
        });
        
        //___________________________________________________________________________
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setResizable(false);
        j.setVisible(true); 
    }

    public int getCorrect() {
        return Correct;
    }

    public int getWrong() {
        return Wrong;
    }
    
    

  
}
