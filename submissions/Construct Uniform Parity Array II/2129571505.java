# Title: Construct Uniform Parity Array II
# Submission ID: 2129571505
# Status: Accepted
# Date: 3 September 2026 at 17:29:23 GMT+5:30

class Solution {
    public boolean uniformArray(int[] nums1) {
        // if(nums1.length == 0 || nums1.length == 1) return true;

        int oddCount = 0, evenCount = 0;
        for(int num: nums1) {
            if(num % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }

        if(evenCount == 0 || oddCount == 0) return true;
        
        int min = Arrays.stream(nums1)
                        .min()
                        .getAsInt();
                        
        if(min % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}