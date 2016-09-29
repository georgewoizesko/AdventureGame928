package com.app;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean userInputCorrect = true;
		
		do {
			System.out.println("Welcome to Adventure Game\n\n" + "Please choose a race:\n" + "1. Human\n"
					+ "2. Elf\n" + "3. Dwarf\n" + "4. Orc\n" + "5. Halfling");
			String userInput = sc.nextLine();
			switch (userInput) {
			case "1":
				System.out.println("You chose to play as a Human!");
				//Call to humanPaladin methods here
				break;
			case "2":
				System.out.println("You chose to play as an Elf!");
				//Call to elfMage methods here
				break;
			case "3":
				System.out.println("You chose to play as a Dwarf!");
				//Call to dwarfRanger methods here
				break;
			case "4":
				System.out.println("You chose to play as an Orc!");
				//Call to orcWarrior methods here
				break;
			case "5":
				System.out.println("You chose to play as a Halfling!");
				//Call to halflingThief methods here
				break;
			default:
				userInputCorrect = true;
				System.out.println("You entered an invalid choice\n\n"
						+ "1, 2, 3, 4, 5 are your choices.\n\n Please try again.\n\n\n");
				break;
			}
		} while (userInputCorrect);
		
		do {
			System.out.println("Please choose a class\n" + "1. Paladin\n"
					+ "2. Mage\n" + "3. Thief\n" + "4. Warrior\n" + "5. Ranger");
			String userInput = sc.nextLine();
			switch (userInput) {
			case "1":
				System.out.println("You chose to play as a Paladin!");
				//Call to humanPaladin methods here
				break;
			case "2":
				System.out.println("You chose to play as a Mage!");
				//Call to elfMage methods here
				break;
			case "3":
				System.out.println("You chose to play as a Thief!");
				//Call to dwarfRanger methods here
				break;
			case "4":
				System.out.println("You chose to play as a Warrior!");
				//Call to orcWarrior methods here
				break;
			case "5":
				System.out.println("You chose to play as a Ranger!");
				//Call to halflingThief methods here
				break;
			default:
				userInputCorrect = true;
				System.out.println("You entered an invalid choice\n\n"
						+ "1, 2, 3, 4, 5 are your choices.\n\n Please try again.\n\n\n");
				break;
			}
		} while (userInputCorrect);
	}

}
