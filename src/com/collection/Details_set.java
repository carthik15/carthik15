package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Details_set {
	public static void main(String[] args) {
		Set<Object> rk=new HashSet<Object>();
		rk.add("hello");
		rk.add("sir");
		rk.add("how");
		rk.add("are");
		rk.add("you?");
		rk.add("hello");
		rk.add(null);
		rk.add(null);
		System.out.println(rk);
		Set<Object> rk1=new LinkedHashSet<Object>();
		rk1.add("hello");
		rk1.add("im");
		rk1.add("fine");
		rk1.add("sir");
		rk1.add(null);
		rk1.add(null);
		System.out.println(rk1);
		Set<Object> rk2=new TreeSet<Object>();
		rk2.add(96);
		rk2.add(85);
		rk2.add(14);
		rk2.add(99);
		rk2.add(24);
		
		System.out.println(rk2);
		int s = rk.size();
		System.out.println(s);
		int s1 = rk1.size();
		System.out.println(s1);
		boolean fg = rk2.equals(rk1);
		System.out.println(fg);
		boolean com = rk2.contains(5);
		System.out.println(com);
		rk.clear();
		System.out.println(rk);
		rk1.addAll(rk2);
		System.out.println(rk1);
		rk.retainAll(rk1);
		System.out.println(rk);
		
		}

}
