class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Arrays.fill(answer, 0); 
        Deque<Integer> ms = new ArrayDeque<>();
        for(int i = 0; i < temperatures.length; i++){
           while(!ms.isEmpty() && temperatures[ms.peek()] < temperatures[i]){
            int targetIndex = ms.pop();
            answer[targetIndex] = i - targetIndex;
           }
           ms.push(i);
        }
        return answer;
    }
}