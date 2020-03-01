package com.company;
/* Zadanie 4. - Piramidka
   Autor: Robert Brzoskowski
   Index: s21162
 */
import java.util.Scanner;
public class Zad4 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę 'poziomów' piramidki: ");

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        char b;

        for(int i=0;i<a;i++){
            for(int j=0;j<a-1-i;j++){System.out.print(" ");}
            for(int k=0;k<=i*2;k++){
                if(k>i){
                    b=(char)(97+i*2-k);
                }else{
                    b=(char)(97+k);
                }
                System.out.print(b);
            }
            System.out.print("\n");
        }}}
