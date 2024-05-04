package com.psja;

//How to count each element/word from the String ArrayList in Java8
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashMap;

public class CountStringFrequence {

	public static void main( String args[] ) {
		List<String> arrList = Arrays.asList("Shyamal", "Pampa", "Shyamal", "Jyotsna", "Anima", "Saptarshi");
		
		arrList.stream()
				.collect( Collectors.groupingBy( data->data, HashMap::new, Collectors.counting() ) )
				.entrySet()
				.forEach( System.out::println );
	}
	
}
