package com.qa.java_tasks;

public class UniqueSum {
	public static void main(String[] args) {

		System.out.println(calcUniques(1, 2, 3));
		System.out.println(calcUniques(3, 3, 3));
		System.out.println(calcUniques(1, 1, 2));
		
	}

	private static int calcUniques(int value1, int value2, int value3) {
		if (value1 != value2 && value1 != value3 && value2 != value3) {
			return value1 + value2 + value3;
		} else if (value1 == value2 && value1 != value3 && value2 != value3) {
			return value3;
		} else if (value1 != value2 && value1 == value3 && value2 != value3) {
			return value2;
		}else if (value1 != value2 && value1 != value3 && value2 == value3) {
			return value1;
		} else {
			return 0;
		}
	}
}
