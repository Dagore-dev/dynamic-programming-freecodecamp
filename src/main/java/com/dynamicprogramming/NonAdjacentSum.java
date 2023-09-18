package com.dynamicprogramming;

import java.util.HashMap;
import java.util.List;

public class NonAdjacentSum {
    /**
     * Write a method, nonAdjacentSum, that takes in an list of numbers as an
     * argument. The method should return the maximum sum of non-adjacent elements
     * in the list. There is no limit on how many elements can be taken into the sum
     * as long as they are not adjacent
     */
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
