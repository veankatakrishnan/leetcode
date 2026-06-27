class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int pileCount : piles){
            right = Math.max(pileCount, right);
        }
        while(left <= right){
            int mid = left + (right - left)/2;
            long totalHours = hoursCalculator(piles, mid);
            if(totalHours <= h){
                right = mid - 1; 
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public long hoursCalculator(int[] piles, int perHourCount){
        long totalHours = 0;
        for(int pileCount : piles){
            totalHours += (pileCount + perHourCount - 1)/perHourCount;
        }
        return totalHours;
    }
}