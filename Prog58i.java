/*Courtney Bryant
 * Jordan-Matthews High
 * Prog58i
 * Created: Sept 21, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description:  This program allows the user to enter in information about a loan (amount borrowed, interest rate, time to pay off loan).  It then calculates how much the monthly payments will be, how much interest the person is charged, and the total amount that is paid back.
 * Difficulties: I did not really have any difficulties with this program. The only problem was that I forgot to place some ";" at the end of a line.
 * What I learned: I learned how to use the loop three times to calculate the proper information needed.
 */

import java.util.*;
import java.io.*;
import java.text.*;
public class Prog58i
{
    public static void main(String[] args)
    {
        int x = 0;
        do {
        System.out.print("The amount I wish to borrow is: ");
        Scanner keyboardAmount = new Scanner(System.in);
        double P = keyboardAmount.nextDouble();
        System.out.print("The loan rate I can get is: ");
        Scanner keyboardLoan = new Scanner(System.in);
        double R = keyboardLoan.nextDouble();
        System.out.print("The number of months it will take me to pay off the loan is: ");
        Scanner keyboardMonths = new Scanner(System.in);
        double M = keyboardMonths.nextDouble();
        DecimalFormat twodigits = new DecimalFormat("0.00");
        double monthlyPayment1 = P*(R/1200);
        double monthlyPayment2 = Math.pow((1+(R/1200)),M);
        double monthlyPayment3 = (Math.pow((1+(R/1200)),M))-1;
        double finalMonthlyPayment = (double)(monthlyPayment1*(monthlyPayment2/monthlyPayment3));
        System.out.println("\nMy monthly payments will be $"+ twodigits.format(finalMonthlyPayment));
        System.out.println("Total Interest Paid is $" + twodigits.format((finalMonthlyPayment*M)- P));
        System.out.println("Total Amount paid is $"+ twodigits.format(finalMonthlyPayment*M)+"\n");
        x +=1;
         } while (x<3);
         
         
    /*Output:
The amount I wish to borrow is: 7500
The loan rate I can get is: 14.5
The number of months it will take me to pay off the loan is: 36

My monthly payments will be $258.16
Total Interest Paid is $1793.66
Total Amount paid is $9293.66

The amount I wish to borrow is: 7500
The loan rate I can get is: 14.5
The number of months it will take me to pay off the loan is: 48

My monthly payments will be $206.83
Total Interest Paid is $2428.06
Total Amount paid is $9928.06

The amount I wish to borrow is: 7500
The loan rate I can get is: 7.5
The number of months it will take me to pay off the loan is: 36

My monthly payments will be $233.30
Total Interest Paid is $898.68
Total Amount paid is $8398.68

     */
    }
}