package org.salestax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    @Test
    public void testCalculateSalesTax_Book() {
        Item item = new Item("1 book at 12.49");
        assertEquals(0.00, item.calculateSalesTax());
    }

    @Test
    public void testCalculateSalesTax_Food() {
        Item item = new Item("1 chocolate bar at 0.85");
        assertEquals(0.00, item.calculateSalesTax());
    }

    @Test
    public void testCalculateSalesTax_Imported() {
        Item item = new Item("1 imported bottle of perfume at 47.50");
        assertEquals(7.15, item.calculateSalesTax(), 0.01);
    }

    @Test
    public void testTotalPrice_WithTax() {
        Item item = new Item("1 music CD at 14.99");
        assertEquals(16.49, item.totalPrice(), 0.01);
    }

    @Test
    public void testTotalPrice_ImportedWithTax() {
        Item item = new Item("1 imported box of chocolates at 10.00");
        assertEquals(10.50, item.totalPrice(), 0.01);
    }
}
