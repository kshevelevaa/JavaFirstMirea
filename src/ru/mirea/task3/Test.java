package ru.mirea.task3;

public class Test {
    public static void main(String[] args){
        Book b= new Book();
        System.out.println(b);
        Circle c=new Circle();
        System.out.println(c);
        Human h= new Human();
        h.getHead().setColorOfHair("blue");
        System.out.println(h.getHead());



    }
}
