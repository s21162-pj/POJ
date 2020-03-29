package com.company;
/* Zadanie 11. - Klasa employee
   Autor: Robert Brzoskowski
   Index: s21162
 */

public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int ID, String firstName, String lastName, int salary) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID(){
        return ID;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent){
        salary =salary/percent + salary;
        return salary;
    }

    public String toString(){
        return "Employee[id=" + ID + ", name: " + firstName + lastName + ", salary: " + salary + "]";

    }
}
