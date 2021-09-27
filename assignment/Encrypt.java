/*================================================================================
   Encrypt.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 24th, 2021
---------------------------------------------------------------------------------
   This program utilizes an encryption method to 
================================================================================= */
import java.util.*;
import java.lang.*;

public class Encrypt
{
   public static void main (String [] args)
   {
      //declare scanner
      Scanner input = new Scanner(System.in);
      
      //declare variables
      String original, encrypted = "", wordTemp, word;
      String [] words;
      char tempChar;
      int ascii, length;
      
      //prompt user for input
      System.out.println("Please enter the word or phrase you would like to encrypt.:");
      original = input.nextLine();
      words = original.split(" ");               //split using spaces
      
      //make changes for each word
      for(int i = 0; i<words.length; i++)
      {
         word = words[i];
         length = word.length();
         wordTemp = word.substring(length-1, length) + word.substring(1,length-1) + word.substring(0,1);
         for(int j = 1; j<word.length()-1; j++)
         {
            tempChar = word.charAt(j);
            ascii = (int) tempChar;
            ascii = ascii + 2;
            tempChar = (char) ascii;
            wordTemp = wordTemp.substring (0, j) + tempChar + wordTemp.substring(j+1, length);
           
         }
         words[i] = wordTemp;
      }
      
      //print encryption
      System.out.println("Here is your encrypted sentence");   
      for (String encripted : words)
      {
         System.out.print(encripted + " ");
      }      
      
                  
      
      
      
               
                       
      
   } 
}