package com.company;
/* Zadanie 17. - Palindrome
   Autor: Robert Brzoskowski
   Index: s21162
 */
public class Palindrome {
    private String pal;

    public Palindrome(String palind) {
        this.pal = palind;
    }
    public boolean isPalindrome(){
        int i = 0;
        int x = pal.length() - 1;
        while (i < x){
            if (pal.charAt(i) != pal.charAt(x))
                return false;
            i++;
            x--;
        }
        return true;
    }
}
