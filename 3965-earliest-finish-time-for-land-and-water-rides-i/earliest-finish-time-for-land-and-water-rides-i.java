class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int land = landStartTime.length, water = waterStartTime.length; 
        int minimumTime = Integer.MAX_VALUE;
        for(int i = 0; i < land; i++){
            int landFinishTime = landStartTime[i] + landDuration[i];
            for(int j = 0; j < water; j++){
                int waterBegin = Math.max(waterStartTime[j], landFinishTime);
                int totalFinish = waterBegin + waterDuration[j];
                minimumTime = Math.min(minimumTime, totalFinish);
            }
        }
        for(int j = 0; j < water; j++){
            int waterFinishTime = waterStartTime[j] + waterDuration[j];
            for(int i = 0; i < land; i++){
                int landBegin = Math.max(waterFinishTime, landStartTime[i]);
                int totalFinish = landBegin + landDuration[i];
                minimumTime = Math.min(minimumTime, totalFinish);
            }
        }
        return minimumTime;
    }
}