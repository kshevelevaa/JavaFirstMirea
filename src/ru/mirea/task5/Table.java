package ru.mirea.task5;

public class Table extends Furniture{
    protected int size,length, price;

    @Override
    public String toString() {
        return "Table{" +
                "size=" + size +
                ", length=" + length +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }
    public Table(){
        this.length=1;
        this.size=2;
        this.price=3;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public  int getWeight(){
        return this.size*this.length/2;
    };
}
