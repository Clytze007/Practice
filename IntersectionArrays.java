package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionArrays {
    public int[] intersection1(int[] nums1, int[] nums2) {
    	HashSet<Integer> base = new HashSet<Integer>();
    	int[] baseNums = null, nums = null;
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	if (nums1.length > nums2.length) {
    		baseNums = nums1;
    		nums = nums2;
    	}else {
    		baseNums = nums2;
    		nums = nums1;
    	}
    	
    	for (int num : baseNums) {
    		base.add(num);
    	}
    	for (int num : nums) {
    		if (base.contains(num)){
    			base.remove(num);
    			result.add(num);
    		}
    	}
    	
    	int[] resultArray = new int[result.size()];
    	for (int i = 0; i < result.size(); i++) {
    		resultArray[i] = result.get(i);
    	}
        return  resultArray;
    }
    
    //O(nlogn)
    public int[] intersection2(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	HashSet<Integer> result = new HashSet<Integer>();
    	
    	for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ){
    		if (nums1[i] == nums2[j]) {
    			result.add(nums1[i++]);
    			j++;
    		} else if (nums1[i] > nums2[j]){
    			j++;
    		} else {
    			i++;
    		}
    	}
    	
    	int[] resultArray = new int[result.size()];
    	int i = 0;
    	for(Integer num : result){
    		resultArray[i++] = num;
    	}
    	return resultArray;
    }
    
    //O(nlogn)
    public int[] intersection(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1);
    	HashSet<Integer> result = new HashSet<Integer>();
    	for (int i = 0; i < nums2.length; i++) {
    		int r = nums1.length - 1;
    		int l = 0;
    		while (l <= r) {
    			int mid = (l + r) / 2;
    			if (nums1[mid] == nums2[i]) {
    				result.add(nums2[i]);
    				break;
    			} else if (nums1[mid] > nums2[i]){
    				r = mid - 1;
    			} else {
    				l = mid + 1;
    			}
    		}
    	}
    	int[] resultArray = new int[result.size()];
    	int i = 0;
    	for(Integer num : result){
    		resultArray[i++] = num;
    	}
    	return resultArray;
    }
}
