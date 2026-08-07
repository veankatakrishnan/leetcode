class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashSet<Character> unique = new HashSet<>();
        int l = 0; 
        int r = 0;
        int maxLength = Integer.MIN_VALUE;
        while(r < s.length()){
            while(unique.contains(s.charAt(r))){
                unique.remove(s.charAt(l));
                l++;
            }
            unique.add(s.charAt(r));
            int length = r - l + 1;
            maxLength = Math.max(length, maxLength);
            r++;
        }
        return maxLength;
    }
}