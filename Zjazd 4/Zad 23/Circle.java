/* Zadanie 23. - Circle, Rectangle, Shape, Square
   Autor: Robert Brzoskowski
   Index: s21162
 */

package com.company;
public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle() {
        radius = 1.0;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area = Math.PI * (radius * radius);
        return area;
    }
    public double getPerimeter() {
        return Math.PI * Math.PI * radius;
    }
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
