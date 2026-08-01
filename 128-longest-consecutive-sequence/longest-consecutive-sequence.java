class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : nums){
            hashSet.add(num);
        }
        int maxSequence = 0;
        for(int num : hashSet){
            if(!hashSet.contains(num - 1)){
                int count = 0;
                int value = num;
                while(hashSet.contains(value)){
                    count++;
                    value++;
                }
                maxSequence = Math.max(maxSequence, count);
            }
        }
        return maxSequence;
    }
}