package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("🔧 Setup complete.");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("🧹 Teardown complete.\n");
    }

    @Test
    public void testAddition() {
        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);

        System.out.println("Addition Result: " + result);
        assertEquals("Addition failed", 15, result);
    }

    @Test
    public void testMultiplication() {

        int x = 4;
        int y = 3;

        int product = calculator.multiply(x, y);

        System.out.println("Multiplication Result: " + product);
        assertEquals("Multiplication failed", 12, product);
    }

    @Test
    public void testIsEven() {

        int num = 6;

        boolean result = calculator.isEven(num);

        System.out.println("Is " + num + " even? " + result);
        assertTrue("Should be even", result);
    }
}

