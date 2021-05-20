package com.qa.java_tasks;

public class Taxes {
public static void main(String[] args) {
//		Variables
	double salary = 23000;
	
	System.out.println("Tax rate = " + findTaxRate(salary) + "%");
	System.out.println(howMuchOfMySalaryWasStolenByTheTaxman(salary, findTaxRate(salary)));
}

public static double findTaxRate(double salary) {
	if (salary <= 14999) {
		return 0;
	} else if (salary >= 15000 && salary <= 19999) {
		return 10;
	} else if (salary >= 20000 && salary <= 29999) {
		return 15;
	} else if (salary >= 30000 && salary <= 44999) {
		return 20;
	} else {
		return 25;
	} 
}
public static String howMuchOfMySalaryWasStolenByTheTaxman(double salary, double taxRate) {
	return "The tax man stole £" + (salary * (taxRate / 100)) + "0 of your wages!";
}
}
