package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import medium.FirstBadVersion;
import utils.SVNRepo;

public class FirstBadVersionTest {

	@Test
	public void test() {
		FirstBadVersion fbv = new FirstBadVersion();
		boolean[] bads = {false, false, false, true, true};
		SVNRepo.isBadVerions = bads;
		assertEquals(4, fbv.findFirstBadVersion(5));
		boolean[] bads2 = {false, false, false, false, false};
		SVNRepo.isBadVerions = bads2;
		assertEquals(0, fbv.findFirstBadVersion(5));
	}

}
