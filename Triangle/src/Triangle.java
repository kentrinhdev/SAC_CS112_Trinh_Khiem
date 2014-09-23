/** 
 * Khiem Trinh
 * Professor Durendal
 * CS112 Section 88195
 * Tuesday 7 PM
 * Chapter 5 Exercise 5.25 Triangle Printing Program
 */

public class Triangle
{
   //  Draw four triangles.
   public static void main(String[] args)
   {
      int row; // Declare Integer variable called 'row' for the row position.
      int column; // Declare Integer variable called 'column' for the the column position.
      int space; // Declare Integer variable called 'space' for the number of spaces to print.

      // First Triangle
      for ( row = 1; row <= 10; row++ ) // (Initialize row value to equal 1; if the value of row is less than or equal to 10 then keep looping; add 1 to the value of row)
      {
         for ( column = 1; column <= row; column++ ) // (Initialize column value to equal 1; if the value of column is less than or equal to the value of row then keep looping; add 1 to the value of column)
            System.out.print( "*" ); // Output an asterisk to the console.

         System.out.println(); // Output a line to the console.
      } // end for loop for the First Triangle.

      System.out.println();
// ----------------------------------------------------------------------------------
      // Second Triangle
      for ( row = 10; row >= 1; row-- ) // (Initialize row value to equal 10; if the value of row is greater than or equal to 1 then keep looping; minus 1 to the value of row)
      {
         for ( column = 1; column <= row; column++ ) // (Initialize column value to equal to 1; if the value of column is less than or equal to the value of row then keep looping; add 1 to the value of column)
            System.out.print( "*" ); // Output an asterisk to the console.

         System.out.println(); // Output a line to the console.
      } // end for loop for the Second Triangle.

      System.out.println(); // Output a line to the console.
   // ----------------------------------------------------------------------------------
      // Third Triangle
      for ( row = 10; row >= 1; row-- ) // (Initialize row value to equal 10; if the value of row is greater than or equal to 1 then keep looping; minus 1 from the value of row)
      {
         for ( space = 10; space > row; space-- ) // (Initialize space value to equal 10; if the value of space is greater than the value of row then keep looping; minus 1 from the value of space)
            System.out.print( " " ); // Output an a blank 'space' to the console.

         for ( column = 1; column <= row; column++ ) // (Initialize column value to equal 1; if the value of column is less than or equal to the value of row then keep looping; add 1 to the value of column)
            System.out.print( "*" ); // Output an asterisk to the console.

         System.out.println(); // Output a line to the console.
      } // end for loop for the Third Triangle.

      System.out.println(); // Output a line to the console.
   // ----------------------------------------------------------------------------------
      // Fourth Triangle
      for ( row = 10; row >= 1; row-- ) // (Initialize row value to equal 10; if the value of row is greater than or equal to 1 then keep looping; minus 1 from the value of row) 
      {
         for ( space = 1; space < row; space++ ) // (Initialize space value to equal 1; if the value of space is less than the value of row then keep looping; add 1 to the value of space)
            System.out.print( " " ); // Output an a blank 'space' to the console.

         for ( column = 10; column >= row; column-- )
            System.out.print( "*" ); // Output an asterisk to the console.

         System.out.println(); // Output a line to the console.
      } // end for loop for the Fourth Triangle.
      
   } // end the Main method.
   
} // end the Class Triangle.