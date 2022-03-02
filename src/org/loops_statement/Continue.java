package org.loops_statement;

public class Continue { 
	public static void main(String[] args) {
		for(int i=0; i<=20; i++) {
			if (i==19) {
				continue;
			}
			System.out.println(i);
		}
	}

}
