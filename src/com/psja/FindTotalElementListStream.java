package com.psja;

//Given a list of integers, find the total number of elements present in the list using Stream functions

import java.util.List;
import java.util.Arrays;

public class FindTotalElementListStream {

	public static void main( String args[] ) {
		List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println(arrList
							.stream()
							.count());
	}
}
