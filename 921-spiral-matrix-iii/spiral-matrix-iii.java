class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int totalCells = rows * cols;
        int result[][] = new int[totalCells][2];
        result[0] = new int[] {rStart, cStart};
        if(totalCells == 1) return result;

        int currRow = rStart;
        int currCol = cStart;
        int index = 1;

        for(int stepSize = 1 ;; stepSize += 2){
            int[][] directions = {
                {0, 1, stepSize},
                {1, 0, stepSize},
                {0, -1, stepSize + 1},
                {-1, 0, stepSize + 1}
            };
            for(int[] direction : directions){
                int rowDiff = direction[0];
                int colDiff = direction[1];
                int step = direction[2];
                while(step > 0){
                    currRow += rowDiff;
                    currCol += colDiff;

                    if(currRow >= 0 && currRow < rows && currCol >= 0 && currCol < cols){
                        result[index] = new int[] {currRow, currCol};
                        index++;

                        if(index == totalCells) return result;
                    }
                    step--;
                }
            }
        }
    }
}