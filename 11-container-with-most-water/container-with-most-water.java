class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxWater = Integer.MIN_VALUE;
        while(l < r){
            int currWater = Math.min(height[l], height[r]) * (r - l);
            maxWater = Math.max(currWater, maxWater);
            if(height[l] < height[r]) l++;
            else r--;
        }
        return maxWater;
    }
}