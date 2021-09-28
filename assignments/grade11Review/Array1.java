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
      int [] oArrV1 = new int [14];       //original array version 1
      int [] rArrV1 = new int [14];       //reversed array version 1
      int [] arrV2 = new int [14];        // array version 2
      int temp;
         
      //version 2
      System.out.println("Version 1:");          
      //prompt user for input
      System.out.println("Please enter 14 numbers for your array and the program will print the reverse.");
      for (int i = 0; i<14; i++)
      {
         oArrV1[i] = input.nextInt();  
      }      
            
      //reverse the array from one array to another
      for (int i = 0; i<14; i++)
      {
         rArrV1[14-i-1] = oArrV1[i];
      }  
            
      //print the array;
      System.out.println("Here is the reversed array version 1: ");
      for( int i : rArrV1){
         System.out.print(i + ", ");
      }
              System.out.println();  
     
      //version 2
      System.out.println("Version 2:");    
                 
      //prompt user for input
      System.out.println("Please enter 14 numbers for your array and the program will print the reverse.");
      for (int i = 0; i<14; i++)
      {
         arrV2[i] = input.nextInt();  
      }      
            
      //reverse the array using one array only
      for (int i = 0; i<14/2; i++)
      {
         temp = arrV2[i];
         arrV2[i] = arrV2[14-1-i];
         arrV2[14-1-i] = temp;
         
      }  
            
      //print the array;
      System.out.println("Here is the reversed array version 1: ");
      for( int i : arrV2){
         System.out.print(i + ", ");
      }
      
   } 
}