package com.company;
/* Zadanie 16. - List of employees
   Autor: Robert Brzoskowski
   Index: s21162
 */

import java.util.*;

public class Test{
    public static void main (String[]args)
    {
        ArrayList<Employee> employerList = new ArrayList<Employee>();
        employerList.add(new Employee("Alicja",3000,"01/01/2020"));
        employerList.add(new Employee("Stefan",3800,"14/04/2014"));
        employerList.add(new Employee("Ferdek",4000,"18/10/2014"));
        employerList.add(new Employee("Marta",5000,"15/06/1999"));
        employerList.add(new Employee("Ania",4500,"04/04/2004"));
        employerList.add(new Employee("Kazimierz",2900,"02/04/2002"));
        employerList.add(new Employee("Adolf",5200,"20/01/2012"));
        employerList.add(new Employee("Zbigniew",4100,"03/01/2015"));

        employerList.forEach((employers)->System.out.println(employers.printData()));    }
}
