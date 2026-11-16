class Solution {
    public String digitSum(String s, int k) {
        return getSum(s, k);
    }

    static String getSum(String s, int k){
        if(s.length() <= k) return s;
        int sum = 0;
        StringBuilder newString = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i % k == 0 && i != 0){
                newString.append(sum);
                sum = 0; 
            }
            sum += s.charAt(i) - '0';
        }
        newString.append(sum);
        return getSum(newString.toString(), k);
    }
}