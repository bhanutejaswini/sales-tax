package org.salestax;

public class ReceiptPrinter {
    public void printReceipt(Receipt receipt) {
        System.out.println("\nReceipt:");
        for (Item item : receipt.getCart().getItems()) {
            System.out.printf("%d %s: %.2f\n", item.getQuantity(), item.getName(), item.getTotalPrice());
        }

        System.out.printf("Sales Taxes: %.2f\n", receipt.getTotalTax());
        System.out.printf("Total: %.2f\n", receipt.getTotalAmount());
    }
}
