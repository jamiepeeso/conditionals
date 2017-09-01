public class WhatIfProgByDoing {
	public static void main(String[] args) {
		int people = 20;
		int cats = 30;
		int dogs = 15;
		
		if (people < cats) {
			System.out.println("Too many cats! This is what Bob Barker was tryint to tell us.");
		}
		if (people > cats) {
			System.out.println("Not many cats! The world is doomed! Thanks Bob Barker.");
		}
		if (people < dogs) {
			System.out.println("The world is drooled on!");
		}
		if (people > dogs) {
			System.out.println("The world is dry!");
		}
		
		dogs += 5;
		
		if (people >= dogs) {
			System.out.println("People are greater that or equal to dogs.");
		}
		if (people <= dogs) {
			System.out.println("People are less than or equal to dogs.");
		}
		if (people == dogs) {
			System.out.println("People are dogs.");
		}
	}
}