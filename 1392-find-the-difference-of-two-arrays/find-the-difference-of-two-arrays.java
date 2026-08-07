class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);

        ArrayList<Integer> newList1 = new ArrayList<>();
        for(int num : nums1){
            if(!set2.contains(num)){
                newList1.add(num);
                set2.add(num);
            }
        }
        answer.add(newList1);

        ArrayList<Integer> newList2 = new ArrayList<>();
        for(int num : nums2){
            if(!set1.contains(num)){
                newList2.add(num);
                set1.add(num);
            }
        }
        answer.add(newList2);

        
        return answer;
    }
}