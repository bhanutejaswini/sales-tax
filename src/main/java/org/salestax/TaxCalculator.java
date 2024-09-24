package org.salestax;

public class TaxCalculator {
    private static final double SALES_TAX_RATE = 0.10;
    private static final double IMPORT_DUTY_RATE = 0.05;

    public static double calculateSalesTax(Item item) {
        double tax = 0;

        if (!isExempt(item.getCategory())) {
            tax += item.getPrice() * SALES_TAX_RATE;
        }
        if (item.getIsImported()) {
            tax += item.getPrice() * IMPORT_DUTY_RATE;
        }

        return roundUp(tax);
    }

    private static boolean isExempt(String category) {
        return category.equals("book") || category.equals("food") || category.equals("medicine");
    }

    private static double roundUp(double value) {
        return Math.ceil(value * 20) / 20;
    }
}
