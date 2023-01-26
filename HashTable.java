package com.bridgelabs.collection;

import java.util.HashMap;

public class HashTable {

	public static void main(String[] args) 
	{
		HashMap<Integer, String>hashmap=new HashMap<>();
		hashmap.put(1, "Mandar");
		hashmap.put(2, "Bakal");
		
		hashmap.replace(2, "bakal");
		
		
		System.out.println(hashmap);

	}

}
