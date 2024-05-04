package com.psja;

//To find the longest string from given array
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class FindLongestStringFromGivenArray {

	public static void main( String args[] ) {
		List<String> wordList = Arrays.asList("Shyamal", "Pampa", "Jyotsna", "Anima", "Saptarshi");
		Comparator<String> compare = new MyCustomComparator3();
		System.out.println( wordList.stream()
										.sorted(compare)
										.findFirst().get() );
	}
	
}
 class MyCustomComparator3 implements Comparator<String>{
	 
	 @Override
	 public int compare(String str1, String str2) {
		 if ( str1.length() < str2.length() ) 
			 return 1;
		 else if ( str1.length() > str2.length() ) 
			 return -1;
		 else
			 return 0;
	 }
 }