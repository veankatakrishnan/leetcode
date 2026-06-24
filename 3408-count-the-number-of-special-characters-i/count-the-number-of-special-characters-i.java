class Solution {
    public int numberOfSpecialChars(String word) {
        int[] letters = new int[26];

        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                letters[ch - 'a'] |= 1;
            } else {
                letters[ch - 'A'] |= 2;
            }
        }

        int count = 0;
        for (int x : letters) {
            if (x == 3) count++;
        }

        return count;
    }
}