# Title: Unique Paths II
# Submission ID: 2129388932
# Status: Time Limit Exceeded
# Date: 3 September 2026 at 13:56:30 GMT+5:30

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return uniquePaths(0, 0, 0, obstacleGrid, m, n);
    }

    public int uniquePaths(int posx, int posy, int paths, int[][] obstacleGrid, int m, int n) {
        if(posx > m - 1 || posy > n - 1) {
            return 0;
        }

        if(obstacleGrid[posx][posy] == 1) {
            return 0;
        }

        if(posx == m - 1 && posy == n - 1) {
            return ++paths;
        }

        paths += uniquePaths(posx + 1, posy, paths, obstacleGrid, m, n) + uniquePaths(posx, posy + 1, paths, obstacleGrid, m, n);

        return paths;
    }
}