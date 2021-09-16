package ru.mirea.task2;

public class Test {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hi");
        System.out.println("Tester");
        System.out.println("Third"); Ball b1= new Ball();
        b1.setRadius(12);
        System.out.println(b1.toString());
        Ball b2= new Ball(15);
        System.out.println(b2);
        Ball b3= new Ball(14,2,3);
        System.out.println(b3.toString());
        Book bo1= new Book();
        System.out.println(bo1.toString());
        Book bo2= new Book(1809);
        System.out.println(bo2.toString());
        Book bo3= new Book("Tostoy");
        System.out.println(bo3.toString());
    }
}
