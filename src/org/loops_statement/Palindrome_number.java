package org.loops_statement;

public class Palindrome_number {
	public static void main(String[] args) {
		int k=515,r;
		int ans=0,temp;
		temp=k;
		 while(k>0) {
			 r=(k%10);
			 k=(k/10);
			 ans=(ans*10)+r;
		 }
		 if (temp==ans) {
			 System.out.println("this is a palindrome number");
		 }else {
			 System.out.println("this is not a palindrome number");
		 }
		
	}

}
