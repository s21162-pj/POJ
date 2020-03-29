package com.company;
/* Zadanie 12. - InvoiceItem
   Autor: Robert Brzoskowski
   Index: s21162
 */

public class TestInvoiceItem{

    public static void main(String[] args) {
        InvoiceItem invoiceItem1 = new InvoiceItem("1","book",5,17.50);
        System.out.println("ID: " + invoiceItem1.getID());
        System.out.println("Desc: " + invoiceItem1.getDesc());
        System.out.println(invoiceItem1.toString());
        invoiceItem1.setQty(10);
        System.out.println("New qty: " + invoiceItem1.getQty());
        invoiceItem1.setUnitPrice(16);
        System.out.println("New unit price: " + invoiceItem1.getUnitPrice());
        System.out.println("Total price: " + invoiceItem1.getTotal());
    }
}
