class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minimumSum = Integer.MAX_VALUE;
        int[] prefixSum = new int[nums.size()];
        prefixSum[0] = nums.get(0);
        for(int i = 1; i < nums.size(); i++){
            prefixSum[i] = prefixSum[i-1] + nums.get(i);
        }
        for(int i = l; i <= r; i++){
            for(int j = 0; j <= prefixSum.length - i; j++){
                if(j == 0){
                    if(prefixSum[i - 1] > 0) minimumSum = Math.min(minimumSum, prefixSum[i - 1]);
                }
                else{
                    if(prefixSum[j + i - 1] - prefixSum[j - 1] > 0)
                        minimumSum = Math.min(minimumSum, prefixSum[j + i - 1] - prefixSum[j - 1]);
                }
            }
        }
        return minimumSum != Integer.MAX_VALUE ? minimumSum : -1;
    }
}