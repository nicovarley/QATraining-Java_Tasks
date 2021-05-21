package com.qa.java_tasks;

public class Arrays {
	public static void main(String[] args) {

		int intArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(intArray[1]);

		int intArray2[] = new int[5];

		for (int i = 0; i < intArray2.length; i++) {
			intArray2[i] = i;
			System.out.println(intArray2[i]);
		}

		for (int i = 0; i < intArray2.length; i++) {
			int takeArrayElement = intArray2[i];
			int multiplyArrayElement = takeArrayElement * 10;
			intArray2[i] = multiplyArrayElement;
			System.out.println(intArray2[i]);
		}

	}
}
