package com.mapConcepts;

import java.util.HashMap;

public class HashMap_02 {
	
	public static void example() {
		HashMap<String,Integer> hm = new HashMap<>();
        hm.put("asif",123);
        System.out.println(hm);
	}
	
	public static void example2() {
		HashMap hm2 = new HashMap<>();
        hm2.put("asif",123);
        hm2.put("nanadi", "abc");
        System.out.println(hm2);
	}

	public static void main(String[] args) {
		example();
		example2();

	}

}
