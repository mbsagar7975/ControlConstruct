package com.kn.selection;
import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = scan.nextInt();
		if(n>0);{
			System.out.println("The given number " + n + " is a positive number ");
		}
	}

}
