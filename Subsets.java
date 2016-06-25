package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets1(int[] nums) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	result.add(new ArrayList<Integer>());
    	for (int i = 0; i < nums.length; i++) {
    		int size = result.size();
    		for (int j = 0; j < size; j++) {
    			List<Integer> m = new ArrayList<Integer>(result.get(j));
    			m.add(nums[i]);
    			result.add(m);
    		}
    	}
        return result;
    }
    
    public List<List<Integer>> subsets2(int[] nums) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if (nums.length == 0) {
    		return result;
    	}
    	List<Integer> list = new ArrayList<Integer>();
    	int pos = 0;
    	subsetsHelper(result, list, nums, pos);
    	return result;
    }

	private void subsetsHelper(List<List<Integer>> result, List<Integer> list, int[] nums, int pos) {
		List<Integer> subset = new ArrayList<Integer>(list);
		result.add(subset);
		for (int i = pos; i < nums.length; i++) {
			list.add(nums[i]);
			subsetsHelper(result, list, nums, i + 1);
			list.remove(list.size() - 1);
		}
	}
	
    public List<List<Integer>> subsetsWithDup1(int[] nums) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 0) return result;
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        int pos = 0;
        
        subsetsWithDupHelper(result, list, nums, pos);
        
    	return result;
    }

	private void subsetsWithDupHelper(List<List<Integer>> result, List<Integer> list, int[] nums, int pos) {
		List<Integer> subset = new ArrayList<Integer>(list);
		result.add(subset);
		for (int i = pos; i < nums.length; i++){
			if (i != pos && nums[i] == nums[i - 1]){
				continue;
			}
			list.add(nums[i]);
			subsetsWithDupHelper(result, list, nums, i + 1);
			list.remove(list.size() - 1);
		}
	}
	
	//lintcode
	public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
		ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
		if (nums == null || nums.length == 0) {
			return subsets;
		}
		Arrays.sort(nums);
		subsets.add(new ArrayList<Integer>());
		for (Integer num : nums) {
			int subsetsSize = subsets.size();
			for (int i = 0; i < subsetsSize; i++) {
				ArrayList<Integer> subset = new ArrayList<Integer>(subsets.get(i));
				subset.add(num);
				subsets.add(subset);
			}
		}
		return subsets;
	}
	
	 public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
		ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
		if (S == null || S.size() == 0) {
			return subsets;
		}
		Collections.sort(S);
		ArrayList<Integer> path = new ArrayList<Integer>();
		int pos = 0;
		
		subsetsWithDupHelper(subsets, path, S, pos);
		return subsets;
		
	 }

	private void subsetsWithDupHelper(ArrayList<ArrayList<Integer>> subsets, ArrayList<Integer> path,
			ArrayList<Integer> s, int pos) {
		subsets.add(path);
		for (int i = pos; i < s.size(); i++) {
			if (i != pos && s.get(i) == s.get(i - 1)) {
				continue;
			}
			ArrayList<Integer> subset = new ArrayList<Integer>(path);
			subset.add(s.get(i));
			subsetsWithDupHelper(subsets, subset, s, i  + 1);
		}
		
	}
}
