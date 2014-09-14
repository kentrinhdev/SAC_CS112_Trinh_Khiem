import java.util.Scanner;

class Calc
{
    public static void main(String[] args)
    {
	Scanner input = new Scanner( System.in );        

	double value1;
	double value2;
	double valueSum;
	double valueDiff;
	double valueProd;
	double valueQuo;
	int pickOption;
	
		int rep = 1;
		while(rep == 1)
		{
		
		System.out.print( "Enter value number one: ");
		value1 = input.nextDouble();

		System.out.print( "Enter value number two: " );
		value2 = input.nextDouble();

		valueSum = value1 + value2;
		valueDiff = value1 - value2;
		valueProd = value1 * value2;
		valueQuo = value1 / value2;
	
		System.out.print( "What do you want to do? 1 to Add, 2 to Subtract, 3 to Multiply, and 4 to Divide." );
		pickOption = input.nextInt();
	
			if (pickOption == 1) 
			{ System.out.println( "The sum of the two values: " + value1 + " + " + value2 + " is = " + valueSum ); }
				else if (pickOption == 2) 
				{ System.out.println( "The difference of the two values: " + value1 + " - " + value2 + " is = " + valueDiff ); }
					else if (pickOption == 3) 
					{ System.out.println( "The product of the two values: " + value1 + " x " + value2 + " is = " + valueProd ); }
						else if (pickOption == 4) 
						{ System.out.println( "The quotient of the two values: " + value1 + " / " + value2 + " is = " + valueQuo ); }
		
			System.out.print( "Do you want to continue using the Calculator? 1 to continue. 2 to stop." );
			rep = input.nextInt();
		}
    }
}