package com.dynamicprogramming;

import java.util.HashMap;
import java.util.List;

public class SumPossible {
    /**
     * Write a method sumPossible that takes in an amount and a list of positive
     * numbers. The method should return a boolean indicating whether or not it is
     * possible to create the amount by summing numbers of the list. You may reuse
     * numbers of the list as many times as necessary.
     * 
     * You may assume that the target amount is non-negative.
     */
    public static boolean sumPossible(int amount, List<Integer> numbers) {
        return sumPossible(amount, numbers, new HashMap<>());
    }

    private static boolean sumPossible(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
        if (amount == 0) {
            return true;
        }

        if (amount < 0) {
            return false;
        }

        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        int subAmount;

        for (int n : numbers) {
            subAmount = amount - n;

            if (sumPossible(subAmount, numbers, memo)) {
                memo.put(amount, true);
                return true;
            }
        }

        memo.put(amount, false);
        return false;
    }
}
