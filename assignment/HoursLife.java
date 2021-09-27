/*=========================================================================
   HoursLife.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 16th, 2021
----------------------------------------------------------------------------
   This program displays the number of hours you have spent sleeping
============================================================================ */
import java.util.*;
import java.lang.*;

public class HoursLife
{
   public static void main (String [] args)
   {
        //declare scanner
        Scanner input = new Scanner(System.in);
        
        //declare variables
        int bYear, bMonth, bDay, tYear,tMonth, tDay;
        int alive, hour;
        
        
        //prompt user for their birthday
        System.out.println("Enter your birthdate:");
        System.out.print("Year:");
        bYear = input.nextInt();
        System.out.print("Month:");
        bMonth = input.nextInt();
        System.out.print("Day:");
        bDay = input.nextInt();

        //prompt user for today's date
        System.out.println("Enter today's date:");
        System.out.print("Year:");
        tYear = input.nextInt();
        System.out.print("Month:");
        tMonth = input.nextInt();
        System.out.print("Day:");
        tDay = input.nextInt();
        
        
        alive = (tYear - (bYear+1))*365;
        alive = alive + (12-bMonth)*30;
        alive = alive + (30-bDay);
        alive = alive + (tDay) + ((tMonth-1) * 30);
        hour = alive * 8;
        
        System.out.println("You have been alive for " + alive + " days.");
        System.out.println("You have slept " + hour + " hours.");        
              
   } 
}