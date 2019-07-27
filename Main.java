package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    public JFrame frame;
    JPanel panel;
    JLabel l1, l2;
    JTextField txt1;
    JPasswordField txt2;
    JButton b1;
    JMenuBar mbar;
    JMenu m1;
    JMenuItem mi1, mi2;

    public static String Username = "admin";
    public static String Username1 = "admin";
    public static String Username2 = "admin";

    public static String Password = "qwerty";
    public static String Password1 = "qwerty";
    public static String Password2 = "qwerty";

    public Main(){
        frame = new JFrame("Locked");
        frame.setSize(250, 150);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);

        l1 = new JLabel();
            l1.setText("Username");
        txt1 = new JTextField();
            txt1.setColumns(9);

        l2 = new JLabel();
            l2.setText("Password");
        txt2 = new JPasswordField();
            txt2.setColumns((int) 9);

        b1 = new JButton();
            b1.setText("Check");
            b1.setBackground(Color.WHITE);

        mbar = new JMenuBar();
        mbar.setBackground(Color.WHITE);
            mbar.add(m1 = new JMenu("Forgot Password"));
            m1.setBackground(Color.WHITE);
                m1.add(mi1 = new JMenuItem("Recover Password"));
                    mi1.setBackground(Color.WHITE);
                m1.add(mi2 = new JMenuItem("Cry"));
                    mi2.setBackground(Color.WHITE);
        frame.setJMenuBar(mbar);


        panel.add(l1);
        panel.add(txt1);
        panel.add(l2);
        panel.add(txt2);
        panel.add(b1);
        frame.add(panel);
        frame.setVisible(true);

        b1.addActionListener(this);
        mi1.addActionListener(this);
        mi2.addActionListener(this);

    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("Check")){
            String a = txt1.getText();
            String b = txt2.getText();

            if(a.equals(Username) && b.equals(Password)){
               //call your class here
            }
            else if(a.equals(Username1) && b.equals(Password1)){
                //call your class here
            }
            else if(a.equals(Username2) && b.equals(Password2)){
                //call your class here
            }
        }
        else if (cmd.equals("Recover Password")){
            new Recover_Password();
        }
        else if (cmd.equals("Cry")){
            new cry();
        }
    }
}

class password1 {
    JFrame frame;
    JPanel panel;
    JLabel l1;

    password1(){
        frame = new JFrame();
        frame.setSize(100, 100);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
            panel.setBackground(Color.WHITE);

        l1 = new JLabel();
            l1.setText(Recover_Password.s);

        panel.add(l1);
        frame.add(panel);
        frame.setVisible(true);
    }
}

class cry{

    JFrame frame;
    JPanel panel;
    JLabel l1;

    cry(){
        frame = new JFrame();
        frame.setSize(150, 100);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
            panel.setBackground(Color.WHITE);

        l1 = new JLabel();
            l1.setText("You cried");

        panel.add(l1);
        frame.add(panel);
        frame.setVisible(true);
    }
}