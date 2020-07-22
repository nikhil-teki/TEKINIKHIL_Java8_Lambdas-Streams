package com.tekinikhil.lambdasAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringListWithA 
{
	public static List<String> checkIfStartsWithA(List<String> StringList)
	{
		Predicate<String> isCharA=string->(string.startsWith("a"));
		Predicate<String> isLength3=string->(string.length()==3);
		Function<List<String>,List<String>> checkA=inputList->
		{
			List<String> result=new ArrayList<>();
			for(String string:inputList)
				if((isCharA.test(string))&&(isLength3.test(string)))
					result.add(string);
			return result;
		};
		List<String> resultList=checkA.apply(StringList);
		return resultList;
	}
}
