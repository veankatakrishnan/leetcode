class Solution {
    public int subarraySum(int[] nums, int k) {
        int currSum = 0;
        int res = 0;
        HashMap<Integer, Integer> arr_sums = new HashMap();
        arr_sums.put(0,1);
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            if(arr_sums.containsKey(currSum - k)){
                res += arr_sums.get(currSum-k);
            }
            arr_sums.put(currSum, arr_sums.getOrDefault(currSum, 0) + 1);
        }
        return res;
    }
}