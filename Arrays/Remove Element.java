// Java Code to remove a element from array and print the rest of the array ordered as same as before.
// https://leetcode.com/problems/remove-element

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = -1;
                count++;
            }
        }
        
        for(int i = 0; i < nums.length - count; i++){
            if(nums[i] == -1){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[j] != -1){
                        nums[i] = nums[j];
                        nums[j] = -1;
                        break;
                    }
                }
            }
        }
        
        return nums.length - count;
    }
}
