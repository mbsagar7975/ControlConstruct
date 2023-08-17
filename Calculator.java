package com.kn.selection;

public class Calculator {
	void arithmaticOperations(int a, int b, char c) {
		if (c == '+') {
			 addNumbers(a, b);
		}else if(c=='-') {
			subsubtractionNumber(a, b);
		}else if(c=='*') {
			multiplicationNumber(a, b);
		}else if(c=='/') {
			 divisionNumber(a, b);
		}else if(c=='%') {
			remainderNumber(a, b);
		}else {
			System.out.println("Invalid Operation!");
		}
	}
	public void addNumbers(int a, int b) {
		System.out.println("Addition = " + (a+b));
	}
	public void subsubtractionNumber(int a, int b) {
		System.out.println("Subtraction = " + (a-b));

	}
	public void multiplicationNumber(int a, int b) {
		System.out.println("Multiplication = " + (a*b));

	}
	public void divisionNumber(double a, double b) {
		System.out.println("Division = " + (double)(a/b));

	}
	public void remainderNumber(int a, int b) {
		System.out.println("Remainder = " + (a%b));

	}
}
