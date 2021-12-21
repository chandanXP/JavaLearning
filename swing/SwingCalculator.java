package com.company.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;

public class SwingCalculator extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_add,b_sub,b_mul,b_div,b_equal,b_clr;
    JTextArea text;
    String expression = "";
    ArrayList<Character> operators = new ArrayList<>(16);
    ArrayList<String> numbers = new ArrayList<>(16);

    public void equalsTo(String expression){
            int i=0;
            for(int j=0;j<expression.length();j++){
                if(j == expression.length()-1){
                    if(j==i){
                        numbers.add(Character.toString(expression.charAt(j)));
                    }
                    else {
                        numbers.add(expression.substring(i, j));
                    }
                }
                else if(expression.charAt(j) == '+' || expression.charAt(j) == '-' || expression.charAt(j) == '*' || expression.charAt(j) == '/' ){
                    operators.add(expression.charAt(j));
                    numbers.add(expression.substring(i,j));
                    i=j+1;
                }
            }

    };

    public int process(ArrayList<String> numbers, ArrayList<Character> operators){
        ArrayList<Integer> temp = new ArrayList<>(16);
        int result= 0;
        for(int i=0; i<operators.toArray().length; i++){
            if(operators.get(i)=='*'){
                if( operators.get(i-1)== '*' || operators.get(i-1)== '/' ){
                    //temp.set(last element of temp  * (i+1)th  element  on  numbers,      last position of temp )
                    temp.set(temp.get(temp.size()-1) * Integer.parseInt( numbers.get(i+1) ),temp.size()-1);
                }
                temp.add(   Integer.parseInt( numbers.get(i) ) * Integer.parseInt( numbers.get(i+1) )   );
                operators.set(i,'0');
            }
            else if(operators.get(i)=='/'){
                if( operators.get(i-1)== '/' || operators.get(i-1)== '*' ){
                    //temp.set(last element of temp  / (i+1)th  element  on  numbers,      last position of temp )
                    temp.set(temp.get(temp.size()-1) / Integer.parseInt( numbers.get(i+1) ),temp.size()-1);
                }
                temp.add(   Integer.parseInt( numbers.get(i) ) / Integer.parseInt( numbers.get(i+1) )   );
                operators.set(i,'0');
            }
            else{
                temp.add(   Integer.parseInt( numbers.get(i+1) )  );
            }
        }
        int k=0;
        for(int i=0; i<temp.toArray().length; i++){
            if(temp.toArray().length ==1){
                //result = last element of temp
                result = temp.get(temp.size()-1);
            }
            else if(operators.get(i)=='+'){
                result =  (temp.get(i) ) + ( temp.get(i+1) );
                operators.set(i, '0');
                k=i+2;
                break;
            }
            else if(operators.get(i)=='-'){
                result =  ( temp.get(i) ) - ( temp.get(i+1) );
                operators.set(i, '0');
                k=i+2;
                break;
            }
        }
        for(int i=k; i<temp.toArray().length;i++){
            if(temp.toArray().length ==1){
                //result = last element of temp
                result = temp.get(temp.size()-1);
            }
            else if(operators.get(i)=='+'){
                result =  result + Integer.parseInt( numbers.get(i) );
                operators.set(i, '0');
            }
            else if(operators.get(i)=='-'){
                result =  result - Integer.parseInt( numbers.get(i) );
                operators.set(i, '0');
            }
        }
        return result;
    }

    SwingCalculator(){
        JFrame f = new JFrame("Calculator");
        f.setSize(400,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        topPanel.setSize(400,200);
        topPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        text = new JTextArea("");
        text.setBounds(10,10,370,100);
        Font san = new Font("SansSerif",Font.PLAIN,60);
        text.setFont(san);
        topPanel.add(text);

        f.add(topPanel,BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(200,200));
        bottomPanel.setLayout(new GridLayout(4,4));
        b1 = new JButton("1");b2 = new JButton("2");b3 = new JButton("3");  b_mul = new JButton("*");
        b4 = new JButton("4");b5 = new JButton("5");b6 = new JButton("6");  b_div = new JButton("/");
        b7 = new JButton("7");b8 = new JButton("8");b9 = new JButton("9");  b_sub = new JButton("-");
        b_clr = new JButton("x");b0 = new JButton("0");b_equal = new JButton("=");  b_add = new JButton("+");

        bottomPanel.add(b1);bottomPanel.add(b2);bottomPanel.add(b3);    bottomPanel.add(b_mul);
        bottomPanel.add(b4);bottomPanel.add(b5);bottomPanel.add(b6);    bottomPanel.add(b_div);
        bottomPanel.add(b7);bottomPanel.add(b8);bottomPanel.add(b9);     bottomPanel.add(b_sub);
        bottomPanel.add(b_clr);bottomPanel.add(b0);bottomPanel.add(b_equal);    bottomPanel.add(b_add);

        f.add(bottomPanel,BorderLayout.CENTER);

        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);   b_mul.addActionListener(this);
        b4.addActionListener(this);b4.addActionListener(this);b6.addActionListener(this);   b_div.addActionListener(this);
        b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);   b_sub.addActionListener(this);
        b_clr.addActionListener(this);b0.addActionListener(this);b_equal.addActionListener(this);   b_add.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().contains("1")){
            text.setText(text.getText() + "1");
        }
        if(e.getActionCommand().contains("2")){
            text.setText(text.getText() + "2");
        }
        if(e.getActionCommand().contains("3")){
            text.setText(text.getText() + "3");
        }
        if(e.getActionCommand().contains("4")){
            text.setText(text.getText() + "4");
        }
        if(e.getActionCommand().contains("5")){
            text.setText(text.getText() + "5");
        }
        if(e.getActionCommand().contains("6")){
            text.setText(text.getText() + "6");
        }
        if(e.getActionCommand().contains("7")){
            text.setText(text.getText() + "7");
        }
        if(e.getActionCommand().contains("8")){
            text.setText(text.getText() + "8");
        }
        if(e.getActionCommand().contains("9")){
            text.setText(text.getText() + "9");
        }
        if(e.getActionCommand().contains("0")){
            text.setText(text.getText() + "0");
        }
        if(e.getActionCommand().contains("+")){
            text.setText(text.getText() + "+");
        }
        if(e.getActionCommand().contains("-")){
            text.setText(text.getText() + "-");
        }
        if(e.getActionCommand().contains("*")){
            text.setText(text.getText() + "*");
        }
        if(e.getActionCommand().contains("/")){
            text.setText(text.getText() + "/");
        }
        if(e.getActionCommand().contains("=")){
            expression = text.getText();
            System.out.println(expression.length());
            equalsTo(expression);
            int res = process(numbers, operators);
            text.setText(String.valueOf(res));
        }
        if(e.getActionCommand().contains("X")){
            text.setText("");
        }
    };

    public static void main(String[] args) {
        SwingCalculator calculator = new SwingCalculator();

    }
}
