package com.company.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM {
    JTextField name_field, amt_field, ac_field,pin_field, deposit_amt,withdraw_amt, deposit_pin, withdraw_pin;
    JLabel trans1, trans2, trans3, trans4, trans5, trans6;
    JLabel Name_val, Acc_val, amount_val, pin_val;
    String transaction = "";
    int counter =0;

    ATM(){
        //Frame
        JFrame frame = new JFrame("ATM OF BPIT");
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Main Panel
        JPanel Main_panel = new JPanel();
        JPanel header_panel = new JPanel();
        JPanel body_panel = new JPanel();
        Main_panel.setVisible(true);
        Main_panel.setBounds(0,0,600,400);
        Main_panel.setSize(400,400);
        Main_panel.setLocation(100,0);

        JLabel wel = new JLabel("WELCOME TO BPIT BANK ATM", SwingConstants.CENTER);
        wel.setBounds(0,0,600,50);
        wel.setFont(new Font("Verdana", Font.BOLD, 16));

        JLabel registration_form = new JLabel(" You are a new user, create new account to continue ", SwingConstants.CENTER);
        registration_form.setBounds(0,50,600,50);

        name_field = new JTextField();
        name_field.setBounds(100,100,400,50);
        name_field.setText("Enter your name");
        name_field.setSize(400, 50);

        ac_field = new JTextField("Enter Your A/C No");
        ac_field.setBounds(100,150,400,50);
        ac_field.setSize(400, 50);

        amt_field = new JTextField("Initial amount");
        amt_field.setBounds(100,200,400,50);
        amt_field.setSize(400, 50);

        pin_field = new JTextField("Four Digit PIN");
        pin_field.setBounds(100,250,400,50);
        pin_field.setSize(400, 50);

        JButton create_btn = new JButton("Create Account");
        create_btn.setBounds(100,250,400,50);
        create_btn.setPreferredSize(new Dimension(400,50));

        //Register Panel
        header_panel.add(wel);
        header_panel.add(registration_form);
        header_panel.setLayout(new GridLayout(2,1));
        header_panel.setSize(600,200);

        body_panel.add(name_field);
        body_panel.add(ac_field);
        body_panel.add(amt_field);
        body_panel.add(pin_field);
        body_panel.add(create_btn);
        body_panel.setLayout(new GridLayout(5,1));
        body_panel.setSize(600,500);

        Main_panel.add(header_panel);
        Main_panel.add(body_panel);
        Main_panel.setLayout(new GridLayout(3,3));

        frame.add(Main_panel);

        //header of second Panel
        JPanel head_panel = new JPanel();
        head_panel.setBounds(0, 0, 600,50);
        JLabel head_l = new JLabel("BPIT BANK ATM");
        head_panel.add(head_l);
        //head_panel.setBackground(Color.orange);
        head_panel.setBorder(BorderFactory.createLineBorder(Color.black));
        head_panel.setVisible(false);

        //side panel
        JPanel side_panel = new JPanel();
        side_panel.setBounds(0, 50, 200,350);
        //side_panel.setBackground(Color.CYAN);
        side_panel.setBorder(BorderFactory.createLineBorder(Color.black));
        side_panel.setVisible(false);

        JPanel btn_panel1 = new JPanel();
        btn_panel1.setBounds(0,50,200,50);
        JPanel btn_panel2 = new JPanel();
        btn_panel2.setBounds(0,100,200,50);
        JPanel btn_panel3 = new JPanel();
        btn_panel3.setBounds(0,150,200,50);
        JPanel btn_panel4 = new JPanel();
        btn_panel4.setBounds(0,200,200,50);

        JButton btn1 = new JButton("HOME");
        btn1.setBounds(0,50,200,50);
        btn1.setPreferredSize(new Dimension(200,50));
        btn1.setVisible(false);

        JButton btn2 = new JButton("DEPOSIT");
        btn2.setBounds(0,100,200,50);
        btn2.setPreferredSize(new Dimension(200,50));
        btn2.setVisible(false);

        JButton btn3 = new JButton("WITHDRAW");
        btn3.setBounds(0,150,200,50);
        btn3.setPreferredSize(new Dimension(200,50));
        btn3.setVisible(false);

        JButton btn4 = new JButton("TRANSACTION");
        btn4.setBounds(0,200,200,50);
        btn4.setPreferredSize(new Dimension(200,50));
        btn4.setVisible(false);

        btn_panel1.add(btn1);
        btn_panel2.add(btn2);
        btn_panel3.add(btn3);
        btn_panel4.add(btn4);


        JPanel panel1 = new JPanel();
        panel1.setBounds(200, 50, 400,350);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setVisible(false);

        //Panel 1 Content
        JLabel Name_l = new JLabel("Name : ");
        Name_val = new JLabel("");
        JLabel Acc_l = new JLabel("A/C NO : ");
        Acc_val = new JLabel("");
        JLabel amount_l  = new JLabel("Balance : ");
        amount_val  = new JLabel("");
        JLabel pin = new JLabel("PIN : ");
        pin_val = new JLabel("XXXX");
        JLabel ifsc_l = new JLabel("IFSC : ");
        JLabel ifsc_val = new JLabel("RAGHAVCHANDANCSEA");

        JPanel homeGridPanel = new JPanel();
        homeGridPanel.setBounds(250,100,300,300);
        homeGridPanel.setPreferredSize(new Dimension(300, 300));
        homeGridPanel.add(Name_l);homeGridPanel.add(Name_val);
        homeGridPanel.add(Acc_l);homeGridPanel.add(Acc_val);
        homeGridPanel.add(amount_l);homeGridPanel.add(amount_val);
        homeGridPanel.add(pin);homeGridPanel.add(pin_val);
        homeGridPanel.add(ifsc_l);homeGridPanel.add(ifsc_val);

        GridLayout homeGrid = new GridLayout(6,2);
        homeGridPanel.setLayout(homeGrid);
        panel1.add(homeGridPanel);

        JPanel panel2 = new JPanel();
        panel2.setBounds(200, 50, 400,350);
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.setVisible(false);

        JPanel DepositGridPanel = new JPanel();
        DepositGridPanel.setBounds(250, 100, 300, 300);
        DepositGridPanel.setPreferredSize(new Dimension(300,300));

        deposit_amt = new JTextField("Enter you amount");
        deposit_pin = new JTextField("PIN");
        JButton deposit_btn = new JButton("Deposit");

        DepositGridPanel.add(deposit_amt);
        DepositGridPanel.add(deposit_pin);
        DepositGridPanel.add(deposit_btn);
        DepositGridPanel.setLayout( new GridLayout(6,1));
        panel2.add(DepositGridPanel);

        JPanel panel3 = new JPanel();
        panel3.setBounds(200, 50, 400,350);
        panel3.setBorder(BorderFactory.createLineBorder(Color.black));
        panel3.setVisible(false);

        JPanel WithdrawGridPanel = new JPanel();
        WithdrawGridPanel.setBounds(250, 100, 300, 300);
        WithdrawGridPanel.setPreferredSize(new Dimension(300,300));

        withdraw_amt = new JTextField("Enter you amount");
        withdraw_pin = new JTextField("PIN");
        JButton withdraw_btn = new JButton("Withdraw");

        WithdrawGridPanel.add(withdraw_amt);
        WithdrawGridPanel.add(withdraw_pin);
        WithdrawGridPanel.add(withdraw_btn);
        WithdrawGridPanel.setLayout( new GridLayout(6,1));
        panel3.add(WithdrawGridPanel);

        JPanel panel4 = new JPanel();
        panel4.setBounds(200, 50, 400,350);
        panel4.setBorder(BorderFactory.createLineBorder(Color.black));
        panel4.setVisible(false);

        JPanel TransactionGridPanel = new JPanel();
        TransactionGridPanel.setBounds(250, 100, 300, 300);
        TransactionGridPanel.setPreferredSize(new Dimension(300,300));
        JLabel transHeading= new JLabel("Transaction    amount      Clear Balance");
        trans1 = new JLabel("");
        trans2 = new JLabel("");
        trans3 = new JLabel("");
        trans4 = new JLabel("");
        trans5 = new JLabel("");
        trans6 = new JLabel("");
        TransactionGridPanel.add(transHeading);
        TransactionGridPanel.add(trans1);
        TransactionGridPanel.add(trans2);
        TransactionGridPanel.add(trans3);
        TransactionGridPanel.add(trans4);
        TransactionGridPanel.add(trans5);
        TransactionGridPanel.add(trans6);

        TransactionGridPanel.setLayout(new GridLayout(7,1));
        panel4.add(TransactionGridPanel);

        frame.add(head_panel);
        frame.add(side_panel);
        frame.add(btn_panel1);
        frame.add(btn_panel2);
        frame.add(btn_panel3);
        frame.add(btn_panel4);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        create_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_panel.setVisible(false);
                panel1.setVisible(true);
                head_panel.setVisible(true);
                side_panel.setVisible(true);
                btn_panel1.setVisible(true);
                btn_panel2.setVisible(true);
                btn_panel3.setVisible(true);
                btn_panel4.setVisible(true);
                btn1.setVisible(true);
                btn2.setVisible(true);
                btn3.setVisible(true);
                btn4.setVisible(true);
                createAcc();
                transactionEvent();

            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(true);
                panel2.setVisible(false);
                panel3.setVisible(false);
                panel4.setVisible(false);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                panel2.setVisible(true);
                panel3.setVisible(false);
                panel4.setVisible(false);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(true);
                panel4.setVisible(false);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(false);
                panel4.setVisible(true);
            }
        });

        deposit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositAmt();
                transactionEvent();
                deposit_amt.setText("");
                deposit_pin.setText("");
            }
        });

        withdraw_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdrawAmt();
                transactionEvent();
                withdraw_amt.setText("");
                withdraw_pin.setText("");
            }
        });

    }

    //methods
    public void createAcc(){
         Name_val.setText(name_field.getText());
         Acc_val.setText(ac_field.getText());
         amount_val.setText(amt_field.getText());
         pin_val.setText(pin_field.getText());
         transaction = "Deposit   "+ "       "+ amount_val.getText()+"              " + amount_val.getText();
         counter++;
    }
    public void withdrawAmt(){
        if(Integer.parseInt(pin_val.getText())==Integer.parseInt(withdraw_pin.getText())){
            int temp =   Integer.parseInt( amount_val.getText() ) -   Integer.parseInt( withdraw_amt.getText() );
            amount_val.setText( String.valueOf(temp));
            transaction = "Withdrawal"+ "       "+ withdraw_amt.getText()+"              " + amount_val.getText();
            counter++;
        }
    }

    public void depositAmt(){
        if(Integer.parseInt(pin_val.getText())==Integer.parseInt(deposit_pin.getText())){
            int temp =   Integer.parseInt( amount_val.getText() ) +  Integer.parseInt( deposit_amt.getText() );
            amount_val.setText( String.valueOf(temp));
            transaction = "Deposit   "+ "        "+ deposit_amt.getText()+"               " + amount_val.getText();
            counter++;
        }
    }

    public void transactionEvent(){
        if(counter==1)
            trans1.setText(transaction);
        else if(counter==2)
            trans2.setText(transaction);
        else if(counter ==3)
            trans3.setText(transaction);
        else if(counter==4)
            trans4.setText(transaction);
        else if(counter==5)
            trans5.setText(transaction);
        else if(counter==6)
            trans6.setText(transaction);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
    }
}
