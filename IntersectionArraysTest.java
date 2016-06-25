package tests;


import java.util.Arrays;

import org.junit.Test;

import easy.IntersectionArrays;

public class IntersectionArraysTest {

	@Test
	public void test() {
		IntersectionArrays ia = new IntersectionArrays();
		int[] nums1 = {1,2};//{1, 2, 2, 1};
		int[] nums2 = {2,1};//{2, 2};
		System.out.println(Arrays.toString(ia.intersection(nums1, nums2)));
	}

}
