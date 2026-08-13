class Solution {
    public int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int num : nums){
            smallest = Math.min(num, smallest);
            largest = Math.max(num, largest);
        }

        return gcd(smallest, largest);
    }
    
    public static int gcd(int a , int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}