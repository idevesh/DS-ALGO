# Title: Minimum Path Sum
# Submission ID: 2131907181
# Status: Accepted
# Date: 5 September 2026 at 21:43:32 GMT+5:30

class Solution {
    public int minPathSum(int[][] grid) {
        int[][] memo = new int[grid.length + 1][grid[0].length + 1];
        return findSum(grid, memo, grid.length - 1, grid[0].length - 1);
    }

    private int findSum(int[][] grid, int[][] memo, int row, int col) {
        if(row == 0 && col == 0) {
            return grid[row][col];
        }

        if(row < 0 || col < 0) {
            return Integer.MAX_VALUE;
        }


        int leftTrack = memo[row+1][col] != 0 ? memo[row+1][col] : findSum(grid, memo, row, col-1);
        int rightTrack = memo[row][col+1] != 0 ? memo[row][col+1] : findSum(grid, memo, row-1, col);
        
        if(leftTrack != Integer.MAX_VALUE) {
            memo[row+1][col] = leftTrack;
        }
        if(rightTrack != Integer.MAX_VALUE) {
            memo[row][col+1] = rightTrack;
        }

        return grid[row][col] + Math.min(rightTrack, leftTrack);
    }
}