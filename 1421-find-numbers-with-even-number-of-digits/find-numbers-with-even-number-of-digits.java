class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            int temp = num;
            int digits = 0;
            while(temp != 0){
                digits++;
                temp /= 10;
            }
            if (digits % 2 == 0) count++;
        }
        return count;
    }
}