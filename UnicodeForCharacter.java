package com.kn.selection;
import java.util.Scanner;

public class UnicodeForCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		checkCharacterIsInRangeOfUnicode(ch);
	}

	public static void checkCharacterIsInRangeOfUnicode(char ch) {
		if(ch>=65 && ch<=90) {
			System.out.println("The given character "+ ch +" is a unicode for uppercase");
		}else if(ch>=97 && ch<=122) {
			System.out.println("The given character "+ ch +" is a unicode for lowercase");
		}else if(ch>=48 && ch<=57){
			System.out.println("The given chracter "+ ch + " is a number");
		}else {
			System.out.println("It is a special character");
		}
	}

}
