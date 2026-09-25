class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique = new HashSet<>();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while(r < s.length()){
            while(l <= r && unique.contains(s.charAt(r))){
                unique.remove(s.charAt(l));
                l++;
            }

            if(!unique.contains(s.charAt(r))){
                unique.add(s.charAt(r));
                maxLen = Math.max(maxLen, r - l + 1);
            }
            
            r++;
        }
        return maxLen; 
    }
}