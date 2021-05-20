package com.qa.java_tasks;

public class TestResults {

	public static void main(String[] args) {
//		Variables
		int physicsResults = 69;
		int chemistryResults = 111;
		int biologyResults = 99;

//		Call stack		
		printResults(physicsResults, chemistryResults, biologyResults);
		System.out.println(printCalcResults(calcResults(physicsResults, chemistryResults, biologyResults)));
		System.out.println(dumbPassFailResults(calcResults(physicsResults, chemistryResults, biologyResults)));
		System.out.println(smartPassFailResults(physicsResults, chemistryResults, biologyResults));
	}

	private static void printResults(int subject1, int subject2, int subject3) {

		System.out.println("Physics: " + subject1);
		System.out.println("Chemistry: " + subject2);
		System.out.println("Biology: " + subject3);
	}

	private static double calcResults(int subject1, int subject2, int subject3) {

		int totalResults = subject1 + subject2 + subject3;

		double percentageResults = (totalResults * 100) / 450;

		return percentageResults;
	}

	private static String printCalcResults(double result) {

		String printablePercResults = "Total Score: " + result + "%";

		return printablePercResults;
	}

	private static String dumbPassFailResults(double results) {

		if (results >= 60) {
			return "You have passed!";
		}
		return "You have failed.";
	}

	private static String smartPassFailResults(double subject1, double subject2, double subject3) {

		double physGrade = ((subject1 * 100) / 150);
		double chemistryGrade = ((subject2 * 100) / 150);
		double biologyGrade = ((subject3 * 100) / 150);
		double overallGrade = (((subject1 + subject2 + subject3) * 100) / 450);

		if (physGrade >= 60 && chemistryGrade >= 60 && biologyGrade >= 60) {
			return "Congratulations you passed all exams! Overall Grade: " + overallGrade + "%";
		} else if (physGrade < 60 && chemistryGrade >= 60 && biologyGrade >= 60) {
			return "Unfortunately, you did not pass physics and have failed overall. Overall Grade: " + overallGrade
					+ "%";
		} else if (physGrade >= 60 && chemistryGrade < 60 && biologyGrade >= 60) {
			return "Unfortunately, you did not pass chemistry and have failed overall. Overall Grade: " + overallGrade
					+ "%";
		} else if (physGrade >= 60 && chemistryGrade >= 60 && biologyGrade < 60) {
			return "Unfortunately, you did not pass biology and have failed overall. Overall Grade: " + overallGrade
					+ "%";
		} else if (physGrade < 60 && chemistryGrade < 60 && biologyGrade >= 60) {
			return "Unfortunately, you did not pass physics and chemistry and have failed overall. Overall Grade: "
					+ overallGrade + "%";
		} else if (physGrade >= 60 && chemistryGrade < 60 && biologyGrade < 60) {
			return "Unfortunately, you did not pass chemistry and biology and have failed overall. Overall Grade: "
					+ overallGrade + "%";
		} else if (physGrade < 60 && chemistryGrade >= 60 && biologyGrade < 60) {
			return "Unfortunately, you did not pass biology and physics and have failed overall. Overall Grade: "
					+ overallGrade + "%";
		} else {
			return "Unfortunately, you failed all exams. Overall Grade: " + overallGrade + "%";
		}
	}
}
