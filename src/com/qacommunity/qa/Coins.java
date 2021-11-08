package com.qacommunity.qa;

public class Coins {

	public static void changeMethod(double cost, double amount) {
		
		double changeAmount = amount-cost;
		System.out.println("£"+changeAmount+" change due.");
		
		int £20=0;
		int £10=0;
		int £5=0;
		int £2=0;
		int £1=0;
		int p50=0;
		int p20=0;
		int p10=0;
		int p5=0;
		int p2=0;
		int p1=0;
		
		
		while (changeAmount>=20) {
			changeAmount -=20;
			£20++;
		}
		while (changeAmount>=10) {
			changeAmount -=10;
			£10++;
		}
		while (changeAmount>=5) {
			changeAmount -=5;
			£5++;
		}
		while (changeAmount>=2) {
			changeAmount -=2;
			£2++;
		}
		while (changeAmount>=1) {
			changeAmount -=1;
			£1++;
		}
		while (changeAmount>=0.5) {
			changeAmount -=0.5;
			p50++;
		}
		while (changeAmount>=0.2) {
			changeAmount -=0.2;
			p20++;
		}
		while (changeAmount>=0.05) {
			changeAmount -=0.05;
			p5++;
		}
		while (changeAmount>=0.02) {
			changeAmount -=0.02;
			p2++;
		}
		while (changeAmount>=0.01) {
			changeAmount -=0.01;
			p1++;
		}
		
		
		System.out.println("£20: "+£20);
		System.out.println("£10: "+£10);
		System.out.println("£5: "+£5);
		System.out.println("£2: "+£2);
		System.out.println("£1: "+£1);
		System.out.println("50 pence: "+p50);
		System.out.println("20 pence: "+p20);
		System.out.println("10 pence: "+p10);
		System.out.println("5 pence: "+p5);
		System.out.println("2 pence: "+p2);
		System.out.println("1 pence: "+p1);
	}

	public static void main(String[] args) {
		changeMethod(10.99, 97.47);
	}

}
