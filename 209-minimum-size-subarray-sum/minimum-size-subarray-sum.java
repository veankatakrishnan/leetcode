class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int currSum = 0;
        int minSize = Integer.MAX_VALUE;
        while(r < nums.length){
            currSum += nums[r];
            while(currSum >= target){
                minSize = Math.min(minSize, r - l + 1);
                currSum -= nums[l];
                l++;
            }
            r++;
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}