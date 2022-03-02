package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Details_of_map {
	public static void main(String[] args) {
		Map<Object,Object> kr=new HashMap<Object,Object>();
		kr.put('R', "KARTHIK");
		kr.put('R', "HARI HARAN");
		kr.put('p', "hari prasad");
		kr.put('d', "shalini");
		kr.put("null", "devi");
		kr.put('s', "null");
		kr.put('p', "mull");
		System.out.println(kr);
		Map<Object,String> hr=new LinkedHashMap<Object,String>();
		hr.put('p', "ravi");
		hr.put('r', "devi");
		hr.put('R', "karthik");
		hr.put('s', "lakshmi");
		System.out.println(hr);
		Map<Object,String>pr=new TreeMap<Object,String>();
		pr.put('2', "2000");
		pr.put('6',"1996");
		pr.put('1',"1574");
		pr.put('5', "87");
		System.out.println(pr);
		Object obj = kr.get('p');
		System.out.println(obj);
		Collection<String> val = hr.values();
		System.out.println(val);
		Set<Object> ks = pr.keySet();
		System.out.println(ks);
		int se = kr.size();
		System.out.println(se);
		int si = hr.size();
		System.out.println(si);
		int sz = pr.size();
		System.out.println(sz);
		boolean ck = hr.containsKey('k');
		System.out.println(ck);
		boolean cv = pr.containsValue("20000");
		System.out.println(cv);
		Set<Entry<Object, Object>> entrySet = kr.entrySet();
		System.out.println(entrySet);
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
			
			
		}
		
		
		
		
		
		
		}

}
