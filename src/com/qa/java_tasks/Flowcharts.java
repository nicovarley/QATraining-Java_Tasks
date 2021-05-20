package com.qa.java_tasks;

public class Flowcharts {
	public static void main(String[] args) {

		System.out.println(addOrMultiply(3, 6, true));
		System.out.println(addOrMultiply(3, 6, false));

		isItBiggerThan2000(2600);

	}

	private static int addOrMultiply(int inp1, int inp2, boolean inp3) {

		if (inp3 == true) {
			return inp1 + inp2;
		} else {
			return inp1 * inp2;
		}
	}

	private static void isItBiggerThan2000(int It) {

		if (It > 2000) {
			System.out.println("A");
			if (It > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (It > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (It > 100) {
				System.out.println("3");
				if (It > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (It > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
}
