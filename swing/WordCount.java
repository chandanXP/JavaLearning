package com.company.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCount {
    public WordCount(){
        JFrame f =new JFrame("Word Counter");
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);

        JTextArea text_area = new JTextArea();
        text_area.setBounds(10, 10, 300, 200);
        f.add(text_area);

        JButton btn = new JButton("count");
        btn.setBounds(150, 300, 100, 30);
        f.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = text_area.getText();
                txt = txt.trim();
                int count=0;
                for(int i=0; i<txt.length(); i++){
                    if(txt.charAt(i) ==' '){
                        count++;
                    }
                }
                btn.setText(Integer.toString(count+1));
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        WordCount n = new WordCount();

    }
}
