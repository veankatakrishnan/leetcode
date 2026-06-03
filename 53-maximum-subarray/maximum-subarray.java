class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int temp = 0;
        for(int num: nums){
            temp += num;
            maxSum = maxSum > temp ? maxSum : temp;
            if(temp < 0) temp = 0;
        }
        
        return maxSum;
    }
}