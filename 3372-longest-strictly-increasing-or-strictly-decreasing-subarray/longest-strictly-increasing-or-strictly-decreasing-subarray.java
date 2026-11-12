class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int lr = 1;
        int maxlr = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                lr++;
            }
            else{
                lr = 1;
            }
            maxlr = Math.max(lr, maxlr);
        }

        int rl = 1;
        int maxrl = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] > nums[i+1]){
                rl++;
            }
            else rl = 1;
            maxrl = Math.max(maxrl, rl);
        }

        return maxrl > maxlr ? maxrl: maxlr;
    }
}