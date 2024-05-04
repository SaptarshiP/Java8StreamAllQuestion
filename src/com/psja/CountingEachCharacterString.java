package com.psja;

//Write a program to print the count of each character in a String

import java.util.stream.Collectors;
import java.util.HashMap;

public class CountingEachCharacterString {

	public static void main( String args[] ) {
		String name = "PampaShyamalJyotsnaAnima";
		
		name.chars()
				.mapToObj(data->(char)data)
				.collect(Collectors.groupingBy(data->data, HashMap::new, Collectors.counting()))
				.entrySet()
				.forEach(System.out::println);
	}
	
}
