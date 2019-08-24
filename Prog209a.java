/*Courtney Bryant
 * Jordan-Matthews High
 * Prog209a
 * Created: November 14, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program reads numbers from a file and displays how many numbers there are, along with how many are less than 500 and how many are greater than or equal to 500
 * Difficulties: I had a little trouble remembering how to import numbers from a file.  To fix this, I reviewed the file provided in previous weeks work.
 * What I learned: I learned how to get input from a file while also using if then statements to determine if numbers are less than or greater than/equal to a certain number.
 */
import java.io.*;
import java.util.*;
public class Prog209a
{
    public static void main(String[] args)
    {
       Scanner inFile = null;
       try
       {
           inFile = new Scanner(new File("p209a.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(0);
        }
        int small = 0;
        int large = 0;
        while (inFile.hasNext())
        {
            int newNum = inFile.nextInt();
            if (newNum < 500)
            {
                small++;
            }
            if (newNum >=500)
            {
                large++;
            }
        }
        System.out.println("The number of numbers less than 500 is "+small);
        System.out.println("The number of numbers greater than or equal to 500 is "+ large);
        System.out.println("The total number of numbers is "+ (small+large));
        inFile.close();
    }
    /*Output:
The number of numbers less than 500 is 263
The number of numbers greater than or equal to 500 is 237
The total number of numbers is 500
     */
}