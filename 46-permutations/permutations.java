class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(0, nums, permutations);
        return permutations;
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void getPermutations(int index, int[] nums, List<List<Integer>> permutations){
        if(index == nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int num : nums){
                permutation.add(num);
            }
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        for(int i = index; i < nums.length; i++){
            swap(nums, index, i);
            getPermutations(index + 1, nums, permutations);
            swap(nums, index, i);
        }
    }
}