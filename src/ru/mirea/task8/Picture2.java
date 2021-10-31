package ru.mirea.task8;

import javax.swing.*;


public class Picture2 {

    public static void main (String[] args) {
        Picture2 image1 = new Picture2();
        image1.go();
    }

    public void go () {
        JFrame frame = new JFrame();
        Picture panel = new Picture();

        frame.getContentPane().add(panel);

        frame.setSize(300, 303);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}