package com.qa;

import com.qa.calc.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {




    @Test //don't call the class 'Test' or this won't work
    void testAdd() {
        Assertions.assertEquals(2, Calculator.add(1,1));
    }

    @Test //don't call the class 'Test' or this won't work
    void testSub() {
        Assertions.assertEquals(2, Calculator.subtraction(4,2));
    }

    @Test //don't call the class 'Test' or this won't work
    void testDivide() {
        Assertions.assertEquals(2.5, Calculator.divide(5,2));
    }

    @Test //don't call the class 'Test' or this won't work
    void testMultiply() {
        Assertions.assertEquals(12, Calculator.multiply(2,4));
    }
}
