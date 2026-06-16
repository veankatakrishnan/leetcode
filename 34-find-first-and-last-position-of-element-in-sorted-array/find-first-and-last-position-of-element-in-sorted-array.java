class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] ans = {-1, -1};
        if(nums.length == 0) return ans;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        if(nums[left] != target) return ans;
        ans[0] = left;
        
        left = 0;
        right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2 + 1;
            if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid;
            }
        }
        ans[1] = left;
        return ans;
    }
}