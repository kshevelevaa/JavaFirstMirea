package ru.mirea.task5;

public class Dachshund extends Dog {
    protected String name;
    protected int age, weight,temp;

    public Dachshund() {
        this.name="Pushok";
        this.age=4;
        this.weight=7;
        temp=30;
    }
    public Dachshund(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dachshund{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", temp=" + temp +
                '}';
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
    public void setUnikProperties(int temp){
        this.temp=temp;
    }
    public int getUnikProperties(){
        return temp;
    }
    public String unikProperties(int temp){
        if (temp>26 && temp<37) return "is health";
        else return"is not health";

    }
}
