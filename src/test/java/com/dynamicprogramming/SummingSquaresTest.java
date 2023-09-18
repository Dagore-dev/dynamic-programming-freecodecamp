package com.dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SummingSquaresTest {
    @Test
    public void returnsOneWhenInputItselfIsAPerfectSquare() {
        assertEquals(1, SummingSquares.summingSquares(1));
        assertEquals(1, SummingSquares.summingSquares(4));
        assertEquals(1, SummingSquares.summingSquares(9));
        assertEquals(1, SummingSquares.summingSquares(16));
    }

    @Test
    public void someBasicCases() {
        assertEquals(2, SummingSquares.summingSquares(8));
        assertEquals(3, SummingSquares.summingSquares(12));
        assertEquals(4, SummingSquares.summingSquares(31));
        assertEquals(2, SummingSquares.summingSquares(50));
    }

    @Test(timeout = 1000)
    public void worksWithLargerNumbers() {
        assertEquals(2, SummingSquares.summingSquares(68));
        assertEquals(4, SummingSquares.summingSquares(87));
    }
}
