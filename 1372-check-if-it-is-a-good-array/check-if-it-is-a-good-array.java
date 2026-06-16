class Solution {
    public boolean isGoodArray(int[] nums) {
        int currentGCD = 0;
        for(int i = 0; i < nums.length; i++){
            currentGCD = gcd(nums[i], currentGCD);
        }
        return (currentGCD == 1) ? true : false; 
    }
    public int gcd(int a, int b){
        return (b == 0) ? a : gcd(b, a % b);
    }
}