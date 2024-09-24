package org.salestax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    @Test
    public void testSalesTaxForNonExemptItem() {
        Item musicCD = new Item("1 music CD at 14.99");
        double expectedTax = 1.50;
        assertEquals(expectedTax, TaxCalculator.calculateSalesTax(musicCD));
    }

    @Test
    public void testSalesTaxForExemptItem() {
        Item book = new Item("1 book at 12.49");
        assertEquals(0.0, TaxCalculator.calculateSalesTax(book));
    }

    @Test
    public void testImportDuty() {
        Item importedPerfume = new Item("1 imported bottle of perfume at 27.99");
        double expectedTax = 4.20;
        assertEquals(expectedTax, TaxCalculator.calculateSalesTax(importedPerfume));
    }

    @Test
    public void testImportedExemptItem() {
        Item importedChocolates = new Item("1 imported box of chocolates at 10.00");
        double expectedTax = 0.50;
        assertEquals(expectedTax, TaxCalculator.calculateSalesTax(importedChocolates));
    }
}
