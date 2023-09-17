package com.dynamicprogramming;

import java.util.HashMap;
import java.util.List;

public class CountPaths {
    public static int countPaths(List<List<String>> grid) {
        return countPaths(0, 0, grid, new HashMap<>());
    }

    private static int countPaths(int row, int col, List<List<String>> grid, HashMap<List<Integer>, Integer> memo) {
        if(row == grid.size() || col == grid.get(0).size()) {
            return 0;
        }
        
        if(grid.get(row).get(col) == "X") {
            return 0;
        }
        
        if(row == grid.size() - 1 && col == grid.get(0).size() - 1) {
            return 1;
        }

        List<Integer> currentPosition = List.of(row, col);
        if(memo.containsKey(currentPosition)) {
            return memo.get(currentPosition);
        }
        
        int result = countPaths(row + 1, col, grid, memo) + countPaths(row, col + 1, grid, memo);
        memo.put(currentPosition, result);

        return result;
    }
}
