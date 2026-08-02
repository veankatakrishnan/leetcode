class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(frequency.containsKey(s.charAt(i))){
                frequency.put(s.charAt(i), frequency.get(s.charAt(i)) + 1);
            }
            else{
                frequency.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            if(frequency.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}