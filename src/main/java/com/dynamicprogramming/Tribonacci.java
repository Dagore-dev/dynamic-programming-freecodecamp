package com.dynamicprogramming;

import java.util.HashMap;

public class Tribonacci {
    /**
     * Write a method tribonacci that takes in a number argument, n, and returns the
     * n-th number of the Tribonacci sequence.
     * 
     * The 0-th and 1-st numbers of the sequence are both 0.
     * 
     * The 2-nd number of the sequence is 1.
     * 
     * To generate further numbers of the sequence, calculate the sum of previous
     * three numbers.
     * 
     * Solve this recursively.
     */
    public static int tribonacci(int n) {
        return tribonacci(n, new HashMap<Integer, Integer>());
    }

    public static int tribonacci(int n, HashMap<Integer, Integer> memo) {
        if (n < 2) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = tribonacci(n - 1, memo) + tribonacci(n - 2, memo) + tribonacci(n - 3, memo);
        memo.put(n, result);

        return result;
    }
}
