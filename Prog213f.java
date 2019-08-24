/*Courtney Bryant
 * Jordan-Matthews High
 * Prog213f
 * Created: November 15, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program reads numbers (or kilowatts) from a file.  It then uses certain conditions to determine how much the bill should be.
 * Difficulties: I had problem getting the program to read all the numbers correctly.  To fix this, I declared num as the number read by the program.  I then created the for loop to run while the number read is not equal to -999.
 * What I learned: I learned how to read a number from a file and use a while loop to determine how many times the program should execute.
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Prog213f
{
    public static void main(String[] args)
    {
        DecimalFormat money = new DecimalFormat ("$00.00");
        Scanner inFile = null;
        try
        {
            inFile = new Scanner(new File("213f.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(0);
        }
        int num = inFile.nextInt();
        while (num!=(-999))
        {
            double total = 0;
         
            if (num <= 2000)
            {
                total = num*.07;
            }
            if (num >2000 && num<=10000)
            {
                total = 2000*.07;
                total += (num-2000)*.05;
            }
            if (num > 10000)
            {
                total = 2000*.07;
                total += 8000*.05;
                total += (num-10000)*.04;
            }
            System.out.println("The cost of "+ num +" is "+ money.format(total)+"\n");
            num = inFile.nextInt();
        }
    }
    /*Output:
The cost of 1338 is $93.66

The cost of 9631 is $521.55

The cost of 13561 is $682.44
     */
}