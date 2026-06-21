class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int maxBars = 0;
        for(int cost : costs){
            coins -= cost;
            if(coins < 0) return maxBars;
            else maxBars++;
        }
        return maxBars;
    }
}