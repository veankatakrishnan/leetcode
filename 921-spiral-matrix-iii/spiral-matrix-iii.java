class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int totalCells = rows * cols;
        int result[][] = new int[totalCells][2];
        result[0] = new int[] {rStart, cStart};
        if(totalCells == 1){
            return result;
        }

        int currentRow = rStart;
        int currentCol = cStart;
        int index = 1;

        for(int stepSize = 1;; stepSize += 2){
            int [][] directions = {
                {0, 1, stepSize},
                {1, 0, stepSize},
                {0, -1, stepSize + 1},
                {-1, 0, stepSize + 1}
            };
            for(int[] direction: directions){
                int rowDif = direction[0];
                int colDif = direction[1];
                int steps =  direction[2];

                while(steps > 0){
                    currentRow += rowDif;
                    currentCol += colDif;
                    
                    if((currentRow >= 0 && currentRow < rows) && (currentCol >= 0 && currentCol < cols)){
                        result[index] = new int[] {currentRow, currentCol};
                        index++;

                        if(index == totalCells) return result;
                    }
                    steps--;                    
                }
            }
        }
    }
}