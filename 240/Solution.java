class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        if(r < 1 || matrix == null || matrix[0].length < 1) return false;
        int col = matrix[0].length - 1;
        int row = 0;
        while(col >= 0 && row < r){
            if(matrix[row][col] == target) return true;
            else if(target > matrix[row][col]) row++;
            else if(target < matrix[row][col]) col--;
        }
        
        return false;
    }
}
