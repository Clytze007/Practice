package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.MatrixSearch;

public class MatrixSearchTest {

	@Test
	public void test() {
		MatrixSearch ms = new MatrixSearch();
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30,34,50}};
		
		assertEquals(true, ms.searchMatrix(matrix, 3));
		assertEquals(false, ms.searchMatrix(matrix, 4));
		assertEquals(true, ms.searchMatrix(matrix, 23));
		int[][] m = {};
		assertEquals(false, ms.searchMatrix(m, 1));
	}

}
