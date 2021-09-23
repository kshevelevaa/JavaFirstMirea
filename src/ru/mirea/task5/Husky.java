package ru.mirea.task5;

public class Husky extends Dog{
    protected String name;
    protected int age, weight,coatLength;

    public Husky() {
        this.name="Vasilii";
        this.age=8;
        this.weight=12;
        coatLength=10;
    }
    public Husky(String name, int age, int weight,int coatLength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.coatLength=coatLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Husky{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", coatLength=" + coatLength +
                '}';
    }

    public int getCoatLength() {
        return coatLength;
    }

    public void setCoatLength(int coatLength) {
        this.coatLength = coatLength;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setUnikProperties(int coatLength){
        this.coatLength=coatLength;
    }
    public String unikProperties(int coatLength){
        if (coatLength<20) return "is summer dog";
        else return"is winter dog";

    }
}
