package com.dynamicprogramming;

import java.util.HashMap;
import java.util.List;

public class MinChange {
    /**
     * Write a method minChange that takes in an amount and an array of coins. The
     * method should return the minimum number of coins required to create the
     * amount. You may use each coin as many times as necessary.
     * 
     * If it is not possible to create the amount, then return -1.
     */
    public static int minChange(int amount, List<Integer> coins) {
        return minChange(amount, coins, new HashMap<>());
    }

    private static int minChange(int amount, List<Integer> coins, HashMap<Integer, Integer> memo) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        int subAmount, subCoins, numberOfCoins;
        int minCoins = -1;

        for (int coin : coins) {
            subAmount = amount - coin;

            if (memo.containsKey(subAmount)) {
                subCoins = memo.get(subAmount);
            } else {
                subCoins = minChange(subAmount, coins, memo);
            }

            if (subCoins != -1) {
                numberOfCoins = subCoins + 1;
                if (numberOfCoins < minCoins || minCoins == -1) {
                    minCoins = numberOfCoins;
                }
            }
        }

        memo.put(amount, minCoins);
        return minCoins;
    }
}
