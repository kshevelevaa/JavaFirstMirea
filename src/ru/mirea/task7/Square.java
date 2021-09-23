package ru.mirea.task7;

public class Square extends Rectangle{
    public Square(){
        length =5;
    }
    public Square (double side){
        setLength(side);
    }
    public Square(double side, String color, boolean filled){
        this.length=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setLength(side);
    }
    public void setLength(double side){
        this.length=side;
    }
    public void setWidth(double side){
        this.width=side;
    }
    public String toString(){
        return "Shape: square, side: "+this.length +
                ", filled: "+this.filled +", color: "+this.color;

    }
}