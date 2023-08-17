package com.kn.selection;
import java.util.Scanner;

public class WeekDaysApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int a= scan.nextInt();
		WeekDays weekDays=new WeekDays();
		weekDays.checkWeekDaysName(a);
		scan.close();
	}

}
