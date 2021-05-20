package com.qa.java_tasks;

public class BlackJack {
	public static void main(String[] args) {

		System.out.println(blackJack(10, 21));
		System.out.println(blackJack(20, 18));
		System.out.println(blackJack(1, 22));
		System.out.println(blackJack(22, 23));
		
	}

	private static int blackJack(int value1, int value2) {
		if (value1 > 21 && value2 > 21) {
			return 0;
		} else if (value1 <= 21 && value2 > 21) {
			return value1;
		} else if (value1 > 21 && value2 <= 21) {
			return value2;
		} else {
			if (value1 == value2) {
				return value1;
			} else if (value1 > value2) {
				return value1;
			} else {
				return value2;
			}
		}
	}
}
