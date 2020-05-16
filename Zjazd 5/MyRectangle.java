/* Zadanie 05_04. - My Rectangle
   Autor: Robert Brzoskowski
   Index: s21162
 */

package com.company;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new MyPoint(x1,y1);
        this.bottomRight = new MyPoint(x2,y2);
    }
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public double getWidth() {
        return (topLeft.getY() - bottomRight.getY());
    }
    public double getLength() {
        return (bottomRight.getX() - topLeft.getX());
    }
    public double getPerimeter() {
        double perimeter = 2 * (getWidth() + getLength());
        System.out.println(perimeter);
        return perimeter;
    }
    public double getArea() {
        double area = (getLength() * getWidth());
        System.out.println(area);
        return area;
    }
    public String toString(){
        return "MyRectangle: TopLeft = (" + this.topLeft.getX() + "," + this.topLeft.getY() + ")" + ", TopRight = (" + this.bottomRight.getX() + "," + this.topLeft.getY() + ")"
                + ", BottomLeft = (" + this.topLeft.getX() + "," + this.bottomRight.getY() + ")" + ", BottomRight = (" + this.bottomRight.getX() + "," + this.bottomRight.getY() + ")";
    }}