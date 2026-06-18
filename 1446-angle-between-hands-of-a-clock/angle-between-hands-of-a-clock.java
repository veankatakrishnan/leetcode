class Solution {
    public double angleClock(int hour, int minutes) {
        double first = (11 * (double) minutes) / 2;
        double second = 30 * (double) hour;
        double angle = Math.abs(first - second);
        return (angle > 180) ? 360 - angle : angle;
    }
}