package ru.mirea.task7;

import java.math.*;
public class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.filled=false;
        this.color="red";
        radius=2;
    }
    public Circle(double radius){
        this.filled=false;
        this.color="red";
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.filled=filled;
        this.color=color;
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
