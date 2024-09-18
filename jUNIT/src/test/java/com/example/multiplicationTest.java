package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class multiplicationTest {
    @Test
    public void testMultiply() {
        multiplication multiplication = new multiplication();
        assertEquals(6, multiplication.multiply(2, 3));
    }
}
