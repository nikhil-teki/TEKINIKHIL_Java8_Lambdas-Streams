package com.tekinikhil.lambdasAndStreams;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AverageOfIntListTest {

	@Test
	public void testFindAverage() {
		List<Integer> inputList=Arrays.asList(40,40,40);
		int expectedAvg=40;
		int realAvg=AverageOfIntList.findAverage(inputList);
		assertEquals(expectedAvg,realAvg);
	}
	@Test
	public void test1FindAverage() {
		List<Integer> inputList=Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		int expectedAvg=55;
		int realAvg=AverageOfIntList.findAverage(inputList);
		assertEquals(expectedAvg,realAvg);
	}
	@Test
	public void test2FindAverage() {
		List<Integer> inputList=Arrays.asList(40,40,40,50);
		int expectedAvg=42;
		int realAvg=AverageOfIntList.findAverage(inputList);
		assertEquals(expectedAvg,realAvg);
	}
}
