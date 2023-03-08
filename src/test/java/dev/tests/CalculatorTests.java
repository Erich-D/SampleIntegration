package dev.tests;

import dev.app.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void basic_addition(){
        double result = Calculator.add(2,2);
        Assert.assertEquals(4,result,.000001);
    }
}
