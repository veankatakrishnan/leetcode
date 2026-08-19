class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> combi = new ArrayList<>();
        getCombinations(1, n, k, combi, answer);
        return answer;
    }

    static void getCombinations(int num, int n, int k, List<Integer> combi, List<List<Integer>> answer){
        if(combi.size() == k){
            answer.add(new ArrayList<>(combi));
            return;
        }
        if(num > n) return;

        combi.add(num);
        getCombinations(num + 1, n, k, combi, answer);

        combi.remove(combi.size() - 1);
        getCombinations(num + 1, n, k, combi, answer);
    }
}