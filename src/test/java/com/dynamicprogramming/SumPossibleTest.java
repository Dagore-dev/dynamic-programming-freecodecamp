package com.dynamicprogramming;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class SumPossibleTest {
    @Test
    public void trueWhenAmountCanBeObtained() {
        assertTrue(SumPossible.sumPossible(8, List.of(5, 12, 4)));
        assertTrue(SumPossible.sumPossible(13, List.of(6, 2, 1)));
        assertTrue(SumPossible.sumPossible(103, List.of(6, 20, 1)));
        assertTrue(SumPossible.sumPossible(12, List.of(12)));
        assertTrue(SumPossible.sumPossible(13, List.of(3, 5)));
        assertTrue(SumPossible.sumPossible(10, List.of(4, 5, 7)));
    }

    @Test
    public void trueWhenAmountIsZeroAndListEmpty() {
        assertTrue(SumPossible.sumPossible(0, List.of()));
    }

    @Test
    public void falseWhenAmountCannotBeObtained() {
        assertFalse(SumPossible.sumPossible(15, List.of(6, 2, 10, 19)));
        assertFalse(SumPossible.sumPossible(12, List.of()));
    }

    @Test(timeout = 1000)
    public void shouldWorksWithLargeFalseCases() {
        assertFalse(SumPossible.sumPossible(271, List.of(10, 8, 265, 24)));
        assertFalse(SumPossible.sumPossible(2017, List.of(4, 2, 10)));
    }
}
