/* Zadanie 05_09. - Codegames - Temperatures
   Autor: Robert Brzoskowski
   Index: s21162
Write a program that prints the temperature closest to 0 among input data. If two numbers are equally close to zero, positive integer has to be considered closest to zero (for instance, if the temperatures are -5 and 5, then display 5).

 */

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the number of temperatures to analyse
        String TEMPS = in.nextLine(); // the N temperatures expressed as integers ranging from -273 to 5526
        
        if( N > 0 ) {
            String list[] = in.nextLine().split(" ");
       
            int res = 10000;
            int temp = 0;
            for ( int i=0; i<list.length; i++ ) {
                temp = Integer.parseInt(list[i]);
                
                if ( Math.abs(temp) < Math.abs(res)) {
                    res = temp;
                }else if ( Math.abs(temp) == Math.abs(res) && temp != res){
                     res = Math.abs(temp);
                }
            }
            System.out.println(res);
        } else {
            System.out.println(0);
        }        
    }
}
