package medium;

/**
 * 给定一个包含 n 个整数的排序数组，找出给定目标值 target 的起始和结束位置。
 * 如果目标值不在数组中，则返回[-1, -1]
 * 
 * @author yazhang
 *
 */
public class SearchForARange {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        if(A == null || A.length == 0) return new int[] {-1, -1}; 
        //get first target index
        int firstTarget = -1;
        int left = 0, right = A.length - 1;
        while (left + 1 < right) {
        	int mid = left + (right - left) / 2;
        	if (A[mid] >= target) {
        		right = mid;
        	} else {
        		left = mid;
        	}
        }
        if (A[left] == target) {
        	firstTarget = left;
        } else if (A[right] == target) {
        	firstTarget = right;
        } else {
        	return new int[] {-1, -1};
        }
        
        //get last target index
        int lastTarget = -1;
        left = 0; right = A.length - 1;
        while (left + 1 < right) {
        	int mid = left + (right - left) / 2;
        	if (A[mid] <= target) {
        		left = mid;
        	} else {
        		right = mid;
        	}
        }
        if (A[right] == target) {
        	lastTarget = right;
        } else if (A[left] == target) {
        	lastTarget = left;
        } else {
        	return new int[] {-1, -1};
        }
        
        int[] result = {firstTarget, lastTarget};
		return result;
    }
}
