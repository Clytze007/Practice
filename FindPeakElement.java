package medium;

/**
 * 
 你给出一个整数数组(size为n)，其具有以下特点：
**相邻位置的数字是不同的
**A[0] < A[1] 并且 A[n - 2] > A[n - 1]

假定P是峰值的位置则满足A[P] > A[P-1]且A[P] > A[P+1]，返回数组中任意一个峰值的位置。

 注意事项

数组可能包含多个峰值，只需找到其中的任何一个即可
 * 
 * @author yazhang
 *
 */
public class FindPeakElement {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
    	if (A == null || A.length <= 2) return Integer.MIN_VALUE;
    	int left = 1, right = A.length - 2; // 答案不会是第一或最后的数
    	while(left + 1 < right) {
    		int mid = left + (right - left) / 2;
    		if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
    			return mid;
    		} else if (A[mid] > A[mid - 1]){
    			left = mid;
    		} else {
    			right = mid;
    		}
    	}
    	if (A[left] > A[right]) {
    		return left;
    	} else {
        	return right;
    	}
    }
    

    /**
     * 没有第二个条件，最高峰可能存在于开头或结尾
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
    	if (nums == null || nums.length < 2) return 0;
    	int left = 0, right = nums.length - 1; 
    	while(left + 1 < right) {
    		int mid = left + (right - left) / 2;
    		if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
    			return mid;
    		} else if (nums[mid] > nums[mid - 1]){
    			left = mid;
    		} else {
    			right = mid;
    		}
    	}
    	if (nums[left] > nums[right]) {
    		return left;
    	} else {
        	return right;
    	}
    }
}
