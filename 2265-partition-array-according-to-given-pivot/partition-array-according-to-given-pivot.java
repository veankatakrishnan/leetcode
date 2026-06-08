class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int l = 0, r = nums.length - 1;
        for(int i = 0, j = nums.length - 1; i < nums.length; i++, j--){
            if(nums[i] < pivot){
                ans[l] = nums[i];
                l++;
            }
            if(nums[j] > pivot){
                ans[r] = nums[j];
                r--;
            }
        }
        while(l <= r){
            ans[l] = pivot;
            l++;
        }
        return ans;
    }
}