class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int left = Integer.MIN_VALUE;
        int[] right = new int[nums.length];
        int rightMin = Integer.MAX_VALUE;
        for(int i = nums.length - 1; i >= 0; i--){
            right[i] = Math.min(nums[i], rightMin);
            rightMin = right[i];
        }

        for(int i = 0; i < nums.length; i++){
            left = Math.max(left, nums[i]);
            if(left - right[i] <= k) return i;
        }
        return -1;
    }
}