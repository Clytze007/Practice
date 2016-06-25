package tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import easy.Subsets;

public class SubsetsTest {

	@Test
	public void test() {
		Subsets ss = new Subsets();
		int[] nums = {4, 1, 0};
		List<List<Integer>> result = ss.subsets2(nums);
		System.out.println(result.toString());
		System.out.println(ss.subsets(nums).toString());
		
		int[] numsDup = {1, 2, 2};
		List<List<Integer>> resultDup = ss.subsetsWithDup1(numsDup);
		System.out.println(resultDup.toString());
		
		ArrayList<Integer> numsDupList = new ArrayList<Integer>();
		numsDupList.add(1);
		numsDupList.add(2);
		numsDupList.add(2);
		System.out.println(ss.subsetsWithDup(numsDupList).toString());
	}

}
