/*Courtney Bryant
 * Jordan-Matthews High
 * Prog202t
 * Created: November 1, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter a starting day and the number of days in a month and then it generates a calendar based on this information.
 * Difficulties: I had a little trouble getting the dates to align correctly.  To fix this, I just used trial and error.
 * What I learned: I learned how to use if then statements and a while loop to generate a calendar based on certain conditions.
 */
import java.io.*;
import java.util.*;
public class Prog202t
{
    public static void main (String[] args)
    {
     System.out.print("First day of the month: ");
     Scanner keyboard = new Scanner(System.in);
     int intStarting = keyboard.nextInt();
     System.out.print("Number of days in the month: ");
     Scanner keyboard2 = new Scanner(System.in);
     int intCalendarDate = keyboard2.nextInt();
     int date = 1;
     
      if (intStarting > 7)
      {
            System.out.println("The first day of the calendar cannot be greather than 7 (Saturday).");
      }
      else if (intCalendarDate < 28) 
      {
            System.out.println("The number of days in the month must be 28, 29, 30, or 31");
      }
      else if(intCalendarDate > 31)
      {
            System.out.println("The number of days in the month must be 28, 29, 30, or 31");
      }
      else
        {
            System.out.println("\nSunday\t\tMonday\t\tTuesday\t\tWednesday\tThursday\tFriday\t\tSaturday");
            for (int x = 1; x<intStarting;x++)
            {
                System.out.print("\t\t");
            }
            for (int y=intStarting; y<=7; y++)
            {
                System.out.print(date+"\t\t");
                date++;
            }
        
            
            while (date<=intCalendarDate)
            {
                if ((date - (9-intStarting))%7==0)
                {
                    System.out.print("\n"+date+"\t\t");
                    
                }
                else
                {
                System.out.print(date+"\t\t");
                }
                date++;
            }
            
        }
        /*Output:
         * 
Sunday		Monday		Tuesday		Wednesday	Thursday	Friday		Saturday
				1		2		3		4		5		
6		7		8		9		10		11		12		
13		14		15		16		17		18		19		
20		21		22		23		24		25		26		
27		28		29		30		31		
         */
        //NOTE: Format is correct in output
    }
}