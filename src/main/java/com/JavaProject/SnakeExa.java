package com.JavaProject;

public class SnakeExa extends AnimalExample_10 {

	public void hiss() {
		 System.out.println("Hiss.....");
	}
	public static void main(String[] args) {
		
		SnakeExa output = new SnakeExa();
		output.eat();
		output.hiss();

	}

}
