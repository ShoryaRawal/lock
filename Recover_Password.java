package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Recover_Password implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel l1, l2;
    JTextField txt1, txt2;
    JButton b1;

    public static String Hint = "First Pet";
    public static String answere = "dog"; //for Username
    public static String answere1 = ""; //for Username1
    public static String answere2 = ""; //for Username2

    static String s;

    public Recover_Password() {
        frame = new JFrame("Recover Password");
        frame.setSize(200, 150);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);

        l1 = new JLabel();
            l1.setText("Username");
        txt1 = new JTextField();
            txt1.setColumns(7);

        l2 = new JLabel();
            l2.setText(Hint);
        txt2 = new JTextField();
            txt2.setColumns(7);

        b1 = new JButton();
            b1.setText("Recover");
            b1.setBackground(Color.WHITE);

        panel.add(l1);
        panel.add(txt1);
        panel.add(l2);
        panel.add(txt2);
        panel.add(b1);
        frame.add(panel);
        frame.setVisible(true);

        b1.addActionListener(this);
    }

    public static void main(String[] args){
        new Recover_Password();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if(cmd.equals("Recover")){
            String a = txt1.getText();
            String b = txt2.getText();
            if(a.equals(Main.Username) && b.equals(answere)){
                s = Main.Password;
                new password1();
            }
            if(a.equals(Main.Username1) && b.equals(answere1)){
                s = Main.Password1;
                new password1();
            }
            if(a.equals(Main.Username2) && b.equals(answere2)){
                s = Main.Password2;
                new password1();
            }
        }
    }
}
