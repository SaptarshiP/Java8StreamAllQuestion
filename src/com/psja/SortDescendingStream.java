package com.psja;

//Given a list of integers, sort all the values present in it in descending order using Stream functions

import java.util.List;
import java.util.Arrays;


public class SortDescendingStream {

	public static int testCompare( Integer data1, Integer data2 ) {
		
		if ( data1 > data2 )
			return -1;
		else if ( data1 < data2 )
			return 1;
		else
			return 0;
	}
	
	public static void main( String args[] ) {
		List<Integer> arrList = Arrays.asList(10,2,3,1,30,4,2);
		
		arrList.stream()
				.sorted(SortDescendingStream::testCompare)
				.forEach(System.out::println);
	}
	
}
