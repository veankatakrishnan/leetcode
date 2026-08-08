class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        int maxFruits = 0;
        HashMap<Integer, Integer> fruitsCount = new HashMap<>();
        while(r < fruits.length){
            fruitsCount.put(fruits[r], fruitsCount.getOrDefault(fruits[r], 0) + 1);
            if(fruitsCount.size() > 2){
                fruitsCount.put(fruits[l], fruitsCount.get(fruits[l]) - 1);
                if(fruitsCount.get(fruits[l]) == 0) fruitsCount.remove(fruits[l]);
                l++;
            }
            else{
                maxFruits = Math.max(maxFruits, r - l + 1);
            }
            r++;
        }
        return maxFruits;
    }
}