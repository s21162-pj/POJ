/* Zadanie 3. - Health
   Autor: Robert Brzoskowski
   Index: s21162

 */
package com.company;

public class Health extends Insurance {

    public Health(String insurance) {
        super(insurance);
        setCost();
    }

    @Override
    public void setCost() {
        this.PricePerMonth = 196;
    }

    @Override
    public void display() {
        System.out.println("This health insurance price is: " + this.PricePerMonth + " $ per month");
    }}




