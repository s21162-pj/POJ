package com.company;
/* Zadanie 14. - Date
   Autor: Robert Brzoskowski
   Index: s21162
 */
public class TestDate{
    public static void main(String[] args) {
        Date date1 = new Date(27,3,2020);
        System.out.println("Day: " + date1.getDay());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Year: " + date1.getYear());
        System.out.println("Date: " + date1.toString());
        date1.setDay(15);
        date1.setMonth(6);
        date1.setYear(2020);
        System.out.println("New day: " + date1.getDay());
        System.out.println("New month: " + date1.getMonth());
        System.out.println("New year: " + date1.getYear());
        System.out.println("New date: " + date1.toString());
        date1.setDate(1,1,2021);
        System.out.println("New date: " + date1.toString());
    }
}
