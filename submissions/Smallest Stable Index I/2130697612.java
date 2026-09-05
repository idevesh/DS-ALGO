# Title: Smallest Stable Index I
# Submission ID: 2130697612
# Status: Accepted
# Date: 4 September 2026 at 18:16:04 GMT+5:30

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // if (nums.length == 0) {
        //     return -1;
        // }
        // for (int splitIndex = 0; splitIndex < nums.length; splitIndex++) {
        //     int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        //     // find maximum
        //     for (int i = 0; i <= splitIndex; i++) {
        //         max = Math.max(nums[i], max);
        //     }

        //     // min value
        //     for (int i = splitIndex; i < nums.length; i++) {
        //         min = Math.min(nums[i], min);
        //     }

        //     if (max - min <= k) {
        //         return splitIndex;
        //     }
        // }

        // return -1;

        int[] suffixArr = new int[nums.length];
        buildSuffixArray(suffixArr, nums, 0);
        return firstStableIndex(suffixArr, nums, 0, k, Integer.MIN_VALUE);
    }

    public void buildSuffixArray(int[] suffixArr, int[] nums, int index) {
        if(index == nums.length - 1) {
            suffixArr[index] = nums[index];
            return;
        }

        buildSuffixArray(suffixArr, nums, index + 1);
        suffixArr[index] = Math.min(suffixArr[index + 1], nums[index]);
    }

    public int firstStableIndex(int[] suffixArr, int[] nums, int index, int k, int max) {
        if(index == nums.length) {
            return -1;
        }

        max = Math.max(max, nums[index]);

        if(max - suffixArr[index] <= k) {
            return index;
        }

        return firstStableIndex(suffixArr, nums, index + 1, k, max);
    }
}