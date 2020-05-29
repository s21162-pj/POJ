/* Zadanie 1. - MovableRectangle
   Autor: Robert Brzoskowski
   Index: s21162

 */
package com.company;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp(){
        this.topLeft.y -= topLeft.ySpeed;
        this.bottomRight.y -= bottomRight.ySpeed;
    }

    public void moveDown(){
        this.topLeft.y += topLeft.ySpeed;
        this.bottomRight.y += bottomRight.ySpeed;
    }

    public void moveLeft(){
        this.topLeft.x -= topLeft.xSpeed;
        this.bottomRight.x -= bottomRight.xSpeed;
    }

    public void moveRight(){
        this.topLeft.x += topLeft.xSpeed;
        this.bottomRight.x += bottomRight.xSpeed;
    }
    public String toString(){
        return "Rectangle: TopLeft(" + this.topLeft.x + "," + this.topLeft.y + "), "
                + "TopRight(" + this.bottomRight.x + "," + this.topLeft.y + "), "
                + "BottomLeft(" + this.topLeft.x + "," + this.bottomRight.y + ")";
                + "BottomRight(" + this.bottomRight.x + "," + this.bottomRight.y + "), "
    }}