// Java program to find duplicates in an array in O(n) time and O(1) space.
// https://leetcode.com/problems/find-all-duplicates-in-an-array

class Solution {
    public List<Integer> findDuplicates(int[] a) {
        List<Integer> output = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++){
            int curr = Math.abs(a[i]) - 1;
            if(a[curr] < 0){
                output.add(curr+1);
            }
            a[curr] = - a[curr];
        }
        return output;
    }
}
