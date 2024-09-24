package org.salestax;
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        InputHandler inputHandler = new InputHandler();
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();

        inputHandler.handleInput(cart);

        Receipt receipt = new Receipt(cart);
        receiptPrinter.printReceipt(receipt);
    }
}