# Title: Unique Paths II
# Submission ID: 2129394182
# Status: Time Limit Exceeded
# Date: 3 September 2026 at 14:03:04 GMT+5:30

import java.util.Arrays;
class Solution {
    int[][] memorization;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        memorization = new int[m][n];
        return uniquePaths(0, 0, 0, obstacleGrid, m, n, memorization);
    }

    public int uniquePaths(int posx, int posy, int paths, int[][] obstacleGrid, int m, int n, int[][] memorization) {
        if(posx > m - 1 || posy > n - 1) {
            return 0;
        }

        if(obstacleGrid[posx][posy] == 1) {
            return 0;
        }

        if(posx == m - 1 && posy == n - 1) {
            return ++paths;
        }

        if(memorization[posx][posy] == 0) {
            paths += uniquePaths(posx + 1, posy, paths, obstacleGrid, m, n, memorization) + uniquePaths(posx, posy + 1, paths, obstacleGrid, m, n, memorization);  
        } else {
            return paths + memorization[posx][posy];
        }

        return paths;
    }
}