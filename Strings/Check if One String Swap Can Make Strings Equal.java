// Java Code to check if two strings will be same if any two charecters are swapped.
// https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] str1 = new int[26];
        int[] str2 = new int[26];
        
        for(int i = 0; i < s1.length(); i++){
            str1[s1.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < s1.length(); i++){
            str2[s2.charAt(i) - 'a']++;
        }
        
        int nullMatch = 0;
        if(Arrays.equals(str1, str2)){
            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) == s2.charAt(i)){
                    continue;
                } else {
                    nullMatch++;
                }
            }
            if(nullMatch > 2){
                return false;
            } else {
                return true;
            }
        } else{
            return false;
        }
    }
}
