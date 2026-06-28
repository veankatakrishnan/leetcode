class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int right = 0;
        int left = Integer.MIN_VALUE;
        for(int weight : weights){
            right += weight;
            left = Math.max(left, weight);
        }
        while(left <= right){
            int mid = left + (right - left)/2;
            if(isPossibleCapacity(weights, days, mid)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    public boolean isPossibleCapacity(int[] weights, int days, int capacity){
        int calculatedDays = 0;
        int temp = 0;
        for(int i = 0; i < weights.length; i++){
            temp += weights[i];
            if(temp > capacity){
                calculatedDays++;
                temp = weights[i];
            }
        }
        calculatedDays++;
        return calculatedDays <= days;
    }
}