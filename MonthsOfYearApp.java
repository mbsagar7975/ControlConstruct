package com.kn.selection;

import java.util.Scanner;

public class MonthsOfYearApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month");
		String month=scan.next();
		MonthsOfYear monthsOfYear=new MonthsOfYear();
		monthsOfYear.checkMonthInQuarter(month);
		scan.close();
	}

}
