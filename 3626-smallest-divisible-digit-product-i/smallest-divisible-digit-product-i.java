class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; i >= 1; i++){
            if(productOfDigits(i) % t == 0) return i;
        }
        return 0;
    }
    
    public static int productOfDigits(int num){
        int product = 1;
        while(num != 0){
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }   
        return product;
    }
}