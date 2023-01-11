package com.cognixia.jump.strings;

public class ReverseString {

	public static void main(String[] args) {
		String word = "Hello world";
		
		for(int i = word.length(); i > 0; --i) {
			System.out.print(word.charAt(i-1));
		}


	}

}
