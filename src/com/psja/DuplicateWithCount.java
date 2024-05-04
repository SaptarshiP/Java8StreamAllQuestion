package com.psja;

//How to find only duplicate elements with its count from the String ArrayList in Java8
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.HashMap;

public class DuplicateWithCount {

	public static void main( String args[] ) {
		List<String> arrList = Arrays.asList("Shyamal", "Pampa", "Shyamal", "Jyotsna", "Anima", "Saptarshi");
		arrList.stream()
				.collect( Collectors.groupingBy(data->data, HashMap::new, Collectors.counting())  )
				.entrySet()
				.stream()
				.filter( data->data.getValue()>1 )
				.forEach(System.out::println);
		
	}
	
}
