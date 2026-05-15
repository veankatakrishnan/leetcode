class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        String concatStr = s + s;
        return concatStr.contains(goal);
    }
}