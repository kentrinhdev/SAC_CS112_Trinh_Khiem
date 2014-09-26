/** 
 * Khiem Trinh
 * Professor Durendal
 * CS112 Section 88195
 * Tuesday 7 PM
 * Week 4 Homework RockPaperScissors Game
 * Rules: Rock beats Scissors / Scissors beats Paper / Paper beats Rock
 */

import java.util.*;
import java.util.Random;

public class gameRockPaperScissors 
{
	static int computerWins = 0;
	static int playerWins = 0;
	static int numDraws = 0;

	static final int ROCK = 1;
	static final int PAPER = 2;
	static final int SCISSORS = 3;

	public static void main(String[] args) {
		System.out.print("Enter your name and press return: ");

		Scanner input = new Scanner(System.in);
		String name = input.nextLine();

		System.out.println("Welcome " +name+ " to a game of Rock-Paper-Scissors!");
		System.out.print("Enter the number of rounds you want to play and press return: ");

		int numGames = input.nextInt();
		playGame(name,numGames,input);
	
	}

	public static void playGame(String name, int numGames, Scanner input) // Initializing the game
	{
		int count = 0;
		boolean play = true;

		String yourChoice = "";
		String computerChoice = "";
		while(play == true) // The while loop escapes when our play flag is false
		{
			count++;

			if(numGames <= count )
			{
				play = false;
			}

			System.out.println("Round " + count);
			System.out.print(name + ", make your move [ 1 = Rock, 2 = Paper, 3 = Scissors ]: ");
			int choice = input.nextInt();
			Random rand = new Random();
			int compChoice = rand.nextInt(3) +1;
			yourChoice = "";
			computerChoice = "";
			if(choice == ROCK)
			{
				yourChoice+=name+" plays Rock ...";
			}
			else if(choice == PAPER)
			{
				yourChoice+=name+" plays Paper ...";
			}
			else if(choice == SCISSORS)
			{
				yourChoice+=name+" plays Scissors ...";
			}
			if(compChoice == 1)
			{
				computerChoice+="Computer plays Rock -- ";
			}
			else if(compChoice == 2)
			{
				computerChoice+="Computer plays Paper -- ";
			}
			else if(compChoice == 3)
			{
				computerChoice+="Computer plays Scissors -- ";
			}
			System.out.print(computerChoice + yourChoice );
			System.out.println();
			checkOutcome(choice, compChoice, computerChoice, yourChoice, name, play);
		}
		System.out.println("You played " +count +" games of Rock Paper Scissors.");
		System.out.println("The Computer won "+computerWins+" times.");
		System.out.println(name+ " won "+playerWins+" times.");
		System.out.println("There were "+numDraws+" draws.");
		if(playerWins > computerWins)
		{
			System.out.println("You are the winner of Rock Paper Scissors!");
		}
		else if(computerWins > playerWins)
		{
			System.out.println("The Computer is the winner of Rock Paper Scissors!");
		}
		else if(playerWins == computerWins)
		{
			System.out.println("It is a tie. Everyone is a winner of Rock Paper Scissors!");
		}
	}
	// Checks the player's choice against the Computer's choice
	public static void checkOutcome(int choice, int compChoice, String computerChoice, String yourChoice, String name, boolean play)
	{
		if(choice == 1 && compChoice == 1 || choice == 2 && compChoice == 2 || choice == 3 && compChoice==3)
		{
			tieGame(play);
			numDraws++;
		}
		if(choice == 1 && compChoice == 2 || choice == 2 && compChoice == 3 || choice == 3 && compChoice == 1)
		{
			youLose(computerChoice, play);
			computerWins++;
		}
		if(choice == 1 && compChoice == 3 || choice == 2 && compChoice == 1 || choice == 3 && compChoice == 2 )
		{
			youWin(yourChoice, name, play);
			playerWins++;
		}
	}
	// The three outcome methods deciding the fate of the player's choice
	public static void youLose(String computerChoice, boolean play)
	{
		if(play == true)
		{
			if(computerChoice.equals("Computer chooses Rock, "))
			{
				System.out.println("Rock breaks Scissors, Computer wins.");
				System.out.println();
			}
			else if(computerChoice.equals("Computer chooses Paper, "))
			{
				System.out.println("Paper covers Rock, Computer wins.");
				System.out.println();
			}
			else if(computerChoice.equals("Computer chooses Scissors, "))
			{
				System.out.println("Scissors cuts Paper, Computer wins.");
				System.out.println();
			}
		}

	}

	public static void youWin(String yourChoice, String name, boolean play)
	{
		if(play == true)
		{	
			if(yourChoice.equals(name+" chose Rock"))
			{
				System.out.println("Rock breaks Scissors - YOU WIN!");
				System.out.println();
			}
			else if(yourChoice.equals(name+" chose Paper"))
			{
				System.out.println("Paper covers Rock - YOU WIN!");
				System.out.println();
			}
			else if(yourChoice.equals(name+" chose Scissors"))
			{
				System.out.println("Scissors cuts Paper - YOU WIN!");
				System.out.println();
			}
		}
	}

	public static void tieGame(boolean play)
	{
		if(play == true)
		{
			System.out.println("This round is a draw");
			System.out.println();
		}
	}
}