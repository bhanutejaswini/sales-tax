package org.salestax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceiptTest {
    @Test
    public void testCalculateTotalAndTaxesForInput1() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1 book at 12.49"));
        cart.addItem(new Item("1 music CD at 14.99"));
        cart.addItem(new Item("1 chocolate bar at 0.85"));

        Receipt receipt = new Receipt(cart);

        double delta = 0.01; // Define a delta for floating-point comparison
        assertEquals(1.50, receipt.getTotalTax(), delta);
        assertEquals(29.83, receipt.getTotalAmount(), delta);
    }

    @Test
    public void testCalculateTotalAndTaxesForInput2() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1 imported box of chocolates at 10.00"));
        cart.addItem(new Item("1 imported bottle of perfume at 47.50"));

        Receipt receipt = new Receipt(cart);

        double delta = 0.01; // Define a delta for floating-point comparison
        assertEquals(7.65, receipt.getTotalTax(), delta);
        assertEquals(65.15, receipt.getTotalAmount(), delta);
    }

    @Test
    public void testCalculateTotalAndTaxesForInput3() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1 imported bottle of perfume at 27.99"));
        cart.addItem(new Item("1 bottle of perfume at 18.99"));
        cart.addItem(new Item("1 packet of headache pills at 9.75"));
        cart.addItem(new Item("1 imported box of chocolates at 11.25"));

        Receipt receipt = new Receipt(cart);

        double delta = 0.01; // Define a delta for floating-point comparison
        assertEquals(6.70, receipt.getTotalTax(), delta);
        assertEquals(74.68, receipt.getTotalAmount(), delta);
    }
}