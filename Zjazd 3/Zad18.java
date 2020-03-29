/*
Summary:search for the largest mountain (codingame)
Author: Robert Brzoskowski
Index: s21162

https://www.codingame.com/ide/puzzle/the-descent
*/
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        // game loop
        while (true) {
            int target = 0;
            int targetH = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if(mountainH>targetH){
                    target=i;
                    targetH=mountainH;
                    }
            }
            

            System.out.println(target); // The index of the mountain to fire on.
        }
    }
}
