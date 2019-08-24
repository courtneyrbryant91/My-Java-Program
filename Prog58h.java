/*Courtney Bryant
 * Jordan-Matthews High
 * Prog58h
 * Created: Sept 14, 2008
 * Compiler/Platform: Java 1.6 / Windows XP
 * Description:  This program allows the user to enter information about his/her savings account and calculate the amount he/she will earn from interest.
 * Difficulties:  I had a problem getting the equation to display the correct answer.  To fix this I double checked my code and reviewed  the worksheet.  I found out that I had to subtract the original amount from the amount that my equation produced in order to get the amount earned.
 * What I learned: I learned how to calculate interest.  I also learned how to use the math.pow() statment to raise the number to a power.
 */

import java.io.*;
import java.util.*;
import java.text.*;

public class Prog58h
{
    public static void main(String[] args)
    {
        System.out.print("Amount saved: ");
        Scanner amount = new Scanner(System.in);
        double P = amount.nextDouble();
        
        System.out.print("Interest rate: ");
        Scanner interest = new Scanner(System.in);
        double r = (interest.nextDouble());
        
        System.out.print("Number of times compunded per year: ");
        Scanner compounded = new Scanner(System.in);
        double n = compounded.nextInt();
        
        System.out.print("Number of days at interest: ");
        Scanner days = new Scanner(System.in);
        double t = days.nextInt();
        DecimalFormat money = new DecimalFormat("0.00");
        double interestEarned = (1 + ((.01 * r)/n));
        double power = (n*t)/365;
        interestEarned = (Math.pow(interestEarned,power));
        interestEarned = P * interestEarned;
        System.out.println("The interest earned is: $" + money.format(interestEarned-P));
        System.out.println("The total amount in savings is now: $" + money.format(interestEarned));
    }
}
/*Output:
 * Amount saved: 10000
Interest rate: 16.5
Number of times compunded per year: 365
Number of days at interest: 90
The interest earned is: $415.14
The total amount in savings is now: $10415.14
 */