/* Zadanie 1. - MovablePoint
   Autor: Robert Brzoskowski
   Index: s21162

 */
package com.company;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp(){
        y -= ySpeed;
    }

    public void moveDown(){
        y += ySpeed;
    }
    public void moveLeft(){
        x -= xSpeed;
    }
    public void moveRight(){
        x += xSpeed;
    }
    
    public String toString(){
        return "Point: x=" + this.x + ", y=" + this.y;
    }}

