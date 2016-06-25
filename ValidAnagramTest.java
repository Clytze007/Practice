package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.ValidAnagram;

public class ValidAnagramTest {

	@Test
	public void test() {
		ValidAnagram va = new ValidAnagram();
		assertEquals(va.isAnagram("abc", "bac"), true);
	}

}
