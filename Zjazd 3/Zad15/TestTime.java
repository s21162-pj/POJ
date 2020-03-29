package com.company;
/* Zadanie 15. - Time
   Autor: Robert Brzoskowski
   Index: s21162
 */
public class TestTime {

    public static void main(String[] args) {
        Time time1 = new Time(11,22,33);
        System.out.println("H:" + time1.getHour());
        System.out.println("M: " + time1.getMinute());
        System.out.println("S: " + time1.getSecond());
        time1.setTime(24,59,59);
        System.out.println("New time: " + time1.toString());
        System.out.println("Next second: " + time1.nextSecond());
        System.out.println("Previous second: " + time1.previousSecond());
    }
}
