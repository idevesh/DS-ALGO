# Title: Unique Paths
# Submission ID: 2128424576
# Status: Accepted
# Date: 2 September 2026 at 18:09:31 GMT+5:30

import java.util.Arrays;

class Solution {
    int[][] memo;
    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return calculatePaths(0, 0, 0, m, n);
    }

    public int calculatePaths(int paths, int posx, int posy, int m, int n) {
        if(posx > m - 1 || posy > n - 1) {
            return paths;
        }

        if(posx == m - 1 && posy == n - 1) {
            return paths + 1;
        }

        if(memo[posx][posy] == -1) {
            paths += calculatePaths(paths, posx + 1, posy, m, n) + calculatePaths(paths, posx, posy + 1, m, n);
            memo[posx][posy] = paths;
        } else {
            paths += memo[posx][posy];
        }

        return paths;
    }
}