package org.salestax;

import java.util.*;

public class Item {
    private final String name;
    private final String category;
    private final boolean isImported;
    private final double price;
    private final int quantity;

    public Item(String itemString){
        String[] parts = itemString.split(" at ");
        String[] nextParts = parts[0].split(" ", 2);

        this.price = Double.parseDouble(parts[1]);
        this.quantity = Integer.parseInt(nextParts[0]);
        this.name = nextParts[1];
        this.isImported = name.toLowerCase().contains("imported");
        this.category = assignCategory();
    }

    private String assignCategory() {
        final List<String> foodKeywords = List.of("fruit", "vegetable", "food", "grain", "milk", "chocolate");
        final List<String> medicineKeywords = List.of("tablet", "capsule", "pill", "medicine");
        final List<String> bookKeywords = List.of("book", "novel", "magazine", "journal", "comic");

        for (String keyword : foodKeywords) {
            if (name.toLowerCase().contains(keyword)) return "food";
        }
        for (String keyword : medicineKeywords) {
            if (name.toLowerCase().contains(keyword)) return "medicine";
        }
        for (String keyword : bookKeywords) {
            if (name.toLowerCase().contains(keyword)) return "book";
        }
        return "other";
    }

    public double calculateSalesTax() {
        double salesTax = 0;
        if (!category.equals("book") && !category.equals("food") && !category.equals("medicine")) {
            salesTax += price * 0.10;
        }
        if (isImported) {
            salesTax += price * 0.05;
        }
        return roundUp(salesTax);
    }

    private double roundUp(double value) {
        return Math.ceil(value * 20) / 20;
    }


    public double totalPrice() {
        return price + calculateSalesTax();
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
