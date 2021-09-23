package ru.mirea.task5;

public class Spoon extends Dish{
    protected int size;
    protected int price;

    @Override
    public String toString() {
        return "Spoon{" +
                "size=" + size + "gram"+
                ", price=" + price +
                ", length=" + length +
                ", color='" + color + '\'' +
                '}';
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    protected int length;
    protected String color;
    public Spoon(){
        this.price=50;
        this.color="white";
        this.size=50;
        this.length=12;
    }
    public Spoon (String color, int price, int size){
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
        this.size=size*10;
    }
    public int getSize(){
        return size;
    }

}
