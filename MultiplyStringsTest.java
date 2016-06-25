package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.MultiplyStrings;

public class MultiplyStringsTest {

	@Test
	public void test() {
		MultiplyStrings ms = new MultiplyStrings();
		assertEquals("1000", ms.multiply("10", "100"));
	}

}
