package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PriceCalculatorTest {
    @Test
    public void should_get_price_of_items() {


        double expectedValue = 4.4;

        PriceCalculator calculator = new PriceCalculator();
        double actualValue = calculator.getPrice(2,2);
        assertThat(actualValue, is(expectedValue));
    }


}
