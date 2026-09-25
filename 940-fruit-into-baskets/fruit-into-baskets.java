class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> fruitTypes = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxFruits = 0;
        while(r < fruits.length){
            fruitTypes.put(fruits[r], fruitTypes.getOrDefault(fruits[r], 0) + 1);
            while(fruitTypes.size() > 2 && l <= r){
                fruitTypes.put(fruits[l], fruitTypes.get(fruits[l]) - 1);
                if(fruitTypes.get(fruits[l]) == 0){
                    fruitTypes.remove(fruits[l]);
                }
                l++;
            }
            maxFruits = Math.max(maxFruits, r - l + 1);
            r++;
        }
        return maxFruits;
    }
}