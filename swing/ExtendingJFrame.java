package com.company.swing;

import javax.swing.*;

public class ExtendingJFrame extends JFrame {
    public ExtendingJFrame(){
        setLayout(null);
        setSize(400, 400);//pixel
        setVisible(true);
        setTitle("Frame after extending JFrame");
    }
    public static void main(String[] args) {
        JavaSwing f = new JavaSwing();
    }
}
