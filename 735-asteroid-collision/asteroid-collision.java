class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> stack = new ArrayList<>();

        for(int asteroid : asteroids){
            if(asteroid > 0) stack.add(asteroid);
            else{
                while(!stack.isEmpty() && stack.getLast() > 0 && stack.getLast() < -asteroid)
                    stack.remove(stack.size() - 1);
                    
                if(!stack.isEmpty() && stack.getLast() == -asteroid) 
                    stack.remove(stack.size() - 1);
                else if(stack.isEmpty() || stack.getLast() < 0) 
                    stack.add(asteroid);
            }
        }
        int[] result = new int[stack.size()];

        for(int i = 0; i < result.length; i++) result[i] = stack.get(i);
        return result;
    }
}