/* Zadanie 25. - Codegames - Power of thor episode 1
   Autor: Robert Brzoskowski
   Index: s21162
 */

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        in.nextLine();

        // game loop
        while (true) {
            int E = in.nextInt(); 
            in.nextLine();

            String direction = "";
            if(lightY > initialTy && initialTy < 17){
                initialTy++;
                direction+= "S";
            }
            if(lightY < initialTy && initialTy > 0){
                initialTy--;
                direction+= "N";
            }
            if(lightX > initialTx && initialTx < 39){
                initialTx++;
                direction+= "E";
            }
            if(lightX < initialTx && initialTx > 0){
                initialTx--;
                direction+= "W";
            }
            System.out.println(direction); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}
