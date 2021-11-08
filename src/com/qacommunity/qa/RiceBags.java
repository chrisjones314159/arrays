package com.qacommunity.qa;

public class RiceBags {

	
	public static boolean riceBagsMethod(int smallBags, int largeBags, int goalInKGs) {
		int smallBagsAmount = smallBags*1;
		int largeBagsAmount = largeBags*5;
		int total = smallBagsAmount+largeBagsAmount;
		
		if (total>=goalInKGs) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(riceBagsMethod(3, 5, 14));
	}
}
