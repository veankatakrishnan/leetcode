class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            rightSum += nums[i];
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            rightSum -= nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return answer;
    }
}