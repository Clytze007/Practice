package easy;

public class BinarySearch {
	 /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return an integer
     */
    public int findPosition(int[] nums, int target) {
        int pos = 0;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
        	pos = (left + right) / 2;
        	if (nums[pos] == target) {
        		return pos;
        	}else if (nums[pos] > target) {
        		right = pos - 1;
        	} else {
        		left = pos + 1;
        	}
        }
    	return -1;
    }
    
    /**
     * 给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），
     * 如果target不存在于数组中，返回-1。
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int findFirstPosition(int[] nums, int target) {
    	if (nums == null || nums.length == 0) {
    		return -1;
    	}
        int pos = 0;
        int left = 0, right  = nums.length - 1;
        while (left <= right) {
        	pos = (left + right) / 2;
        	if (nums[pos] == target && (pos == 0 || nums[pos] != nums[pos - 1])){
        		return pos;
        	} else if (nums[pos] < target) {
        		left = pos + 1;
        	} else {
        		right = pos - 1;
        	}
        }
        return -1;
    }
    
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return an integer
     */
    public int findLastPosition(int[] nums, int target) {
    	if (nums == null || nums.length == 0) {
    		return -1;
    	}
    	int pos = 0;
    	int left = 0, right = nums.length - 1;
    	while (left <= right) {
    		pos = (left + right) / 2;
    		if (nums[pos] == target && (pos == nums.length -1 || nums[pos] != nums[pos + 1])) {
    			return pos;
    		} else if (nums[pos] <= target) {
    			left = pos + 1;
    		} else {
    			right = pos - 1;
    		}
    	}
    	return -1;
    }
}
