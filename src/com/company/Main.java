package com.company;
import javax.swing.JFrame;
public class Main extends JFrame {

    public static void main(String[] args) {
        // write your code here
        Main gui = new Main();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(500, 700);
        gui.setVisible(true);
        gui.setTitle("First Gui ");
    }

}
