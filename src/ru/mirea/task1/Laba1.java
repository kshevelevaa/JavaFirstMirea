package ru.mirea.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Laba1 {

        int getFactorial(int x) {
            int factorial = 1;
            while (x > 0) {
                factorial *= x;
                x--;
            }
            return factorial;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ////////////////////////////////////////
            int sum1 = 0, sum2 = 0, sum3 = 0;//task1

            int[] b = new int[10];
            for (int i = 0; i < 5; i++) b[i] = sc.nextInt();
            for (int i = 0; i < 5; i++) sum1 += b[i];
            int i = 0;
            while (i < 5) {
                sum2 += b[i];
                i++;
            }
            i = 0;
            do {
                sum3 += b[i];
                i++;
            } while (i < 5);
            System.out.println(sum1 + " " + sum2 + " " + sum3);
            ;
            //task2
            System.out.println(Arrays.toString(args));
            //task3
            for (int k = 1; k < 11; k++) {
                System.out.println(1.0 / k);
            }
            //task4
            int[] b4 = new int[10];
            for (i = 0; i < 10; i++) b4[i] = (int) (Math.random() * (200 - 2));
            System.out.println(Arrays.toString(b4));
            Arrays.sort(b4);
            System.out.println(Arrays.toString(b4));

            //task5
            Laba1 a = new Laba1();
            System.out.println(a.getFactorial(5));

        }
    }
