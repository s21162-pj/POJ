/* Zadanie 3. - UseInsurance
   Autor: Robert Brzoskowski
   Index: s21162

 */
package com.company;
import java.util.*;

public class UseInsurance {
    public static void main(String[] args){
        System.out.println("Choose insurance \n 1. Health insurance \n 2. Life insurance");
        Insurance chooseInsurace;
        String userchoice;
        Scanner userInput = new Scanner(System.in);
        userchoice = userInput.next();

        if (userchoice.equals("1")) {
            chooseInsurace = new Health("Health insurance");
            chooseInsurace.display();
        } else if (userchoice.equals("2")) {
            chooseInsurace = new Life("Life insurance");
            chooseInsurace.display();
        }
        else {
            System.out.println("Something goes wrong, try again");
        }
    }
}





