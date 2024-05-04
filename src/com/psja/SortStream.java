package com.psja;

//Given a list of integers, sort all the values present in it using Stream functions
import java.util.List;
import java.util.Arrays;

public class SortStream {

	public static void main( String args[] ) {
		List<Integer> arrList = Arrays.asList(10,2,3,1,30,4,2);
		arrList.stream()
				.sorted()
				.forEach(System.out::println);
		
	}
	
}
