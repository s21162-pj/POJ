/* Zadanie 05_01. - My Point | (1.1),(2.2)...
   Autor: Robert Brzoskowski
   Index: s21162
 */
package com.company;
import java.util.Arrays;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return new int[]{x, y};
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public double distance(int x, int y){
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y,2));
        return distance;
    }
    public double distance(MyPoint anotherMyPoint){
        double distance = Math.sqrt(Math.pow(anotherMyPoint.x - this.x, 2) + Math.pow(anotherMyPoint.y - this.y,2));
        return distance;
    }
    public double distance(){
        double distance = Math.sqrt(Math.pow(0 - this.x, 2) + Math.pow(0 - this.y,2));
        return distance;
    }

    /* Główny program */
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }
        System.out.println(Arrays.toString(points));
    }

}
