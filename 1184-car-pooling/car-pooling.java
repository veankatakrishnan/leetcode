class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a,b) -> Integer.compare(a[1], b[1]));
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        int currentPassengers = 0;

        for(int[] trip : trips){
            int passengers = trip[0]; int start = trip[1]; int end = trip[2];

            while(!heap.isEmpty() && heap.peek()[0] <= start){
                currentPassengers -= heap.poll()[1];
            }

            currentPassengers += passengers;
            if(currentPassengers > capacity) return false;

            heap.offer(new int[]{end, passengers});
        }
        return true;
    }
}