// Java code to find out the next greater element 
// https://leetcode.com/problems/next-greater-element-i

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];
        Arrays.fill(output, -1);
        int index = 0;
        
        for(int i = 0; i < nums1.length; i++){
            int flag = 0;
            for(int j = 0; j < nums2.length; j++){
                if(flag == 0){
                    if(nums1[i] == nums2[j]){
                        flag = 1;
                    }
                } else {
                    if(nums2[j] > nums1[i]){
                        output[index] = nums2[j];
                        break;
                    }
                }
            }
            index++;
        }
        return output;
    }
}
