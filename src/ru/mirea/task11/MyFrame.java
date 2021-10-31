package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JTextArea text;
    JMenuItem red;
    JMenuItem blue;
    JMenuItem green;
    JMenuItem tNR;
    JMenuItem arial;
    JMenuItem calibri;

    MyFrame(){
        setSize(200,200);
        JMenuBar menu=new JMenuBar();
        JMenu font=new JMenu("Font");
        JMenu color=new JMenu("Color");

        tNR=new JMenuItem("Times New Roman");
        arial=new JMenuItem("Arial");
        calibri=new JMenuItem("calibri");

        red=new JMenuItem("red");
        blue=new JMenuItem("blue");
        green=new JMenuItem("green");

        tNR.addActionListener(this);
        arial.addActionListener(this);
        calibri.addActionListener(this);

        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);

        font.add(tNR);
        font.add(arial);
        font.add(calibri);

        color.add(red);
        color.add(blue);
        color.add(green);

        menu.add(color);
        menu.add(font);

        this.setJMenuBar(menu);

        text= new JTextArea(10,10);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        add(text);

        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Font font = text.getFont();
        if (e.getSource()==blue) {
            text.setForeground(Color.blue);
        }
        if (e.getSource()==red) {
            text.setForeground(Color.red);
        }
        if (e.getSource()==green) {
            text.setForeground(Color.green);
        }
        if (e.getSource()==tNR) {
            font = new Font("TimesRoman", Font.PLAIN, 16);
        }
        if (e.getSource()==arial) {
            font = new Font("Arial", Font.PLAIN, 16);
        }
        if (e.getSource()==calibri) {
            font = new Font("Calibri", Font.PLAIN, 16);
        }
        text.setFont(font);
    }
    public static void main(String [] args){
        new MyFrame();
    }

}