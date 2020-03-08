package com.company;

public class Main{
    public static void main(String[] args){

        Human robert = new Human();
        robert.setName("Robert");
        robert.setAge(20);
        robert.setWeight(176);
        /*   robert.setHeight = "dsad";
        robert.setSex = "Male";
        robert.setIndex = 21162;
        robert.setFeetsize = 43;
*/
        System.out.println(robert.getName());
        System.out.println(robert.getAge()+" lat");
        System.out.println(robert.getWeight()+" cm");


    }

    }