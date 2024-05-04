package com.psja;

//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamFindEven {

	public static void main( String args[] ) {
		List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println(arrList.stream()
									.filter(data->data%2==0)
									.collect(Collectors.toList()));
		
	}
}
