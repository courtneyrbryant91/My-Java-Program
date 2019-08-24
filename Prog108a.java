/*Courtney Bryant
 * Jordan-Matthews High
 * Prog 108a
 * Created: Sept 27, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program converts seconds to minutes and seconds.  It runs three times before terminating.
 * Difficulties: I did not have any difficulties.
 * What I learned: I learned how to use a loop to calculate minutes and seconds.
 */
import java.io.*;
import java.util.*;
public class Prog108a
{
    public static void main(String[] args)
    {
        int number =0;
        do {
        System.out.print("Enter seconds: ");
        Scanner keyboard = new Scanner(System.in);
        int seconds = keyboard.nextInt();
        System.out.println(seconds + " seconds equals " + (seconds/60) + " minutes and " + (seconds%60) + " seconds.\n");
        number +=1;} 
        while (number < 3);
        
        /*Output:
Enter seconds: 252
252 seconds equals 4 minutes and 12 seconds.

Enter seconds: 8621
8621 seconds equals 143 minutes and 41 seconds.

Enter seconds: 31046
31046 seconds equals 517 minutes and 26 seconds.
         */
    }
}