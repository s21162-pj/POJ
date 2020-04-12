/* Zadanie 23. - Circle, Rectangle, Shape, Square
   Autor: Robert Brzoskowski
   Index: s21162
 */
package com.company;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }
    public void setWidth(double side) {
        this.setWidth(side);
    }
    public void setHeight(double side) {
        this.setHeight(side);
    }
    public String toString() {
        return "Square["+super.toString()+"]";
    }
}
