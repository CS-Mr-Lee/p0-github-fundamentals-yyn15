
/*================================================================================
   Line.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 24th, 2021
---------------------------------------------------------------------------------
   This program finds the slope and length of a line using methods
================================================================================= */
import java.util.*;
import java.lang.*;

public class Line
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
      
      //print using methods
      System.out.println("The length is : " + length(p1x,p1y,p2x,p2y));
      System.out.println("The slope is : " + slope(p1x,p1y,p2x,p2y));

   } 
   
   
    /*==============================================================================
    |  double length (int x1, int y1, int x2, int y2)                              |
    |------------------------------------------------------------------------------|
    |  returns lineLength - the length of the line                                 |
    |------------------------------------------------------------------------------|
    |  int x1 - this parameter is the x value of the first vertex                  |
    |------------------------------------------------------------------------------|
    |  int x2 - this parameter is the x value of the second vertex                 |
    |------------------------------------------------------------------------------|
    |  int y1 - this parameter is the y value of the first vertex                  |
    |------------------------------------------------------------------------------|
    |  int y2 - this parameter is the y value of the second vertex                 |
    |------------------------------------------------------------------------------|
    | This program uses two vertices to find the length of the line.               |                                                         |
    ==============================================================================*/
   public static double length(int x1, int y1, int x2, int y2)
   {
       double lineLength;
       lineLength = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2));
       return lineLength;
   }
   
   /*==============================================================================
    |  double slope (int x1, int y1, int x2, int y2)                               |
    |------------------------------------------------------------------------------|
    |  returns s - the slope of the line                                   |
    |------------------------------------------------------------------------------|
    |  int x1 - this parameter is the x value of the first vertex                  |
    |------------------------------------------------------------------------------|
    |  int x2 - this parameter is the x value of the second vertex                 |
    |------------------------------------------------------------------------------|
    |  int y1 - this parameter is the y value of the first vertex                  |
    |------------------------------------------------------------------------------|
    |  int y2 - this parameter is the y value of the second vertex                 |
    |------------------------------------------------------------------------------|
    | This program uses two vertices to find the slope of the line.                |                                                         |
    ==============================================================================*/
   public static double slope (int x1, int y1, int x2, int y2)
   {
      double s;
      s= ((double)y2-y1)/(x2-x1);
      return s;
   }
}