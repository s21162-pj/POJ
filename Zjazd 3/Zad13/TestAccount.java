package com.company;
/* Zadanie 13. - Account
   Autor: Robert Brzoskowski
   Index: s21162
 */

public class TestAccount{
    public static void main(String[] args) {
        Account account1 = new Account("1","account 1", 100);
        Account account2 = new Account("2","account 2");
        System.out.println("Account 1 id: " + account1.getID());
        System.out.println("Account 1 name: " + account1.getName());
        System.out.println("Account 2 id: " + account2.getID());
        System.out.println("Account 2 name: " + account2.getName());
        account1.credit(1000);
        System.out.println("New account 1 balance: " + account1.getBalance());
        account1.debit(100);
        System.out.println("Account 2 balance: " + account2.getBalance());
        account1.transferTo(account2, 500);
        System.out.println("New account 1 balance: " + account1.getBalance());
        System.out.println("New account 2 balance: " + account2.getBalance());
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
