class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landThenWater = getearliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        int waterThenLand = getearliestFinishTime(waterStartTime, waterDuration, landStartTime, landDuration);

        return Math.min(landThenWater, waterThenLand);
    }

    public int getearliestFinishTime(int[] firstStartTime, int[] firstDuration, int[] secondStartTime, int[] secondDuration){
        int minFirst = Integer.MAX_VALUE;
        for(int i = 0; i < firstDuration.length ; i++){
            int firstCompletionTime = firstStartTime[i] + firstDuration[i];
            minFirst = Math.min(firstCompletionTime, minFirst);
        }

        int minFirstAndSecond = Integer.MAX_VALUE;
        for(int i = 0; i < secondDuration.length ; i++){
            int secondBegin = Math.max(minFirst, secondStartTime[i]);
            int secondCompletionTime = secondBegin + secondDuration[i];
            minFirstAndSecond = Math.min(minFirstAndSecond, secondCompletionTime);
        }

        return minFirstAndSecond;
    }
}