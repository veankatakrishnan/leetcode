class Solution {
    public int sumOfSquares(int[] nums) {
        int sumOfSq = 0;
        int n = nums.length;
        for(int i = 1; i <= nums.length; i++){
            if(n % i == 0){
                sumOfSq = sumOfSq + (nums[i - 1]*nums[i - 1]);
            }
        }
        return sumOfSq;
    }
}