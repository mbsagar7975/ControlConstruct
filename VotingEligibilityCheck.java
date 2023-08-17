package com.kn.selection;
import java.util.Scanner;

public class VotingEligibilityCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Taking input from end user
		System.out.println("Enter your age");
		int age=scan.nextInt();
		checkVotingEligibilityOrNot(age);
	}

	public static void checkVotingEligibilityOrNot(int age) {
		//condition check
		if(age>=18) {
			//Print Eligibility Message
			System.out.println("Congratulation,you are eligible for voting !");
		}else {
			//Print Non-Eligibility Message
			System.out.println("Sorry,you are not eligible for voting");
		}
	}

}
