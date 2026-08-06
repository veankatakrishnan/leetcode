class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visitedElements = new HashMap<>();
        int[] two = new int[2];
        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(visitedElements.containsKey(compliment)){
                two[0] = visitedElements.get(compliment);
                two[1] = i;
                return two;
            }
            else{
                visitedElements.put(nums[i], i);
            }
        }
        return two;
    }
}