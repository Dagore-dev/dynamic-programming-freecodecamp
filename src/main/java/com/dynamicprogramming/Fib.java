package com.dynamicprogramming;

import java.util.HashMap;

public class Fib {
    public static int run(int n) {
        return fib(n, new HashMap<Integer, Integer>());
    }

    public static int fib(int n, HashMap<Integer, Integer> memo) {
        if(n < 2) {
            return n;
        }

        if(memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);

        return result;
    }
}
