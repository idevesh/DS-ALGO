// Java Code to solve matrix problem to get distance of zero from 1.
// https://leetcode.com/problems/01-matrix/

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat.length == 0) return mat;
        int[][] distance = new int[mat.length][mat[0].length];
        int i,j;
        for(i = 0; i < mat.length; i++){
            for(j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    distance[i][j] = 0;
                } else {
                    if(i > 0){
                        distance[i][j] = Math.min(distance[i][j], distance[i-1][j] + 1);
                    }
                    if(j > 0){
                        distance[i][j] = Math.min(distance[i][j], distance[i][j-1] + 1);
                    }
                }
            }
        }
        
        for(i = mat.length-1; i >= 0; i--){
            for(j = mat[0].length-1; j >= 0; j--){
                if(i < mat.length-1){
                    distance[i][j] = Math.min(distance[i][j], distance[i+1][j] + 1);
                }
                if(j < mat[0].length-1){
                    distance[i][j] = Math.min(distance[i][j], distance[i][j+1] + 1);
                }
            }
        }
        return distance;
    }
}
