package com.company;
/* Zadanie 7. - Triangle
   Autor: Robert Brzoskowski
   Index: s21162
 */
public class triangle {
    public double base;
    public double height;
    public double sideleft;
    public double sideright;
    
    public triangle(double base, double sideleft, double sideright, double height) {
        this.base = base;
        this.height = height;
        this.sideleft = sideleft;
        this.sideright = sideright;
    }
    
    public void resultofarea(double area){
        area=(base*height)/2;
    }
    
    public void resultofperimeter(double perimeter){
        perimeter=base+sideleft+sideright;
    }

    public void isEquilateral(){
        if(base==sideleft){
            if(base==sideright){
                System.out.print("This triangle is equilateral");
            }
            else{
                System.out.print("This triangle is not equilateral");
            }
        }
        else{
            System.out.print("This triangle is not equilateral");
        }}

    public void isIsosceles(){
        if (sideleft==sideright){
            System.out.print("This triangle is isosceles");
        }
        else{
            System.out.print("This triangle is not isosceles");
        }}

    public void isScalene(){
        if(base==sideleft){
            System.out.print("This triangle is not scalene");
        }
        else if (base==sideright){
            System.out.print("This triangle is not scalene");
        }
        else if (sideleft==sideright){
            System.out.print("This triangle is not scalene");
        }
        else{
            System.out.print("This triangle is scalene");
        }}}
