package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.NimGame;

public class NimGameTest {

	@Test
	public void test() {
		NimGame ng = new NimGame();
		assertTrue(ng.canWinNim1(1));
		assertFalse(ng.canWinNim1(8));
	}

}
