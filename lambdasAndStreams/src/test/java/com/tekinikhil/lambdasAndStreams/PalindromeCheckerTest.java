package com.tekinikhil.lambdasAndStreams;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PalindromeCheckerTest {

	@Test
	public void testFindPalindromes() {
		List<String> inputList=Arrays.asList("abcd","a","abba","123454321","nikhil","123321");
		String[] expectedList={"a","abba","123454321","123321"};
		Object[] realList=PalindromeChecker.findPalindromes(inputList).toArray();
		assertArrayEquals(expectedList,realList);
	}
	@Test
	public void test1FindPalindromes() {
		List<String> inputList=Arrays.asList("1","epam");
		String[] expectedList={"1"};
		Object[] realList=PalindromeChecker.findPalindromes(inputList).toArray();
		assertArrayEquals(expectedList,realList);
	}
	@Test
	public void test2FindPalindromes() {
		List<String> inputList=Arrays.asList("12","epam");
		String[] expectedList={};
		Object[] realList=PalindromeChecker.findPalindromes(inputList).toArray();
		assertArrayEquals(expectedList,realList);
	}
}
