package ru.mirea.task5;
import java.util.Scanner;
public class TestDish {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mug m = new Mug();
        System.out.println(m);
        System.out.println("enter a count of portions for mug ");
        m.setSize(in.nextInt());
        System.out.println(m);

        Spoon s = new Spoon();
        System.out.println(s);
        System.out.println("enter a count of portions for spoon ");
        s.setSize(in.nextInt());
        System.out.println(s);

        Plate p = new Plate();
        System.out.println(p);
        System.out.println("enter a count of portions for plate ");
        p.setSize(in.nextInt());
        System.out.println(p);
    }
}
