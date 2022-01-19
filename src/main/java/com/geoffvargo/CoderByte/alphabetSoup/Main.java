package com.geoffvargo.CoderByte.alphabetSoup;

import java.util.*;

/**
 * Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with
 * the letters in alphabetical order (i.e. hello becomes ehllo). Assume numbers and punctuation symbols will
 * not be included in the string.
 */
class Main {
	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(AlphabetSoup(s.nextLine()));
	}
	
	public static String AlphabetSoup(String str) {
		// code goes here
		StringBuilder ans = new StringBuilder();
		
		List<String> temp = new ArrayList<>(Arrays.asList(str.split("")));
		
		temp.sort(null);
		
//		temp.forEach(System.out::println);
		
		for (String s : temp) {
			ans.append(s);
		}
		
		return ans.toString();
	}
}
