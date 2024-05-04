package com.psja;

//How to use map to convert object into Uppercase in Java 8
import java.util.List;
import java.util.Arrays;

public class UpperCaseChange {

	public static void main( String args[] ) {
		List<String> nameList = Arrays.asList("saptarshi", "Pampa", "Shyamal", "jyotSna", "aniMa");
		nameList.stream()
				.map(data->data.toUpperCase())
				.forEach(System.out::println);
	}
	
}
