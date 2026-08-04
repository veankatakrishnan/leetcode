class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        HashSet<Integer> map = new HashSet<>();

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            smallest = Math.min(smallest, nums[i]);
            largest = Math.max(largest, nums[i]);
            map.add(nums[i]);
        }

        for(int i = smallest; i < largest; i++){
            if(!map.contains(i)) missing.add(i);
        }
        return missing;
    }
}