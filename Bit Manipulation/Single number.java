// Java code to find single non repeating number in a array
// https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int number = 0;
        for(int i = 0; i < nums.length; i++){
            number ^= nums[i];
        }
        return number;
    }
}
