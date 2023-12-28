package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void testForZero() {
        Factorial factorial = new Factorial();
        int result=factorial.find(0);
        assertEquals(1,result);
    }

    @Test
    public void testForOne() {
        Factorial factorial = new Factorial();
        int result=factorial.find(1);
        assertEquals(1,result);
    }

    @Test
    public void testForNegative() {
        Factorial factorial = new Factorial();
        int result=factorial.find(-3);
        assertEquals(1,result);
    }

    @Test
    public void testForPositiveNumber() {
        Factorial factorial = new Factorial();//arrange
        int result=factorial.find(5);//act
        assertEquals(120,result);//assert
    }

}