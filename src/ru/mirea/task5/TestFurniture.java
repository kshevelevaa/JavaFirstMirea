package ru.mirea.task5;

public class TestFurniture {
    public static void main(String[] args) {

        Table t = new Table();
        System.out.println(t);
        System.out.println(t.getWeight());

        Chair c = new Chair();
        System.out.println(c);
        System.out.println(c.getWeight());
    }
}