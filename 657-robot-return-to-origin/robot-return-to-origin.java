class Solution {
    public boolean judgeCircle(String moves) {
        int countR = 0, countL = 0, countD = 0, countU = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'R') countR++;
            else if(ch == 'L') countL++;
            else if(ch == 'U') countU++;
            else if(ch == 'D') countD++;
        }
        if(countD == countU && countL == countR) return true;
        else return false;
    }
}