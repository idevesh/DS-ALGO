// Java program to find maximum area of a island represented by 2D array
// https://leetcode.com/problems/max-area-of-island/

class Solution {
    
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int row = grid.length;
        int column = grid[0].length;
        int i,j;
        for(i = 0; i < row; i++){
            for(j = 0; j < column; j++){
                maxArea = Math.max(maxArea, area(i, j, grid));
            }
        }
        return maxArea;
    }
    
    public int area(int row, int column, int[][] grid) {
        
        if ((row<0) || (row>=grid.length) || (column<0) || (column >= grid[row].length) || (grid[row][column] == 0)){
            return 0;
        }
        grid[row][column] = 0;
        return (1 + area(row-1, column, grid) + area(row, column-1, grid) + 
                area(row+1, column, grid) + area(row, column+1, grid));
    }
}
