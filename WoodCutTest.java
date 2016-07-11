package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import medium.WoodCut;

public class WoodCutTest {

	@Test
	public void test() {
		WoodCut wc = new WoodCut();
		int[] woods = {232, 124, 456};
		assertEquals(114, wc.woodCut(woods, 7));
	}

}
