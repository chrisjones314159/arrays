package com.qacommunity.qa;

public class Arrays {

	
	
	
	
	public static void main(String[] args) {
		
		int [] myArray = new int [10];
		
		myArray[0] = 4;
		myArray[1] = 5;
		myArray[2] = 0;
		myArray[3] = 6;
		myArray[4] = 8;
		myArray[5] = 45;
		myArray[6] = 80;
		myArray[7] = 26;
		myArray[8] = 46;
		myArray[9] = 9;
		
//		for (int arrayItem : myArray) {
//			System.out.println(arrayItem);
//		}
		
		int [] myArray2 = new int [10];
		
		for (int i=0; i<myArray2.length; i++) {
			myArray2[i] = (i +1)*3;
			System.out.println(myArray2[i]);
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < myArray2.length; i++) {

			myArray2[i] = (i*10);
			System.out.println(myArray2[i]);
		}
		
//		for (int arrayIndex : myArray2) {
//			System.out.println(arrayIndex);
//		}
	}
}
