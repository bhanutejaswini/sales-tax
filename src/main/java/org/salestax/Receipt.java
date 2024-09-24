package org.salestax;

public class Receipt {
    private final ShoppingCart cart;

    public Receipt(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printReceipt() {
        double totalTax = 0;
        double totalAmount = 0;

        System.out.println("\nReceipt:");
        for (Item item : cart.getItems()) {
            double itemTax = TaxCalculator.calculateSalesTax(item);
            double itemTotalPrice = item.getPrice() + itemTax;
            System.out.printf("%d %s: %.2f\n", item.getQuantity(), item.getName(), itemTotalPrice);
            totalTax += itemTax;
            totalAmount += itemTotalPrice;
        }

        System.out.printf("Sales Taxes: %.2f\n", totalTax);
        System.out.printf("Total: %.2f\n", totalAmount);
    }
}
