package com.kn.selection;
import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n=scan.nextInt();
		if(n%2==0) {
			System.out.println("The given number " + n + " is an even number");
			
		}
	}

}
