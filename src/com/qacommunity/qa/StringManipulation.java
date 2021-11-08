package com.qacommunity.qa;

public class StringManipulation {

	
	
	
	public static void main(String[] args) {
		
		String first = "yesterday it was raining";
		String second = "today it is sunny";
		
		String combined = second.concat(", "+first+".");
		combined = combined.toUpperCase();
		
		System.out.println(combined);
		System.out.println(combined.substring(0, 11) + combined.substring(35, 43));
	}
}
