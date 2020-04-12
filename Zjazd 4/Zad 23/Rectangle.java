/* Zadanie 23. - Circle, Rectangle, Shape, Square
   Autor: Robert Brzoskowski
   Index: s21162
 */

package com.company;
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        width=1.0;
        height=1.0;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeighth(double height) {
        this.height = height;
    }
    public double getArea() {
        return height*width;
    }
    public double getPerimeter() {
        double doubleHeight = height + height;
        double doubleWidth = width + width;
        return doubleHeight + doubleWidth;
    }
    public String toString() {
        return "Rectangle" + super.toString() + ",width=" + width + ",height=" + height+"]";
    }
}
