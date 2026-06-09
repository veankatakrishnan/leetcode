class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = 0, end = nums.length - 1;
        int temp = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                temp = mid;
                end = mid - 1;
            }
        }
        ans[0] = temp;

        start = 0;
        end = nums.length - 1;
        temp = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                temp = mid;
                start = mid + 1;
            }
        }
        ans[1] = temp;
        return ans;
    }
}