package com.kn.selection;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking input from end user
		System.out.println("Enter the number");
		int a=scan.nextInt();
		checkEvenOrOdd(a);
	}

	public static void checkEvenOrOdd(int a) {
		//condition check
		if(a%2==0) {
			//Print even numbers
			System.out.println("The given " + a +" number is Even");
		}else {
			//Print odd numbers
			System.out.println("The given " + a + " number is Odd");
		}
	}

}
