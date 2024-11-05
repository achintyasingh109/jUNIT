package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class subtractionTest {
    @Test
    public void testSubtract() {
        subtraction subtraction = new subtraction();
        assertEquals(2, subtraction.subtract(5, 3));
    }
}
