package com.company;
import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        // write your code here
        Main gui = new Main();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setDefaultLookAndFeelDecorated(true);
        gui.setSize(500, 700);
        gui.setVisible(true);
        gui.setTitle("First Gui ");

        JLabel labelM = new JLabel("How it's your name?");
        labelM.setBounds(50, 50, 200, 30);

        JTextField motto1 = new JTextField();
        motto1.setBounds(50, 100, 200, 30);

        gui.add(labelM);
        gui.add(motto1);
        gui.setLayout(null);
        gui.setVisible(true);

        JButton b = new JButton("Submit");
        b.setBounds(50, 150, 100, 30);
        //add button to the frame
        gui.add(b);
    }

}
