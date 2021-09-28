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
      double dNum, dDiv, quotient;
      boolean again = true;
      
      //Do while loop to play again if user wishes to
      do
      {
         try      //to check if an exception occurs
         {
            //prompts user for the numerator and check if user wishes to quit
            System.out.print("Enter the numerator:");
            numerator = input.nextLine();
            if(numerator.substring(0,1).equals("q") || numerator.substring(0,1).equals("Q")){
               again = false;
            }
            else{
               dNum = Double.parseDouble(numerator);              //change string value to integer
               System.out.print("Enter the divisor: " );
               divisor = input.nextLine();
               dDiv = Double.parseDouble(divisor);
               
               //check if the equation would be undefined. 
               if(divisor.equals("0")){
                  System.out.println("You can't divide " + numerator + " by 0");
                  System.out.println();
               }
               else{
                  quotient= dNum/dDiv;
                  System.out.print(numerator  + " / " + divisor + " is ");
                  if(dNum%dDiv != 0)                          //check if there is a remainder 
                  {
                     System.out.printf("%.2f", quotient);
                  }
                  else
                     System.out.printf("%.0f", quotient);

                  System.out.println();
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