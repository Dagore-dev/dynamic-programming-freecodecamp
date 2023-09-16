package com.dynamicprogramming;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class MinChangeTest {
    @Test
    public void somePositiveCases() {
        assertEquals(MinChange.minChange(8, List.of(1, 5, 4, 12)), 2);
        assertEquals(MinChange.minChange(23, List.of(2, 5, 7)), 4);
        assertEquals(MinChange.minChange(102, List.of(1, 5, 10, 25)), 6);
        assertEquals(MinChange.minChange(200, List.of(1, 5, 10, 25)), 8);
    }

    @Test
    public void someNegativeCases() {
        assertEquals(MinChange.minChange(271, List.of(10, 8, 265, 24)), -1);
        assertEquals(MinChange.minChange(2017, List.of(4, 2, 10)), -1);
    }

    @Test
    public void zeroShouldReturnZero() {
        assertEquals(MinChange.minChange(0, List.of(4, 2, 20)), 0);
        assertEquals(MinChange.minChange(0, List.of()), 0);
    }
}
