class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(i == sumOfDigits(nums[i])){
                return i;
            }
        }
        return -1;
    }

    static int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}