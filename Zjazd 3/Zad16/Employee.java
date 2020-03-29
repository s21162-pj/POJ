package com.company;
/* Zadanie 16. - List of employees
   Autor: Robert Brzoskowski
   Index: s21162
 */
public class Employee{
    private String name;
    private int salary;
    private String joinDate;
    Employee(String name,int salary,String joinDate){
        this.name = name;
        this.salary = salary;
        this.joinDate = joinDate;
    }
    public String printData(){
        return "Name: "+name+" Salary: "+salary+" Join Date: "+joinDate;
    }
}
