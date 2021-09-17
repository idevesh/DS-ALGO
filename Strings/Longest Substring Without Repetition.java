// Java Program to find longest substring without repetition.
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1){
            return 1;
        } else if (s.length() == 0){
            return 0;
        }
        
        HashMap<Character, Integer> hashTable = new HashMap<>();
        int maxLen = 0;
        int start = 0;
        
        for(int end = 0; end < s.length(); end++) {
            if(hashTable.containsKey(s.charAt(end))) {
                start = Math.max(start, hashTable.get(s.charAt(end)) + 1);
            }
            
            hashTable.put(s.charAt(end), end);
            maxLen = Math.max(maxLen, end-start+1);
        }
        
        return maxLen;
    }
}
