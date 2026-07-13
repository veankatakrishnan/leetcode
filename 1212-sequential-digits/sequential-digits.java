class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int startDigit = 1; startDigit < 9; startDigit++){
            int currentNum = startDigit;
            for(int num = currentNum + 1; num < 10; num++){
                currentNum = currentNum * 10 + num;
                if(low <= currentNum && currentNum <= high) result.add(currentNum);
            }   
        }
        Collections.sort(result);
        return result;
    }
}