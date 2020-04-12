/* Zadanie 20. - Person Staff Student
   Autor: Robert Brzoskowski
   Index: s21162
 */

package com.company;

public class Person {
    private String name;
    private String Address;

    public Person(String name, String address) {
        this.name = name;
        this.Address = address;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.Address;
    }
    public void setAddress(String address) {
        this.Address = address;
    }
    public String toString(){
        return "Person [name = " + this.name + ", address: " + this.Address + "]";
    }
}
