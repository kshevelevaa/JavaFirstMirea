package ru.mirea.task7;

public class Rectangle extends Shape{
    protected double width, length;
    public Rectangle(){
        this.width=5;
        this.length=10;
    }
    public Rectangle(double width, double length,String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double length){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
}

