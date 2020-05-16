/* Zadanie 05_02. - My Circle
   Autor: Robert Brzoskowski
   Index: s21162
 */
package com.company;
public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle() {
    }
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return this.center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public int getCenterY() {
        return center.getY();
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public int[] getCenterXY() {
        return new int[]{center.getX(), center.getY()};
    }
    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return "MyCircle[" + "radius=" + radius + "," + "center=" + center.toString() + "]";
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
/* Test main
    public static void main(String[] args) {
        MyCircle firstCircle = new MyCircle(5, 5, 55);
        System.out.println(firstCircle.toString());
        MyCircle secondCircle = new MyCircle(6, 6, 66);
        secondCircle.distance(secondCircle);
        System.out.println(secondCircle.toString());

    } */
}

