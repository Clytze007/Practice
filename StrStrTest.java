package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.StrStr;

public class StrStrTest {

	@Test
	public void test() {
		StrStr ss = new StrStr();
		assertEquals(ss.strStr("abc", "bc"), 1);
	}

}
