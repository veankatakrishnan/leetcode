class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows == s.length())
            return s;

        int cycle = (numRows - 1) * 2;
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < numRows; i++){
            for(int j = 0; j + i < s.length(); j += cycle){
                ans.append(s.charAt(j + i));
                if(i > 0 && i < numRows
                 - 1 && cycle + j - i < s.length()){
                    ans.append(s.charAt(cycle + j - i));
                }
            }
        }
        return ans.toString();
    }
}