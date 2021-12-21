package com.company.swing;

import javax.swing.*;

public class FirstFrame {
    public FirstFrame(){
        JFrame frame = new JFrame();

        frame.setLayout(null);
        frame.setSize(400, 400);//pixel
        frame.setVisible(true);
        frame.setTitle("Hello Frame");
    }

    public static void main(String[] args) {
        JavaSwing f = new JavaSwing();
    }
}
