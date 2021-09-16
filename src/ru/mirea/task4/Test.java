package ru.mirea.task4;

public class Test {
    public static void main(String[] args){
        Ball b= new Ball(55,46);
        System.out.println(b);
        b.move(120,-70);
        System.out.println(b);
        Author b1=new Author("Maria Selezneva", "masha.ru", 'F');
        System.out.println(b1);
        b1.setEmail("mashula@mail");
        System.out.println(b1);


    }
}