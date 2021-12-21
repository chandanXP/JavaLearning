package com.company.codechef.easy;
import javax.swing.*;
import java.awt.*;

public class Jbutton {
    public static void main(String[] args) {
        JFrame f =new JFrame("Calculator");
        JTextArea input = new JTextArea();
        input.setBounds(0,0,200,50);

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");

        JButton bplus = new JButton("+");
        JButton bsub = new JButton("-");
        JButton bmul = new JButton("x");
        JButton bdiv = new JButton("/");
        JButton bequal = new JButton("=");
        JButton bclear = new JButton("c");


        btn1.setBounds(0, 50, 50, 50);
        btn2.setBounds(50, 50, 50, 50);
        btn3.setBounds(100, 50, 50, 50);
        btn4.setBounds(0, 100, 50, 50);
        btn5.setBounds(50, 100, 50, 50);
        btn6.setBounds(100, 100, 50, 50);
        btn7.setBounds(0, 150, 50, 50);
        btn8.setBounds(50, 150, 50, 50);
        btn9.setBounds(100, 150, 50, 50);
        btn0.setBounds(50, 200, 50, 50);

        bplus.setBounds(150, 50, 50, 50);
        bsub.setBounds(150, 100, 50, 50);
        bmul.setBounds(150, 150, 50, 50);
        bdiv.setBounds(150, 200, 50, 50);
        bequal.setBounds(100, 200, 50, 50);
        bclear.setBounds(0, 200, 50, 50);

        bequal.setBackground(Color.green);
        bclear.setBackground(Color.orange);

        f.add(input);

        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);
        f.add(btn5);
        f.add(btn6);
        f.add(btn7);
        f.add(btn8);
        f.add(btn9);
        f.add(btn0);

        f.add(bplus);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
        f.add(bclear);
        f.add(bequal);


        //f.setSize(250, 300);
        f.setMinimumSize(new Dimension(215,285));
        f.setLayout(null);
        f.setVisible(true);

    }
}
