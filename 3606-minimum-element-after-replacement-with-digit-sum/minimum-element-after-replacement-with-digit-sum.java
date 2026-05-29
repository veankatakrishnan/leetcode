class Solution {
    public int minElement(int[] nums) {
        int minimumElement = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            int sum = 0;
            while(temp != 0){
                sum += temp % 10;
                temp /= 10;
            }
            nums[i] = sum;
            minimumElement = (minimumElement < nums[i]) ? minimumElement : nums[i];
        }
        return minimumElement;
    }
}