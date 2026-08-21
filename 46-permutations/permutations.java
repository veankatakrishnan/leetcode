class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        getPermutations(permutation, permutations, map, nums);
        return permutations;
    }

    static void getPermutations(List<Integer> permutation, List<List<Integer>> permutations, boolean[] map, int[] nums){

        if(permutation.size() == nums.length){
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!map[i]){
                map[i] = true;
                permutation.add(nums[i]);
                getPermutations(permutation, permutations, map, nums);
                permutation.remove(permutation.size() - 1);
                map[i] = false;
            }
        }
    }
}