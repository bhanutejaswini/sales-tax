package org.salestax;

public class Receipt {
    private final ShoppingCart cart;
    private double totalTax;
    private double totalAmount;

    public Receipt(ShoppingCart cart) {
        this.cart = cart;
        calculateTotals();
    }

    private void calculateTotals() {
        totalTax = 0;
        totalAmount = 0;

        for (Item item : cart.getItems()) {
            double itemTax = TaxCalculator.calculateSalesTax(item);
            totalTax += itemTax;
            totalAmount += item.getPrice() + itemTax;
        }
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
