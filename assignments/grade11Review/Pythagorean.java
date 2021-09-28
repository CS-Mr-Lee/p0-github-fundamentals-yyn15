/*==============================================================================
   Pythagorean.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 16th, 2021
-------------------------------------------------------------------------------
   This program displays all the pythagorean triplets smaller than the number
===============================================================================*/
import java.util.*;
import java.lang.*;

public class Pythagorean
{
   public static void main (String [] args)
   {
      //declare scanner
      Scanner input = new Scanner(System.in);
      
      //declare variables
      int number;        
      
      //prompt user for number
      System.out.println("please enter a number");
      number = input.nextInt();
      
      //use for loops to find all pythagorean triplets and print
      for(int a = 1; a<=number; a++){
         for (int b= a; b<=number; b++){
            for (int c= b; c<= number; c++){
               if ((a*a + b*b) == (c*c))
               {
                  System.out.println( a + " " + b + " " + c);
               }
            }
         }
      }
      
      
      
   } 
}