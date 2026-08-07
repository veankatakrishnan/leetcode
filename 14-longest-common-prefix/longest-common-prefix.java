class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        for(String str: strs) minLength = Math.min(minLength, str.length());

        int i = 0;
        while(i < minLength){
            for(String str : strs){
                if(str.charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
        return strs[0].substring(0, i);

    }
}