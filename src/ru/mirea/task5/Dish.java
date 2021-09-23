package ru.mirea.task5;

public abstract class Dish {
    protected String color;
    protected int price, size;
    public Dish(){};
    public Dish(String color, int price, int size){
        this.color=color;
        this.price=price;
        this.size=size;
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
    public abstract int getSize();
    public abstract void setSize(int size);
    public String toString(){
        return color;
    };

}
