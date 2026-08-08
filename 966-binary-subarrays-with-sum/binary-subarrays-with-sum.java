class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int prefix = 0;
        freq.put(0,1);
        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
            if(freq.containsKey(prefix - goal)){
                count += freq.get(prefix - goal);
            }
            freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}