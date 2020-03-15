package com.company;
/* Zadanie 6. - Rectangle
   Autor: Robert Brzoskowski
   Index: s21162
 */
public class Zad6{
    public float width;
    public float height;

    public rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }
    public float getHeight() {
        return height;
    }


    public void resultofarea(float area){
        area = width*height;
    }
    public void resultofcircuit(float circuit){
        circuit=2*width+2*height;
    }
    public void resultofdiagonal(float diagonal){
        diagonal = ((width * width) + (height * height));
    }
}
