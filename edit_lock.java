package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class edit_lock implements ActionListener {

    JFrame frame;
    JPanel panel;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField txt1, txt3, txt4;
    JPasswordField txt2;
    JComboBox cb1, cb2, cb3;
    JSeparator separator;
    JButton b1;

    edit_lock() {
        frame = new JFrame("Edit lock");
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
            panel.setBackground(Color.WHITE);

        String Usr[] = {"Username", "Username1", "Username2"};
        cb1 = new JComboBox(Usr);

        l1 = new JLabel();
            l1.setText("  -  ");

        txt1 = new JTextField();
            txt1.setColumns(8);

        String Pas[] = {"Password", "Password1", "Password2"};
        cb2 = new JComboBox(Pas);

        l2 = new JLabel();
            l2.setText("  -  ");

        txt2 = new JPasswordField();
            txt2.setColumns(8);

        l3 = new JLabel();
            l3.setText("Password Recovery Options- ");
            l3.setFont(new Font("Caliber", Font.BOLD, 14));

        separator = new JSeparator();

        l4 = new JLabel();
            l4.setText("          Hint     ");
            l4.setFont(new Font("Caliber", Font.BOLD, 14));

        l5 = new JLabel();
            l5.setText("   -   ");

        txt3 = new JTextField();
            txt3.setColumns(8);


        l6 = new JLabel();
            l6.setText("Set Answer for ");
            l6.setFont(new Font("Caliber", Font.BOLD, 14));

        cb3 = new JComboBox(Usr);

        txt4 = new JTextField();
            txt4.setColumns(20);

        b1 = new JButton();
            b1.setText("   Save and Exit   ");
            b1.setBackground(Color.WHITE);

        panel.add(cb1);
        panel.add(l1);
        panel.add(txt1);
        panel.add(cb2);
        panel.add(l2);
        panel.add(txt2);
        panel.add(l3);
        panel.add(separator);
        panel.add(l4);
        panel.add(l5);
        panel.add(txt3);
        panel.add(l6);
        panel.add(cb3);
        panel.add(txt4);
        panel.add(b1);
        frame.add(panel);
        frame.setVisible(true);

        cb1.addActionListener(this);
        cb2.addActionListener(this);
        cb3.addActionListener(this);
        b1.addActionListener(this);
    }

    public static void main(String[] args){
        new edit_lock();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("   Save and Exit   ")){
            String a = (String) cb1.getSelectedItem();
            if(a.equals("Username")){
                Main.Username = txt1.getText();
            }
            if(a.equals("Username1")){
                Main.Username1 = txt1.getText();
            }
            if(a.equals("Username2")){
                Main.Username2 = txt1.getText();
            }

            String b = (String) cb2.getSelectedItem();
            if(b.equals("Password")){
                Main.Password = txt2.getText();
            }
            if(b.equals("Password1")){
                Main.Password1 = txt2.getText();
            }
            if(b.equals("Password2")){
                Main.Password2 = txt2.getText();
            }

            Recover_Password.Hint = txt3.getText();

            String c = (String) cb3.getSelectedItem();
            if(c.equals("Username")){
                Recover_Password.answere = txt4.getText();
            }
            if(c.equals("Username1")){
                Recover_Password.answere1 = txt4.getText();
            }
            if(c.equals("Username2")){
                Recover_Password.answere2 = txt4.getText();
            }

            frame.dispose();
            new Main();
        }
    }
}