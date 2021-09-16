package ru.mirea.task4;

public class Author {
    private String name, email;
    private char gender;
    public Author(String n, String e, char g){
        this.name=n;
        this.email=e;
        this.gender=g;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String e){
        this.email=e;
    }
    public char getGender(){
        return gender;
    }
    public String toString() {
        String g;
        if (gender == 'F') {return name + " (ms) at " + email;}
        else if (gender == 'M') {return name + " (m) at " + email;}
        else if (gender == 'U') {return name + " (unknown gender) at " + email;}
        else return null;
    }
}

