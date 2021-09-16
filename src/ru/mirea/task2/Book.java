package ru.mirea.task2;

public class Book {
    private int year, numberOfPages;
    private String author;
    public Book()
    {
        year=1800;
        numberOfPages=1000;
        author="Pushkin";
    };
    public Book(int y)
    {
        year=y;
        numberOfPages=1000;
        author="Pushkin";
    };
    public Book(String a )
    {
        year=1800;
        numberOfPages=1000;
        author=a;
    };

    public int getYear()
    {
        return year;
    };
    public int getNumberOfPages()
    {
        return numberOfPages;
    };
    public String getAuthor()
    {
        return author;
    };
    public String toString(){
        return "This book was written by " + getAuthor()+" in "+ getYear() +
                " for " + getNumberOfPages() +" pages";
    }
}
