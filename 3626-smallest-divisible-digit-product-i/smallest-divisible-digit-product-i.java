class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = 0; i < 10; i++){
            if(productOfDigits(n) % t == 0) return n;
            n++;
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