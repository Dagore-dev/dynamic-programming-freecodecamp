package com.dynamicprogramming;

import java.util.HashMap;
import java.util.List;

public class NonAdjacentSum {
    public static int nonAdjacentSum(List<Integer> numbers) {
        return nonAdjacentSum(numbers, 0, new HashMap<>());
    }

    private static int nonAdjacentSum(List<Integer> numbers, int i, HashMap<Integer, Integer> memo) {
        if (i >= numbers.size()) {
            return 0;
        }

        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        int result = Math.max(
                numbers.get(i) + nonAdjacentSum(numbers, i + 2, memo),
                nonAdjacentSum(numbers, i + 1, memo));
        memo.put(i, result);

        return result;
    }
}
