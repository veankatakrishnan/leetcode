class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String ans = "1";
        
        for(int i = 2; i <= n; i++){
            int count = 1;
            StringBuilder next = new StringBuilder();
            for(int j = 1; j < ans.length(); j++){
                if(ans.charAt(j) == ans.charAt(j-1)){
                    count++;
                }
                else{
                    next.append(count);
                    next.append(ans.charAt(j-1));
                    count = 1;
                }
            }
            next.append(count).append(ans.charAt(ans.length() - 1));
            ans = next.toString();
        }
        return ans.toString();
    }
}