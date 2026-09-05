class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] suffixMin = new int[nums.length];
        int suffix = Integer.MAX_VALUE;
        for(int i = nums.length - 1; i >= 0; i--){
            suffixMin[i] = Math.min(suffix, nums[i]);
            suffix = suffixMin[i];
        }

        int prefixMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            prefixMax = Math.max(prefixMax, nums[i]);
            if(prefixMax - suffixMin[i] <= k) return i;
        }
        return -1;
    }
}