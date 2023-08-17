package com.kn.selection;
import java.util.Scanner;

public class RainbowColorApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your color = ");
		char color=scan.next().charAt(0);
		RainbowColor rainbow=new RainbowColor();
		rainbow.checkRainbowColor(color);
		scan.close();
	}

}
