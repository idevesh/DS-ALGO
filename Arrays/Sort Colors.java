// Java code to sort the array of 0,1,2 in place without library function
// https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 1) return;
        int red = 0, white = 0, blue = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                red++;
            } else if (nums[i] == 1){
                white++;
            } else if (nums[i] == 2){
                blue++;
            }
        }
        
        for(int i = 0; i < red; i++){
            nums[i] = 0;
        }
        
        for(int i = red; i < red + white; i++){
            nums[i] = 1;
        }
        
        for(int i = red+white; i < red + white + blue; i++){
            nums[i] = 2;
        }
    }
}
