package ru.mirea.task5;
import java.util.Scanner;
public class TestDog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dachshund m = new Dachshund();
        System.out.println(m);
        System.out.println("enter unik properties ");
        m.setUnikProperties(in.nextInt());
        System.out.println(m);
        System.out.println(m.unikProperties(m.temp));

        Husky h = new Husky();
        System.out.println(h);
        System.out.println("enter unik properties ");
        h.setUnikProperties(in.nextInt());
        System.out.println(h);
        System.out.println(h.unikProperties(h.coatLength));

        Pug p = new Pug();
        System.out.println(p);
        System.out.println("enter unik properties ");
        p.setUnikProperties(in.nextInt());
        System.out.println(p);
        System.out.println(p.unikProperties(p.walkingTime));
    }
}