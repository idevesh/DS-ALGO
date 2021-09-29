// Java code to sort the array after merging both the arrays.
// https://leetcode.com/problems/merge-sorted-array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n != 0){
            if(m == 0){
                // Copy B to A
                for(int i = 0; i < n; i++){
                    nums1[i] = nums2[i];
                }
            } else{
                int j = 0;
                for(int i = m; i < nums1.length; i++){
                    nums1[i] = nums2[j++];
                }
                Arrays.sort(nums1);
            }
        }
    }
}
