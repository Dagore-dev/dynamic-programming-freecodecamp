package com.dynamicprogramming;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class CountingChangeTest {
    @Test
    public void someBasicCases() {
        assertEquals(4, CountingChange.countingChange(4, List.of(1, 2, 3)));
        assertEquals(10, CountingChange.countingChange(8, List.of(1, 2, 3)));
        assertEquals(5, CountingChange.countingChange(24, List.of(5, 7, 3)));
    }

    @Test
    public void returnsZeroForNoPossibleCombination() {
        assertEquals(0, CountingChange.countingChange(13, List.of(2, 6, 12, 10)));
    }

    @Test(timeout = 1000)
    public void shouldWorkWithForLargerCases() {
        assertEquals(20119, CountingChange.countingChange(512, List.of(1, 5, 10, 25)));
        assertEquals(142511, CountingChange.countingChange(1000, List.of(1, 5, 10, 25)));
        assertEquals(1525987916, CountingChange.countingChange(240, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }
}
