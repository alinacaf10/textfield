package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextArea t1;
        JLabel l1, l2;
        JButton btn;
        l1 = new JLabel("");
        l1.setBounds(20, 40, 100, 30);
        t1 = new JTextArea();
        t1.setBounds(20, 100, 200, 60);
        l2 = new JLabel("");
        l2.setBounds(100, 40, 100, 30);
        btn=new JButton("Submit");
        btn.setBounds(20,200,200,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=t1.getText();
                String words[]=text.split("\\s");

                l1.setText("Soz sayi: "+words.length);
                l2.setText("Herf sayi: "+(text.length()-words.length+1));

            }
        });
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(t1);
        frame.add(l1);
        frame.add(l2);

        frame.add(btn);
    }
}
