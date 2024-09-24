package org.salestax;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceiptTest {
    @Test
    public void testReceiptOutput1() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1 book at 12.49"));
        cart.addItem(new Item("1 music CD at 14.99"));
        cart.addItem(new Item("1 chocolate bar at 0.85"));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Receipt receipt = new Receipt(cart);
        receipt.printReceipt();

        String expectedOutput =
                "\nReceipt:\r\n" +
                        "1 book: 12.49\n" +
                        "1 music CD: 16.49\n" +
                        "1 chocolate bar: 0.85\n" +
                        "Sales Taxes: 1.50\n" +
                        "Total: 29.83\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testReceiptOutput2() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1 imported box of chocolates at 10.00"));
        cart.addItem(new Item("1 imported bottle of perfume at 47.50"));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Receipt receipt = new Receipt(cart);
        receipt.printReceipt();

        String expectedOutput =
                "\nReceipt:\r\n" +
                        "1 imported box of chocolates: 10.50\n" +
                        "1 imported bottle of perfume: 54.65\n" +
                        "Sales Taxes: 7.65\n" +
                        "Total: 65.15\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testReceiptOutput3() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1 imported bottle of perfume at 27.99"));
        cart.addItem(new Item("1 bottle of perfume at 18.99"));
        cart.addItem(new Item("1 packet of headache pills at 9.75"));
        cart.addItem(new Item("1 box of imported chocolates at 11.25"));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Receipt receipt = new Receipt(cart);
        receipt.printReceipt();

        String expectedOutput =
                "\nReceipt:\r\n" +
                        "1 imported bottle of perfume: 32.19\n" +
                        "1 bottle of perfume: 20.89\n" +
                        "1 packet of headache pills: 9.75\n" +
                        "1 box of imported chocolates: 11.85\n" +
                        "Sales Taxes: 6.70\n" +
                        "Total: 74.68\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}