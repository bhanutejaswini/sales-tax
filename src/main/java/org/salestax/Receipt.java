package org.salestax;

import java.util.List;

public class Receipt {
    private List<Item> items;

    public Receipt(List<Item> items) {
        this.items = items;
    }

    public void printReceipt() {
        double totalTax = 0;
        double totalAmount = 0;

        System.out.println("\nReceipt:");
        for (Item item : items) {
            double itemTax = item.calculateSalesTax();
            double itemTotalPrice = item.totalPrice();
            System.out.printf("%d %s: %.2f\n", item.getQuantity(), item.getName(), itemTotalPrice);
            totalTax += itemTax;
            totalAmount += itemTotalPrice;
        }

        System.out.printf("Sales Taxes: %.2f\n", totalTax);
        System.out.printf("Total: %.2f\n", totalAmount);
    }
}
