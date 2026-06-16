class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(result.length() > 0) result = result.deleteCharAt(result.length() -1);
            }
            else if(ch == '#'){
                result.append(result);
            }
            else if(ch == '%'){
                result.reverse();
            }
            else if('a' <= ch && ch <= 'z'){
                result.append(ch);
            }
        }
        return result.toString();
    }
}