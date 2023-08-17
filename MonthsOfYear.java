package com.kn.selection;

public class MonthsOfYear {
	public void checkMonthInQuarter(String month) {
		switch(month) {
		case "April":
		case "May":
		case "June":
			System.out.println("Quarter 1");
			break;
		case "July":
		case "August":
		case "September":
			System.out.println("Quarter 2");
			break;
		case "October":
		case "November":
		case "December":
			System.out.println("Quarter 3");
			break;
		case "January":
		case "February":
		case "March":
			System.out.println("Quarter 4");
			break;
		default:
			System.out.println("Invalid Input!");
		}
	}
}
