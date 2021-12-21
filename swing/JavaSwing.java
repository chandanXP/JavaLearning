package com.company.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwing implements ActionListener {
    JFrame frame;
    JTextField text;
    JLabel label;
    JTextArea text_area;

    public JavaSwing(){
        frame = new JFrame("title of the frame");
        frame.setLayout(null);
        frame.setSize(400, 400);//pixel
        frame.setVisible(true);
        //frame.setTitle("Hello Frame");

        //button
        JButton btn = new JButton("click");
        btn.setBounds(40,40,100,30);
        frame.add(btn);

        //Label
        label = new JLabel("click to learn java swing.");
        label.setBounds(40, 90, 250, 30);
        frame.add(label);
        //Text Field
        text =new JTextField();
        text.setBounds(40, 130, 250 ,30);
        frame.add(text);
        
        text_area = new JTextArea();
        text_area.setBounds(40, 180, 250,180);
        text_area.setBackground(Color.CYAN);
        text_area.setForeground(Color.RED);
        frame.add(text_area);

        JButton btn_count = new JButton("count");
        btn_count.setBounds(40, 190, 100, 30);



        //Action Listener
        /*
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button has been clicked!");
                text.setText("text has been changed!");
            };
        });

         */
        btn.addActionListener(this);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        label.setText("new label");
        text.setText("new text, button clicked!");
    }

    public static void main(String[] args) {
        JavaSwing f = new JavaSwing();
    }
}
