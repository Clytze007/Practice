package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.ReverseStr;

public class ReverseStrTest {

	@Test
	public void test() {
		ReverseStr rs = new ReverseStr();
		assertEquals("olleH", rs.reverseString("Hello"));
		assertEquals("", rs.reverseString(""));
		assertEquals("a", rs.reverseString("a"));
	}
	
	@Test
	public void test1() {
		ReverseStr rs = new ReverseStr();
		assertEquals("olleH", rs.reverseString2("Hello"));
		assertEquals("", rs.reverseString2(""));
		assertEquals("a", rs.reverseString2("a"));
	}
	
	

}
