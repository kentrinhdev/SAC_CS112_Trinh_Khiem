import java.util.Scanner;

public class Test
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int number1;
				
		System.out.print( "Enter an integer: " );
		number1 = input.nextInt();
			
	    if ( number1 % 2 == 0 )
	       System.out.println("The number is divisible by 2.");
	       else
	          System.out.println("The number is NOT divisible by 2.");
	}
}
