package com.JavaProject;

import java.util.ArrayList;
import java.util.List;

public class TraverseIntegerArrayList_14 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		for (int i = list1.size() - 1; i >= 0 ; i--) {
			System.out.println(list1.get(i));
		}
		
	}

}
