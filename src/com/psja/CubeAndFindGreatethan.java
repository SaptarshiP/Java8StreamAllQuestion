package com.psja;

import java.util.Arrays;
//Java 8 program to perform cube on list elements and filter numbers greater than 50
import java.util.List;


public class CubeAndFindGreatethan {

	public static void main( String args[] ) {
		
		List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8);
		
		arrList.stream()
				.map(data->Math.pow(data, 3))
				.filter(data->data>50)
				.forEach(System.out::println);
		
	}
	
}
