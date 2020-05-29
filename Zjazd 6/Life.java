/* Zadanie 3. - Life
   Autor: Robert Brzoskowski
   Index: s21162

 */
package com.company;

public class Life extends Insurance{

    public Life(String insurance) {
        super(insurance);
        setCost();
    }

    @Override
    public void setCost() {
        this.PricePerMonth = 36;
    }

    @Override
    public void display() {
        System.out.println("This life insurance price is: " + this.PricePerMonth + " $ per month ");
    }}




