package com.psja;

//How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.Collections;

public class OptionalCheckEmpty {

	public static void main( String args[] ) {
		Optional<List<Integer>> optionalArrList = Optional.ofNullable(Arrays.asList(1,2));
//		optionalArrList.orElseGet(Collections::emptyList)
//						.stream()
	}
	
}
