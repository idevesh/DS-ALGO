// Java Code to find out the flood filling using the DFS.
// https://leetcode.com/problems/flood-fill/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int prevColor = image[sr][sc];
        if(prevColor != newColor)
            color(image, sr, sc, newColor, prevColor);
        return image;
    }
    
    public void color(int[][] image, int sr, int sc, int newColor, int color) {
        
        try {
            if(image[sr][sc] != color ||
               sr < 0 || 
               sr >= image.length || sc < 0 || 
               sc >= image[0].length){
                return;
            }
        } catch(Exception e){
            return;
        }
        
        image[sr][sc] = newColor;
        color(image, sr-1, sc, newColor, color);
        color(image, sr+1, sc, newColor, color);
        color(image, sr, sc-1, newColor, color);
        color(image, sr, sc+1, newColor, color);
    }
}
