class Solution {
    public int rearrangeCharacters(String s, String target) {
        int maxCopies = Integer.MAX_VALUE;
        int[] frequencyS = new int[26];
        int[] frequencyT = new int[26];

        for(int i = 0; i < s.length(); i++){
            frequencyS[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < target.length(); i++){
            frequencyT[target.charAt(i) - 'a']++;
        }

        for(char ch : target.toCharArray()){
            maxCopies = Math.min(maxCopies, (frequencyS[ch - 'a']/frequencyT[ch - 'a']));
        }
        return maxCopies;
    }
}