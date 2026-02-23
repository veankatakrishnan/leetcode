class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);

        int children = 0, i = 0, j = 0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                children++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return children;
    }
}