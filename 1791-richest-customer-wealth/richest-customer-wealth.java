class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int[] wealth : accounts){
            int sum = 0;
            for(int i: wealth){
                sum += i;
            }
            maxWealth = maxWealth < sum ? sum : maxWealth;
        }
        return maxWealth;
    }
}