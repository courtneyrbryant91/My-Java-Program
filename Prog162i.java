/*Courtney Bryant
 * Jordan-Matthews High
 * Prog162i
 * Created: October 11, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter an initial investment, along with the interest rates for 5 years.  It then caculated and displays the amount the user earns per year.
 * Difficulties: I did not get the correct output the first time because I set investment=answer, which was the amount earned for the last year.  To fix this, I made investment equal to investment+answer.
 * What I learned: I learned how to use a for loop to calculate investment.
 */


import java.io.*;
import java.util.*;
import java.text.*;
public class Prog162i
{
    public static void main(String[] args)
    {
            System.out.print("Enter initial investment: ");
            Scanner keyboard = new Scanner(System.in);
            double investment = keyboard.nextDouble();
            int year = 1;
            double rate;
            double answer;
          
            DecimalFormat twodigits = new DecimalFormat("0.00");
        for (int i=1; i<6; i++)
        {
            System.out.print("Enter Rate for year "+ year+ " ");
            Scanner keyboard2 = new Scanner(System.in);
            rate = keyboard2.nextDouble();
            answer = (investment*(rate/100));
            System.out.println("You earned $" + twodigits.format(answer)+" interest.\n");
            investment = answer+investment;
            year++;
         
        }
        System.out.println("Your CD is now worth $"+ twodigits.format(investment));
        /*Output:
Enter initial investment: 3000
Enter Rate for year 1 10.0
You earned $300.00 interest.

Enter Rate for year 2 5.0
You earned $165.00 interest.

Enter Rate for year 3 7.0
You earned $242.55 interest.

Enter Rate for year 4 9.0
You earned $333.68 interest.

Enter Rate for year 5 11.0
You earned $444.54 interest.

Your CD is now worth $4485.76

         */
    }
}