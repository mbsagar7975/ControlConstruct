package com.kn.selection;

import java.util.Scanner;

public class WeekDaysUsingSwitchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int days=scan.nextInt();
		WeekDaysUsingSwitch weekDaysUsingSwitch=new WeekDaysUsingSwitch();
		weekDaysUsingSwitch.checkWeekDays(days);
		scan.close();
	}

}
