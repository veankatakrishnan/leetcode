class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshaped = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c) return mat;
        int index = r * c;
        for(int i = 0; i < index; i++){
            reshaped[i / c][i % c] = mat[i / n][i % n];
        }
        return reshaped;
    }
}