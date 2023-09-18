package com.dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TribonacciTest {
    @Test
    public void tribonacciOfZeroShouldBeZero() {
        assertEquals(Tribonacci.tribonacci(0), 0);
    }

    @Test
    public void tribonacciOfOneShouldBeZero() {
        assertEquals(Tribonacci.tribonacci(1), 0);
    }

    @Test
    public void tribonacciOfFiveShouldBeFour() {
        assertEquals(Tribonacci.tribonacci(5), 4);
    }

    @Test
    public void tribonacciOfTwoShouldBeOne() {
        assertEquals(Tribonacci.tribonacci(2), 1);
    }

    @Test
    public void tribonacciOfSevenShouldBeThirteen() {
        assertEquals(Tribonacci.tribonacci(7), 13);
    }

    @Test(timeout = 1000)
    public void solutionWorksWithBigNumbers() {
        assertEquals(Tribonacci.tribonacci(14), 927);
        assertEquals(Tribonacci.tribonacci(20), 35890);
        assertEquals(Tribonacci.tribonacci(37), 1132436852);
    }
}
