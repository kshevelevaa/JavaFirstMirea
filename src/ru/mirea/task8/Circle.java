package ru.mirea.task8;
import java.awt.*;

public class Circle extends Shape{
    protected int radius;
    Circle(){
        this.radius=5;
        this.point=new Point(0,0);

    }
    Circle(int x, int y, int radius, Color color){
        this.radius=radius;
        this.point= new Point(x,y);
        this.color=color;
    }
    public  Color getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
