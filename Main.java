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
    JMenu m1, m2;
    JMenuItem mi1, mi2, mi3;
    JDialog dialog, dialog1;

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
            mbar.add(m2 = new JMenu("Options"));
            m2.setBackground(Color.WHITE);
                m2.add(mi3 = new JMenuItem("Edit Lock"));
                    mi3.setBackground(Color.WHITE);
        frame.setJMenuBar(mbar);

        dialog = new JDialog();
        dialog.setSize(400, 100);
        dialog.setLocationRelativeTo(null);
        dialog.setResizable(false);
        dialog.setDefaultCloseOperation(dialog.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel();
        JLabel l = new JLabel();
            l.setText("Access granted, you can add your own application here");
        p.add(l);
        dialog.add(p);

        dialog1 = new JDialog();
        dialog1.setSize(150, 100);
        dialog1.setResizable(false);
        dialog1.setLocationRelativeTo(null);
        dialog1.setDefaultCloseOperation(dialog1.DISPOSE_ON_CLOSE);
        JPanel p1 = new JPanel();
        JLabel label1 = new JLabel();
            label1.setText("Access Denied");
        p1.add(label1);
        dialog1.add(p1);

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
        mi3.addActionListener(this);

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
                dialog.setVisible(true);
            }
            else if(a.equals(Username1) && b.equals(Password1)){
                dialog.setVisible(true);
            }
            else if(a.equals(Username2) && b.equals(Password2)){
                dialog.setVisible(true);
            }
            else {
                dialog1.setVisible(true);
            }
        }
        else if (cmd.equals("Recover Password")){
            new Recover_Password();
        }
        else if (cmd.equals("Cry")){
            new cry();
        }
        else if(cmd.equals("Edit Lock")){
            frame.dispose();
            new edit_lock();
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