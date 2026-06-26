class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        int[] diagonal = new int[n * m];
        int index = 0;
        
        List<Integer> diagonals = new ArrayList<>();

        for(int diagonalNum = 0; diagonalNum < (n + m - 1); diagonalNum++){
            int diagonalRow = (diagonalNum < n) ? 0 : diagonalNum - n + 1;
            int diagonalCol = (diagonalNum < n) ? diagonalNum : n - 1;

            while(diagonalRow < m && diagonalCol >= 0){
                diagonals.add(mat[diagonalRow][diagonalCol]);
                diagonalRow++;
                diagonalCol--;
            }

            if(diagonalNum % 2 == 0) Collections.reverse(diagonals);

            for(int element : diagonals) diagonal[index++] = element;

            diagonals.clear();
        }
        return diagonal;
    }
}