package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute1(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if (nums.length == 0) {
        	return result;
        }
    	List<Integer> list = new ArrayList<Integer>();
    	permuteHelper1(result, list, nums);
    	return result;
    }

	private void permuteHelper1(List<List<Integer>> result, List<Integer> list, int[] nums) {
		List<Integer> permutation = new ArrayList<Integer>(list);
		if (nums.length == 0) {
			result.add(permutation);
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
			permuteHelper1(result, list, removeElmAt(nums, i));
			list.remove(list.size() - 1);
		}
	}
	
	private int[] removeElmAt(int[] array, int pos) {
		int[] result = new int[array.length - 1];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i != pos){
				result[j++] = array[i];
			}
		}
		return result;
	}
	
	//recursive
    public List<List<Integer>> permuteUnique1(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) return result;
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        permuteUniqueHelper(result, list, nums);
        
        return result;
    }
	
	
	private void permuteUniqueHelper(List<List<Integer>> result, List<Integer> list, int[] nums) {
		if (nums.length == 0) {
			result.add(list);
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (i != 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			List<Integer> permutation = new ArrayList<Integer>(list);
			permutation.add(nums[i]);
			permuteUniqueHelper(result, permutation, removeElmAt(nums, i));;
		}
		
	}
	
	//iterative
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) return result;
        result.add(new ArrayList<Integer>());
        HashSet<List<Integer>> noDup = new HashSet<List<Integer>>();
        for (int pos = 0; pos < nums.length; pos++) {
        	int sizeOfResult = result.size();
        	for (int i = 0; i < sizeOfResult; i++) {
        		for (int j = 0; j <= result.get(0).size(); j++) {
        			ArrayList<Integer> permutation = new ArrayList<Integer>(result.get(0));
        			permutation.add(j, nums[pos]);
        			if (!noDup.contains(permutation)) {
            			result.add(permutation);
        				noDup.add(permutation);
        			}
        		}
        		result.remove(0);
        	}
        }
        return result;
    }

	//lintCode
	public ArrayList<ArrayList<Integer>> permute1(ArrayList<Integer> nums) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if (nums.size() == 0) {
        	return result;
        }
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	permuteHelper(result, list, nums);
    	return result;
    }

	private void permuteHelper(ArrayList<ArrayList<Integer>> result, List<Integer> list, ArrayList<Integer> nums) {
		ArrayList<Integer> permutation = new ArrayList<Integer>(list);
		if (nums.size() == 0) {
			result.add(permutation);
			return;
		}
		for (int i = 0; i < nums.size(); i++) {
			list.add(nums.get(i));
			ArrayList<Integer> reducedNums = new ArrayList<Integer>(nums);
			reducedNums.remove(i);
			permuteHelper(result, list, reducedNums);
			list.remove(list.size() - 1);
		}
	}
	
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (nums == null) return result;
		result.add(new ArrayList<Integer>());
		for (Integer num : nums) {
			int resultSize = result.size();
			for (int i = 0; i < resultSize; i++) {
				for (int j = 0; j <= result.get(0).size(); j++) {
					ArrayList<Integer> permutation = new ArrayList<Integer>(result.get(0));
					permutation.add(j, num);
					result.add(permutation);
				}
				result.remove(0);
			}
		}
    	return result;
    }
	
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
    	ArrayList<ArrayList<Integer>> permutations = new ArrayList<ArrayList<Integer>>();
    	if (nums == null || nums.size() == 0) return permutations;
    	ArrayList<Integer> path = new ArrayList<Integer>();
    	Collections.sort(nums);
    	permuteUniqueHelper(permutations, path, nums);
    	return permutations;
    }

	private void permuteUniqueHelper(ArrayList<ArrayList<Integer>> permutations, ArrayList<Integer> path,
			ArrayList<Integer> nums) {
		if (nums.size() == 0) {
			permutations.add(path);
			return;
		}
		for (int i = 0; i < nums.size(); i++) {
			if (i != 0 && nums.get(i - 1) == nums.get(i)){continue;}
			ArrayList<Integer> permutation = new ArrayList<Integer>(path);
			permutation.add(nums.get(i));
			ArrayList<Integer> reducedNums = new ArrayList<Integer>(nums);
			reducedNums.remove(i);
			permuteUniqueHelper(permutations, permutation, reducedNums);
		}
		
	}
}
