class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> nQueens = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        int[] leftRow = new int[n];
        int[] leftTopDiagnal = new int[2 * n - 1];
        int[] leftBottomDiagnal = new int[2 * n - 1];
        getNQueens(0, n, leftRow, leftTopDiagnal, leftBottomDiagnal, board, nQueens);
        return nQueens;
    }

    static void getNQueens(int col, int n, int[] leftRow, int[] leftTopDiagnal, int[] leftBottomDiagnal, char[][] board, List<List<String>> nQueens){
        if(col == n){
            List<String> nQueen = new ArrayList<>();
            for(int i = 0; i < n; i++){
                nQueen.add(new String(board[i]));
            }
            nQueens.add(nQueen);
            return;
        }

        for(int row = 0; row < n; row++){
            if(leftRow[row] != 1 && leftTopDiagnal[row + col] != 1 && leftBottomDiagnal[(n - 1) + (col - row)] != 1){
                leftRow[row] = 1;
                leftTopDiagnal[row + col] = 1;
                leftBottomDiagnal[n - 1 + (col - row)] = 1;
                board[row][col] = 'Q';

                getNQueens(col + 1, n, leftRow, leftTopDiagnal, leftBottomDiagnal, board, nQueens);

                leftRow[row] = 0;
                leftTopDiagnal[row + col] = 0;
                leftBottomDiagnal[n - 1 + (col - row)] = 0;

                board[row][col] = '.';
            }
        }
    }
}