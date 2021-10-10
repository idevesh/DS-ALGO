// Java code to find a number is power of two or not
// https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        double num = n;
        return checkNum(num);
    }
    
    public boolean checkNum(double n){
        if(n <= 2.0){
            if(n == 2.0){
                return true;
            }
            return false;
        }
        n = n / 2;
        return checkNum(n);
    }
}
