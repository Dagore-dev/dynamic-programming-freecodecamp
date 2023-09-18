package com.dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibTest {
    @Test
    public void fibOfZeroShouldBeZero() {
        assertEquals(Fib.fib(0), 0);
    }

    @Test
    public void fibOfOneShouldBeOne() {
        assertEquals(Fib.fib(1), 1);
    }

    @Test
    public void fibOfTwoShouldBeTwo() {
        assertEquals(Fib.fib(2), 1);
    }

    @Test
    public void fibOfThreeShouldBeTwo() {
        assertEquals(Fib.fib(3), 2);
    }

    @Test
    public void fibOfFourShouldBeThree() {
        assertEquals(Fib.fib(4), 3);
    }

    @Test
    public void fibOfFiveShouldBeFive() {
        assertEquals(Fib.fib(5), 5);
    }

    @Test(timeout = 1000)
    public void solutionWorksWithBigNumbers() {
        assertEquals(Fib.fib(35), 9227465);
        assertEquals(Fib.fib(46), 1836311903);
    }
}
