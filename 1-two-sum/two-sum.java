class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoIndices = new int[]{-1, -1};
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(nums[i])){
                twoIndices[0] = map.get(nums[i]);
                twoIndices[1] = i;
            }
            else{
                map.put(compliment, i);
            }
        }
        return twoIndices;
    }
}