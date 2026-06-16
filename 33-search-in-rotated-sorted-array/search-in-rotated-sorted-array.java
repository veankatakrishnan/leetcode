class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            //Left Part Sorted
            else if(nums[left] <= nums[mid]){
                //Target present in the left half
                if(nums[left] <= target && target < nums[mid]) right = mid - 1;

                //Target present in the right half of the sorted array
                else left = mid + 1;
            }
            // Right Half sorted
            else{
                // Target in the right half 
                if(nums[mid] < target && target <= nums[right]) left = mid + 1; 

                // Target in left half
                else right = mid - 1; 
            }
        }
        return -1;
    }
}