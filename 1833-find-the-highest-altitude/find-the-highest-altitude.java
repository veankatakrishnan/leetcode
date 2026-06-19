class Solution {
    public int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int altitude = 0;
        for(int i = 0; i < gain.length; i++){
            altitude += gain[i];
            highestAltitude = Math.max(highestAltitude, altitude);
        }
        return highestAltitude;
    }
}