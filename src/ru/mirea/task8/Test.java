package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    public void paint(Graphics g) {
        super.paint(g);
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        g.setColor(new Color(R,G,B));
        g.drawRect(100,100,100,100);
    }

    public Test() {
        super("Test");
        setLayout(null);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main (String[]args)
    {
        new Test();
    }

}