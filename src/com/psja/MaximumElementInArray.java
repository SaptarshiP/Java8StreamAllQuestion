package com.psja;

//Write a Program to find the Maximum element in an array
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class MaximumElementInArray {

	public static void main( String args[] ) {
		List<Integer> arrList = Arrays.asList(9,8,7,6,5,4,3,2,1);
		Comparator<Integer> comparatorClass = new ComparatorClass();
		System.out.println(arrList.stream()
									.sorted( comparatorClass )
									.findFirst()
									.get());
	}
	
}

class ComparatorClass implements Comparator<Integer>{
	
	@Override
	public int compare( Integer a, Integer b ) {
		if ( a>b )
			return -1;
		else if ( a<b )
			return 1;
		else
			return 0;
	}
	
}
