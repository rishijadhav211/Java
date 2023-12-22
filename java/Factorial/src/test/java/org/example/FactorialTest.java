package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {


    @Test
    public void testFactorialOfZero() {
        Factorial factorial = new Factorial();
        long result = factorial.findFactorial(0);
        assertEquals(1, result);
    }


    @Test
    public void testFactorialOfPositiveNumber() {
        Factorial factorial = new Factorial();
        long result = factorial.findFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        Factorial factorial = new Factorial();
        long result = factorial.findFactorial(-3);
        assertEquals(1, result); // Since factorial of a negative number is not defined, the function returns 1 as a default value.
    }

    @Test
     public void testFactorialOfOne() {
        Factorial factorial = new Factorial();
        long result = factorial.findFactorial(1);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialOfLargeNumber() {
        Factorial factorial = new Factorial();
        long result = factorial.findFactorial(10);
        assertEquals(3628800, result);
    }

}