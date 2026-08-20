class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subs = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        getSubsets(0, nums, subs, sub);
        return subs;
    }

    static void getSubsets(int index, int[] nums, List<List<Integer>> subsets, List<Integer> subset){
        if(index >= nums.length){
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        getSubsets(index + 1, nums, subsets, subset);

        subset.remove(subset.size() - 1);
        getSubsets(index + 1, nums, subsets, subset);
    }
}