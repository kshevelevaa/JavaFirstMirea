package ru.mirea.task10;
import java.util.Scanner;

public class Recursion {
    public void F12(){
        Scanner in = new Scanner (System.in);
        int x= in.nextInt();
        if ( x>0) {
            if (x % 2 == 1) {
                System.out.println(x);
                 F12();
            } else {
                 F12();
            }
        }
    };
    public void F13(){
        Scanner in = new Scanner (System.in);
        int x= in.nextInt();
        System.out.println(x);
        if(x!=0){
            int y= in.nextInt();
            if (y!=0) F13();
        }

    }
    public void F14(int n){
        System.out.println(n%10);
        if(n/10>0) F14(n/10);

    }
    public static void main(String[] args){
        Recursion r=new Recursion();
        r.F12();
        r.F13();
        r.F14(1236723);
    }
}
