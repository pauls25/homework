package io.codelex.oop.summary;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {
        FoodItem milk = new FoodItem("Milk", BigDecimal.ONE, LocalDate.of(2023, 9, 20));
        ElectronicsItem mp3 = new ElectronicsItem("MP3 player", BigDecimal.ONE, 30.0);
        HouseholdItem powerWool = new HouseholdItem("Perwool", BigDecimal.ONE, "Blue");
        ItemPacking itemPacking = new ItemPacking();

        Order order = new Order();
        try {
            order.addItem(milk);
            order.addItem(mp3);
            order.addItem(powerWool);
            order.addItem(itemPacking);
        } catch (BadFoodException e) {
            System.out.println("Bad food item was added to order");
        }

        try {
            Invoice invoice = new Invoice(order, "INV123");
            invoice.toText();
            invoice.send();
            System.out.println("Invoice status after invoice processing: " + invoice.getInvoiceStatus());
        } catch (WrongOrderException e) {
            System.out.println("An empty order was invoiced!");
        }

        // test empty order and bad food product
        // todo varbūt pārcelt try catch uz pašām metodēm.
        System.out.println();

        try {
            testBadOrder();
        } catch (BadFoodException e) {
            System.out.println("caught BadFoodException");
        }
        System.out.println();
        try {
            testEmptyOrder();
        } catch (WrongOrderException e) {
            System.out.println("caught WrongOrderException");
        }
    }

    public static void testBadOrder() throws BadFoodException {
        // test empty order and bad food product
        System.out.println("Testing bad food item functionality.");
        FoodItem badMilk = new FoodItem("Milk", BigDecimal.ONE, LocalDate.now().minusDays(1));
        Order badOrder = new Order();
        badOrder.addItem(badMilk);

    }

    public static void testEmptyOrder() throws WrongOrderException {
        // test empty order and bad food product
        System.out.println("Testing for empty order list.");
        Order badOrder = new Order();
        Invoice emptyInvoice = new Invoice(badOrder, "INV666");
    }
}
