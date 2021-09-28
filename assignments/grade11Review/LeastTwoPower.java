/*=========================================================================
   LeastTwoPower.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 16th, 2021
----------------------------------------------------------------------------
   This program displays the smallest power of two greater than the input
============================================================================ */
import java.util.*;
import java.lang.*;

public class LeastTwoPower
{
   public static void main (String [] args)
   {
      //declare scanner
      Scanner input = new Scanner(System.in);
      
      //declare variables
      int number, power, count=0, result=0;        
      
      //prompt user for number
      System.out.println("please enter a number");
      number = input.nextInt();
      
      //find the largest below the number given
      while(Math.pow(2,count)<number)
      {
         result = (int) Math.pow(2, count);
         count++;
      }
      
      //find the next power value. 
      result = result * 2;
      
      //print result
      System.out.println("the smallest number after the next value is: " + result + "."); 
      
      
   } 
}