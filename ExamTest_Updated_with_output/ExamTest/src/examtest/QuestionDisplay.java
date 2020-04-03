package examtest;

import java.awt.event.ActionEvent;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.AbstractButton;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class QuestionDisplay
{
    
    static String Ans1;
    static String Ans2;
    static String Ans3;
    static String Ans4;
    static String Ans5;
    static String Ans6;
    static String Ans7;
    static String Ans8;
    static String Ans9;
    static String Ans10;
    static int Correct;
    static int Wrong;
    Question q;
    JLabel Question1;
    JLabel Question2;
    JLabel Question3;
    JLabel Question4;
    JLabel Question5;
    JLabel Question6;
    JLabel Question7;
    JLabel Question8;
    JLabel Question9;
    JLabel Question10;
    ButtonGroup Ques1;
    ButtonGroup Ques2;
    ButtonGroup Ques3;
    ButtonGroup Ques4;
    ButtonGroup Ques5;
    ButtonGroup Ques6;
    ButtonGroup Ques7;
    ButtonGroup Ques8;
    ButtonGroup Ques9;
    ButtonGroup Ques10;
    JRadioButton Ques1A;
    JRadioButton Ques1B;
    JRadioButton Ques1C;
    JRadioButton Ques1D;
    JRadioButton Ques2A;
    JRadioButton Ques2B;
    JRadioButton Ques2C;
    JRadioButton Ques2D;
    JRadioButton Ques3A;
    JRadioButton Ques3B;
    JRadioButton Ques3C;
    JRadioButton Ques3D;
    JRadioButton Ques4A;
    JRadioButton Ques4B;
    JRadioButton Ques4C;
    JRadioButton Ques4D;
    JRadioButton Ques5A;
    JRadioButton Ques5B;
    JRadioButton Ques5C;
    JRadioButton Ques5D;
    JRadioButton Ques6A;
    JRadioButton Ques6B;
    JRadioButton Ques6C;
    JRadioButton Ques6D;
    JRadioButton Ques7A;
    JRadioButton Ques7B;
    JRadioButton Ques7C;
    JRadioButton Ques7D;
    JRadioButton Ques8A;
    JRadioButton Ques8B;
    JRadioButton Ques8C;
    JRadioButton Ques8D;
    JRadioButton Ques9A;
    JRadioButton Ques9B;
    JRadioButton Ques9C;
    JRadioButton Ques9D;
    JRadioButton Ques10A;
    JRadioButton Ques10B;
    JRadioButton Ques10C;
    JRadioButton Ques10D;
    
    public QuestionDisplay() throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        final JFrame j = new JFrame("Aptitude Series");
        j.setLayout(null);
        j.setLocationRelativeTo(null);
        j.setBounds(400, 10, 651, 710);
        final Font f = new Font("lucida calligraphy", 2, 30);
        final JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 650, 50);
        p1.setBackground(Color.GRAY);
        final JLabel head = new JLabel("Welcome to Test Series ");
        head.setBounds(100, 150, 350, 40);
        head.setForeground(Color.WHITE);
        head.setFont(f);
        p1.add(head);
        j.add(p1);
        final JPanel p2 = new JPanel(null);
        p2.setBackground(Color.WHITE);
        p2.setPreferredSize(new Dimension(600, 1700));
        final Font ft = new Font("Times New Roman", 0, 20);
        final JScrollPane scroll = new JScrollPane(p2, 22, 31);
        scroll.setBounds(0, 50, 644, 580);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        j.add(scroll);
        final Question q = this.q;
        (this.Question1 = new JLabel(Question.question[0])).setBounds(50, 0, 600, 30);
        this.Question1.setFont(ft);
        p2.add(this.Question1);
        this.Ques1 = new ButtonGroup();
        final Question q2 = this.q;
        this.Ques1A = new JRadioButton(Question.option1[0]);
        final Question q3 = this.q;
        this.Ques1B = new JRadioButton(Question.option1[1]);
        final Question q4 = this.q;
        this.Ques1C = new JRadioButton(Question.option1[2]);
        final Question q5 = this.q;
        this.Ques1D = new JRadioButton(Question.option1[3]);
        this.Ques1A.setBounds(90, 30, 300, 30);
        this.Ques1B.setBounds(90, 60, 300, 30);
        this.Ques1C.setBounds(90, 90, 300, 30);
        this.Ques1D.setBounds(90, 120, 300, 30);
        this.Ques1A.setFont(ft);
        this.Ques1B.setFont(ft);
        this.Ques1C.setFont(ft);
        this.Ques1D.setFont(ft);
        this.Ques1.add(this.Ques1A);
        this.Ques1.add(this.Ques1B);
        this.Ques1.add(this.Ques1C);
        this.Ques1.add(this.Ques1D);
        p2.add(this.Ques1A);
        p2.add(this.Ques1B);
        p2.add(this.Ques1C);
        p2.add(this.Ques1D);
        final JSeparator sp1 = new JSeparator(0);
        sp1.setBounds(0, 170, 650, 30);
        p2.add(sp1);
        final Question q6 = this.q;
        (this.Question2 = new JLabel(Question.question[1])).setBounds(50, 180, 600, 30);
        this.Question2.setFont(ft);
        p2.add(this.Question2);
        this.Ques2 = new ButtonGroup();
        final Question q7 = this.q;
        this.Ques2A = new JRadioButton(Question.option2[0]);
        final Question q8 = this.q;
        this.Ques2B = new JRadioButton(Question.option2[1]);
        final Question q9 = this.q;
        this.Ques2C = new JRadioButton(Question.option2[2]);
        final Question q10 = this.q;
        this.Ques2D = new JRadioButton(Question.option2[3]);
        this.Ques2A.setBounds(90, 210, 300, 30);
        this.Ques2B.setBounds(90, 240, 300, 30);
        this.Ques2C.setBounds(90, 270, 400, 30);
        this.Ques2D.setBounds(90, 300, 300, 30);
        this.Ques2A.setFont(ft);
        this.Ques2B.setFont(ft);
        this.Ques2C.setFont(ft);
        this.Ques2D.setFont(ft);
        this.Ques2.add(this.Ques2A);
        this.Ques2.add(this.Ques2B);
        this.Ques2.add(this.Ques2C);
        this.Ques2.add(this.Ques2D);
        p2.add(this.Ques2A);
        p2.add(this.Ques2B);
        p2.add(this.Ques2C);
        p2.add(this.Ques2D);
        final JSeparator sp2 = new JSeparator(0);
        sp2.setBounds(0, 340, 650, 30);
        p2.add(sp2);
        final Question q11 = this.q;
        (this.Question3 = new JLabel(Question.question[2])).setBounds(50, 350, 600, 30);
        this.Question3.setFont(ft);
        p2.add(this.Question3);
        this.Ques3 = new ButtonGroup();
        final Question q12 = this.q;
        this.Ques3A = new JRadioButton(Question.option3[0]);
        final Question q13 = this.q;
        this.Ques3B = new JRadioButton(Question.option3[1]);
        final Question q14 = this.q;
        this.Ques3C = new JRadioButton(Question.option3[2]);
        final Question q15 = this.q;
        this.Ques3D = new JRadioButton(Question.option3[3]);
        this.Ques3A.setBounds(90, 380, 600, 30);
        this.Ques3B.setBounds(90, 410, 600, 30);
        this.Ques3C.setBounds(90, 440, 600, 30);
        this.Ques3D.setBounds(90, 470, 600, 30);
        this.Ques3A.setFont(ft);
        this.Ques3B.setFont(ft);
        this.Ques3C.setFont(ft);
        this.Ques3D.setFont(ft);
        this.Ques3.add(this.Ques3A);
        this.Ques3.add(this.Ques3B);
        this.Ques3.add(this.Ques3C);
        this.Ques3.add(this.Ques3D);
        p2.add(this.Ques3A);
        p2.add(this.Ques3B);
        p2.add(this.Ques3C);
        p2.add(this.Ques3D);
        final JSeparator sp3 = new JSeparator(0);
        sp3.setBounds(0, 510, 650, 30);
        p2.add(sp3);
        final Question q16 = this.q;
        (this.Question4 = new JLabel(Question.question[3])).setBounds(50, 520, 600, 30);
        this.Question4.setFont(ft);
        p2.add(this.Question4);
        this.Ques4 = new ButtonGroup();
        final Question q17 = this.q;
        this.Ques4A = new JRadioButton(Question.option4[0]);
        final Question q18 = this.q;
        this.Ques4B = new JRadioButton(Question.option4[1]);
        final Question q19 = this.q;
        this.Ques4C = new JRadioButton(Question.option4[2]);
        final Question q20 = this.q;
        this.Ques4D = new JRadioButton(Question.option4[3]);
        this.Ques4A.setBounds(90, 550, 600, 30);
        this.Ques4B.setBounds(90, 580, 600, 30);
        this.Ques4C.setBounds(90, 610, 600, 30);
        this.Ques4D.setBounds(90, 640, 600, 30);
        this.Ques4A.setFont(ft);
        this.Ques4B.setFont(ft);
        this.Ques4C.setFont(ft);
        this.Ques4D.setFont(ft);
        this.Ques4.add(this.Ques4A);
        this.Ques4.add(this.Ques4B);
        this.Ques4.add(this.Ques4C);
        this.Ques4.add(this.Ques4D);
        p2.add(this.Ques4A);
        p2.add(this.Ques4B);
        p2.add(this.Ques4C);
        p2.add(this.Ques4D);
        final JSeparator sp4 = new JSeparator(0);
        sp4.setBounds(0, 680, 650, 30);
        p2.add(sp4);
        final Question q21 = this.q;
        (this.Question5 = new JLabel(Question.question[4])).setBounds(50, 690, 600, 30);
        this.Question5.setFont(ft);
        p2.add(this.Question5);
        this.Ques5 = new ButtonGroup();
        final Question q22 = this.q;
        this.Ques5A = new JRadioButton(Question.option5[0]);
        final Question q23 = this.q;
        this.Ques5B = new JRadioButton(Question.option5[1]);
        final Question q24 = this.q;
        this.Ques5C = new JRadioButton(Question.option5[2]);
        final Question q25 = this.q;
        this.Ques5D = new JRadioButton(Question.option5[3]);
        this.Ques5A.setBounds(90, 720, 600, 30);
        this.Ques5B.setBounds(90, 750, 600, 30);
        this.Ques5C.setBounds(90, 780, 600, 30);
        this.Ques5D.setBounds(90, 810, 600, 30);
        this.Ques5A.setFont(ft);
        this.Ques5B.setFont(ft);
        this.Ques5C.setFont(ft);
        this.Ques5D.setFont(ft);
        this.Ques5.add(this.Ques5A);
        this.Ques5.add(this.Ques5B);
        this.Ques5.add(this.Ques5C);
        this.Ques5.add(this.Ques5D);
        p2.add(this.Ques5A);
        p2.add(this.Ques5B);
        p2.add(this.Ques5C);
        p2.add(this.Ques5D);
        final JSeparator sp5 = new JSeparator(0);
        sp5.setBounds(0, 850, 650, 30);
        p2.add(sp5);
        final Question q26 = this.q;
        (this.Question6 = new JLabel(Question.question[5])).setBounds(50, 860, 600, 30);
        this.Question6.setFont(ft);
        p2.add(this.Question6);
        this.Ques6 = new ButtonGroup();
        final Question q27 = this.q;
        this.Ques6A = new JRadioButton(Question.option6[0]);
        final Question q28 = this.q;
        this.Ques6B = new JRadioButton(Question.option6[1]);
        final Question q29 = this.q;
        this.Ques6C = new JRadioButton(Question.option6[2]);
        final Question q30 = this.q;
        this.Ques6D = new JRadioButton(Question.option6[3]);
        this.Ques6A.setBounds(90, 890, 600, 30);
        this.Ques6B.setBounds(90, 920, 600, 30);
        this.Ques6C.setBounds(90, 950, 600, 30);
        this.Ques6D.setBounds(90, 980, 600, 30);
        this.Ques6A.setFont(ft);
        this.Ques6B.setFont(ft);
        this.Ques6C.setFont(ft);
        this.Ques6D.setFont(ft);
        this.Ques6.add(this.Ques6A);
        this.Ques6.add(this.Ques6B);
        this.Ques6.add(this.Ques6C);
        this.Ques6.add(this.Ques6D);
        p2.add(this.Ques6A);
        p2.add(this.Ques6B);
        p2.add(this.Ques6C);
        p2.add(this.Ques6D);
        final JSeparator sp6 = new JSeparator(0);
        sp6.setBounds(0, 1020, 650, 30);
        p2.add(sp6);
        final Question q31 = this.q;
        (this.Question7 = new JLabel(Question.question[6])).setBounds(50, 1030, 600, 30);
        this.Question7.setFont(ft);
        p2.add(this.Question7);
        this.Ques7 = new ButtonGroup();
        final Question q32 = this.q;
        this.Ques7A = new JRadioButton(Question.option7[0]);
        final Question q33 = this.q;
        this.Ques7B = new JRadioButton(Question.option7[1]);
        final Question q34 = this.q;
        this.Ques7C = new JRadioButton(Question.option7[2]);
        final Question q35 = this.q;
        this.Ques7D = new JRadioButton(Question.option7[3]);
        this.Ques7A.setBounds(90, 1060, 600, 30);
        this.Ques7B.setBounds(90, 1090, 600, 30);
        this.Ques7C.setBounds(90, 1120, 600, 30);
        this.Ques7D.setBounds(90, 1150, 600, 30);
        this.Ques7A.setFont(ft);
        this.Ques7B.setFont(ft);
        this.Ques7C.setFont(ft);
        this.Ques7D.setFont(ft);
        this.Ques7.add(this.Ques7A);
        this.Ques7.add(this.Ques7B);
        this.Ques7.add(this.Ques7C);
        this.Ques7.add(this.Ques7D);
        p2.add(this.Ques7A);
        p2.add(this.Ques7B);
        p2.add(this.Ques7C);
        p2.add(this.Ques7D);
        final JSeparator sp7 = new JSeparator(0);
        sp7.setBounds(0, 1190, 650, 30);
        p2.add(sp7);
        final Question q36 = this.q;
        (this.Question8 = new JLabel(Question.question[7])).setBounds(50, 1200, 600, 30);
        this.Question8.setFont(ft);
        p2.add(this.Question8);
        this.Ques8 = new ButtonGroup();
        final Question q37 = this.q;
        this.Ques8A = new JRadioButton(Question.option8[0]);
        final Question q38 = this.q;
        this.Ques8B = new JRadioButton(Question.option8[1]);
        final Question q39 = this.q;
        this.Ques8C = new JRadioButton(Question.option8[2]);
        final Question q40 = this.q;
        this.Ques8D = new JRadioButton(Question.option8[3]);
        this.Ques8A.setBounds(90, 1230, 600, 30);
        this.Ques8B.setBounds(90, 1260, 600, 30);
        this.Ques8C.setBounds(90, 1290, 600, 30);
        this.Ques8D.setBounds(90, 1320, 600, 30);
        this.Ques8A.setFont(ft);
        this.Ques8B.setFont(ft);
        this.Ques8C.setFont(ft);
        this.Ques8D.setFont(ft);
        this.Ques8.add(this.Ques8A);
        this.Ques8.add(this.Ques8B);
        this.Ques8.add(this.Ques8C);
        this.Ques8.add(this.Ques8D);
        p2.add(this.Ques8A);
        p2.add(this.Ques8B);
        p2.add(this.Ques8C);
        p2.add(this.Ques8D);
        final JSeparator sp8 = new JSeparator(0);
        sp8.setBounds(0, 1360, 650, 30);
        p2.add(sp8);
        final Question q41 = this.q;
        (this.Question9 = new JLabel(Question.question[8])).setBounds(50, 1370, 600, 30);
        this.Question9.setFont(ft);
        p2.add(this.Question9);
        this.Ques9 = new ButtonGroup();
        final Question q42 = this.q;
        this.Ques9A = new JRadioButton(Question.option9[0]);
        final Question q43 = this.q;
        this.Ques9B = new JRadioButton(Question.option9[1]);
        final Question q44 = this.q;
        this.Ques9C = new JRadioButton(Question.option9[2]);
        final Question q45 = this.q;
        this.Ques9D = new JRadioButton(Question.option9[3]);
        this.Ques9A.setBounds(90, 1400, 600, 30);
        this.Ques9B.setBounds(90, 1430, 600, 30);
        this.Ques9C.setBounds(90, 1460, 600, 30);
        this.Ques9D.setBounds(90, 1490, 600, 30);
        this.Ques9A.setFont(ft);
        this.Ques9B.setFont(ft);
        this.Ques9C.setFont(ft);
        this.Ques9D.setFont(ft);
        this.Ques9.add(this.Ques9A);
        this.Ques9.add(this.Ques9B);
        this.Ques9.add(this.Ques9C);
        this.Ques9.add(this.Ques9D);
        p2.add(this.Ques9A);
        p2.add(this.Ques9B);
        p2.add(this.Ques9C);
        p2.add(this.Ques9D);
        final JSeparator sp9 = new JSeparator(0);
        sp9.setBounds(0, 1530, 650, 30);
        p2.add(sp9);
        final Question q46 = this.q;
        (this.Question10 = new JLabel(Question.question[9])).setBounds(50, 1540, 600, 30);
        this.Question10.setFont(ft);
        p2.add(this.Question10);
        this.Ques10 = new ButtonGroup();
        final Question q47 = this.q;
        this.Ques10A = new JRadioButton(Question.option10[0]);
        final Question q48 = this.q;
        this.Ques10B = new JRadioButton(Question.option10[1]);
        final Question q49 = this.q;
        this.Ques10C = new JRadioButton(Question.option10[2]);
        final Question q50 = this.q;
        this.Ques10D = new JRadioButton(Question.option10[3]);
        this.Ques10A.setBounds(90, 1570, 600, 30);
        this.Ques10B.setBounds(90, 1600, 600, 30);
        this.Ques10C.setBounds(90, 1630, 600, 30);
        this.Ques10D.setBounds(90, 1660, 600, 30);
        this.Ques10A.setFont(ft);
        this.Ques10B.setFont(ft);
        this.Ques10C.setFont(ft);
        this.Ques10D.setFont(ft);
        this.Ques10.add(this.Ques10A);
        this.Ques10.add(this.Ques10B);
        this.Ques10.add(this.Ques10C);
        this.Ques10.add(this.Ques10D);
        p2.add(this.Ques10A);
        p2.add(this.Ques10B);
        p2.add(this.Ques10C);
        p2.add(this.Ques10D);
        final JSeparator sp10 = new JSeparator(0);
        sp10.setBounds(0, 1700, 650, 30);
        p2.add(sp10);
        final JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(0, 630, 650, 40);
        p3.setBackground(Color.LIGHT_GRAY);
        final JButton submit = new JButton("Submit");
        submit.setBounds(180, 0, 100, 40);
        p3.add(submit);
        final JButton cancel = new JButton("Cancel");
        cancel.setBounds(320, 0, 100, 40);
        p3.add(cancel);
        j.add(p3);
        
        /*
        Question q52;
        Question q53;
        Question q54;
        Question q55;
        Question q56;
        Question q57;
        Question q58;
        Question q59;
        Question q60;
        Question q61;
        Question q62;
        Question q63;
        Question q64;
        Question q65;
        Question q66;
        Question q67;
        Question q68;
        Question q69;
        Question q70;
        Question q71;
        Question q72;
        Question q73;
        Question q74;
        Question q75;
        Question q76;
        Question q77;
        Question q78;
        Question q79;
        Question q80;
        Question q81;
        Question q82;
        Question q83;
        Question q84;
        Question q85;
        Question q86;
        Question q87;
        Question q88;
        Question q89;
        Question q90;
*/
        final Window window = null;
        
        submit.addActionListener(e -> {
            final char[] ch = new char[] { 'A', 'B', 'C', 'D' };
            if (this.Ques1A.isSelected()) {
                QuestionDisplay.Ans1 = this.Ques1A.getText();
                Question q51 = this.q;
                if (Question.ChAns[0] == ch[0]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques1B.isSelected()) {
                QuestionDisplay.Ans1 = this.Ques1B.getText();
               Question q52 = this.q;
                if (Question.ChAns[0] == ch[1]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques1C.isSelected()) {
                QuestionDisplay.Ans1 = this.Ques1C.getText();
                Question q53 = this.q;
                if (Question.ChAns[0] == ch[2]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques1D.isSelected()) {
                QuestionDisplay.Ans1 = this.Ques1D.getText();
                Question q54 = this.q;
                if (Question.ChAns[0] == ch[3]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques2A.isSelected()) {
                QuestionDisplay.Ans2 = this.Ques2A.getText();
                Question q55 = this.q;
                if (Question.ChAns[1] == ch[0]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques2B.isSelected()) {
                QuestionDisplay.Ans2 = this.Ques2B.getText();
                Question q56 = this.q;
                if (Question.ChAns[1] == ch[1]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques2C.isSelected()) {
                QuestionDisplay.Ans2 = this.Ques2C.getText();
                Question q57 = this.q;
                if (Question.ChAns[1] == ch[2]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques2D.isSelected()) {
                QuestionDisplay.Ans2 = this.Ques2D.getText();
                Question q58 = this.q;
                if (Question.ChAns[1] == ch[3]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques3A.isSelected()) {
                QuestionDisplay.Ans3 = this.Ques3A.getText();
                Question q59 = this.q;
                if (Question.ChAns[2] == ch[0]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques3B.isSelected()) {
                QuestionDisplay.Ans3 = this.Ques3B.getText();
               Question q60 = this.q;
                if (Question.ChAns[2] == ch[1]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques3C.isSelected()) {
                QuestionDisplay.Ans3 = this.Ques3C.getText();
                Question q61 = this.q;
                if (Question.ChAns[2] == ch[2]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques3D.isSelected()) {
                QuestionDisplay.Ans2 = this.Ques3D.getText();
                Question q62 = this.q;
                if (Question.ChAns[2] == ch[3]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques4A.isSelected()) {
                QuestionDisplay.Ans4 = this.Ques4A.getText();
                Question q63 = this.q;
                if (Question.ChAns[3] == ch[0]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques4B.isSelected()) {
                QuestionDisplay.Ans4 = this.Ques4B.getText();
                Question q64 = this.q;
                if (Question.ChAns[3] == ch[1]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques4C.isSelected()) {
                QuestionDisplay.Ans4 = this.Ques4C.getText();
                Question q65 = this.q;
                if (Question.ChAns[3] == ch[2]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques4D.isSelected()) {
                QuestionDisplay.Ans4 = this.Ques4D.getText();
                Question q66 = this.q;
                if (Question.ChAns[3] == ch[3]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques5A.isSelected()) {
                QuestionDisplay.Ans5 = this.Ques5A.getText();
                Question q67 = this.q;
                if (Question.ChAns[4] == ch[0]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques5B.isSelected()) {
                QuestionDisplay.Ans5 = this.Ques5B.getText();
                Question q68 = this.q;
                if (Question.ChAns[4] == ch[1]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques5C.isSelected()) {
                QuestionDisplay.Ans5 = this.Ques5C.getText();
                Question q69 = this.q;
                if (Question.ChAns[4] == ch[2]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques5D.isSelected()) {
                QuestionDisplay.Ans5 = this.Ques5D.getText();
                Question q70 = this.q;
                if (Question.ChAns[4] == ch[3]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques6A.isSelected()) {
                QuestionDisplay.Ans6 = this.Ques6A.getText();
                Question q71 = this.q;
                if (Question.ChAns[5] == ch[0]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques6B.isSelected()) {
                QuestionDisplay.Ans6 = this.Ques6B.getText();
                Question q72 = this.q;
                if (Question.ChAns[5] == ch[1]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques6C.isSelected()) {
                QuestionDisplay.Ans6 = this.Ques6C.getText();
                Question q73 = this.q;
                if (Question.ChAns[5] == ch[2]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques6D.isSelected()) {
                QuestionDisplay.Ans6 = this.Ques6D.getText();
                Question q74 = this.q;
                if (Question.ChAns[5] == ch[3]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques7A.isSelected()) {
                QuestionDisplay.Ans7 = this.Ques7A.getText();
                Question q75 = this.q;
                if (Question.ChAns[6] == ch[0]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques7B.isSelected()) {
                QuestionDisplay.Ans7 = this.Ques7B.getText();
                Question q76 = this.q;
                if (Question.ChAns[6] == ch[1]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques7C.isSelected()) {
                QuestionDisplay.Ans7 = this.Ques7C.getText();
                Question q77 = this.q;
                if (Question.ChAns[6] == ch[2]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques7D.isSelected()) {
                QuestionDisplay.Ans7 = this.Ques7D.getText();
                Question q78 = this.q;
                if (Question.ChAns[6] == ch[3]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques8A.isSelected()) {
                QuestionDisplay.Ans8 = this.Ques8A.getText();
                Question q79 = this.q;
                if (Question.ChAns[7] == ch[0]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques8B.isSelected()) {
                QuestionDisplay.Ans8 = this.Ques8B.getText();
                Question q80 = this.q;
                if (Question.ChAns[7] == ch[1]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques8C.isSelected()) {
                QuestionDisplay.Ans8 = this.Ques8C.getText();
                Question q81 = this.q;
                if (Question.ChAns[7] == ch[2]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques8D.isSelected()) {
                QuestionDisplay.Ans8 = this.Ques8D.getText();
                Question q82 = this.q;
                if (Question.ChAns[7] == ch[3]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques9A.isSelected()) {
                QuestionDisplay.Ans9 = this.Ques9A.getText();
                Question q83 = this.q;
                if (Question.ChAns[8] == ch[0]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques9B.isSelected()) {
                QuestionDisplay.Ans9 = this.Ques9B.getText();
                Question q84 = this.q;
                if (Question.ChAns[8] == ch[1]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques9C.isSelected()) {
                QuestionDisplay.Ans9 = this.Ques9C.getText();
                Question q85 = this.q;
                if (Question.ChAns[8] == ch[2]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques9D.isSelected()) {
                QuestionDisplay.Ans9 = this.Ques9C.getText();
               Question q86 = this.q;
                if (Question.ChAns[8] == ch[3]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques10A.isSelected()) {
                QuestionDisplay.Ans10 = this.Ques10A.getText();
                Question q87 = this.q;
                if (Question.ChAns[9] == ch[0]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques10B.isSelected()) {
                QuestionDisplay.Ans10 = this.Ques10B.getText();
                Question q88 = this.q;
                if (Question.ChAns[9] == ch[1]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques10C.isSelected()) {
                QuestionDisplay.Ans10 = this.Ques10C.getText();
                Question q89 = this.q;
                if (Question.ChAns[9] == ch[2]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            if (this.Ques10D.isSelected()) {
                QuestionDisplay.Ans10 = this.Ques10D.getText();
                Question q90 = this.q;
                if (Question.ChAns[9] == ch[3]) {
                    ++QuestionDisplay.Correct;
                }
                else {
                    ++QuestionDisplay.Wrong;
                }
            }
            
            try {
                TestResult testResult = new TestResult();
            }
            catch (Exception ex) {}
            return;
        });
        final Component parentComponent = null;
        cancel.addActionListener(e -> {
            JOptionPane.showMessageDialog(parentComponent, "Thanks for Visiting us...\n Good By");
            ((Window)parentComponent).dispose();
            return;
        });
        j.setDefaultCloseOperation(3);
        j.setResizable(false);
        j.setVisible(true);
    }
    
    public int getCorrect() {
        return QuestionDisplay.Correct;
    }
    
    public int getWrong() {
        return QuestionDisplay.Wrong;
    }
    
    static {
        QuestionDisplay.Correct = 0;
        QuestionDisplay.Wrong = 0;
    }
}