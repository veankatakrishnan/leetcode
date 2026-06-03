class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int temp = 0;
        for(int num: nums){
            temp = Math.max(num, temp + num);
            maxSum = Math.max(temp, maxSum);
        }
        
        return maxSum;
    }
}