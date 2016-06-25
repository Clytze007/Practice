package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.AddDigits;

public class AddDigitsTest {

	@Test
	public void test() {
		AddDigits ad = new AddDigits();
		assertTrue(ad.addDigits(1)==1);
		assertTrue(ad.addDigits(376)==7);
		assertTrue(ad.addDigits(498)==3);
	}

}
