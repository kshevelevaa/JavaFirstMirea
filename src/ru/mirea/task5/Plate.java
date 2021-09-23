package ru.mirea.task5;

public  class Plate extends Dish {
    protected int size;
    protected int price;

    @Override
    public String toString() {
        return "Plate{" +
                "size=" + size +"gram"+
                ", price=" + price +
                ", diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    protected int diameter;
    protected String color;
    public Plate(){
        this.price=200;
        this.color="blue";
        this.size=150;
    }
    public Plate (String color, int price, int size){
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
        this.size=size*200;
    }
    public int getSize(){
        return size;
    }

}
