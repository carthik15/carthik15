package org.non_primitive_datatype;

public class String_task2 {
	public static void main(String[] args) {
		String k="madam";
		String reverse="";
		int length = k.length();
		for (int i = length-1; i >=0; i--) {
			reverse=reverse+k.charAt(i);
			
			
		}
		System.out.println(reverse);
		if(k.contentEquals(reverse)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
