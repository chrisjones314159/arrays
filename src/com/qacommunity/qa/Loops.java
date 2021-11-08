package com.qacommunity.qa;

public class Loops {
	
	
	public static void flowchart1() {
		int A = 100;
		while (A<=200) {
			System.out.println("A "+ A);
			A++;
		}
		System.out.println("Fin");
	}
	
	
	public static void flowchart2() {
		int A = 100;
		while (A<=200) {
			if (A%2 == 0) {
				System.out.println("- "+A);
				A++;
			}
			else {
				System.out.println("* "+A);
				A++;
			}
			
		}
	}
	
	
	public static void flowchart1AsForLoop(){
		for (int A=100; A<=200; A++) {
			System.out.println("A "+A);
		}
		System.out.println("Fin");
	}
	
	
	public static void timesTables() {
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			for (int j=1; j<=10; j++) {
				System.out.println(j);
			}
		}
	}

	
	public static void methodForTask5() {
		for (int i=1; i<=10; i++) {
			for (int j=i; j>0; j--) {
				System.out.println(i);
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
//		flowchart1();
//		flowchart2();
//		flowchart1AsForLoop();
		
//		timesTables();
//		methodForTask5();
	}

}
