package com.kn.selection;
import java.util.Scanner;

public class GradingSystemApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks = ");
		int marks=scan.nextInt();
		GradingSystem g1=new GradingSystem();
		g1.Marks(marks);
		scan.close();
	}

}
