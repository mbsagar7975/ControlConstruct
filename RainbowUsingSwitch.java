package com.kn.selection;

public class RainbowUsingSwitch {
	void findRainbowColor(char color) {
		switch (color) {
		case 'V':
		case 'v': 
			System.out.println("Voilet Color in Rainbow");
			break;
		case 'I':
		case 'i': 
			System.out.println("Indigo Color in Rainbow");
			break;
		case 'B':
		case 'b': 
			System.out.println("Blue Color in Rainbow");
			break;
		case 'G':
		case 'g': 
			System.out.println("Green Color in Rainbow");
			break;
		case 'Y':
		case 'y': 
			System.out.println("Yellow Color in Rainbow");
			break;
		case 'O':
		case 'o': 
			System.out.println("Orange Color in Rainbow");
			break;
		case 'R':
		case 'r': 
			System.out.println("Red Color in Rainbow");
			break;
		default: 
			System.out.println("Invalid Color!");
		}
	}
}
