// Java program to find if a squares of digits of a number stuck in a loop or becomes 1
// https://leetcode.com/problems/happy-number

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hash = new HashSet<Integer>();
        while(!hash.contains(n) && n != 1){
            hash.add(n);
            n = findSquares(n);
        }
        
        return n == 1 ? true : false;
    }
    
    public int findSquares(int n){
        int nextNum = 0;
        while(n > 0){
            int a = n % 10;
            nextNum = a*a + nextNum;
            n /= 10;
        }
        return nextNum;
    }
}
