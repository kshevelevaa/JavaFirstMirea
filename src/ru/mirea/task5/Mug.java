package ru.mirea.task5;

public class Mug extends Dish{
    protected int size, price,length;
    protected String color;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public Mug(){
        this.price=100;
        this.color="black";
        this.size=200;
        this.length=12;
    }
    public Mug(String color, int price, int size){
        this.price=price;
        this.size=size;
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setSize(int size){
       this.size=size*120;
    }
    public int getSize(){
        return size;
    };

    @Override
    public String toString() {
        return "Mug{" +
                "size=" + size +"ml"+
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
