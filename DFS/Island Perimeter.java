// Java program to find perimeter of island using a 2D array.
// https://leetcode.com/problems/island-perimeter

class Solution {
    private int perimeter = 0;
    public int islandPerimeter(int[][] grid) {
        if(grid.length == 0 && grid[0].length == 0){
            return perimeter;
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    calculatePerimeter(grid, i, j);
                    return perimeter; // There is only one island
                }
            }
        }
        return perimeter;
    }
    
    public void calculatePerimeter(int[][] grid, int row, int column){
        if(row < 0 || row >= grid.length || column < 0 || column >= grid[0].length){
            perimeter++;
            return;
        }
        if(grid[row][column] == 0){
            perimeter++;
            return;
        }
        if(grid[row][column] == -2){ // Since already traversed it we will not increment the perimeter
            return;
        }
        grid[row][column] = -2; // Dump the island
        calculatePerimeter(grid, row + 1, column);
        calculatePerimeter(grid, row - 1, column);
        calculatePerimeter(grid, row, column + 1);
        calculatePerimeter(grid, row, column - 1);
        return;
    }
}
