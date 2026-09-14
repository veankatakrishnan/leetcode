class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int bottomX1 = rec1[0];
        int bottomY1 = rec1[1];
        int topX1 = rec1[2];
        int topY1 = rec1[3];

        int bottomX2 = rec2[0];
        int bottomY2 = rec2[1];
        int topX2 = rec2[2];
        int topY2 = rec2[3];

        if(bottomY1 >= topY2 || bottomY2 >= topY1 || topX1 <= bottomX2 || topX2 <= bottomX1){
            return false;
        }
        return true;
    }
}