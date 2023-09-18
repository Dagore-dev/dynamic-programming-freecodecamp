package com.dynamicprogramming;

import java.util.HashMap;

public class Fib {
    public static int fib(int n) {
        return fib(n, new HashMap<Integer, Integer>());
    }

    /**
     * Write a method fib that takes in a number argument, n, and returns the n-th
     * number of the Fibonacci sequence.
     * 
     * The 0-th number of the sequence is 0.
     * 
     * The 1-st number of the sequence is 1.
     * 
     * To generate further numbers of the sequence, calculate the sum of previous
     * two numbers.
     * 
     * Solve this recursively.
     */
    public static int fib(int n, HashMap<Integer, Integer> memo) {
        if (n < 2) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);

        return result;
    }
}
