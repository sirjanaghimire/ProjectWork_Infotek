package com.JavaProject;

public class BasicKnowledgeJava1_2 {
	int z;

	public int Subtraction(int x, int y) {
		z = x - y;

		return z;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to the Java class!");
		BasicKnowledgeJava1_2 obj = new BasicKnowledgeJava1_2();
		int subValue = obj.Subtraction(15, 10);
		System.out.println("The difference between the given numbers:" + subValue);

	}

}
