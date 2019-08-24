/*Courtney Bryant
 * Jordan-Matthews High
 * Prog213g
 * Created: October 31, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter A and B.  It then uses these variables to calcualte the equation Ax + B = 0.
 * Difficulties: I did not have any difficulties with this program.
 * What I Learned: I learned how to use nested if then statements to produce a specific output in different situations.
 */

import java.io.*;
import java.text.*;
import java.util.*;
public class Prog213g
{
    public static void main(String[] args)
    {
        System.out.print("Enter A: ");
        Scanner keyboard = new Scanner(System.in);
        double varA = keyboard.nextDouble();
        System.out.print("Enter B: ");
        Scanner keyboard2 = new Scanner(System.in);
        double varB = keyboard2.nextDouble();
        double solution = -1*(varB/varA);
        if (varA == 0)
        {
            if (varB==0)
            {    
                System.out.println("0x + 0 = 0---> There are infinite solutions.");
            }
            else 
            {
               System.out.println("0x + "+varB+" = 0---> There are no solutions.");
            }
        }
        else
        {
            System.out.println(varA+"x + "+varB+" = " +solution);  
        }
    }
    /*Output:
Enter A: 0
Enter B: 4
0x + 4 = 0---> There are no solutions.

Enter A: 0
Enter B: 0
0x + 0 = 0---> There are infinite solutions.

Enter A: 3.5
Enter B: -1.6
3.5x + -1.6 = 0.4571428571428572

     */
}