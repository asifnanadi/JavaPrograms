package com.mapConcepts;

import java.util.HashMap;
//1. Duplicate keys are not allowed
//2. Duplicate values are allowed
//3. Only one Null key is allowed
//4. n number of Null values are allowed
//5. Insertion order is not preserved
public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, String> m = new HashMap<>();
		m.put("asif", "111");
		m.put("nanadi", "555");
		m.putAll(m);
		m.put("Null", "222");
		m.put("Null", "444");// This will be replaced and printed. Because only one Null is allowed
		m.put("FirstNullValue", "Null");
		m.put("SecondNullValue", "Null");
		m.remove("nanadi");

		System.out.println(m);
		System.out.println(m.get("asif"));
		System.out.println(m.containsKey("nanadi"));// false, because this is removed at line 18
		System.out.println(m.containsValue("444")); // true
		System.out.println(m.isEmpty());// false
		System.out.println(m.size());;
	}

}
