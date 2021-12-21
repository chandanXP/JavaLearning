package com.company.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiButtonSingleTextField implements ActionListener {
    JTextField text;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    MultiButtonSingleTextField(){
        JFrame f = new JFrame("Multiple Buttons Test");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        text = new JTextField("");
        text.setBounds(10,10,370,50);
        f.add(text);

        btn1 = new JButton("A");
        btn1.setBounds(10, 70, 87,87);
        f.add(btn1);

        btn2 = new JButton("B");
        btn2.setBounds(110, 70, 87,87);
        f.add(btn2);

        btn3 = new JButton("C");
        btn3.setBounds(210, 70, 87,87);
        f.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().contains("A")){
            text.setText(text.getText()+"A");
        }
        if(e.getActionCommand().contains("B")){
            text.setText(text.getText() +"B");
        }
        if(e.getActionCommand().contains("C")){
            text.setText(text.getText() +"C");
        }


    }

    public static void main(String[] args) {
        MultiButtonSingleTextField fr = new MultiButtonSingleTextField();

    }
}
