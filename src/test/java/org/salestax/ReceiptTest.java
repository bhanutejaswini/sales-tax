package org.salestax;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceiptTest {

    @Test
    public void testPrintReceipt() {
        Item[] items = {
                new Item("1 book at 12.49"),
                new Item("1 music CD at 14.99"),
                new Item("1 chocolate bar at 0.85")
        };

        Receipt receipt = new Receipt(Arrays.asList(items));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        receipt.printReceipt();

        System.setOut(originalOut);

        String expectedOutput = "\nReceipt:\r\n" +
                "1 book: 12.49\n" +
                "1 music CD: 16.49\n" +
                "1 chocolate bar: 0.85\n" +
                "Sales Taxes: 1.50\n" +
                "Total: 29.83\n";

        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}