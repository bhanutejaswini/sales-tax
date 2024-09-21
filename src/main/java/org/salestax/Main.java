package org.salestax;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();

        System.out.println("Enter items (type 'done' to finish):");

        while(sc.hasNextLine()){
            String itemDescription = sc.nextLine();

            if (itemDescription.equalsIgnoreCase("done")) {
                break;
            }

            items.add(new Item(itemDescription));
        }

        Receipt receipt = new Receipt(items);
        receipt.printReceipt();

        sc.close();
    }
}