package com.qa.java_tasks;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			fizzBuzz(i);
		}
}

	private static void fizzBuzz(double input) {

		double divisBy3 = (input % 3);
		double divisBy5 = (input % 5);

		if (divisBy3 == 0 && divisBy5 != 0) {
			System.out.println("Fizz");
		} else if (divisBy3 != 0 && divisBy5 == 0) {
			System.out.println("Buzz");
		} else if (divisBy3 == 0 && divisBy5 == 0) {
			System.out.println("FizzBuzz");
		} else {
			System.out.println(input);
		}
	}

}