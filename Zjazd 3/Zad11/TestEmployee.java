package com.company;
/* Zadanie 11. - Klasa employee
   Autor: Robert Brzoskowski
   Index: s21162
 */

public class TestEmployee {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Robert","Brzoskowski", 3000);
        System.out.println("ID: " + employee1.getID());
        System.out.println("Name: " + employee1.getFirstName() + employee1.getLastName());
        System.out.println(employee1.toString());
        System.out.println("Salary:" + employee1.getSalary());
        System.out.println("Annual Salary: " + employee1.getAnnualSalary());
        employee1.raiseSalary(10);
        System.out.println("Pay rise salary: " + employee1.getSalary());
    }
}
