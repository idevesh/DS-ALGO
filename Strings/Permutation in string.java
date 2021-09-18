// Java program to check whether string2 has a permutation of String1 as a substring
// https://leetcode.com/problems/permutation-in-string

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        
        if(n < m)
            return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0; i < m; i++){
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        
        for(int j = m; j < n; j++){
            if(Arrays.equals(freq1, freq2))
                return true;
            
            freq2[s2.charAt(j) - 'a']++;
            freq2[s2.charAt(j-m) - 'a']--;
        }
        if(Arrays.equals(freq1, freq2))
                return true;
        
        return false;
    }
}
