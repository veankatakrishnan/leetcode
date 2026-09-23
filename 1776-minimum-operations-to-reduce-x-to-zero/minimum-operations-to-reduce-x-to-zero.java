class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        int target = sum - x;
        int l = 0;
        int r = 0;
        int maxLen = -1;
        int currSum = 0;
        while(r < nums.length){
            currSum += nums[r];
            while(l <= r && currSum > target){
                currSum -= nums[l];
                l++;
            }
            if(currSum == target){
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return (maxLen != -1) ? nums.length - maxLen : maxLen;
    }
}