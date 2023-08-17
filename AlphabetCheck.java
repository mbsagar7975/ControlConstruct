package com.kn.selection;
import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character = ");
		char alphabet = scan.next().charAt(0);
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ) {
			System.out.println("It is a vowel");
		}

	}

}
