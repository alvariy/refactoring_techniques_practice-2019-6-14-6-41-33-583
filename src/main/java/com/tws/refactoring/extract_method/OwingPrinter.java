package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    private static final String CONSTANT_HEADER = "*****************************\n****** Customer totals ******\n*****************************";

    void printOwing(String name, List<Order> orders) {
        Double outstanding = calculateAmount(orders);

        System.out.println(CONSTANT_HEADER + "\nname: " + name + "\namount: " + outstanding);
    }

    private Double calculateAmount(List<Order> orders) {

        return orders.stream().mapToDouble(Order::getAmount).sum();
    }
}
