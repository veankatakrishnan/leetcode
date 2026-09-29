class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < nums.length){
            while((nums[i] >= 1 && nums[i] <= n) && (nums[i] != nums[nums[i] - 1])){
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
            i++;
        }

        for(i = 1; i <= n; i++){
            if(nums[i - 1] != i) return i;
        }

        return i;
    }
}