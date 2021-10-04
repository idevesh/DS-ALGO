// Java program to find longest common subsequence.
// https://leetcode.com/problems/longest-common-subsequence/

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] map = new int[text1.length() + 1][text2.length() + 1];
        
        for(int i = text1.length()-1; i >= 0; i--){
            for(int j = text2.length()-1; j >= 0; j--){
                if(text1.charAt(i) == text2.charAt(j)){
                    map[i][j] = map[i+1][j+1] + 1;
                } else {
                    map[i][j] = Math.max(map[i][j+1], map[i+1][j]);
                }
            }
        }
        return map[0][0];
    }
}
