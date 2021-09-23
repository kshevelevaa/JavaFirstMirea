package ru.mirea.task5;

public abstract class Furniture {
    int size,length, price;

    public Furniture(int size, int length, int price) {
        this.size = size;
        this.length = length;
        this.price=price;
    }
    public int getPrice() {
        return price;
    }

    public Furniture() {
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
    public abstract int getWeight();

    @Override
    public String toString() {
        return "Furniture{" +
                "size=" + size +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}
