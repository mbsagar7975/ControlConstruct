package com.kn.selection;
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number = ");
		int a = scan.nextInt();
		System.out.println("Enter the second number = ");
		int b = scan.nextInt();
		System.out.println("Enter your choice = ");
		char c = scan.next().charAt(0);
		Calculator calculator = new Calculator();
		calculator.arithmaticOperations(a, b, c);
		scan.close();

	}

}
