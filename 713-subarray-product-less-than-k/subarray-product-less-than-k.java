class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        int product = 1;
        while(r < nums.length){
            product *= nums[r];
            while(product > k && l < nums.length){
                product /= nums[l];
                l++;
            }
            if(product < k){
                count += (r - l + 1);
            }
            r++;
        }
        return count;
    }
}