class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));
        for(int i = 0; i < numRows - 1; i++){
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            List<Integer> previousRow = triangle.get(i);
            for(int col = 1; col < previousRow.size(); col++){
                int sum = previousRow.get(col - 1) + previousRow.get(col);
                currentRow.add(sum);
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }
}