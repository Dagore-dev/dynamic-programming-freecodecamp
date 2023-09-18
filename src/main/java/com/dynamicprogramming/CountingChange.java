package com.dynamicprogramming;

import java.util.HashMap;
import java.util.List;

public class CountingChange {
    /**
     * Write a method, countingChange, that takes in an amount and an array of
     * coins. The method should return the number of different ways it is possible
     * to make change for the given amount using the coins.
     * 
     * You may reuse a coin as many times as necessary.
     */
    public static int countingChange(int amount, List<Integer> coins) {
        return countingChange(amount, 0, coins, new HashMap<>());
    }

    private static int countingChange(int amount, int coinIdx, List<Integer> coins,
            HashMap<List<Integer>, Integer> memo) {
        if (amount == 0) {
            return 1;
        }

        if (coinIdx == coins.size()) {
            return 0;
        }

        List<Integer> key = List.of(amount, coinIdx);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int coinValue = coins.get(coinIdx);
        int possibilities = 0;
        int subAmount;

        for (int quantity = 0; (quantity * coinValue) <= amount; quantity++) {
            subAmount = amount - (quantity * coinValue);
            possibilities += countingChange(subAmount, coinIdx + 1, coins, memo);
        }

        memo.put(key, possibilities);
        return possibilities;
    }
}
