class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int minElement = Integer.MAX_VALUE;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < minElement) minElement = nums[mid];
            if(nums[left] <= nums[mid]){
                minElement = (minElement > nums[left]) ? nums[left] : minElement;
                left = mid + 1;
            }
            else{
                minElement = (minElement > nums[mid]) ? nums[mid] : minElement;
                right = mid;
            }
        }
        return minElement;
    }
}