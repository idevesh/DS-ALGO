// Java code to find maximum money a robber can make
// https://leetcode.com/problems/house-robber

class Solution {
    public int rob(int[] nums) {
        int map[] = new int[nums.length];
        Arrays.fill(map, -1);
        return findMaxMoney(map, 0, nums);
    }
    
    public int findMaxMoney(int[] map, int i, int[] nums){
        if(i >= nums.length) return 0;
        if(map[i] != -1){
            return map[i];
        }
        int robbing = nums[i] + findMaxMoney(map, i + 2, nums);
        int notRobbing = findMaxMoney(map, i + 1, nums);
        
        map[i] = Math.max(robbing, notRobbing);
        return map[i];
    }
}
