class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landThenWater = minimumFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        int waterThenLand = minimumFinishTime(waterStartTime, waterDuration, landStartTime, landDuration);
        return (Math.min(landThenWater, waterThenLand));
    }

    public int minimumFinishTime(int[] firstStartTime, int[] firstDuration, int[]secondStartTime, int[]secondDuration){
        int firstMinimum = Integer.MAX_VALUE;
        for(int i = 0; i < firstStartTime.length; i++){
            int minimum = firstStartTime[i] + firstDuration[i];
            firstMinimum = Math.min(minimum, firstMinimum);
        }

        int secondMinimum = Integer.MAX_VALUE;
        for(int i = 0; i < secondDuration.length; i++){
            int secondBegin = Math.max(firstMinimum, secondStartTime[i]);
            int minimum = secondDuration[i] + secondBegin;
            secondMinimum = Math.min(minimum, secondMinimum);
        }
        return (secondMinimum);
    }
}