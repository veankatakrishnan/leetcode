class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = 0;
        long currSum = 0;
        long maxSum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int r = 0; r < nums.length; r++){
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            currSum += nums[r];

            if(r - l + 1 > k){
                map.put(nums[l], map.get(nums[l]) - 1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                currSum -= nums[l];
                l++;
            }

            if(r - l + 1 == k && map.size() == k){
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
}