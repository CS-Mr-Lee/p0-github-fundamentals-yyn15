/*================================================================================
   Array2.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 17th, 2021
---------------------------------------------------------------------------------
   This program uses a 2D array to calculate different aspects of student marks
================================================================================= */
import java.util.*;
import java.lang.*;

public class Array2
{
   public static void main (String [] args)
   {
      //declare scanner
      Scanner input = new Scanner(System.in);
      
      //declare variables
      int nStudent, nTest;
      double markAverage=0, markSum=0, highest=0, highestStudent=0, classAverage=0, classSum=0;
      double [][] marks;
      double [] studentAverage;
      
             
      //prompt user for input
      System.out.println("Please enter the number of students.");
      nStudent = input.nextInt();
      System.out.println("Please enter the number of tests.");
      nTest = input.nextInt();
      
      //set array
      marks = new double [nStudent][nTest];
      studentAverage = new double [nStudent];
      
      //ask for individual test marks
      System.out.println("Please enter the test mark for each student:");   
      for (int i = 0; i<nStudent; i++)
      {
         for (int j = 0; j<nTest; j++){
            System.out.println("Enter student #" + (i+1) + "'s mark for test #" + (j+1));
            marks[i][j] = input.nextInt();
            
         }
      }      
      System.out.println();
      
      
      //Calculate the average of each student as well as the highest mark and the classAverage
      System.out.println("Here is the average of each student");   
      for (int i = 0; i<nStudent; i++)
      {
         for (int j = 0; j<nTest; j++){
            markSum = markSum + marks[i][j];            
         }
         //find average for each person
         markAverage = markSum/nTest;
         studentAverage[i] = markAverage;                //record the average of the student
         System.out.print("Student #" + (i+1) + ": ");   //print student average
         System.out.printf("%.2f\n", markAverage); 
         classSum = classSum + markAverage;              //record the average into classSum
         if(markAverage >= highest)                      //check if the average is higher than others
         {
            highest = markAverage;
            highestStudent = i+1;
         }
         markSum = 0;                                    //reset sum of marks for next student
         
      }       
      System.out.println();
      
      classAverage = classSum/nStudent;   //calculate class average
      //print highest student
      System.out.print("The student with highest average is student #" + highestStudent + " with mark ");
      System.out.printf("%.2f\n", highest); 
      
      //print class average
      System.out.print("The class average is ");
      System.out.printf("%.2f\n", classAverage); 
      System.out.println();
      
      //print student's whos marks are higher than the class average
      System.out.println("Here is the list of students who's average is higher than the class average:");
      for (int i = 0; i<nStudent; i++)
      {
         if (studentAverage[i] > classAverage)
            System.out.println("Student #" + (i+1));

         
      }
      
           
      
                       
      
   } 
}