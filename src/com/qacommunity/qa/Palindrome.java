package com.qacommunity.qa;

import java.util.ArrayList;
import java.util.Collection;

public class Palindrome {
	
	
	public static void checkMethod(String word) {
		
		int wordLength = word.length(); 
		System.out.println(word.charAt(wordLength-1));
		
		if (word.charAt(1) == word.charAt(wordLength-1)) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("It's not.");
		}
	}
	


	public static void main(String[] args) {
		
		String word = "racecar";
		
		
		checkMethod(word);
	}

}
