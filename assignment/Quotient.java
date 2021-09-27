/*Write a class Line.java to calculate the different property of a line.


The class should include the following methods:

length – takes the coordinates of a line segment as input and returns its
length

public static double length (int x1, int y1, int x2, int y2)

slope – takes the coordinates of a line segment as input and returns its slope

public static double slope (int x1, int y1, int x2, int y2)
Use Math.sqrt(num) to find the square root of a number*/

/*================================================================================
   Quotient.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 24th, 2021
---------------------------------------------------------------------------------
   This programs finds the quotient of a number until the user quits the program 
================================================================================= */
import java.util.*;
import java.lang.*;

public class Quotient
{
   public static void main (String [] args)
   {
      //declare scanner
      Scanner input = new Scanner(System.in);
      
      //declare variables
      String numerator, divisor;
      double dNum, dDiv;
      boolean again = true;
      do
      {
         try
         {
            System.out.print("Enter the numerator:");
            numerator = input.nextLine();
            if(numerator.substring(0,1).equals("q") || numerator.substring(0,1).equals("Q")){
               again = false;
            }
            else{
               dNum = Double.parseDouble(numerator);
               System.out.print("Enter the divisor: " );
               divisor = input.nextLine();
               dDiv = Double.parseDouble(divisor);

               if(divisor.equals("0")){
                  System.out.println("You can't divide " + numerator + " by 0");
                  System.out.println();
               }
               else{
                  System.out.println(numerator  + " / " + divisor + " is " + dNum/dDiv);
                  System.out.println();

               }
            }
            
                 
         }
         catch (NumberFormatException  e)
         {
            System.out.println("You entered bad data.");
            System.out.println("Please try again.");
            System.out.println();

         }
      } while (again);
   
   }
   
}