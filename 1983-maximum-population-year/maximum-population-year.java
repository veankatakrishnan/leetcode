class Solution {
    public int maximumPopulation(int[][] logs) {
        int population [] = new int[101];
        for(int i = 0; i < logs.length; i++){
            population[logs[i][0] - 1950] += 1;
            population[logs[i][1] - 1950] -= 1;
        }

        int curr = 0; 
        int resYear = 1950;
        int resPop = 0;

        for(int i = 0; i < 101; i++){
            curr += population[i];
            if(curr > resPop){
                resPop = curr;
                resYear = 1950 + i;
            }
        }
        return resYear;
    }
}