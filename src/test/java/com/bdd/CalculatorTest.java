package com.bdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2,3));
    }

    @Test
    public void subtract() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(7,2));
    }
}