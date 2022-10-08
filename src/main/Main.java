package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField t1, t2, t3;
        JLabel l1, l2, l3;
        JButton btn;
        l1 = new JLabel("First num");
        l1.setBounds(50, 10, 100, 30);
        t1 = new JTextField();
        t1.setBounds(50, 40, 200, 30);
        l2 = new JLabel("Second num");
        l2.setBounds(50, 70, 100, 30);
        t2 = new JTextField();
        t2.setBounds(50, 100, 200, 30);
        l3 = new JLabel("Total");
        l3.setBounds(50, 130, 100, 30);
        t3 = new JTextField();
        t3.setBounds(50, 160, 200, 30);
        t3.setEditable(false);
        btn=new JButton("Total");
        btn.setBounds(50,200,200,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a+b;
                String total=String.valueOf(c);
                t3.setText(total);
            }
        });
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(t1);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(t2);
        frame.add(t3);
        frame.add(btn);
    }
}
