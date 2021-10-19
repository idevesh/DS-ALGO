// Java solution to check whether a string is anagram of the other
// https://leetcode.com/problems/valid-anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] source = new int[26];
        int[] target = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            source[s.charAt(i) - 'a']++;
            target[t.charAt(i) - 'a']++;
        }
        
        if(Arrays.equals(source, target)){
            return true;
        } else {
            return false;
        }
    }
}
