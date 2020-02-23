package com.company;
/* Kalkulator BMI
   Autor: Robert Brzoskowski
   Index: s21162
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("To jest kalkulator BMI, podaj swój wzrost w cm: ");
        Scanner input = new Scanner(System.in);
        double  wzrost = input.nextDouble();
        System.out.println("Podaj swoją wagę: ");
        double waga = input.nextDouble();

    double bmi = ((10000*waga)/(wzrost*wzrost));

    System.out.println("Twoje BMi wynosi: " +bmi);
    if (bmi>40){
        System.out.println("otyłość skrajna");
    }
    else if (bmi>35){
        System.out.println("II stopień otyłoście");
    }
    else if (bmi>30){
        System.out.println("I stopień otyłości");
    }
    else if (bmi>25){
        System.out.println("nadwaga");
    }
    else if (bmi>18){
        System.out.println("wartość prawidłowa");
    }
    else if (bmi>17){
        System.out.println("niedowaga");
    }
    else if (bmi>16){
        System.out.println("wychudzenie");
    }
    else if (bmi<16){
        System.out.println("wygłodzenie");
    }
    }
}
