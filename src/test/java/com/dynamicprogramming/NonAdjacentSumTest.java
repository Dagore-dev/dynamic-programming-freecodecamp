package com.dynamicprogramming;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class NonAdjacentSumTest {
    @Test
    public void someBasicCases() {
        assertEquals(16, NonAdjacentSum.nonAdjacentSum(List.of(2, 4, 5, 12, 7)));
        assertEquals(19, NonAdjacentSum.nonAdjacentSum(List.of(7, 5, 5, 12)));
        assertEquals(48, NonAdjacentSum.nonAdjacentSum(List.of(7, 5, 5, 12, 17, 29)));
    }

    @Test(timeout = 1000)
    public void worksForLargeLists() {
        assertEquals(1465, NonAdjacentSum.nonAdjacentSum(List.of(
                72, 62, 10, 6, 20, 19, 42, 46, 24, 78,
                30, 41, 75, 38, 23, 28, 66, 55, 12, 17,
                83, 80, 56, 68, 6, 22, 56, 96, 77, 98,
                61, 20, 0, 76, 53, 74, 8, 22, 92, 37,
                30, 41, 75, 38, 23, 28, 66, 55, 12, 17,
                72, 62, 10, 6, 20, 19, 42, 46, 24, 78,
                42)));
        assertEquals(488, NonAdjacentSum.nonAdjacentSum(List.of(
                72, 62, 10, 6, 20, 19, 42,
                46, 24, 78, 30, 41, 75, 38,
                23, 28, 66, 55, 12, 17, 9,
                12, 3, 1, 19, 30, 50, 20)));
    }
}
