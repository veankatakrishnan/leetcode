class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(n*m != r*c) return mat;

        int[][] reshaped = new int[r][c];
        int[] temp = new int[r*c];
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                temp[index] = mat[i][j];
                index++;
            }
        }

        index = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                reshaped[i][j] = temp[index];
                index++;
            }
        }
        return reshaped;
    }
}