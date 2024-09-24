package org.salestax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("1 book at 12.49");
        cart.addItem(item);

        assertEquals(1, cart.getItems().size());
        assertEquals(item, cart.getItems().get(0));
    }

    @Test
    public void testMultipleItems() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1 book at 12.49"));
        cart.addItem(new Item("1 music CD at 14.99"));

        assertEquals(2, cart.getItems().size());
    }
}
