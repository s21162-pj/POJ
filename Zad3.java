package com.company;
/* Zadanie 3. - Kalkulator KCAL
   Autor: Robert Brzoskowski
   Index: s21162
 */
import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("To jest kalkulator dziennego zapotrzebowania na kalorie wg wzoru Harrisa-Benedicta. ");
        System.out.println("Podaj swój wzorst: ");
        Scanner input = new Scanner(System.in);
        double  wzrost = input.nextDouble();
        System.out.println("Podaj swoją wagę: ");
        double waga = input.nextDouble();
        System.out.println("Podaj swój wiek: ");
        double wiek = input.nextDouble();

        double kcalk = (655.1+(9.563*waga)+(1.85*wzrost)-(4.676*wiek));
        double kcalm = (66.5+(13.75*waga)+(5.003*wzrost)-(6.775*wiek));
        System.out.println("Twoje zapotrzebowanie na kalorie jeśli jesteś kobietą wynosi: " +kcalk +" Kalorii/dzień");
        System.out.println("Twoje zapotrzebowanie na kalorie jeśli jesteś mężczyzną wynosi: " +kcalm +" Kalorii/dzień");


    }
}
