/*=======================================================================================
   TwoPowerTable.Java
   Programmer: Cherry Yinuo Yang
   Course: ICS4U1
   Last modified: Sept 24th, 2021
-----------------------------------------------------------------------------------------
   This program creates a text file that contains a power of two table in HTML format
 ========================================================================================*/
import java.util.*;
import java.lang.*;
import java.io.*;


public class TwoPowerTable
{
   public static void main (String [] args)
   {
           
      //declare scanner
      Scanner input = new Scanner(System.in);
      
      //declare variables
      int maxPow;
      String html;
      String table;
      
      
      //prompt user for input
      System.out.println("Please enter the size of the powe of two table (maximum power): ");
      maxPow = input.nextInt();
      
      // Creating a variable to store the file name
      String fileName = "twoPowerTable.html";
      
      try
      {
         // Create a BufferedWriter with a FileWriter, then write several lines and close the file.
         BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false));
                              
         html = """
               <html>
               <head>
                  <title>
                  Exponent/tabsPower of 2
                  </title>
               </head>
              
               <body>
               <table border cellpadding=5>
                 <tr><th>Exponent</th><th>Power of 2</th></tr>
               """;
               
         for( int i = 0; i<=maxPow; i++)
         {
            
            html = html + 
                 "<tr><td>" + i + "</td><td>" + i*i + "</td></tr>";        
         }
      
         html = html + 
               """
               </table>
               </body>
               </html>
               """;
         out.write(html);
         out.close();
      }
      catch (IOException e)
      {
         System.out.println(e + "  Problem writing " + fileName);
      }
      
   
   }
   
}