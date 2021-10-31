package ru.mirea.task13;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String [] arg){
        LinkedList<String> list=new LinkedList<String>();
        System.out.println(list);
        System.out.print("Добавить в конец");
        list.add("123");
        list.add("124");
        list.add("125");
        System.out.println(list);
        System.out.print("Добавить в середину");
        list.add(2,"000");
        System.out.println(list);
        System.out.print("Удалить по содержимому");
        list.remove("000");
        System.out.print(list);



    }

}
