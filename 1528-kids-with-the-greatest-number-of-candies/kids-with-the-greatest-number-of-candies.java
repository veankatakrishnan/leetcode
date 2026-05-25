class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandie = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++){
            maxCandie = (maxCandie > candies[i]) ? maxCandie : candies[i];
        }
        List<Boolean> result = new ArrayList<>();
        for(int i = 0 ; i < candies.length; i++){
            // if(extraCandies + candies[i] >= maxCandie){
            //     result.add(true);
            // }
            // else{
            //     result.add(false);
            // }
            result.add((extraCandies + candies[i] >= maxCandie) ? true : false);

        }
        return result;
    }
}