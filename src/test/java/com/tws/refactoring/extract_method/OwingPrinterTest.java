package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        OwingPrinter printer = new OwingPrinter();
        List<Order> orders = new ArrayList<>();
        Order order = new Order(5);
        Order order2 = new Order(5);
        orders.add(order);
        orders.add(order2);
        printer.printOwing("Iyan", orders);
        String expectingString = "*****************************\n"
                + "****** Customer totals ******\n"
                + "*****************************\n"
                + "name: Iyan\n"
                + "amount: 10.0\r\n";
        assertEquals(expectingString, outContent.toString());
    }

}