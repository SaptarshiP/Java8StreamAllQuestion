package com.psja;

//Find the second highest number in given array

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SecondHighestNumberArray {

	public static void main( String args[] ) {
		//Integer[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Comparator<Integer> comparator = new CustomComparatorSecond();
		List<Integer> dataList = Arrays.asList(arr)
										.stream().sorted(comparator)
										.collect(Collectors.toList());
		
		System.out.println(dataList.get(1));
	}
	
}

class CustomComparatorSecond implements Comparator<Integer>{
	
	@Override
	public int compare( Integer num1, Integer num2 ) {
		if ( num1 <num2 )
			return 1;
		else if ( num1 >num2 )
			return -1;
		else 
			return 0;
	}	
	
}
