package ru.mirea.task5;

public class Pug {
    protected String name;
    protected int age, weight,walkingTime;

    public Pug() {
        this.name="Gorge";
        this.age=2;
        this.weight=5;
        this.walkingTime=40;
    }
    public Pug(String name, int age, int weight,int walkingTime) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.walkingTime=walkingTime;
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
                ", walkingTime=" + walkingTime +
                '}';
    }

    public int getWalkingTime() {
        return walkingTime;
    }

    public void setWalkingTime(int walkingTime) {
        this.walkingTime = walkingTime;
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
    public void setUnikProperties(int walkingTime){
        this.walkingTime=walkingTime;
    }
    public String unikProperties(int walkingTime){
        if (walkingTime<30) return "is olg dog";
        else return"is young dog";

    }
}
