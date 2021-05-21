package com.qa.java_tasks;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		int userInput = 0;
		int intSystemOutput = 0;
		String strSystemOutput = "";

		Scanner scanInput = new Scanner(System.in);

//		This section of code calls the number digit adder.
//		System.out.println("Please enter an integer that is: 10-99.");
//		userInput = scanInput.nextInt();
//
//		if (userInput < 10 || userInput > 99) {
//			System.out.println("Error: " + userInput + " is NOT 10-99.");
//		} else {
//			intSystemOutput = pointlessAdder(userInput);
//
//			System.out.println("The sum of the digits in " + userInput + " is: " + intSystemOutput + ".");
//		}

//		This section of code calls the number to string method.
		System.out.println("Please enter an integer that is two digits:");
		userInput = scanInput.nextInt();

		if (userInput > 9999) {
			System.out.println("Lol: " + userInput + " is NOT two digits my guy.");
		} else {
			strSystemOutput = pointlessStringer(userInput);

			System.out.println("The sum of the digits in " + userInput + " is: " + strSystemOutput + ".");
		}

		scanInput.close();

	}

	private static int pointlessAdder(int input) {

		int storeInput = input;

		if (input >= 10 && input <= 99) {
			int lastDigit = input % 10;
			int digitCount = 0;
			while (input != 0) {
				digitCount++;
				input = input / 10;
			}
			int divisor = (int) Math.pow(10, digitCount - 1);
			int firstDigit = storeInput / divisor;
			int sum = firstDigit + lastDigit;
			return sum;
		} else {
			return storeInput;
		}
	}

	private static String pointlessStringer(int input) {

		int storeInput = input;
		String strOutput = "";
		
		String storeOnesString = "";
		String storeTensString = "";
		String storeHundString = "";

		int digitCount = 0;
		while (input != 0) {
			digitCount++;
			System.out.println(digitCount);
			input = input / 10;
		}
		for (int i = digitCount; i > 0; i--) {
			if (i == 1) {
				int onesDigit = storeInput % 10;
				switch (onesDigit) {
				case 1: {
					storeOnesString = "one";
					continue;
				}
				case 2: {
					storeOnesString = "two";
					continue;
				}
				case 3: {
					storeOnesString = "three";
					continue;
				}
				case 4: {
					storeOnesString = "four";
					continue;
				}
				case 5: {
					storeOnesString = "five";
					continue;
				}
				case 6: {
					storeOnesString = "six";
					continue;
				}
				case 7: {
					storeOnesString = "seven";
					continue;
				}
				case 8: {
					storeOnesString = "eight";
					continue;
				}
				case 9: {
					storeOnesString = "nine";
					continue;
				}
				}
			} 
			else if (i == 2) {
				int tensDigit = storeInput % 100;
				switch (tensDigit) {
				case 1: {
//					Wow, fun exception time.
					int onesDigit = storeInput % 10;
					switch (onesDigit) {
					case 1: {
						storeTensString = "eleven";
						storeOnesString = "";
						continue;
					}
					case 2: {
						storeTensString = "twelve";
						storeOnesString = "";
						continue;
					}
					case 3: {
						storeTensString = "thirteen";
						storeOnesString = "";
						continue;
					}
					case 4: {
						storeTensString = "fourteen";
						storeOnesString = "";
						continue;
					}
					case 5: {
						storeTensString = "fifteen";
						storeOnesString = "";
						continue;
					}
					case 6: {
						storeTensString = "sixteen";
						storeOnesString = "";
						continue;
					}
					case 7: {
						storeTensString = "seventeen";
						storeOnesString = "";
						continue;
					}
					case 8: {
						storeTensString = "eighteen";
						storeOnesString = "";
						continue;
					}
					case 9: {
						storeTensString = "nineteen";
						storeOnesString = "";
						continue;
					}
					}
				}
				case 2: {
					storeTensString = "twenty";
					continue;
				}
				case 3: {
					storeTensString = "thirty";
					continue;
				}
				case 4: {
					storeTensString = "forty";
					continue;
				}
				case 5: {
					storeTensString = "fifty";
					continue;
				}
				case 6: {
					storeTensString = "sixty";
					continue;
				}
				case 7: {
					storeTensString = "seventy";
					continue;
				}
				case 8: {
					storeTensString = "eighty";
					continue;
				}
				case 9: {
					storeTensString = "ninety";
					continue;
				}
				}
			}
		}
		strOutput = storeTensString + storeOnesString;
		return strOutput;
	}
}
