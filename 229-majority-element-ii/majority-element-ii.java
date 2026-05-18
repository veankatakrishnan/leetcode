import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majority = new ArrayList<>();
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(count1 == 0 && candidate2 != nums[i]){
                count1++;
                candidate1 = nums[i];
            }
            else if(count2 == 0 && candidate1 != nums[i]){
                count2++;
                candidate2 = nums[i];
            }
            else if(candidate1 == nums[i]) count1++;
            else if(candidate2 == nums[i]) count2++;
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num: nums){
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
        }
        if(count1 > nums.length / 3) majority.add(candidate1);
        if(count2 > nums.length / 3) majority.add(candidate2);
        return majority;
    }
}