package com.goldilocks;

import java.util.HashMap;

public class HashMapOperation {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Naveen", 25);
		map.put("Amit",26);
		map.put("Ravi", 28);
		map.put("Sonu", 24);
		
		
		// Searching and printing values based on keys
        String[] names = {"Naveen", "Ravi", "Abhishek"};

        for(String name: names) {
            if (map.containsKey(name)) {
                System.out.println("Name - " + name + ", age - " + map.get(name));
            } else {
                System.out.println(name + " not present");
            }
        }
		
	}
}
