package com.kn.selection;
import java.util.Scanner;

public class VowelsOrConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=scan.next().charAt(0);
		checkVowelsOrConsonants(ch);
	}
	private static void checkVowelsOrConsonants(char ch) {
		// TODO Auto-generated method stub
		
	}
	public static void checkVowelOrConstanant(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' ||  ch == 'o' ||  ch == 'u') {
			System.out.println("The given character " + " is Vowel ");
		}else {
			System.out.println("The given character " + " is Consonants ");
		}
	}

}
