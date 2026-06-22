class Solution {
    public int maxNumberOfBalloons(String text) {
        int maxBallons = Integer.MAX_VALUE;
        int frequency[] = new int[26];
        for(int i = 0; i < text.length(); i++){
            frequency[text.charAt(i) - 'a']++;
        }
        frequency['l' - 'a'] /= 2;
        frequency['o' - 'a'] /= 2;

        for(char ch : "balon".toCharArray()){
            maxBallons = Math.min(maxBallons, frequency[ch - 'a']);
        }
        return maxBallons;
    }
}