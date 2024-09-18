package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class additionTest {
    @Test
    public void testSum() {
        addition addition = new addition();
        assertEquals(5, addition.sum(2, 3));
    }
}
