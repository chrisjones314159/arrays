package com.qacommunity.qa;

public class BottlesOfBeer {

	public static void bottlesOfBeerMethod() {
		
		for (int bottlesOfBeer=99; bottlesOfBeer>0;) {
			System.out.println(bottlesOfBeer+" bottles of beer on the wall, "+bottlesOfBeer+" bottles of beer.");
			bottlesOfBeer--;
			System.out.println("Take one down and pass it around, "+bottlesOfBeer+" bottles of beer on the wall."+"\n");
		}
	}
	
	
	
	public static void main(String[] args) {
		bottlesOfBeerMethod();
	}
}
