package com.qa.java_tasks;

public class QQlater {

	public static void main(String[] args) {
		System.out.println(qqlate(8, 2));
		System.out.println(qqlateMult(6, 2));
		System.out.println(qqlateSub(3, 2));
		qqlateDiv(10, 33);

	}

	private static int qqlate(int num1, int num2) {
		return num1 + num2;
	}

	private static int qqlateMult(int num1, int num2) {
		return num1 * num2;
	}

	private static int qqlateSub(int num1, int num2) {
		return num1 - num2;
	}

	private static void qqlateDiv(double num1, double num2) {
		if (num1 <= num2) {
			System.out.println("I refuse to perform this Q.Qlation");
		} else {
			System.out.println(num1 / num2);
		}
	}

}
