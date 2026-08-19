class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combi = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        combiSum(0, target, combi, result, candidates);
        return result;
    }

    static void combiSum(int index, int target, List<Integer> combi, List<List<Integer>> result, int[] arr){
        if(index >= arr.length){
            if(target == 0){
                result.add(new ArrayList<>(combi));
            }
            return;
        }

        if(arr[index] <= target){
            combi.add(arr[index]);
            combiSum(index, target - arr[index], combi, result, arr);
            combi.remove(combi.size() - 1);
        }

        combiSum(index + 1, target, combi, result, arr);
    }
}