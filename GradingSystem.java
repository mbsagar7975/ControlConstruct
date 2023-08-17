package com.kn.selection;

public class GradingSystem {
	public void Marks(int marks) {
		if(marks>90) {
			System.out.println("A Grade");
		}else if(marks>75 && marks<=90) {
			System.out.println("B Grade");
		}else if(marks>60 && marks<=75) {
			System.out.println("C Grade");
		}else if(marks>45 && marks<=60) {
			System.out.println("D Grade");
		}else if(marks>=35 && marks<=45) {
			System.out.println("E Grade");
		}else if(marks<35) {
			System.out.println("Better luck next time!");
		}
	}
}
