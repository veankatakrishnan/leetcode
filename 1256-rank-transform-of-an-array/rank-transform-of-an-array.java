class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);

        int uniqueCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == 0 || sortedArray[i - 1] != sortedArray[i]){
                sortedArray[uniqueCount] = sortedArray[i];
                uniqueCount++;
            }
        }

        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = Arrays.binarySearch(sortedArray, 0, uniqueCount, arr[i]) + 1;
        }
        return result;
    }
}