class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        for(int i = 1; i < words.length; i++){
            if(!isAnagram(words[i-1], words[i])){
                result.add(words[i]);
            }
        }
        return result;
    }

    static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        int[] charCount = new int[26];

        for(int i = 0; i < str1.length(); i++){
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        for(int count : charCount){
            if(count != 0) return false;
        }
        return true;
    }
}