package com.psja;

//Write a Java 8 program to sort an array and then convert the sorted array into Stream\
import java.util.List;
import java.util.Arrays;

public class SortedArrayStream {

	public static void main( String args[] ) {
		
		Integer[] arr = {10,2,3,1,30,4,2};
		Arrays.sort(arr);
		Arrays.stream(arr)
				.forEach(System.out::println);
	}
	
}
