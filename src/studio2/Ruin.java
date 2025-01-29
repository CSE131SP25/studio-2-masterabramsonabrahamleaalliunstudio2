package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		int numPlays = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter total days you want to gamble: ");
		int totalSimulations = in.nextInt();
		
		System.out.print("Enter Start Amount: $");
		double startAmount = in.nextDouble();
		double origAmount = startAmount;
		System.out.print("Enter win probability (0.0-1.0): ");
		double winChance = in.nextDouble(); 
		System.out.print("Enter win limit: $");
		double winLimit = in.nextDouble();
		
		for(int day = 0 ; day < totalSimulations ; day++) {
			while(startAmount < winLimit && startAmount > 0) {
				if(Math.random() <= winChance) {
				startAmount++;
				//System.out.println("Win! New amount: " + startAmount);
				numPlays++;
			}
				else {
				startAmount--;
				//System.out.println("You Lose! New amount: " + startAmount);
				numPlays++;
			}
			
			}	
		
			if(startAmount == winLimit) {
				System.out.println("Simulation " + day + ": " + numPlays + " WIN");
			}
			else {
				System.out.println("Simulation " + day + ": " + numPlays + " LOSE");
			}
			numPlays = 0;
			startAmount = origAmount;
		}

	}
}
