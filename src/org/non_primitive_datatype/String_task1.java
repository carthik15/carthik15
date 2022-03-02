package org.non_primitive_datatype;

public class String_task1 {
	
	public static void main(String[] args) {
		
		String k="Hello";
		String reverse="";
		int length = k.length();
		
		for (int i =length-1; i>=0; i--) {
			reverse =reverse+ k.charAt(i);
		}	
			System.out.println(reverse);
			
		
		
	}

}
