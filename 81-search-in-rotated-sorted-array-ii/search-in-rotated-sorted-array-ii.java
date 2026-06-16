class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return true;
            //Right half sorted 
            if(nums[mid] < nums[right]){
                //Target in right half
                if(nums[mid] < target && target <= nums[right]) left = mid + 1;
                
                //Target in left half
                else right = mid - 1;
            }
            //Left half sorted
            else if(nums[mid] > nums[right]){
                //Target in left half
                if(nums[left] <= target && target < nums[mid]) right = mid - 1;
                //Target in right half
                else left = mid + 1;
            }
            //If we have duplicates
            else{
                right--;
            }
        }
        return false;
    }
}