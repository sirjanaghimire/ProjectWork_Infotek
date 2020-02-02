package com.JavaProject;

public class EvevIntegerArray_13 {
	

	public static void main(String[] args) {
		int[] arra= {1,2,3,4,5,6,7,8,9,10};

		int noOfMatched=0;
		
		for (int i=0; i<arra.length; i++) {
			
			if(arra[i]%2==0) {
				
				noOfMatched++;
			}
		}
		
		System.out.println(noOfMatched);
	}

}
