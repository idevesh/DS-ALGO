# Title: Jump Game II
# Submission ID: 2120750193
# Status: Time Limit Exceeded
# Date: 26 August 2026 at 17:21:55 GMT+5:30

class Solution {
    public int jump(int[] nums) {
        int[] memory = new int[nums.length];
        Arrays.fill(memory, -1);
        return fetchJumps(nums, 0);
    }

    private int fetchJumps(int[] nums, int i) {
        if (i == nums.length - 1) {
            return 0;
        }
        if (nums[i] == 0) {
            return 100000;
        }
        int finalJumps = 100000;
        int end = Math.min(nums.length - 1, i + nums[i]);
        for (int j = i + 1; j <= end; j++) {
            finalJumps = Math.min(finalJumps, 1 + fetchJumps(nums, j));
        }
        return finalJumps;
    }
} 