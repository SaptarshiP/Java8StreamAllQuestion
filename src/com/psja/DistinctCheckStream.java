package com.psja;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class DistinctCheckStream {

	public static void main( String args[] ) {
		
		Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 2};
		List<Integer> arrList = Arrays.asList(arr);
		Set<Integer> set = new HashSet<>(arrList);
		if ( arrList.size() == set.size() ) {
			System.out.println(false);
		}else
			System.out.println(true);
	}
}
