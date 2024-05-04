package com.psja;

//Given a String, find the first repeated character in it using Stream functions

import java.util.Set;
import java.util.HashSet;

public class FindFirstRepeatedCharacterStream {

	public static void main( String args[] ) {
		String data = "PSJA SJA";
		Set<Character> set = new HashSet<>();
		System.out.println(data.chars()
							.mapToObj(data1->(char)data1)
							.filter( data1-> !set.add(data1) )
							.findFirst());
	}
}
