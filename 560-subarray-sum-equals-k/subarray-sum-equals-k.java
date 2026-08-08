class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        freq.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
            if(freq.containsKey(prefix - k)){
                count += freq.get(prefix - k);
            }
            freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}