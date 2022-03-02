package org.loops_statement;

public class fibanacci_series {
	public static void main(String[] args) {
		int k1=10, k2=20, k3;
		System.out.println(k1);
		System.out.println(k2);
		for(int i=0; i<=10; i++) {
		k3=k2+k1;
		System.out.println(k3);
		k1=k2;
		k2=k3;
		
		
	}
	}
}
