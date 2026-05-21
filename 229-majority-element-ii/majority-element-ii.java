import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majority = new ArrayList<>();
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(count1 == 0 && nums[i] != candidate2){
                count1++;
                candidate1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != candidate1){
                count2++;
                candidate2 = nums[i];
            }
            else if(nums[i] == candidate1){
                count1++;
            }
            else if(nums[i] == candidate2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == candidate1){
                count1++;
            }
            else if(nums[i] == candidate2){
                count2++;
            }
        }
        if((nums.length / 3) < count1){
            majority.add(candidate1);
        }
        if((nums.length / 3) < count2){
            majority.add(candidate2);
        }
        return majority;
    }
}