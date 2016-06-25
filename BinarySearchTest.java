package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.BinarySearch;

public class BinarySearchTest {

	@Test
	public void test() {
		BinarySearch bs  = new BinarySearch();
		int[] nums = {1, 2, 2, 4, 5, 5};
		
		assertEquals(2, bs.findPosition(nums, 2));
		assertEquals(4, bs.findPosition(nums, 5));
		assertEquals(-1, bs.findPosition(nums, 6));
		
		assertEquals(1, bs.findFirstPosition(nums, 2));
		assertEquals(4, bs.findFirstPosition(nums, 5));
		assertEquals(-1, bs.findFirstPosition(nums, 6));
		
		assertEquals(2, bs.findLastPosition(nums, 2));
		assertEquals(5, bs.findLastPosition(nums, 5));
		assertEquals(-1, bs.findLastPosition(nums, 6));
	}

}
