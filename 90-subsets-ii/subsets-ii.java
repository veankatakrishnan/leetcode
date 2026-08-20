class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        getSubsets(0, nums, subset, subsets);
        return subsets;
    }

    static void getSubsets(int index, int[] nums, List<Integer> subset, List<List<Integer>> subsets){
        subsets.add(new ArrayList<>(subset));
        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] == nums[i - 1]) continue;
            subset.add(nums[i]);
            getSubsets(i + 1, nums, subset, subsets);
            subset.remove(subset.size() - 1);
        }
    }
}