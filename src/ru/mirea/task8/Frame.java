package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;
import java.lang.Math;

public class Frame extends JFrame{
    public void paint(Graphics g) {
        super.paint(g);
        for( int i=0;i<20;i++){
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            int x=(int)(Math.random()*2);
            switch(x){
                case 0: {
                    Rectangle r = new Rectangle( i * 20, i*40, i * 100, i * 200, new Color(R,G,B));
                    g.setColor(r.getColor());
                    g.drawRect((int) r.getX(), (int) r.getY(),r.getLength(), r.getWidth());
                    break;
                }
                case 1:{
                    Circle c=new Circle(i*100,i*100,(int)(Math.random()*100+10),new Color(R,G,B));
                    g.setColor(c.getColor());
                    g.drawOval(i+20,i*40,c.getRadius(),c.getRadius());
                    break;
                }
                default: break;
            }
        }
    }
    public Frame() {
        super("Test");
        setLayout(null);
        setSize(1600,900);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Frame();
    }
}
