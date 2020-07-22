package com.tekinikhil.lambdasAndStreams;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface StringPredicate
{
	boolean test(String string);
}
class StringPredicates
{
	public static boolean isPalindrome(String string)
	{
		int stringLength=string.length();
		for(int i=0;i<stringLength/2;i++)
		{
			char firstChar=string.charAt(i);
			char lastChar=string.charAt(stringLength-i-1);
			if(firstChar!=lastChar)
				return false;
		}
		return true;
	}
}

public class PalindromeChecker 
{
	public static List<String> findPalindromes(List<String> stringList)
	{
		List<String> palindromeList=new ArrayList<>();
		StringPredicate checkPalindrome=StringPredicates::isPalindrome;
		for(String string:stringList)
			if(checkPalindrome.test(string))
				palindromeList.add(string);
		return palindromeList;
	}
}
