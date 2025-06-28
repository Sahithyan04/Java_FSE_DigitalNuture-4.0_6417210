package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    public void testMathUtilsFunctions() {
        System.out.println("✅ Starting MathUtils test...");

        int sum = mathUtils.add(2, 3);
        System.out.println("Addition Result: " + sum);
        assertEquals("Addition failed", 5, sum);

        boolean isPositive = mathUtils.isPositive(10);
        System.out.println("Is 10 Positive? " + isPositive);
        assertTrue("Number should be positive", isPositive);

        boolean isNegativePositive = mathUtils.isPositive(-5);
        System.out.println("Is -5 Positive? " + isNegativePositive);
        assertFalse("Number should not be positive", isNegativePositive);

        Integer nullValue = mathUtils.getNullValue();
        System.out.println("Null value: " + nullValue);
        assertNull("Should return null", nullValue);

        String str = mathUtils.getNonNullString();
        System.out.println("Non-null String: " + str);
        assertNotNull("Should not be null", str);

        System.out.println("✅ MathUtils test completed successfully!");
    }
}

