class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0, count = 0;
        for(int num : nums){
            int temp = num;
            if(count == 0 && temp != majority){
                majority = temp;
                count++;
            } 
            else if(temp != majority){
                count--;
            }
            else{
                count++;
            }
        }
        return majority;
    }
}