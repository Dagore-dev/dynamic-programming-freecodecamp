package com.dynamicprogramming;

import java.util.HashMap;

public class SummingSquares {
    public static int summingSquares(int n) {
        return summingSquares(n, new HashMap<>());
    }

    private static int summingSquares(int n, HashMap<Integer, Integer> memo) {
        if(n == 0) {
            return 0;
        }

        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        
        int square, subResult;
        int minSquare = n;

        for(int i = 1; i <= Math.sqrt(n); i++) {
            square = i * i;
            subResult = summingSquares(n - square, memo) + 1;
            minSquare = Math.min(minSquare, subResult);
        }

        memo.put(n, minSquare);
        return minSquare;
    }
}
