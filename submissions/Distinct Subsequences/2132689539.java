# Title: Distinct Subsequences
# Submission ID: 2132689539
# Status: Accepted
# Date: 6 September 2026 at 15:12:14 GMT+5:30

class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] memo = new int[m+1][n+1];

        if(m < n) return 0;

        for(int i = 0; i < m; i++) {
            memo[i][0] = 1;
        }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(s.charAt(i-1) == t.charAt(j-1)) {
                    memo[i][j] = memo[i-1][j-1] + memo[i-1][j];
                } else {
                    memo[i][j] = memo[i-1][j];
                }
            }
        }

        return memo[m][n];
    }
}