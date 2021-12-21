package com.company.codechef.easy;
import java.awt.*;
import javax.swing.*;

public class Border
{
    JFrame f;
    Border()
    {
        f = new JFrame("Calculator");


        JButton btn = new JButton("click");
        btn.setBounds(50,100, 95,30);
        //JTextArea input = new JTextArea();
        //input.setBounds(10,30,300,50);




        //f.add(input);
        f.add(btn);



        f.setSize(300, 300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        Border b = new Border();
    }
}
