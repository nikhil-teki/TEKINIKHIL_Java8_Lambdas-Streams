package com.tekinikhil.lambdasAndStreams;

import java.util.List;
import java.util.function.Function;

public class AverageOfIntList 
{
	public static int findAverage(List<Integer> inputList)
	{
		Function<List<Integer>,Integer> findAvg=intlist->{int sum=0;for(int i:intlist)sum+=i;int listLength=intlist.size();return sum/listLength;};
		int averageOfList=findAvg.apply(inputList);
		return averageOfList;
	}
}
