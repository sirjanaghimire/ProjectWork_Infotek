package com.JavaProject;

public class OperatorInJava_4 {
	int x;

	public int addition(int a, int b) {
		x = a + b;
		return x;
	}

	public int subExample(int a, int b) {
		x = a - b;
		return x;
	}

	public int multiExample(int a, int b) {
		x = a * b;
		return x;
	}

	public int diviexample(int a, int b) {
		x = a / b;
		return x;
	}

	public static void main(String[] args) {
		
		OperatorInJava_4 meth= new OperatorInJava_4();
		int total = meth.addition(10, 5);
		System.out.println("total addition is "+ total);
		
		int sub= meth.subExample(10, 5);
		System.out.println("total subtruction is "+ sub);
		
		int mul= meth.multiExample(10, 5);
		System.out.println("total multiplication is " + mul);
		
		int divd = meth.diviexample(10,5);
		System.out.println("total division is "+ divd);
		
	}

	

}
