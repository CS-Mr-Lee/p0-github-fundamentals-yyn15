/*Write a program that initialized an array of size 14 with user input and then reverses the order of the values in the array using the specified methods:

The first version uses two arrays. The original array is not changed. The second array gets the elements of the first array in reversed order. The content of the second array is then printed in order.
In the second version, there is only one array and its values are reversed
and printed.*/

/*=============================================================================
   Array1.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 17th, 2021
-------------------------------------------------------------------------------
   This program displays an array in reverse
=============================================================================== */
import java.util.*;
import java.lang.*;

public class Array1
{
   public static void main (String [] args)
   {
      //declare scanner
      Scanner input = new Scanner(System.in);
      
      //declare variables
      int [] oArr = new int [14];
      int [] rArr = new int [14];
      int temp;
             
      //prompt user for input
      System.out.println("Please enter 14 numbers for your array and the program will print the reverse.");
      for (int i = 0; i<14; i++)
      {
         oArr[i] = input.nextInt();  
      }      
            
      //reverse the array
      for (int i = 0; i<14; i++)
      {
         rArr[14-i-1] = oArr[i];
      }  
            
      //print the array;
      System.out.println("Here is the reversed array: ");
      for( int i : rArr){
         System.out.print(i + ", ");
      }
                 
      
   } 
}