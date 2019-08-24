/*Courtney Bryant
 * Jordan-Matthews High
 * Prog76b
 * Compiler/Platform: Java 1.6, Windows XP
 * Created: Sept 21, 2008
 * Description: This program allows the user to enter a number (as many digits as wanted).  The program then displays the number in reverse order.
 * Difficulties: I had a difficult time figuring out how to do the do while loop statement.  To solve this, I looked up instructions on the internet (google).
 * What I learned: I learned how to do loop statements. You have to use {} to inclose the method you want the program to do during the loop.
 */

import java.io.*;
import java.util.*;
public class Prog76b
{
    public static void main(String[] args)
    {
        System.out.print("Enter a six digit number: ");
        Scanner keyboardNumber = new Scanner(System.in);
        int number = keyboardNumber.nextInt();
        String a = " ";
        do { 
            a += (number%10);
            number = number/10;
            }while (number > 0);
        System.out.println("The number in reverse order is:"+a);
        
        /*Output:
         * Enter a six digit number: 49291
         * The number in reverse order is: 19294
         */
    }
}