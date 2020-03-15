package com.company;
/* Zadanie 5. - Human
   Autor: Robert Brzoskowski
   Index: s21162
 */
public class Zad5{
    public static void main(String[] args){

        Human robert = new Human();
        robert.setName("Robert");
        robert.setAge(20);
        robert.setWeight(73);
        robert.setHeight(176);
        robert.setGender("Male");
        robert.setIndex(21162);
        robert.setFeetsize(43);

        System.out.println("Name: "+robert.getName());
        System.out.println("Age: "+robert.getAge()+" Years old");
        System.out.println("Weight: "+robert.getWeight()+"kg");
        System.out.println("Height: "+robert.getHeight()+"cm");
        System.out.println("Gender: "+robert.getGender());
        System.out.println("Index number: "+robert.getIndex());
        System.out.println("Feet size: "+robert.getFeetsize());

    }}
