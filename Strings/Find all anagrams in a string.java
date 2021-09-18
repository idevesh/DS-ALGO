// Java code to find all the anagrams of a string and return the starting indexes of anagrams
// https://leetcode.com/problems/find-all-anagrams-in-a-string

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        List list = new ArrayList();
        if(n < m)
            return list;
        int i;
        int[] freqInMain = new int[26];
        int[] freqToCheck = new int[26];
        
        for(i = 0; i < m; i++) {
            freqInMain[s.charAt(i) - 'a']++;
            freqToCheck[p.charAt(i) - 'a']++;
        }
        
        for(i = m; i < n; i++){
            if(Arrays.equals(freqInMain, freqToCheck)){
                list.add(i-m);
            } 
            freqInMain[s.charAt(i) - 'a']++;
            freqInMain[s.charAt(i-m) - 'a']--;
        }
        if(Arrays.equals(freqInMain, freqToCheck)){
                list.add(i-m);
        } 
        return list;
    }
}
