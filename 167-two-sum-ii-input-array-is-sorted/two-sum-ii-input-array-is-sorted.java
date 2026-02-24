class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length-1;
        int sum = 0;
        int[] arr = new int[2];
        while(l < r){
            sum = numbers[l] + numbers[r];
            if (sum > target){
                r--;
            }
            else if (sum < target){
                l++;
            }
            else{
                arr[0] = l+1;
                arr[1] = r+1;
                break;
            }
        }
        return arr;
    }
}