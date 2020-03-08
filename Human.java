package com.company;

public class Human {
    private String name;
    private int age;
    private int weight;


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }



    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
}