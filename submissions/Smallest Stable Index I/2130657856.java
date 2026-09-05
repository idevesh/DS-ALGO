# Title: Smallest Stable Index I
# Submission ID: 2130657856
# Status: Accepted
# Date: 4 September 2026 at 17:26:50 GMT+5:30

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if (nums.length == 0) {
            return -1;
        }
        for (int splitIndex = 0; splitIndex < nums.length; splitIndex++) {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            // find maximum
            for (int i = 0; i <= splitIndex; i++) {
                max = Math.max(nums[i], max);
            }

            // min value
            for (int i = splitIndex; i < nums.length; i++) {
                min = Math.min(nums[i], min);
            }

            if (max - min <= k) {
                return splitIndex;
            }
        }

        return -1;
    }
}