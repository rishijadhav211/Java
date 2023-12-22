package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void testForZero() {
        Factorial factorial = new Factorial();
        int result=factorial.findFactorial(0);
        assertEquals(1,result);
    }

    @Test
    public void testForOne() {
        Factorial factorial = new Factorial();
        int result=factorial.findFactorial(1);
        assertEquals(1,result);
    }

    @Test
    public void testForNegative() {
        Factorial factorial = new Factorial();
        int result=factorial.findFactorial(-3);
        assertEquals(1,result);
    }

    @Test
    public void testForPositiveNumber() {
        Factorial factorial = new Factorial();
        int result=factorial.findFactorial(5);
        assertEquals(120,result);
    }

}