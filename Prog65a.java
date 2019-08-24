/*Courtney Bryant
 * Jordan-Matthews High
 * Prog65a
 * Created: Sept 21, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter a month day and year. It then converts it into International format (YYYY-MM-DD).
 * Difficulties: I had a difficult time trying to figure out how to use the easyformat instructions provided.  To solve this, I just coded my program in a different way to eliminate the use of the EasyFormat class.
 * What I learned: I learned how to use the If-Then statement in java. Instead of saying "then" you just use {} to inclose the statement.
 */

import java.util.*;
import java.io.*;
import java.text.*;
public class Prog65a
{
    public static void main(String[] args)
    {
        System.out.print("Enter the Month Day Year (separated by a space): ");
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat twodigits = new DecimalFormat("00");
        int month = keyboard.nextInt();
        int day = keyboard.nextInt();
        int year =keyboard.nextInt();
         if (year < 2000){
        System.out.print("The date written in International format is: 19"+ year + "-" + twodigits.format(month) + "-" + twodigits.format(day));}
         else {
         System.out.print("The date written in International format is: "+ year + "-"+twodigits.format(month)+"-"+twodigits.format(day));}
         
         
         /*Output:
          * Enter the Month Day Year (separated by a space): 1 3 2006
          * The date written in International format is: 2006-01-03
          */
        }
}
