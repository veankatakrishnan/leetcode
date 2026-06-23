class Solution {
    public boolean isGood(int[] nums) {
        if(nums.length == 1) return false;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if((i + 1) != nums[i]) return false;
        }
        return(nums[nums.length - 1] == nums[nums.length - 2]);
    }
}