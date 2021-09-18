// Java Code to find if a person can jump to max length of the array or not.
// https://leetcode.com/problems/jump-game/

class Solution {
    public boolean canJump(int[] nums) {
        int target = nums.length-1;
        if(target == 0) return true;
        
        int i,reachable = 0;
        Boolean flag = false;
        for(i = 0; i <= reachable; i++){
            try{
                reachable = Math.max(reachable, i + nums[i]);
            } catch(Exception e){
                flag = true;
            }
            if(reachable >= target){
                flag = true;
            }
        }
        return flag;
    }
}
