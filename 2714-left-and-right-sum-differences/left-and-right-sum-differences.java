class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        int[] answer = new int[n];
        int l = 0, r = 0;
        for(int i = 0; i < n; i++){
            leftsum[i] = l;
            l += nums[i];
        }
        for(int i = n - 1; i >= 0; i--){
            rightsum[i] = r;
            r += nums[i];
        }
        for(int i = 0; i < n; i++){
            answer[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        return answer;
    }
}