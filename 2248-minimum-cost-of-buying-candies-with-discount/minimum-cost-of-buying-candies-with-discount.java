class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int minCost = 0;
        int temp = 0;
        for(int i = cost.length - 1; i >= 0; i--){
            temp++;
            if(temp % 3 ==0){
                continue;
            }
            else{
                minCost += cost[i];
            }
        }
        return minCost;
    }
}