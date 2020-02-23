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
    if (bmi<16){
        System.out.println("To wyglodzenie");
    }
    else if (bmi<17){
        System.out.println("To niedowaga");
    }
    else{
        System.out.println("");
    }
    }
}
