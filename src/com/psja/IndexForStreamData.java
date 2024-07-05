package com.psja;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * This method is used for filtering a particular character and provide the index of the character
 * */

public class IndexForStreamData {

	public static void main( String args[] ) {
		String str = "Saptarshi is a Java developer";
		List<Character> charArr = str.chars()
									.mapToObj(data->(char)data)
									.collect(Collectors.toList());
				
				
		List<String> indexList = IntStream.range(0, charArr.size())
											.filter(t-> charArr.get(t)=='a')
											.mapToObj(data->String.valueOf( data ))
											.collect(Collectors.toList());
		
		System.out.println(indexList);
		
				
	}
	
}
