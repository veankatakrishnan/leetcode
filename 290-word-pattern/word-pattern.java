class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sSplit = s.split(" ");
        HashMap<Character, Integer> charMap = new HashMap<>();
        HashMap<String, Integer> stringMap = new HashMap<>();
        if(sSplit.length != pattern.length()) return false;

        for(int i = 0; i < pattern.length(); i++){
            char character = pattern.charAt(i);
            String word = sSplit[i];

            charMap.putIfAbsent(character, i);
            stringMap.putIfAbsent(word, i);

            if(!charMap.get(character).equals(stringMap.get(word))) return false;
        }
        return true;
    }
}