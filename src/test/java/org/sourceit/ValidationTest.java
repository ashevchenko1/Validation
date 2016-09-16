package org.sourceit;

import org.junit.Assert;
import org.junit.Test;

public class ValidationTest {

    @Test
    public void testCountDigits() {
        long result = Validation.countDigits(123456);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testSumOfNumber2() {
        long result = Validation.countDigits(-123456);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSumOfNumber3() {
        long result = Validation.countDigits(1234);
        Assert.assertEquals("Test positive number", 10, result);
        result = Validation.sumOfNumber(0);
        Assert.assertEquals("Test Zero", 0, result);
        result = Validation.sumOfNumber(-123);
        Assert.assertEquals("Test Negative Number", -5, result );
    }

}
