class Solution {
    public int romanToInt(String s) {
        String romanNumerals = "IVXLCDM";
        int[] values = {1, 5, 10, 50, 100, 500, 1000};

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < values.length; i++){
            map.put(romanNumerals.charAt(i), values[i]);
        }

        int len = s.length();

        int result = map.get(s.charAt(len - 1));

        for(int i = 0; i < len - 1; i++){
            int sign = (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) ? -1 : 1;
            result += sign * (map.get(s.charAt(i)));
        }
        return result;
    }
}