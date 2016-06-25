package easy;

public class SearchInsertPosition {
    /** 
     * Given a sorted array and a target value, return the index if the target is found. 
     * If not, return the index where it would be if it were inserted in order.
     * You may assume NO duplicates in the array.
     * 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
    	if (A == null || A.length == 0) return 0;
    	int left = 0, right = A.length - 1;
    	int pos = 0;
    	while (left + 1 < right) {
    		pos = (left + right) / 2;
    		if (target == A[pos]) {
    			return pos;
    		}
    		else if (target > A[pos]) {
    			left = pos;
    		} else {
    			right = pos;
    		}
    	}
    	if (left == right) {
    		return A[pos] < target? 1 : 0;
    	} 
    	return right;
    }
}
