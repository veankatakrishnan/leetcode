class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n < m * k) return -1;
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for(int day : bloomDay){
            left = Math.min(left, day);
            right = Math.max(right, day);
        }
        int minDays = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(isPossible(bloomDay, mid, m, k)){
                minDays = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return minDays;
    }

    public boolean isPossible(int[] bloomDay, int day, int m, int k){
        int counter = 0;
        int bouquets = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= day) counter++;
            else{
                bouquets += (counter / k);
                counter = 0;
            }
        }
        bouquets += counter/k;
        return (bouquets >= m) ? true : false;
    }
}