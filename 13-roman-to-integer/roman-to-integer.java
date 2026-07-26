class Solution {
    public int romanToInt(String s) {
        String roman = "IVXLCDM";
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < roman.length(); i++){
            map.put(roman.charAt(i), values[i]);
        }

        int result = 0;

        for(int i = 0; i < s.length() - 1; i++){
            int sign = (map.get(s.charAt(i)) < map.get(s.charAt(i+1))) ? -1 : 1;
            result += sign * (map.get(s.charAt(i)));
        }
        result += map.get(s.charAt(s.length() - 1));
        return result;

    }
}