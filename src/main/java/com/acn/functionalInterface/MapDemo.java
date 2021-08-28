package com.acn.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

	public static void main(String[] args) {

		// HashTable don't allow null key and value and its scnchronized
		Hashtable<String,Integer> map=new Hashtable<>();

		// ByDefault maintains ascending order based on key
		// don't allow null key and value and its scnchronized
		//ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

		// HashMap allow null key and value
		// ByDefault maintains order based hashing
		// HashMap<String,Integer> map=new HashMap<String,Integer>();

		// ByDefault maintains insertion order based on key
		// LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();

		// ByDefault maintains ascending order based on key
		// TreeMap cannot have a null key but can have multiple null values.
		// TreeMap is non synchronized.
		// TreeMap<String,Integer> map=new TreeMap<String,Integer>();

		// Collections.synchronizedMap(map);//Synchronized map

		map.put("B", 1000);
		map.put("A", 4000);
		map.put("C", 3000);
		map.put("Z", 2000);
		// map.put(null,null);
		// map.put("X",null);

		// Retrive using key Set
		System.out.println(
				"*****************Using TreeMap value are retrived in descending order by default*****************");
		Set<String> keySet = map.keySet();
		for (String s : keySet) {
			System.out.println("Key Value pair-> " + s + ":" + map.get(s));
		}

		// Retrive using Map.Entry
		/*
		 * Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
		 * for(Map.Entry<String,Integer> hm:entrySet) {
		 * //System.out.println("Key Value pair--> "+hm.getKey()+":"+map.get(hm.getKey()
		 * )); System.out.println("Key Value pair--> "+hm.getKey()+":"+hm.getValue());
		 * 
		 * }
		 */

		Map<Integer, String> hm = new HashMap<>();// using hashMap performing sorting according to key value
		hm.put(45, "Ramesh");
		hm.put(99, "Prakash");
		hm.put(65, "Puja");
		hm.put(66, "Punam");
		hm.put(100, "Raju");
		hm.put(98, "Amesh");
		System.out.println("*****************Sorting using value of Map*****************");
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(i -> System.out.println(i.getKey() + ":" + i.getValue()));

		System.out.println("*****************Sorting using Key of Map*****************");
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(i -> System.out.println(i.getKey() + ":" + i.getValue()));

		Map<Integer, Book> bookMap = new ConcurrentHashMap<>();
		bookMap.put(1, new Book("Java Programming", "Ken Arnold", 30));
		bookMap.put(2, new Book("C inDepth", "Scott Ambler", 50));
		bookMap.put(3, new Book("C++ OOPS", "Bruce Eckel", 20));
		bookMap.put(4, new Book("Head First Java", "Kathy Sierra", 80));

		System.out.println("*********************************************************");
		List<Book> bList = new ArrayList<>();
		for (Map.Entry<Integer, Book> mb : bookMap.entrySet()) {
			Book obj = mb.getValue();
			bList.add(obj);
			System.out.println("Key:  " + mb.getKey() + "  :Contains below Book details:");
			System.out.println("Book Name:" + obj.getName() + "  Author Name:" + obj.getAuthName() + "  Price:"
					+ obj.getPrice() + "\n");

		}
		System.out.println("******************Sorting Books a/c to price/AuthName**************************");

		Comparator c = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {

				// return (int) (o1.getPrice()-o2.getPrice());
				return (int) (o1.getAuthName().compareTo(o2.getAuthName()));

			}
		};
		bList.sort(c);
		bList.stream().forEach(i -> System.out.println(i.getName() + "---" + i.getAuthName() + "---" + i.getPrice()));

	}

}
