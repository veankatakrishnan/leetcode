class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        getCombinations(1, k, n, 0, combination, combinations);
        return combinations;
    }

    static void getCombinations(int num, int k, int n, int sum, List<Integer> combination, List<List<Integer>> combinations){
        if(k == combination.size()){
            if(sum == n){
                combinations.add(new ArrayList<>(combination));
            }
            return;
        }
        for(int i = num; i < 10; i++){
            sum += i;
            combination.add(i);

            getCombinations(i + 1, k, n, sum, combination, combinations);

            combination.remove(combination.size() - 1);
            sum -= i;
        }
    }
}