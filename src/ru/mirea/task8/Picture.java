package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class Picture extends JPanel {
    public void paintComponent (Graphics g) {
        Image image = new ImageIcon("C:\\Users\\kshev\\Desktop\\picture.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }
}
