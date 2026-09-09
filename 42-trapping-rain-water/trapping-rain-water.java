class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int rainWater = 0;
        while(left < right){
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);
            if(leftMax < rightMax){
                rainWater += leftMax - height[left];
                left++;
            }
            else{
                rainWater += rightMax - height[right];
                right--;
            }
        }
        return rainWater;
    }
}