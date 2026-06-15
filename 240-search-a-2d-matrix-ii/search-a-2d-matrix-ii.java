class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; i++){
            int left = 0, right = n - 1;
            while(left <= right){
                int mid = left + (right - left)/2;
                if(matrix[i][mid] == target) return true;
                else if(matrix[i][mid] < target) left = mid + 1;
                else right = mid - 1;
            }
        }
        return false;
    }
}