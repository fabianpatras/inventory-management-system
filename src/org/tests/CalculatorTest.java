package org.tests;

import org.junit.jupiter.api.Test;
import org.main.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4, Calculator.add(1, 3));
    }
}