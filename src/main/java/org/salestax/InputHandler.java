package org.salestax;

import java.util.Scanner;
public class InputHandler {
    public void handleInput(ShoppingCart cart) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter items (type 'done' to finish):");

        while (true) {
            String itemDescription = sc.nextLine();

            if (itemDescription.equalsIgnoreCase("done")) {
                break;
            }

            cart.addItem(new Item(itemDescription));
        }

        sc.close();
    }
}
