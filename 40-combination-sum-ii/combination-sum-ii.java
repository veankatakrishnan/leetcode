class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        Arrays.sort(candidates);
        getCombinations(0, candidates, target, 0, combination, result);
        return result;
    }

    static void getCombinations(int index, int[] arr, int target, int sum, List<Integer> combination, List<List<Integer>> result){
        
        if(target == sum){
            result.add(new ArrayList<>(combination));
            return;
        }

        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i - 1]) continue;
            if(sum > target) return; 

            combination.add(arr[i]);
            sum += arr[i];
            getCombinations(i + 1, arr, target, sum, combination, result);

            combination.remove(combination.size() - 1);
            sum -= arr[i];
        }
    }
}