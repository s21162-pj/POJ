package com.company;
/* Zadanie 17. - Palindrome
   Autor: Robert Brzoskowski
   Index: s21162
 */

public class Main {

    public static void main(String[] args) {
        Palindrome pal1 = new Palindrome("atakkata");
        System.out.println(pal1.isPalindrome());
        Palindrome pal2 = new Palindrome("muzorazdajjadzarozum");
        System.out.println(pal2.isPalindrome());
        Palindrome pal3 = new Palindrome("wódyżaldlażydów");
        System.out.println(pal3.isPalindrome());
    }
}
