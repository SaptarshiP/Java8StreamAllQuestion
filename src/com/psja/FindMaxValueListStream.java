package com.psja;

//Given a list of integers, find the maximum value element present in it using Stream functions
import java.util.List;
import java.util.Arrays;

public class FindMaxValueListStream {

	public static void main( String args[] ) {
		List<Integer> arrList = Arrays.asList(9,8,7,6,5,4,3,2,10,10);
		System.out.println( arrList.stream()
									.max((data1, data2)->{
										if ( data1>data2 ) 
											return 1;
										else if (data1 < data2)
											return -1;
										else
											return 0;
									})
									.get() );
	}
	
}
