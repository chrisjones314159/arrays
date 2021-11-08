package com.qacommunity.qa;

public class LargestPrimeFactor {

	public static void primeFactorFinder(int num) {

		for (int i = num - 1; i > 1; i--) {
			if (num % i == 0) {
				int multiplier = num/i;
				System.out.println(i+" is a factor of "+num+"  "+multiplier);
			}
			else {
				System.out.println(i+" is not a factor of "+num);
			}
		}
	}

	public static void main(String[] args) {
		primeFactorFinder(104);
	}
}