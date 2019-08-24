/*Courtney Bryant
 * Jordan-Matthews High
 * Prog165a
 * Created: October 11, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter a number.  It then displays a pyramid of *'s with the first like having the same number of *'s as the number entered.  Each line then decreases by one *.
 * Difficulties: I had a difficult time getting the program to display the correct number of lines.  To fix this, I had to add another loop outside of my original loop.
 * What I learned: I learned how to use a nested loop to both subtract a number from a given number to display a line of *'s while also subtracting from a loop to display a given number of lines.
 */
import java.io.*;
import java.util.*;
public class Prog165a
{
    public static void main(String[] args)
    {
        System.out.print("Enter the starting size: ");
        Scanner keyboard = new Scanner(System.in);
        int inputNum = keyboard.nextInt();
        
        for (int n=inputNum; n>0;n--)
        {
            System.out.println(" ");
                for (int i=inputNum; i>0;i--)
                {
                    System.out.print("*");
                }
                 inputNum--;
    }    
    }
    
    /*Output:
Enter the starting size: 7
 
******* 
****** 
***** 
**** 
*** 
** 
*
     */
}

