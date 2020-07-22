package com.tekinikhil.lambdasAndStreams;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StringListWithATest {

	@Test
	public void testCheckIfStartsWithA() 
	{
		List<String> inputList=Arrays.asList("abc ","","abb","123454321","nikhil","and");
		String[] expectedList={"abb","and"};
		Object[] realList=StringListWithA.checkIfStartsWithA(inputList).toArray();
		assertArrayEquals(expectedList,realList);
	}
	@Test
	public void test1CheckIfStartsWithA() 
	{
		List<String> inputList=Arrays.asList("abc","","ab1","a12","add","and");
		String[] expectedList={"abc","ab1","a12","add","and"};
		Object[] realList=StringListWithA.checkIfStartsWithA(inputList).toArray();
		assertArrayEquals(expectedList,realList);
	}
	@Test
	public void test2CheckIfStartsWithA() 
	{
		List<String> inputList=Arrays.asList("abc ","","ab1fg","112","dadd","sai");
		String[] expectedList={};
		Object[] realList=StringListWithA.checkIfStartsWithA(inputList).toArray();
		assertArrayEquals(expectedList,realList);
	}
}
