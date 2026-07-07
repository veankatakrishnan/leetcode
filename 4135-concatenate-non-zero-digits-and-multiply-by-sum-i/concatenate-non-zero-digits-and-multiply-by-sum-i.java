class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0') continue;
            else result.append(str.charAt(i));
        }
        if(result.length() == 0) return 0;
        long res = Integer.parseInt(result.toString());
        long temp = res;
        long sum = 0;
        while(temp != 0){
            sum += temp % 10;
            temp /= 10;
        }
        return res * sum; 
    }
}