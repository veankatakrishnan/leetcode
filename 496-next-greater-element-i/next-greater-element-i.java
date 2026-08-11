class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> nextGreater = new HashMap<>(nums2.length);

        for(int i = nums2.length - 1; i >= 0; i--){
            int currentNum = nums2[i];

            while(!stack.isEmpty() && stack.peek() < currentNum){
                stack.pop();
            }

            if(!stack.isEmpty()){
                nextGreater.put(currentNum, stack.peek());
            }

            stack.push(currentNum);
        }

        int[] nextGreaterElement = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            nextGreaterElement[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        return nextGreaterElement;
    }
}