package com.kn.selection;
import java.util.Scanner;

public class RainbowUsingSwitchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the color");
		char color=scan.next().charAt(0);
		RainbowUsingSwitch rainbowUsingSwitch=new RainbowUsingSwitch();
		rainbowUsingSwitch.findRainbowColor(color);
		scan.close();
	}

}
