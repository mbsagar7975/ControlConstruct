package com.kn.selection;

public class RainbowColor {
	public void checkRainbowColor(char color) {
		if(color=='V') {
			System.out.println("Voilet color present in Rainbow");
		}else if(color=='I') {
			System.out.println("Indigo color present in Rainbow");
		}else if(color=='B') {
			System.out.println("Blue color present in Rainbow");
		}else if(color=='G') {
			System.out.println("Green color present in Rainbow");
		}else if(color=='Y') {
			System.out.println("Yellow color present in Rainbow");
		}else if(color=='O') {
			System.out.println("Orange color present in Rainbow");
		}else if(color=='R') {
			System.out.println("Red color present in Rainbow");
		}else  {
			System.out.println(color + " color not present in Rainbow");
		}
	}
}
