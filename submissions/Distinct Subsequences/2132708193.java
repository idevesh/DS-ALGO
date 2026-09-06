# Title: Distinct Subsequences
# Submission ID: 2132708193
# Status: 
# Date: 6 September 2026 at 15:34:57 GMT+5:30

class Solution {
    public int numDistinct(String s, String t) {
        int memo[][] = new int[s.length()+1][t.length()+1];
        return paths(s,t, s.length(), t.length(), memo);
    }

    private int paths(String s, String t, int m, int n, int[][] memo) {
        if(n == 0) {
            return memo[m][n] = 1;
        }

        if(m == 0) {
            return memo[m][n] = 0;
        }

        if(s.charAt(m-1) == t.charAt(n-1)) {
            return memo[m][n] = paths(s,t,m-1,n-1, memo) + paths(s,t,m-1,n, memo);
        } else {
            return memo[m][n] = paths(s,t,m-1,n, memo);
        }
    }
}