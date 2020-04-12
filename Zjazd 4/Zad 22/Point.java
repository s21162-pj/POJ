/* Zadanie 22. - MovablePoint & Point
   Autor: Robert Brzoskowski
   Index: s21162
 */

package com.company;

import java.util.Arrays;
import java.util.List;

class Point{
    private float x;
    private float y;
    public Point(float x,float y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        x = 0.0f;
        y = 0.0f;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public List getXY(){
        return Arrays.asList(x,y);
    }

    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
