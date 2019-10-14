package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    private static final double CONST_DISCOUNT = 0.05;
    private static final double CONST_SHIPPING_FEE = 0.1;
    private static final double CONST_MAXIMUM_SHIPPING_FEE = 100.0;

    public double getPrice(int quantity, int itemPrice) {
        return computePrice(quantity, itemPrice);
    }

    private double computePrice(int quantity, int itemPrice) {
        double totalPrice = quantity * itemPrice;
        double discount = Math.max(0, quantity - 500) * itemPrice * CONST_DISCOUNT;
        double shippingFee = Math.min(totalPrice * CONST_SHIPPING_FEE, CONST_MAXIMUM_SHIPPING_FEE);

        return totalPrice - discount + shippingFee;
    }
}
