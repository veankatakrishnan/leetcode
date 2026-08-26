class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l = 0;
        int noOfOnes = 0;
        String answer = "";
        for(int r = 0; r < s.length(); r++){
            if(s.charAt(r) == '1') noOfOnes++;

            while(noOfOnes > k){
                if(s.charAt(l) == '1') noOfOnes--;
                l++;
            }

            if(noOfOnes == k){
                while(s.charAt(l) == '0') l++;

                String current = new String(s.substring(l, r + 1));

                if(answer.isEmpty() || current.length() < answer.length() || current.length() == answer.length() && current.compareTo(answer) < 0 ){
                    answer = current;
                }
            }
        }
        return answer;
    }
}