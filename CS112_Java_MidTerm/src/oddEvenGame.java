/**
 * Khiem Trinh
* Professor Durendal
* CS112 Section 88195
* Tuesday 7 PM
* CS112 Java MidTerm
*/
 
import java.util.Scanner;
 
public class oddEvenGame
{
    public static void main(String[] args)
    {
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
                        cpuInt=1+(int)(Math.random()*10);
                        System.out.print("The system generated number is " + cpuInt + ".");
                        
                        if ( (cpuInt/2)*2 == cpuInt )
                        {
                        	computerMove = "Even";
                            System.out.println(" This is Even!");
                        }
                        else if ( (cpuInt/1)*1 == cpuInt )
                        {
                        	computerMove = "Odd";  
                            System.out.println(" This is Odd!");
                        }
                        
                        System.out.print("Guess if the system generated an Odd or Even number. 1 = Odd and 2 = Even: ");
                        playerInt = input.nextInt();
                        
                        if ( (playerInt/2)*2 == playerInt )
                        {
                        	playerMove = "Even";
                            System.out.println("Your guess is Even.");
                        }
                        else if ( (playerInt/1)*1 == playerInt )
                        {
                        	playerMove = "Odd";  
                            System.out.println("Your guess is Odd.");
                        }
                        
// CPU plays Odd  --------------------------------------------------------------------------------------------------
                        if (computerMove == "Odd" && playerMove == "Odd")
                        {
                               System.out.println(playerMove + " matches " + computerMove + ". You Win!\n");
                        }
                        else if (computerMove == "Odd" && playerMove == "Even")
                        {
                               System.out.println(playerMove + " does not match " + computerMove + ". Guess again!\n");
                        }   
// CPU plays Even  --------------------------------------------------------------------------------------------------
                        if (computerMove == "Even" && playerMove == "Even")
                        {
                               System.out.println(playerMove + " matches " + computerMove + ". You Win!\n");
                        }
                        else if (computerMove == "Even" && playerMove == "Odd")
                        {
                               System.out.println(playerMove + " does not match " + computerMove + ". Guess again!\n");
                        }   
                          
                  }
                        while (playerMove != computerMove);
                               System.out.println("Your move matches the computer's move. You are the winner!");
                               System.out.print("Do you want to play again? Enter Y or N: ");
                               answer = scan.next();
           }     
           while(answer.equalsIgnoreCase("Y"));
           System.out.println("Thank you for playing Odd Or Even. Good-Bye!");
    }
}
