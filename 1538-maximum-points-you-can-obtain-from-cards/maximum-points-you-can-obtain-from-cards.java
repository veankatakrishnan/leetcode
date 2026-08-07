class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(k == cardPoints.length){
            int sum = 0;
            for(int points : cardPoints){
                sum += points;
            }
            return sum;
        }

        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < k; i++){
            leftSum += cardPoints[i];
        }
        int maxSum = leftSum;
        for(int i = 1; i <= k; i++){
            leftSum -= cardPoints[k - i];
            rightSum += cardPoints[cardPoints.length - i];
            int sum = leftSum + rightSum;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}