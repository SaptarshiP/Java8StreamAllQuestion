package com.psja;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions
import java.util.List;
import java.util.Arrays;

public class NumberWithOne {

	public static void main( String args[] ) {
		
		List<Integer> numList = Arrays.asList(100, 210, 200, 110, 500, 190);
		numList.stream()
				.map(data->data.toString())
				.filter(data->data.substring(0, 1).equals("1"))
				.forEach(System.out::println);
		
	}
}
