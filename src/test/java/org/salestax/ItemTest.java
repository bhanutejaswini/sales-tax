package org.salestax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemTest {
    @Test
    public void testBookCategory() {
        Item book = new Item("1 book at 12.49");
        assertEquals("book", book.getCategory());
    }

    @Test
    public void testFoodCategory() {
        Item chocolate = new Item("1 chocolate bar at 0.85");
        assertEquals("food", chocolate.getCategory());
    }

    @Test
    public void testImportedItem() {
        Item importedPerfume = new Item("1 imported bottle of perfume at 27.99");
        assertTrue(importedPerfume.getIsImported());
    }
}
