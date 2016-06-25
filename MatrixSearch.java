package easy;

public class MatrixSearch {
    /**
     * 写出一个高效的算法来搜索 m × n矩阵中的值。
     * 这个矩阵具有以下特性：
     * 每行中的整数从左到右是排序的。
     * 每行的第一个数大于上一行的最后一个整数。
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
    	if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
    		return false;
    	}
    	
    	int rowNum = matrix.length;
    	int colNum = matrix[0].length;
    	
    	int left = 0, right = rowNum * colNum - 1, pos = 0;
    	
    	while (left <= right) {
    		pos = (left + right) / 2;
    		int row = pos / colNum;
    		int col = pos % colNum;
    		if (matrix[row][col] == target) {
    			return true;
    		} else if (matrix[row][col] > target) {
    			right = pos - 1;
    		} else {
    			left = pos + 1;
    		}
    	}
        return false;
    }
}
