package org.non_primitive_datatype;

public class Array_task2 {
 public static void main(String[] args) {
	 int i[]= {1,2,3,4,5,6,7,8,9,10};
	float sum=0;
	for (int j = 0; j < i.length; j++) { 
		sum=sum+i[j];
		float avg=sum/i.length;
		
	
		System.out.println(avg);
	}	
		
	
	
		
	}
}

