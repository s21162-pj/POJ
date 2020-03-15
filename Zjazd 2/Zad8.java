package com.company;
/* Zadanie 8. - Cipher
   Autor: Robert Brzoskowski
   Index: s21162
 */
public class Zad8 {
    public static char[] Cipher(String input) {
        char[] charInput = input.toCharArray();
        for (int i=0; i < charInput.length; i++){
            if((int)charInput[i]>=65&&(int)charInput[i]<=87||(int)charInput[i]>=97&&(int)charInput[i]<=119)
            {
                charInput[i]+=3;
            }
            if((int)charInput[i]>=88&&(int)charInput[i]<97){
                int a = (int)charInput[i]-88;
                charInput[i] = (char)(a+65);
            }
            if((int)charInput[i]>=120&&(int)charInput[i]<123){
                int a = (int) charInput[i]-120;
                charInput[i] = (char)(a + 97);
            }
        }
        return charInput;
    }}

/*
package com.company;

public class Main {
    public static void main(String[] args) {
        String name = "Robert";
        System.out.println(Zad8.Cipher(name));
    }}

 */
