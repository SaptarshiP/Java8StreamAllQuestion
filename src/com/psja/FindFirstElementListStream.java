package com.psja;

//Given the list of integers, find the first element of the list using Stream functions
import java.util.List;
import java.util.Arrays;

public class FindFirstElementListStream {

	public static void main( String args[] ) {
		List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8);
		arrList.stream()
					.findFirst()
					.ifPresent(System.out::println);
	}
	
}
