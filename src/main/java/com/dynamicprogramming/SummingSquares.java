package com.dynamicprogramming;

import java.util.HashMap;

public class SummingSquares {
    /**
     * Write a method, summingSquares, that takes a target number as an argument.
     * The method should return the minimum number of perfect squares that sum to
     * the target. A perfect square is a number of the form (i*i) where i >= 1.
     * 
     * For example: 1, 4, 9, 16 are perfect squares, but 8 is not perfect square.
     */
    public static int summingSquares(int n) {
        return summingSquares(n, new HashMap<>());
    }

    private static int summingSquares(int n, HashMap<Integer, Integer> memo) {
        if (n == 0) {
            return 0;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int square, subResult;
        int minSquare = n;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            square = i * i;
            subResult = summingSquares(n - square, memo) + 1;
            minSquare = Math.min(minSquare, subResult);
        }

        memo.put(n, minSquare);
        return minSquare;
    }
}
