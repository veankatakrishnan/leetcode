class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i == maxIndex) continue;
            secondMax = Math.max(secondMax, nums[i]);
        }
        return (max - 1) * (secondMax - 1);
    }
}