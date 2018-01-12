package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
            assertEquals( 7, calculator.add(5, 2));
            assertEquals( 0, calculator.add(1,-1));
        }


    @Test
    public void sub() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals( 3, calculator.sub(5, 2));
        assertEquals( 5, calculator.sub(4,-1));
    }


    @Test
    public void multiple() throws Exception {Calculator calculator = new Calculator();
        assertEquals( 10, calculator.multiple(5, 2));
        assertEquals( -1, calculator.multiple(1,-1));

    }

    @Test
    public void division() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals( 3, calculator.division(6, 2));
        assertEquals( -1, calculator.division(1,-1));
    }

}