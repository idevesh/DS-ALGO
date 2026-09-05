# Title: Smallest Stable Index II
# Submission ID: 2131774801
# Status: Accepted
# Date: 5 September 2026 at 19:24:43 GMT+5:30

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] suffixArr = new int[nums.length];
        buildSuffixArr(nums, suffixArr, 0);
        System.out.print(Arrays.toString(suffixArr));
        return firstStableIndex(nums, suffixArr, 0, k, Integer.MIN_VALUE);
    }

    private void buildSuffixArr(int[] nums, int[] suffixArr, int index) {
        if(index == nums.length - 1) {
            suffixArr[index] = nums[index];
            return;
        }

        buildSuffixArr(nums, suffixArr, index+1);
        suffixArr[index] = Math.min(suffixArr[index + 1], nums[index]);
    }

    private int firstStableIndex(int[] nums, int[] suffixArr, int index, int k, int max) {
        if(index == nums.length) {
            return -1;
        }
        max = Math.max(nums[index], max);

        if(max - suffixArr[index] <= k) {
            return index;
        }

        return firstStableIndex(nums, suffixArr, index + 1, k, max);
    }
}