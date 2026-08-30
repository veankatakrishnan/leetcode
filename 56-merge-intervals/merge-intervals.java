class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        List<int[]> merged = new ArrayList<>();
        for(int i = 1; i < intervals.length; i++){
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if(currentEnd < nextStart){
                merged.add(new int[]{currentStart, currentEnd});
                currentStart = nextStart;
                currentEnd = nextEnd;
            }
            else{
                currentEnd = (currentEnd > nextEnd) ? currentEnd : nextEnd;
            }
        }
        merged.add(new int[]{currentStart, currentEnd});
        int[][] mergedArr = new int[merged.size()][2];
        int i = 0;
        for(int[] arr : merged){
            mergedArr[i] = arr;
            i++;
        }
        return mergedArr;
    }
}