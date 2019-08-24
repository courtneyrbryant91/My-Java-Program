/*Courtney Bryant
 * Jordan-Matthews High
 * Prog 108b - Straight Line
 * Created: Sept 28, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter the price they paid for an object, the salvage value, and the number of years he/she had the object.  It then calculates the depreciation value of the object.  The program runs four times before stopping.
 * Difficulties:  The only difficulties I had with this program was that I had to make it twice because the power went out and erased my code before I compiled it and saved it.  I also had a little trouble formatting it correctly because I forgot to use println instead of just print.
 * What I learned: I learned how to use the do - while loop to make a program run four times.
 */


import java.util.*;
import java.io.*;
import java.text.*;
public class StraightLine
{
    public static void main(String[] args)
    {
        int number = 1;
        DecimalFormat twodigits = new DecimalFormat("0.00");
        do { 
            System.out.println("Run # " + number);
            System.out.print("Enter Price: ");
            Scanner keyboard = new Scanner(System.in);
            double price = keyboard.nextDouble();
            System.out.print("Enter Salvage Value: ");
            Scanner keyboard2 = new Scanner(System.in);
            double salvage = keyboard2.nextDouble();
            System.out.print("Enter Estimated Life in years: ");
            Scanner keyboard3 = new Scanner(System.in);
            double life = keyboard3.nextDouble();
            System.out.println("Annual Depreciation = " + twodigits.format((price-salvage)/life) + "\n");
            number +=1;
            }while (number < 5);
            
            /*Output:
Run # 1             
Enter Price: 250.00
Enter Salvage Value: 35.00
Enter Estimated Life in years: 8
Annual Depreciation = 26.88

Run # 2
Enter Price: 2425.00
Enter Salvage Value: 470.00
Enter Estimated Life in years: 6
Annual Depreciation = 325.83

Run # 3
Enter Price: 1162.00
Enter Salvage Value: 625.00
Enter Estimated Life in years: 5
Annual Depreciation = 107.40

Run # 4
Enter Price: 9654.33
Enter Salvage Value: 100.00
Enter Estimated Life in years: 12
Annual Depreciation = 796.19
             */
    }
}