# Title: Construct Uniform Parity Array II
# Submission ID: 2129547057
# Status: Time Limit Exceeded
# Date: 3 September 2026 at 16:57:36 GMT+5:30

class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] nums2 = new int[nums1.length];
        // Try for odd
        boolean oddFlag = true, evenFlag = true;
        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] % 2 == 0) {
                boolean isConvertible = false;
                for(int j = 0; j < nums1.length; j++) {
                    if(i != j) {
                        if(nums1[i] > nums1[j]) {
                            // if we are able to convert it to odd it's fine else return false
                            if((nums1[i] - nums1[j]) % 2 != 0) {
                                isConvertible = true;
                                continue;
                            }
                        }
                    }
                }
                if(!isConvertible) {
                    oddFlag = false;
                    break;
                }
            }       
        }

        // try for even
        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] % 2 != 0) {
                boolean isConvertible = false;              
                for(int j = 0; j < nums1.length; j++) {
                    if(i != j) {
                        if(nums1[i] > nums1[j]) {
                            // if we are able to convert it to even it's fine else return false
                            if((nums1[i] - nums1[j]) % 2 == 0) {
                                isConvertible = true;
                                continue;
                            }
                        }
                    }
                }
                if(!isConvertible) {
                    evenFlag = false;
                    break;
                }
            }
        }

        System.out.println(evenFlag + " " + oddFlag);
        return evenFlag || oddFlag;
    }
}