package com.company;
/* Zadanie 1. - Flagi
   Autor: Robert Brzoskowski
   Index: s21162
 */
import java.util.Scanner;
public class Zad1 {

    public static void main(String[] args) {


        System.out.println("Rozmiary flag: ");
        System.out.println("1 - mały");
        System.out.println("2 - średni");
        System.out.println("3 - duży");

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        switch (x) {
            case 1:
                 System.out.println("Polska: ");
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _");
                for (int i = 0; i < 3; i++) {
                    System.out.println("|                    |");
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("||||||||||||||||||||||");

                }
                 System.out.println("Japonia: ");
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _");
                for (int i = 0; i < 1; i++) {
                    System.out.println("|                    |");
                }
                System.out.println("|         .-.        |");
                System.out.println("|       |     |      |");
                System.out.println("|       |     |      |");
                System.out.println("|         '-'        |");
                for (int i = 0; i <1; i++) {
                    System.out.println("|                    |");
                }
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _");
                break;
            case 2:
                System.out.println("Polska: ");
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
                for (int i = 0; i < 5; i++) {
                    System.out.println("|                                           |");
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
                }

                 System.out.println("Japonia: ");
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                for (int i = 0; i < 2; i++) {
                    System.out.println("|                                          |");
                }
                System.out.println("|                   ----                   |");
                System.out.println("|                |        |                |");
                System.out.println("|                |        |                |");
                System.out.println("|                   ----                   |");
                for (int i = 0; i <2; i++) {
                    System.out.println("|                                          |");
                }
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                break;
            case 3:
                System.out.println("Polska: ");
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                for (int i = 0; i < 9; i++) {
                    System.out.println("|                                                                                      |");
                }
                for (int i = 0; i < 9; i++) {
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                }
                System.out.println("Japonia: ");
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                for (int i = 0; i < 4; i++) {
                    System.out.println("|                                                                                      |");
                }
                System.out.println("|                                       .------.                                       |");
                System.out.println("|                                     |          |                                     |");
                System.out.println("|                                    |            |                                    |");
                System.out.println("|                                     |          |                                     |");
                System.out.println("|                                       '------'                                       |");
                for (int i = 0; i <4; i++) {
                    System.out.println("|                                                                                      |");
                }
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                break;
            default:
                System.out.println("Błędny znak");
        }}}
