package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class divisionTest {
    @Test
    public void testDivide() {
        division division = new division();
        assertEquals(2, division.divide(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        division division = new division();
        division.divide(6, 0);
    }
}
