package com.JavaProject;

import java.util.*;

public class StaticalDoubleDataVariable_12 {

	public static void main(String[] args) {

		List<Double> list = new ArrayList<>();
		for(int i=1; i<26 ;i ++) {
			
			list.add(5.0*i);
		}
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
