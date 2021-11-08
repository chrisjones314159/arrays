package com.qacommunity.qa;

public class enhancedForLoops {

	
	public static boolean method1(int num) {
		if (num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		
		int [] myArray = new int [10];
		
		for (int i =0; i < myArray.length; i++) {
			myArray[i] = (i+1)*3;
			System.out.println(myArray[i]);
		}
		
		
		System.out.println("\n");
		
		
		for (int i: myArray) {
			boolean booli = method1(i);
			
			if (booli) {
				System.out.println((i*i)*i);
			}
			else {
				System.out.println(i*i);
			}
		}
	}
}
