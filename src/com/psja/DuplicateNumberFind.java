package com.psja;

//How to find duplicate elements in a given integers list in java using Stream functions

import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class DuplicateNumberFind {

	public static void main( String args[] ) {
		List<Integer> arrList = Arrays.asList(1,2,3,2,5,1,6);
		Set<Integer> set = new HashSet<>();
		arrList.stream()
					.filter(n->!set.add(n))
					.forEach(System.out::println);
	}
	
}
