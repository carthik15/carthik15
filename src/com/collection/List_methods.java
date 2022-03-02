package com.collection; 
import java.util.ArrayList;
import java.util.List;

public class List_methods {
	public static void main(String[] args) {
		List<Object> list =new ArrayList<Object>();
		System.out.println(list);
		list.add("karthik");
		list.add(25);
		list.add("java");
		list.add(2548);
		list.add("cars");
		  list.add("java");
		System.out.println(list);
	 
	
		
		list.add("bikes");
		System.out.println(list);
		int s = list.size();
		System.out.println(s);
		Object r = list.get(2);
		System.out.println(r);
		list.set(4, 340);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		int i = list.indexOf(25);
		System.out.println(i);
		boolean c = list.contains("jeep");
		System.out.println(c);
		boolean equals = list.equals(25);
		System.out.println(equals);
		int lastIndexOf = list.lastIndexOf("java");
		System.out.println(lastIndexOf);
	}

}
