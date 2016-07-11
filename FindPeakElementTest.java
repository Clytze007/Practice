package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import medium.FindPeakElement;

public class FindPeakElementTest {

	@Test
	public void test() {
		FindPeakElement fpe = new FindPeakElement();
		int[] nums = {1, 2, 1, 3, 4, 5, 7, 6};
		int[] nums2 = {1,10,9,8,7,6,5,4};
		assertEquals(6, fpe.findPeak(nums));
		System.out.println(fpe.findPeak(nums2));
	}

}
