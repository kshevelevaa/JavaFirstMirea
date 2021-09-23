package ru.mirea.task6;

public class Apple implements Nameable, Priceable{
    public void getName(){
        System.out.println("Apple");
    }
    public void getPrice(){
        System.out.println("50 rub");
    }
}
