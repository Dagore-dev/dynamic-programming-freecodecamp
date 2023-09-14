package com.dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibTest {
    @Test
    public void fibOfZeroShouldBeZero() {
        assertEquals(Fib.run(0), 0);
    }
    @Test
    public void fibOfOneShouldBeOne() {
        assertEquals(Fib.run(1), 1);
    }
    
    @Test
    public void fibOfTwoShouldBeTwo() {
        assertEquals(Fib.run(2), 1);
    }
    
    @Test
    public void fibOfThreeShouldBeTwo() {
        assertEquals(Fib.run(3), 2);
    }
    
    @Test
    public void fibOfFourShouldBeThree() {
        assertEquals(Fib.run(4), 3);
    }
    
    @Test
    public void fibOfFiveShouldBeFive() {
        assertEquals(Fib.run(5), 5);
    }

    @Test(timeout = 1000)
    public void solutionWorksWithBigNumbers() {
        assertEquals(Fib.run(35), 9227465);
        assertEquals(Fib.run(46), 1836311903);
    }
}
