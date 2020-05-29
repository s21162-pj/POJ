/* Zadanie 2. - ResizableCircle
   Autor: Robert Brzoskowski
   Index: s21162

 */
package com.company;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}




