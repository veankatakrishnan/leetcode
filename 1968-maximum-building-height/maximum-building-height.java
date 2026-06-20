class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        int r[][] = new int[restrictions.length + 1][2];
        r[0] = new int[]{1, 0};

        long maxHeight = 0;
        
        for(int i = 0; i < restrictions.length; i++){
            r[i + 1] = restrictions[i];
        }
        Arrays.sort(r, (a,b) -> Integer.compare(a[0],b[0]));
        int m = r.length; 

        //Left Pass
        for(int i = 1; i < m; i++){
            int distance = r[i][0] - r[i - 1][0];
            r[i][1] = Math.min(r[i][1], r[i - 1][1] + distance);
        }

        //Right Pass
        for(int i = m - 2; i >= 0; i--){
            int distance = r[i + 1][0] - r[i][0];
            r[i][1] = Math.min(r[i][1], r[i + 1][1] + distance);
        }

        for(int i = 1; i < m; i++){
            int x1 = r[i - 1][0];
            int h1 = r[i - 1][1];

            int x2 = r[i][0];
            int h2 = r[i][1];

            int d = x2 - x1;
            long peak = ((long) h1 + h2 + d)/2;
            maxHeight = Math.max(peak, maxHeight);
        }

        int lastPos = r[m - 1][0];
        int lastHeight = r[m - 1][1];
        maxHeight = Math.max(maxHeight, (long) lastHeight + (n - lastPos));
        return (int) maxHeight;
    }
}