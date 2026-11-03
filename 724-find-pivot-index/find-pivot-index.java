class Solution {
    public int pivotIndex(int[] nums) {
        int pivotIndex = -1;
        int left = 0;
        int right = 0;
        for(int num : nums){
            right += num;
        }

        for(int i = 0; i < nums.length; i++){
            right -= nums[i];
            if(left == right){
                pivotIndex = i;
                break;
            }
            left += nums[i];
        }
        return pivotIndex;
    }
}