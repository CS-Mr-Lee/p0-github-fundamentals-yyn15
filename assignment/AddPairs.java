
/*================================================================================
   AddPairs.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 24th, 2021
---------------------------------------------------------------------------------
   This program adds pairs of a number together and finds the sum
================================================================================= */
import java.util.*;
import java.lang.*;

public class AddPairs
{
   public static void main (String [] args)
   {
      //declare scanner
      Scanner input = new Scanner(System.in);
      
      //declare variables
      String fullNum, tempNum;
      int [] nums;
      int length, sum=0,fullLength;
      
      //prompt user for input
      System.out.println("Please enter a number you want to see the sum for:");
      fullNum = input.nextLine();
      length = fullNum.length()/2;
      fullLength=fullNum.length();
      
      //check even or odd
      if(fullNum.length()%2 !=0){
      
         length = length + 1;
         nums = new int[length];
         nums[length-1] = Integer.parseInt(fullNum.substring(fullNum.length()-1));
         fullLength=fullLength-1; 
      }
      else 
         nums = new int[length];
      
      
      
      for(int i = 0; i<fullLength-1; i+=2)
      {
         tempNum = fullNum.substring (i, i+2);
         nums[i/2]=Integer.parseInt(tempNum);
      }
      
      //print sum
      System.out.println("Here the sum:");   
      for (int n : nums)
      {
         sum = sum + n;
      }   
      System.out.print(sum + " (");   
      for (int i=0; i<nums.length-1; i++)
      {
         System.out.print(nums[i] + "+");   
      }   
      System.out.print(nums[nums.length-1] + ")");            
      
      
      
               
                       
      
   } 
}