package com.psja;

//A join method is used and skip and limit.
import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StringJoinStream {

	public static void main( String args[] ) {
		List<String> arrList = Arrays.asList("saptarshi", "pampa", "shyamal", "jyotsna", "anima");
		
		System.out.println( String.join("->", arrList) );
		
		IntStream.range(1, 10)
					.skip(3)
					.limit(7)
					.forEach(System.out::println);
	}
	
}
