
/*================================================================================
   Length.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 24th, 2021
---------------------------------------------------------------------------------
   This program finds the slope and length of a line using methods
================================================================================= */
import java.util.*;
import java.lang.*;

public class Length
{
   public static void main (String [] args)
   {
      //declare scanner
      Scanner input = new Scanner(System.in);
      
      //declare variables
      int p1x, p1y, p2x, p2y;
      
      //prompt user for input
      System.out.println("Please the coordinates for a line: ");
      System.out.println("x1: ");
      p1x = input.nextInt();
      System.out.println("y1: ");
      p1y = input.nextInt();
      System.out.println("x2: ");
      p2x = input.nextInt();
      System.out.println("x2: ");
      p2y = input.nextInt();
      
      System.out.println("The length is : " + length(p1x,p1y,p2x,p2y));
      System.out.println("The slope is : " + slope(p1x,p1y,p2x,p2y));

   } 
   
   public static double length(int x1, int y1, int x2, int y2)
   {
       double lineLength;
       lineLength = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2));
       return lineLength;
   }
   
   public static double slope (int x1, int y1, int x2, int y2)
   {
      double s;
      s= ((double)y2-y1)/(x2-x1);
      return s;
   }
}