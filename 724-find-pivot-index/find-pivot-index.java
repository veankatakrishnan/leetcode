class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int pivot = -1;
        for(int i = 0; i < nums.length; i++) leftSum += nums[i];

        for(int i = nums.length - 1; i >= 0; i--){
            leftSum -= nums[i];
            if(leftSum == rightSum) pivot = i;
            rightSum += nums[i];
        }
        return pivot;
    }
}