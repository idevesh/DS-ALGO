# Title: Jump Game II
# Submission ID: 2121746759
# Status: Wrong Answer
# Date: 27 August 2026 at 15:11:14 GMT+5:30

class Solution {
    public int jump(int[] nums) {
        int[] memory = new int[nums.length];
        Arrays.fill(memory, -1);
        return fetchJumps(nums, 0, memory);
    }

    private int fetchJumps(int[] nums, int i, int[] memory) {
        if (i == nums.length - 1) {
            return 0;
        }
        if (nums[i] == 0) {
            return 1000000;
        }
        int finalJumps = 1000000;
        int end = Math.min(nums.length, 1 + i + nums[i]);
        for (int j = i + 1; j < end; j++) {
            if(memory[j] != -1) {
                return memory[j];
            }
            finalJumps = Math.min(finalJumps, 1 + fetchJumps(nums, j, memory));
            memory[i] = finalJumps;
        }
        return finalJumps;
    }
} 