/* Zadanie 3. - Health - Insurance
   Autor: Robert Brzoskowski
   Index: s21162

 */
package com.company;

public abstract class Insurance {
    public String insurance;
    public double PricePerMonth;

    public Insurance(String insurance) {
        this.insurance = insurance;
    }

    public String getInsurance() {
        return insurance;
    }

    public double getMonthly_price() {
        return PricePerMonth;
    }

    public abstract void setCost();
    public abstract void display();
}





