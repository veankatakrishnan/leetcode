class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        int l = 0, r = str.length - 1;
        while(l < r){
            String temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
        return String.join(" ",str).trim();
    }
}