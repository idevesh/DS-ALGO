# Title: Unique Paths
# Submission ID: 2128375635
# Status: Time Limit Exceeded
# Date: 2 September 2026 at 17:08:54 GMT+5:30

class Solution {
    public int uniquePaths(int m, int n) {
        return calculatePaths(0, 0, 0, m, n);
    }

    public int calculatePaths(int paths, int posx, int posy, int m, int n) {
        if(posx > m - 1 || posy > n - 1) {
            return paths;
        }

        if(posx == m - 1 && posy == n - 1) {
            return paths + 1;
        }

        paths += calculatePaths(paths, posx + 1, posy, m, n) + calculatePaths(paths, posx, posy + 1, m, n);
        return paths;
    }
}