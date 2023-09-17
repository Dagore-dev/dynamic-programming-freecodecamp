package com.dynamicprogramming;

import java.util.HashMap;
import java.util.List;

public class MaxPathSum {
    public static int maxPathSum(List<List<Integer>> grid) {
        return maxPathSum(0, 0, grid, new HashMap<>());
    }

    private static int maxPathSum(int row, int col, List<List<Integer>> grid, HashMap<List<Integer>, Integer> memo) {
        if (row == grid.size() || col == grid.get(0).size()) {
            return 0;
        }

        List<Integer> currentPosition = List.of(row, col);
        int currentValue = grid.get(row).get(col);

        if (memo.containsKey(currentPosition)) {
            return memo.get(currentPosition);
        }

        if (row == grid.size() - 1 && col == grid.get(0).size() - 1) {
            return currentValue;
        }

        int result = Math.max(maxPathSum(row + 1, col, grid, memo),
                maxPathSum(row, col + 1, grid, memo)) + currentValue;
        memo.put(currentPosition, result);

        return result;
    }
}
