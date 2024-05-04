package com.psja;

//Given a String, find the first non-repeated character in it using Stream functions

import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

public class FindFirstNonRepeatedCharacterStream {

	public static void main( String args[] ) {
		String data1 = "PASJPJ";
		Map<Character, Integer> mapped = new HashMap<>();
		System.out.println(data1.chars()
				.mapToObj(data->(char)data)
				.collect(Collectors.groupingBy( data->data, HashMap::new, Collectors.counting() ))
				.entrySet().stream().filter(data->data.getValue()==1)
				.findFirst());
				
	}
}
