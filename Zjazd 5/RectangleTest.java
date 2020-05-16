/* Zadanie 05_04. - My Rectangle Test
   Autor: Robert Brzoskowski
   Index: s21162
 */
package com.company;

public class RectangleTest {
    public static void main(String[] args) {
        MyRectangle rec = new MyRectangle(0, 10, 10, 0);
        rec.getArea();
        rec.getPerimeter();
        System.out.println(rec.toString());
        MyRectangle recTwo = new MyRectangle(3, 15, 12, 6);
        recTwo.getArea();
        recTwo.getPerimeter();
        System.out.println(recTwo.toString());
        MyRectangle recThree = new MyRectangle(1, 5, 4,2);
        recThree.getArea();
        recThree.getPerimeter();
        System.out.println(recThree.toString());

    }
}