package com.qacommunity.qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
	
	
	
	
	
	

	public static void main(String[] args) {
		
		List <String> pets = new ArrayList<>();
		
		pets.add("rabbit");
		pets.add("dog");
		pets.add("cat");
		pets.add("bird");
		
		for (String i : pets) {
			System.out.println(i);
		}
		
		
		System.out.println(pets.set(3, "hamster"));
		System.out.println(pets.get(3));
		pets.remove(1);
		Collections.sort(pets);
		
		
		for (int i = 0; i < pets.size(); i++) {
			System.out.println(pets.get(i));
		}

	}

}
