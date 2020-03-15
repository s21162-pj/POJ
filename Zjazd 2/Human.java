package com.company;
/* Zadanie 5. - Human
   Autor: Robert Brzoskowski
   Index: s21162
 */
public class Human {
    private String name;
    private int age;
    private int weight;
    private int height;
    private String gender;
    private int index;
    private int feetsize;

    public String getName(){return name; }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }
    public int getHeight(){return height; }
    public String getGender(){return gender; }
    public int getIndex(){return index; }
    public int getFeetsize(){return feetsize; }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
    public void setGender(String newGender) {
        this.gender = newGender;
    }
    public void setIndex(int newIndex) {
        this.index = newIndex;
    }
    public void setFeetsize(int newFeetsize) {
        this.feetsize = newFeetsize;
    }

 }

