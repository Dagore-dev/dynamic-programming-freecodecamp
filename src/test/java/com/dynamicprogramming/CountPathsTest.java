package com.dynamicprogramming;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class CountPathsTest {
    @Test
    public void someSimpleCases() {
        assertEquals(2, CountPaths.countPaths(List.of(
                List.of("O", "O"),
                List.of("O", "O"))));
        assertEquals(5, CountPaths.countPaths(List.of(
                List.of("O", "O", "X"),
                List.of("O", "O", "O"),
                List.of("O", "O", "O"))));
        assertEquals(3, CountPaths.countPaths(List.of(
                List.of("O", "O", "O"),
                List.of("O", "O", "X"),
                List.of("O", "O", "O"))));
        assertEquals(1, CountPaths.countPaths(List.of(
                List.of("O", "O", "O"),
                List.of("O", "X", "X"),
                List.of("O", "O", "O"))));
        assertEquals(42, CountPaths.countPaths(List.of(
                List.of("O", "O", "X", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "X"),
                List.of("X", "O", "O", "O", "O", "O"),
                List.of("X", "X", "X", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O"))));
    }

    @Test
    public void shouldReturnZeroIfNoPossiblePath() {
        assertEquals(0, CountPaths.countPaths(List.of(
                List.of("O", "O", "X", "O", "O", "O"),
                List.of("O", "O", "X", "O", "O", "O"),
                List.of("X", "O", "X", "O", "O", "O"),
                List.of("X", "X", "X", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O"))));
        assertEquals(0, CountPaths.countPaths(List.of(
                List.of("O", "O", "X", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "X"),
                List.of("X", "O", "O", "O", "O", "O"),
                List.of("X", "X", "X", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "X"))));
    }

    @Test(timeout = 1000)
    public void shouldWorkForBigGrids() {
        assertEquals(145422675, CountPaths.countPaths(List.of(
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"))));
        assertEquals(3190434, CountPaths.countPaths(List.of(
                List.of("O", "O", "X", "X", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "X", "X", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "X", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O", "O"),
                List.of("X", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O", "O"),
                List.of("X", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "X", "X", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O", "X", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O"),
                List.of("X", "X", "X", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "X", "X", "O", "O", "O", "O", "X", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "X", "X", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O"),
                List.of("O", "O", "O", "O", "O", "O", "O", "O", "X", "O", "O", "O", "O", "O", "O"))));
    }
}
