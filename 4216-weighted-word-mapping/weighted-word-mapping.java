class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(String word : words){
            int strWeight = 0;
            for(char ch: word.toCharArray()){
                int weight = (int) ch - 97;
                strWeight += weights[weight];
            }
            int map = strWeight % 26;
            ans.append((char)('z' - map));
        }
        return ans.toString();
    }
}