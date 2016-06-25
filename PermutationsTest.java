package tests;

import java.util.ArrayList;

import org.junit.Test;

import easy.Permutations;

public class PermutationsTest {

	@Test
	public void test() {
		Permutations p = new Permutations();
		int[] nums = {1,2,2};
//		System.out.println(p.permute1(nums).toString());
		System.out.println(p.permuteUnique1(nums).toString());
		System.out.println(p.permuteUnique(nums).toString());
		
		ArrayList<Integer> numsList = new ArrayList<Integer>();
		numsList.add(1);
		numsList.add(2);
		numsList.add(2);
//		System.out.println(p.permute(numsList).toString());
		System.out.println(p.permuteUnique(numsList).toString());
	}

}
