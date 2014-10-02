/**
 * Khiem Trinh
* Professor Durendal
* CS112 Section 88195
* Tuesday 7 PM
* Week 4 Homework RockPaperScissors Game
* Rules: Rock beats Scissors / Scissors beats Paper / Paper beats Rock
*/
 
import java.util.Scanner;
 
public class gameRockPaperScissors
{
       public static void main(String[] args)
       {
              // 1 = Rock, 2 = Paper, 3 = Scissors
             
              // Rock smashes Scissors: 1 beats 3 and 1 loses to 2.
              // If cpu plays 1=Rock, and player plays 1=Rock then it's a draw.
              // If cpu plays 1=Rock, and player plays 2=Paper then Player wins.
              // If cpu plays 1=Rock, and player plays 3=Scissors then CPU wins.
             
              // Scissors cuts Paper: 3 beats 2 and 3 loses to 1.
              // If cpu plays 2=Paper, and player plays 1=Rock then CPU wins.
              // If cpu plays 2=Paper, and player plays 2=Paper then it's a draw.
              // If cpu plays 2=Paper, and player plays 3=Scissors then Player wins.            
             
              // Paper covers Rock: 2 beats 1 and 2 loses to 3.
              // If cpu plays 3=Scissors, and player plays 1=Rock then Player wins.
              // If cpu plays 3=Scissors, and player plays 2=Paper then CPU wins.
              // If cpu plays 3=Scissors, and player plays 3=Scissors then it's a draw. 
             
              Scanner input = new Scanner(System.in);
              Scanner scan = new Scanner(System.in);
             
              int count = 0;
              int cpuInt;
              String computerMove = "";
              int playerInt;
              String playerMove = "";
              String answer = "";
                 
              do
              {
                     do
                     {
                           count++;
                           cpuInt=1+(int)(Math.random()*3);
                           if (cpuInt == 1)
                           {
                                  computerMove = "Rock";
                                  System.out.println("Round " + count);
                                  System.out.println("The computer's move is " + computerMove);
                           }
                           else if (cpuInt == 2)
                           {
                                  computerMove = "Paper";
                                  System.out.println("Round " + count);
                                  System.out.println("The computer's move is " + computerMove);
                           }
                           else if (cpuInt == 3)
                           {
                                  computerMove = "Scissors";
                                  System.out.println("Round " + count);
                                  System.out.println("The computer's move is " + computerMove);
                           }
                          
                           System.out.print("Enter you move. 1 = Rock, 2 = Paper, 3 = Scissors: ");
                           playerInt = input.nextInt();
 
                           if (playerInt == 1)
                           {
                                  playerMove = "Rock";
                                  System.out.println("Your move is " + playerMove);
                           }
                           else if (playerInt == 2)
                           {
                                  playerMove = "Paper";
                                  System.out.println("Your move is " + playerMove);
                           }
                           else if (playerInt == 3)
                           {
                                  playerMove = "Scissors";
                                  System.out.println("Your move is " + playerMove);
                           }
                          
// CPU Plays Rock --------------------------------------------------------------------------------------------------
                           if (cpuInt == 1 && playerInt == 1)
                           {
                                  System.out.println(playerMove + " matches " + computerMove + ". It's a draw.\n");
                           }
                           else if (cpuInt == 1 && playerInt == 2)
                           {
                                  System.out.println(playerMove + " covers " + computerMove + ". You Win!\n");
                           }                   
                           else if (cpuInt == 1 && playerInt == 3)
                           {
                                  System.out.println(computerMove + " smashes " + playerMove + ". The CPU Wins!\n");
                           }     
// CPU Plays Paper --------------------------------------------------------------------------------------------------
                           if (cpuInt == 2 && playerInt == 1)
                           {
                                  System.out.println(computerMove + " covers " + playerMove + ". The CPU Wins!\n");
                           }
                           else if (cpuInt == 2 && playerInt == 2)
                           {
                                  System.out.println(playerMove + " matches " + computerMove + ". It's a draw.\n");
                           }                   
                           else if (cpuInt == 2 && playerInt == 3)
                           {
                                  System.out.println(playerMove + " cuts " + computerMove + ". You Win!\n");
                           }
// CPU Plays Scissors ------------------------------------------------------------------------------------------------
                           if (cpuInt == 3 && playerInt == 1)
                           {
                                  System.out.println(playerMove + " smashes " + computerMove + ". You Win!\n");
                           }
                           else if (cpuInt == 3 && playerInt == 2)
                           {
                                  System.out.println(computerMove + " cuts " + playerMove + ". The CPU Wins!\n");
                           }                   
                           else if (cpuInt == 3 && playerInt == 3)
                           {
                                  System.out.println(playerMove + " matches " + computerMove + ". It's a draw.\n");
                           }
                          
                     }
                           while (playerMove != computerMove);
                                  System.out.println("Your move matches the computer's move. There is no winner.");
                                  System.out.print("Do you want to play again? Enter Y or N: ");
                                  answer = scan.next();
              }     
              while(answer.equalsIgnoreCase("Y"));
              System.out.println("Thank you for playing Rock-Paper-Scissors. Good-Bye!");
       }
}
// Good!
