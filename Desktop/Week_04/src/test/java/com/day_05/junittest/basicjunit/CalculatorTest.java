package com.day_05.junit.basicjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    void testSubtraction() {
        assertEquals(6, calculator.subtract(10, 4));
        assertEquals(-3, calculator.subtract(2, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(42, calculator.multiply(6, 7));
        assertEquals(0, calculator.multiply(10, 0));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(20, 4));
        assertEquals(-2, calculator.divide(-10, 5));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
