class Solution {
    static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void getPermutations(int index, int[] nums, List<List<Integer>> permutations){
        if(index == nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int num : nums) permutation.add(num);
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        HashSet<Integer> used = new HashSet<>();

        for(int i = index; i < nums.length; i++){
            if(used.contains(nums[i])) continue;
            used.add(nums[i]);
            swap(i, index, nums);
            getPermutations(index + 1, nums, permutations);
            swap(i, index, nums);
        }
    }


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(0, nums, permutations);
        return permutations;
    }
}