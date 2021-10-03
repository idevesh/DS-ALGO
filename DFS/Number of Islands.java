// Java program to find the number of islands in a 2D array.
// https://leetcode.com/problems/number-of-islands/

class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != '0') {
                    findIsland(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }
    
    public void findIsland(char[][] grid, int row, int column){
        if(row >= grid.length || row < 0 || column < 0 || column >= grid[0].length || grid[row][column] == '0'){
            return;
        }
        grid[row][column] = '0';
        findIsland(grid, row - 1, column);
        findIsland(grid, row + 1, column);
        findIsland(grid, row, column - 1);
        findIsland(grid, row, column + 1);
    }
}
